import com.ebayJsonClasses.Order;
import com.ebayJsonClasses.fullFIllmentOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lexofficeJsonClasses.*;
import com.lexofficeJsonClasses.Address;
import okhttp3.*;

import javax.swing.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainForm {
    private JTextField authKeyField;
    private JTextField csvField;
    private JButton goButton;
    private JPanel main;
    private JTextArea outputTextArea;


    public MainForm(){

        PrintStream ps = new PrintStream(new CustomOutputStream(outputTextArea));
        System.setOut(ps);
        System.setErr(ps);

        goButton.addActionListener((e)->{
            String authKey = authKeyField.getText();
            String csv = csvField.getText();

            String line="";
            String[] csvList=new String[0];
            try {
                BufferedReader br = new BufferedReader(new FileReader(csv));
                while ((line = br.readLine()) != null)   //returns a Boolean value
                {
                    csvList = line.split(";");    // use comma as separator
                }
                fullFIllmentOrder fullFIllmentOrder = gettingEbayOrdersFromStringList(authKey, Arrays.asList(csvList));



                for (Order o:fullFIllmentOrder.getOrders()
                ) {
                    Invoice invoice = generatingInvoicesObject(o);
                    ObjectMapper om = new ObjectMapper();
                    String inv = om.writeValueAsString(invoice);

                    System.out.println(generateLexofficeInvoce(inv));
                }
            }catch(Exception ex){

            }




        });
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);









        /* fullFIllmentOrder fullFIllmentOrder = gettingEbayOrders(authKey); */






    }


//Just for test cases. takes the ebay auth key straight from the code
/**
    public static fullFIllmentOrder gettingEbayOrders(String authkey) throws IOException {
        authkey = "Bearer " + "XXX";
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://api.ebay.com/sell/fulfillment/v1/order?filter=orderfulfillmentstatus:%7BNOT_STARTED%7CIN_PROGRESS%7D&limit=1000&offset=0")
                .method("GET", null)
                .addHeader("Authorization", authkey)
                .addHeader("Cookie", "ebay=%5Esbf%3D%23%5E")
                .build();
        ResponseBody response = client.newCall(request).execute().body();
        String resStri = response.string();
        ObjectMapper om = new ObjectMapper();
        fullFIllmentOrder fullFIllmentOrder = om.readValue(resStri, fullFIllmentOrder.class);
        List<Order> list = fullFIllmentOrder.getOrders();

        List<Order> newList = new LinkedList<>();
        for (Order i :
                list) {
            String cancstatus = i.getCancelStatus().getCancelState();
            String paystat = i.getOrderPaymentStatus();
            String orderstat = i.getOrderFulfillmentStatus();
            if (cancstatus.equals("NONE_REQUESTED") && paystat.equals("PAID") && orderstat.equals("NOT_STARTED")) {
                newList.add(i);
            }
        }
        fullFIllmentOrder.setOrders(newList);
        for (Order o:fullFIllmentOrder.getOrders()
        ) {
            System.out.println(o.getBuyer().getUsername());
        }
        response.close();
        return fullFIllmentOrder;
    }**/

    public static fullFIllmentOrder gettingEbayOrdersFromStringList(String authkey, List<String> orderNumbers) throws IOException {
        authkey = "Bearer " + authkey;
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        fullFIllmentOrder fullFIllmentOrder = new fullFIllmentOrder();
        List<Order> list = new LinkedList();
        for (String i:orderNumbers
        ) {
            Request request = new Request.Builder()
                    .url("https://api.ebay.com/sell/fulfillment/v1/order/" + i)
                    .method("GET", null)
                    .addHeader("Authorization", authkey)
                    .addHeader("Cookie", "ebay=%5Esbf%3D%23%5E")
                    .build();
            ResponseBody response = client.newCall(request).execute().body();
            String resStri = response.string();
            ObjectMapper om = new ObjectMapper();
            Order o = om.readValue(resStri, Order.class);
            list.add(o);
            response.close();
        }
        fullFIllmentOrder.setOrders(list);


        return fullFIllmentOrder;
    }

    public static Invoice generatingInvoicesObject(Order order){
        Invoice invoice = new Invoice();
        System.out.println(invoice.getVoucherDate());
        DecimalFormat f = new DecimalFormat("##.00");


        Address address = new Address();
        address.setName(order.getFulfillmentStartInstructions().get(0).getShippingStep().getShipTo().getFullName());
        address.setCity(order.getFulfillmentStartInstructions().get(0).getShippingStep().getShipTo().getContactAddress().getCity());
        address.setCountryCode(order.getFulfillmentStartInstructions().get(0).getShippingStep().getShipTo().getContactAddress().getCountryCode());
        address.setStreet(order.getFulfillmentStartInstructions().get(0).getShippingStep().getShipTo().getContactAddress().getAddressLine1());
        address.setZip(order.getFulfillmentStartInstructions().get(0).getShippingStep().getShipTo().getContactAddress().getPostalCode());
        invoice.setAddress(address);

        invoice.setTotalPrice(new TotalPrice());
        invoice.setTaxConditions(new TaxConditions());
        invoice.setShippingConditions(new ShippingConditions());
        List<LineItem> lineItems = new LinkedList<>();
        for (com.ebayJsonClasses.LineItem i:
                order.getLineItems()) {
            LineItem lineItem = new LineItem();
            lineItem.setName(i.getTitle());
            lineItem.setQuantity(i.getQuantity());
            String lineItemCost = i.getLineItemCost().getConvertedFromValue();
            if(i.getDiscountedLineItemCost() != null && Float.parseFloat(i.getDiscountedLineItemCost().getConvertedFromValue())>0){
                lineItemCost= i.getDiscountedLineItemCost().getConvertedFromValue();
            }
            lineItem.setUnitPrice(new UnitPrice(i.getLineItemCost().getConvertedFromCurrency(), Float.parseFloat(lineItemCost)/i.getQuantity(),19));
            lineItems.add(lineItem);
        }
        double deliveryCost = Double.parseDouble(order.getPricingSummary().getDeliveryCost().getConvertedFromValue());
        if(order.getPricingSummary().getDeliveryDiscount() != null){
            deliveryCost -= Double.parseDouble(order.getPricingSummary().getDeliveryDiscount().getConvertedFromValue());
        }
        if(deliveryCost>0){
            LineItem lineItem = new LineItem();
            lineItem.setName("Versand");
            lineItem.setQuantity(1);

            lineItem.setUnitPrice(new UnitPrice("EUR",(float)deliveryCost,19));
            lineItems.add(lineItem);
        }
        invoice.setLineItems(lineItems);


        return invoice;

    }

    //  !PUT YOUR LEXOFFICE KEY HERE!
    public static String generateLexofficeInvoce (String invoiceJson) throws IOException {
        String authk = "Bearer " + "PUT LEXOFFICE KEY HERE";
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType,invoiceJson);
        Request request = new Request.Builder()
                .url("https://api.lexoffice.io/v1/invoices?finalize=true")
                .method("POST", body)
                .addHeader("Authorization", authk)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .build();
        ;
        Response response = client.newCall(request).execute();
        response.close();
        return response.toString();
    }

}
