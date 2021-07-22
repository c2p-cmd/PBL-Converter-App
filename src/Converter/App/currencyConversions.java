package Converter.App;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.Money;
import javax.money.*;
import javax.money.convert.*;
import javax.money.format.MonetaryAmountFormat;
import javax.money.format.MonetaryFormats;
import java.util.Locale;

public class currencyConversions {
    public static void notmain(String[] args){
        MonetaryAmount amt = Money.of(1,"GBP");
        CurrencyConversion conv = MonetaryConversions.getConversion("INR" , "IMF");
        System.out.println("::::"+amt.with(conv));
    }

    public static void main(String[] args) {
        // Creating instances of Money:
        Money m1 = Monetary.getAmountFactory(Money.class).setCurrency("USD").setNumber(2.5).create();
        Money m2 = Money.of(2, "USD");

        // Get a formatter for dutch money layout
        MonetaryAmountFormat formatForNL = MonetaryFormats.getAmountFormat(Locale.forLanguageTag("en-US"));

        ExchangeRateProvider rateProvider = MonetaryConversions.getExchangeRateProvider( "IMF");
        CurrencyConversion conversionToEUR = rateProvider.getCurrencyConversion("INR");

        // Convert some money

        // From USD to EUR with today's rate
        System.out.println("2.00 USD converted to INR = "+ formatForNL.format(m2.with(conversionToEUR)));
        // Output: 300.00 USD converted to EUR = EUR 256,43

        // From EUR to EUR with today's rate, should always be 1-on-1
        System.out.println("2,5 USD converted to INR = "+ formatForNL.format(m1.with(conversionToEUR)));
        // Output: 300.00 EUR converted to EUR = EUR 300,00
    }
}
