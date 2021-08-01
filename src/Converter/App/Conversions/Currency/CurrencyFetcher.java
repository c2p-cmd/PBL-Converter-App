package Converter.App.Conversions.Currency;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

public class CurrencyFetcher extends Thread {
    static String sURL = "https://api.exchangerate-api.com/v4/latest/";
    static String fromC = "EUR", toC = "INR";
    public static final String CURRENCY = "Currency";

    public void run() {
        try {
            URL url = new URL(sURL+fromC);
            URLConnection request;
            request = url.openConnection();
            request.setConnectTimeout(5000);
            request.setReadTimeout(5000); // 5 seconds timeout
            request.connect();

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse( new InputStreamReader((InputStream) request.getContent()));
            JsonObject rootObj = root.getAsJsonObject();
            Set<Map.Entry<String, JsonElement>> ratesString = rootObj.get("rates").getAsJsonObject().entrySet();
            for (Object s: ratesString) {
                if( s.toString().contains(toC) ) System.out.println("Printing: " + s);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CurrencyFetcher fetcher = new CurrencyFetcher();
        fetcher.start();
    }
}
