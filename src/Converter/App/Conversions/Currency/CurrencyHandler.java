package Converter.App.Conversions.Currency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurrencyHandler {
    static String inputRead = null;
    static String inputString = null;
    static String argument = null;
    private static final String OS = System.getProperty("os.name").toLowerCase();

    public static String currencyConvert(String amount, String fromCurrency, String toCurrency) {
        try {
            if (isMacOS() || isUnix()) argument = "src/Converter/App/calculator-env/bin/python3 src/Converter/App/Conversions/Currency/currency_fetcher.py " + amount + " " + fromCurrency + " " + toCurrency;
            else argument = "python src\\Converter\\App\\Conversions\\Currency\\currency_fetcher.py" + amount + " " + fromCurrency + " " + toCurrency;
            Process process = Runtime.getRuntime().exec(argument);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

            while ( (inputRead = stdInput.readLine()) != null ) {
                inputString = inputRead;
            }
            while ( (inputRead = stdError.readLine()) != null) {
                inputString = inputRead;
            }

            return inputString;
        } catch(IOException e) {
            System.out.println("Exception" + e.getMessage());
            e.printStackTrace();
            return "Error While Fetching Results.";
        }
    }

    private static boolean isMacOS() {
        return OS.contains("mac");
    }

    private static boolean isUnix() {
        return (OS.contains("nix") || OS.contains("nux") || OS.contains("aix"));
    }
}
