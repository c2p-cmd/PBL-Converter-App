package Converter.App;

public class Scientific {

    public static double scientificInputValidator(String number) throws NumberFormatException {
        try {
            return Double.parseDouble(number);
        } catch (NumberFormatException parseException) {
            return Double.NaN;
        }
    }

    // expOf
    public static double expOf(String number) {
        try {
            double e = scientificInputValidator(number);
            return Math.exp(e);
        } catch (NumberFormatException numberFormatException) {
            return 0.0;
        }
    }

    // logOf
    public static double logOf(String base, String argument) {
        try {
            double b = scientificInputValidator(argument);
            if (base.equals("e"))
                return Math.log(b);
            double a = scientificInputValidator(base);
            // log a b = c;
            return (Math.log10(b)/Math.log10(a));
        } catch (NumberFormatException numberFormatException) {
            return 0.0;
        }
    }

    // sin(x)
    public static double sineOf(String number, boolean isRadian) {
        try {
            double temp = scientificInputValidator(number);
            if (isRadian)
                return Math.sin( temp );
            else
                return Math.sin( Math.toRadians(temp) );
        } catch (Exception e) {
            return  0.0;
        }
    }

    // sinh(x)
    public static double sinhOf(String number, boolean isRadian) throws NumberFormatException {
        try {
            double temp = scientificInputValidator(number);
            if (isRadian)
                return Math.sinh( temp );
            else
                return Math.sinh( Math.toRadians(temp) );
        } catch (NumberFormatException parseException) {
            return  0.0;
        }
    }

    // cosec(x)
    public static double cosecOf(String number, boolean isRadian) {
        double sinX = sineOf(number, isRadian);
        if ( sinX == 0.0 )
            return Double.NaN;
        else
            return 1/sinX;
    }

    // cos(x)
    public static double cosOf(String number, boolean isRadian) {
        try {
            double temp = scientificInputValidator(number);
            if (isRadian)
                return Math.cos( temp );
            else
                return Math.cos( Math.toRadians(temp) );
        } catch (NumberFormatException parseException) {
            return  0.0;
        }
    }

    // cosh(x)
    public static double coshOf(String number, boolean isRadian) {
        try {
            double temp = scientificInputValidator(number);
            if (isRadian)
                return Math.cosh( temp );
            else
                return Math.cosh( Math.toRadians(temp) );
        } catch (NumberFormatException parseException) {
            return  0.0;
        }
    }

    // sec(x)
    public static double secOf(String number, boolean isRadian) {
        double cosX = cosOf(number, isRadian);
        if (cosX == 0.0)
            return Double.NaN;
        else
            return 1/cosX;
    }

    // tan(x)
    public static double tanOf(String number, boolean isRadian) {
        try {
            double tmp = scientificInputValidator(number);
            if (isRadian)
                return Math.tan(tmp);
            else
                return Math.tan( Math.toRadians(tmp) );
        } catch (NumberFormatException parseException) {
            return 0.0;
        }
    }

    // tanh(x)
    public static double tanhOf(String number, boolean isRadian) {
        try {
            double tmp = scientificInputValidator(number);
            if (isRadian)
                return Math.tanh(tmp);
            else
                return Math.tanh( Math.toRadians(tmp) );
        } catch (NumberFormatException parseException) {
            return 0.0;
        }
    }

    // cot(x)
    public static double cotOf(String number, boolean isRadian) {
        double tanX = tanOf(number, isRadian);
        if (tanX == 0.0)
            return Double.NaN;
        else
            return 1/tanX;
    }

    // arcsin(x)
    public static double arcsinOf(String number) {
        try {
            double x = scientificInputValidator(number);
            return Math.toDegrees(Math.asin(x));
        } catch (NumberFormatException parseException) {
            return 0.0;
        }
    }

    // arccosOf(x)
    public static double arccosOf(String number) {
        try {
            double x = scientificInputValidator(number);
            return Math.toDegrees( Math.acos(x) );
        } catch (NumberFormatException parseException) {
            return 0.0;
        }
    }

    // arctan(x)
    public static double arctanOf(String number) {
        try {
            double x = scientificInputValidator(number);
            return Math.toDegrees( Math.atan(x) );
        } catch (NumberFormatException parseException) {
            return 0.0;
        }
    }
}
