package Converter.App;

import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;
import java.text.MessageFormat;

public class currencyConversions {

    public static void main(String... args){
        final MonetaryAmount amt = Money.of(1,"AED");
        CurrencyConversion conv = MonetaryConversions.getConversion("INR" , "IMF");
        System.out.println("::::"+amt.with(conv));
        CurrencyUnit usd = Monetary.getCurrency("USD");

    }
}
