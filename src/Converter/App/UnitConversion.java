package Converter.App;

public class UnitConversion {
    public static class Distance {
        /* possible distances
        * cm, m, km, miles, yard, feet, inches, nautical miles
        */
        public static double centiToMeter(double num) { return (num/Math.pow(10,2)); }
        public static double centiToKilo(double num)  { return (num/Math.pow(10,5)); }
        public static double meterToKilo(double num)  { return (num/Math.pow(10,3)); }
        public static double meterToCenti(double num) { return (num*Math.pow(10,2)); }
        public static double kiloToCenti(double num)  { return (num*Math.pow(10,5)); }
        public static double kiloToMeter(double num)  { return (num*Math.pow(10,3)); }

        public static double meterToMiles(double num) { return (num/1609); }
        public static double centiToMiles(double num) { return meterToMiles(centiToMeter(num)); }
        public static double kiloToMiles(double num)  { return meterToMiles(kiloToMeter(num)); }

        public static double meterToYard(double num) { return (num*1.09361); }
        public static double centiToYard(double num) { return meterToYard(centiToMeter(num)); }
        public static double kiloToYard(double num)  { return meterToYard(kiloToMeter(num)); }

        public static double meterToFoot(double num) { return (num*32.8084); }
        public static double centiToFoot(double num) { return meterToFoot(centiToMeter(num)); }
        public static double kiloToFoot(double num)  { return meterToFoot(kiloToMeter(num)); }

        public static double meterToInches(double num) { return (num*39.3701); }
        public static double centiToInches(double num) { return meterToInches(centiToMeter(num)); }
        public static double kiloToInches(double num)  { return meterToInches(kiloToMeter(num)); }

        public static double meterToNauticalMiles(double num) { return (num/1852); }
        public static double centiToNauticalMiles(double num) { return meterToNauticalMiles(centiToMeter(num)); }
        public static double kiloToNauticalMiles(double num)  { return meterToNauticalMiles(kiloToMeter(num)); }

        public static double milesToFoot(double num)          { return (num*5280); }
        public static double milesToInches(double num)        { return (num*63360); }
        public static double milesToNauticalMiles(double num) { return (num/1.151); }
        public static double milesToYard(double num)          { return (num*1760); }
        public static double milesToMeter(double num)         { return (num*1609); }
        public static double milesToCenti(double num)         { return meterToCenti(milesToMeter(num)); }
        public static double milesToKilo(double num)          { return meterToKilo(milesToMeter(num)); }

        public static double footToInches(double num)        { return (num*12); }
        public static double footToNauticalMiles(double num) { return (num/6076); }
        public static double footToYard(double num)          { return (num/3); }
        public static double footToMeter(double num)         { return (num/3.281); }
        public static double footToCenti(double num)         { return meterToCenti(footToMeter(num)); }
        public static double footToKilo(double num)          { return meterToKilo(footToMeter(num)); }
        public static double footToMiles(double num)         { return (num/5280); }

        //TODO Yards to etc
        //TODO nautical miles to etc


    }

}
