package Converter.App.Conversions.Units;



public class UnitConversion {
    public static class Distance {
        /* possible distances
        * cm, m, km, miles, yard, feet, inches, nautical miles
        */
        public static double centiToMeter(double num) { return (num/Math.pow(10,2)); }
        public static double centiToKilo(double num)  { return (num/Math.pow(10,5)); }
        public static double centiToMiles(double num) { return meterToMiles(centiToMeter(num)); }
        public static double centiToYard(double num) { return meterToYard(centiToMeter(num)); }
        public static double centiToInches(double num) { return meterToInches(centiToMeter(num)); }
        public static double centiToFoot(double num) { return meterToFoot(centiToMeter(num)); }
        public static double centiToNauticalMiles(double num) { return meterToNauticalMiles(centiToMeter(num)); }

        public static double meterToKilo(double num)  { return (num/Math.pow(10,3)); }
        public static double meterToCenti(double num) { return (num*Math.pow(10,2)); }
        public static double meterToMiles(double num) { return (num/1609); }
        public static double meterToYard(double num) { return (num*1.09361); }
        public static double meterToFoot(double num) { return (num*32.8084); }
        public static double meterToInches(double num) { return (num*39.3701); }
        public static double meterToNauticalMiles(double num) { return (num/1852); }

        public static double kiloToCenti(double num)  { return (num*Math.pow(10,5)); }
        public static double kiloToMeter(double num)  { return (num*Math.pow(10,3)); }
        public static double kiloToMiles(double num)  { return meterToMiles(kiloToMeter(num)); }
        public static double kiloToYard(double num)  { return meterToYard(kiloToMeter(num)); }
        public static double kiloToInches(double num)  { return meterToInches(kiloToMeter(num)); }
        public static double kiloToFoot(double num)  { return meterToFoot(kiloToMeter(num)); }
        public static double kiloToNauticalMiles(double num)  { return meterToNauticalMiles(kiloToMeter(num)); }

        public static double milesToFoot(double num)          { return (num*5280); }
        public static double milesToInches(double num)        { return (num*63360); }
        public static double milesToNauticalMiles(double num) { return (num/1.151); }
        public static double milesToYard(double num)          { return (num*1760); }
        public static double milesToMeter(double num)         { return (num*1609); }
        public static double milesToCenti(double num)         { return meterToCenti(milesToMeter(num)); }
        public static double milesToKilo(double num)          { return meterToKilo(milesToMeter(num)); }

        public static double inchesToFoot(double num)          { return (num/12); }
        public static double inchesToYard(double num)          { return (num/36); }
        public static double inchesToMiles(double num)         { return (num/63360); }
        public static double inchesToNauticalMiles(double num) { return (num/72913); }
        public static double inchesToMeter(double num)         { return (num/39.37); }
        public static double inchesToCenti(double num)         { return meterToCenti(inchesToMeter(num)); }
        public static double inchesToKilo(double num)          { return meterToKilo(inchesToMeter(num)); }

        public static double footToInches(double num)        { return (num*12); }
        public static double footToNauticalMiles(double num) { return (num/6076); }
        public static double footToYard(double num)          { return (num/3); }
        public static double footToMeter(double num)         { return (num/3.281); }
        public static double footToCenti(double num)         { return meterToCenti(footToMeter(num)); }
        public static double footToKilo(double num)          { return meterToKilo(footToMeter(num)); }
        public static double footToMiles(double num)         { return (num/5280); }

        public static double yardToFoot(double num)          { return (num*3); }
        public static double yardToInches(double num)        { return footToInches(yardToFoot(num)); }
        public static double yardToNauticalMiles(double num) { return (num/2025); }
        public static double yardToMiles(double num)         { return (num/1760); }
        public static double yardToMeter(double num)         { return footToMeter(yardToFoot(num)); }
        public static double yardToCenti(double num)         { return footToCenti(yardToFoot(num)); }
        public static double yardToKilo(double num)          { return footToKilo(yardToFoot(num)); }

        public static double nauticalMilesToMiles(double num) { return (num*1.151);  }
        public static double nauticalMilesToFoot(double num)  { return (num*6076); }
        public static double nauticalMilesToYard(double num)  { return footToYard(nauticalMilesToFoot(num)); }
        public static double nauticalMilesToInches(double num){ return footToInches(nauticalMilesToFoot(num)); }
        public static double nauticalMilesToMeter(double num) { return (num*1852); }
        public static double nauticalMilesToCenti(double num) { return meterToCenti(nauticalMilesToMeter(num)); }
        public static double nauticalMilesToKilo(double num) { return meterToKilo(nauticalMilesToMeter(num)); }
    }
    //Class for Weight conversions
    public static class Weight{

        /*Possible Measurements
            Carats , Milligrams , Centigrams , Decigrams , Grams , Decagrams
            Hectograms , Kilograms , Metric tonnes
            Ounces , Pounds , Stone
         */

        //Conversions from Carats
        public static double caratsToMilligrams(double num) { return (num*200); }
        public static double caratsToCentigrams(double num) { return milligramsToCentigrams(caratsToMilligrams(num)); }
        public static double caratsToDecigrams(double num)  { return centigramsToDecigrams(caratsToCentigrams(num)); }
        public static double caratsToGrams(double num)      { return (num*0.2); }
        public static double caratsToDecagrams(double num)  { return gramsToDecagrams(caratsToGrams(num)); }
        public static double caratsToHectograms(double num) { return gramsToHectograms(caratsToGrams(num)); }
        public static double caratsToKilograms(double num)  { return gramsToKilograms(caratsToGrams(num)); }
        public static double caratsToMetricTonnes(double num){ return kilogramsToMetricTonnes(caratsToKilograms(num)); }
        public static double caratsToOunces(double num)     { return (num/142); }
        public static double caratsToPounds(double num)     { return (num/2268); }
        public static double caratsToStone(double num)      { return (num/31751); }

        //Conversions from Milligrams
        public static double milligramsToCarats(double num)       { return (num/200); }
        public static double milligramsToCentigrams(double num)   { return (num/10); }
        public static double milligramsToDecigrams(double num)    { return (num/Math.pow(10,2)); }
        public static double milligramsToGrams(double num)        { return (num/Math.pow(10,3)); }
        public static double milligramsToDecagrams(double num)    { return gramsToDecagrams(milligramsToGrams(num)); }
        public static double milligramsToHectograms(double num)   { return gramsToHectograms(milligramsToGrams(num)); }
        public static double milligramsToKilograms(double num)    { return gramsToKilograms(milligramsToGrams(num)); }
        public static double milligramsToMetricTonnes(double num) { return kilogramsToMetricTonnes(milligramsToKilograms(num)); }
        public static double milligramsToOunces(double num)        { return (num/28350); }
        public static double milligramsToPounds(double num)       { return (num/453592); }
        public static double milligramsToStone(double num)        { return (num/(6.35*Math.exp(6))); }

        //Conversions from Centigrams
        public static double centigramsToCarats(double num)        { return (num/20); }
        public static double centigramsToMilligrams(double num)    { return (num*10); }
        public static double centigramsToDecigrams(double num)     { return (num/10); }
        public static double centigramsToGrams(double num)         { return (num/100); }
        public static double centigramsToDecagrams(double num)     { return gramsToDecagrams(centigramsToGrams(num)); }
        public static double centigramsToHectograms(double num)    { return gramsToHectograms(centigramsToGrams(num)); }
        public static double centigramsToKilograms(double num)     { return gramsToKilograms(centigramsToGrams(num)); }
        public static double centigramsToMetricTonnes(double num)  { return kilogramsToMetricTonnes(centigramsToKilograms(num)); }
        public static double centigramsToOunces(double num)        { return (num/2835); }
        public static double centigramsToPounds(double num)        { return (num/45359); }
        public static double centigramsToStone(double num)         { return (num/635029); }

        //Conversions from Decigrams
        public static double decigramsToCarats(double num)         { return (num/2); }
        public static double decigramsToMilligrams(double num)     { return (num*100); }
        public static double decigramsToCentigrams(double num)     { return (num*10); }
        public static double decigramsToGrams(double num)          { return (num/10); }
        public static double decigramsToDecagrams(double num)      { return (num/100); }
        public static double decigramsToHectograms(double num)     { return (num/Math.pow(10,3)); }
        public static double decigramsToKilograms(double num)      { return (num/Math.pow(10,4)); }
        public static double decigramsToMetricTonnes(double num)   { return (num/Math.exp(7)); }
        public static double decigramsToOunces(double num)         { return (num/283); }
        public static double decigramsToPounds(double num)         { return (num/4536); }
        public static double decigramsToStone(double num)          { return (num/63503); }

        //Conversions from Grams
        public static double gramsToCarats(double num)       { return (num*5); }
        public static double gramsToMilligrams(double num)   { return (num*Math.pow(10,3)); }
        public static double gramsToCentigrams(double num)   { return (num*100); }
        public static double gramsToDecigrams(double num)    { return (num*10); }
        public static double gramsToDecagrams(double num)    { return (num/10); }
        public static double gramsToHectograms(double num)   { return (num/100); }
        public static double gramsToKilograms(double num)    { return (num/Math.pow(10,3)); }
        public static double gramsToMetricTonnes(double num) { return kilogramsToMetricTonnes(gramsToKilograms(num)); }
        public static double gramsToOunces(double num)       { return (num/28.35); }
        public static double gramsToPounds(double num)       { return (num/454); }
        public static double gramsToStone(double num)        { return (num/6350); }

        //Conversions from Decagrams
        public static double decagramsToCarats(double num)      { return gramsToCarats(decagramsToGrams(num)); }
        public static double decagramsToMilligrams(double num)  { return (num*Math.pow(10,4)); }
        public static double decagramsToCentigrams(double num)  { return (num*Math.pow(10,3)); }
        public static double decagramsToDecigrams(double num)   { return (num*Math.pow(10,2)); }
        public static double decagramsToGrams(double num)       { return (num*10); }
        public static double decagramsToHectograms(double num)  { return (num/10); }
        public static double decagramsToKilograms(double num)   { return (num/Math.pow(10,2)); }
        public static double decagramsToMetricTonnes(double num){ return kilogramsToMetricTonnes(decagramsToKilograms(num)); }
        public static double decagramsToOunces(double num)      { return (num/2.835); }
        public static double decagramsToPounds(double num)      { return (num/45.359); }
        public static double decagramsToStone(double num)       { return (num/635); }

        //Conversions from Hectograms
        public static double hectogramsToCarats(double num)     { return gramsToCarats(hectogramsToGrams(num)); }
        public static double hectogramsToMilligrams(double num) { return gramsToMilligrams(hectogramsToGrams(num)); }
        public static double hectogramsToCentigrams(double num) { return gramsToCentigrams(hectogramsToGrams(num)); }
        public static double hectogramsToDecigrams(double num)  { return (num*Math.pow(10,3)); }
        public static double hectogramsToGrams(double num)      { return (num*Math.pow(10,2)); }
        public static double hectogramsToDecagrams(double num)  { return (num*10); }
        public static double hectogramsToKilograms(double num)  { return (num/10); }
        public static double hectogramsToMetricTonnes(double num){ return kilogramsToMetricTonnes(hectogramsToKilograms(num)); }
        public static double hectogramsToOunces(double num)     { return (num*3.527); }
        public static double hectogramsToPounds(double num)     { return (num/4.536); }
        public static double hectogramsToStone(double num)      { return (num/63.503); }

        //Conversions from Kilograms
        public static double kilogramsToCarats(double num)      { return gramsToCarats(kilogramsToGrams(num)); }
        public static double kilogramsToMilligrams(double num)  { return gramsToMilligrams(kilogramsToGrams(num)); }
        public static double kilogramsToCentigrams(double num)  { return gramsToCentigrams(kilogramsToGrams(num)); }
        public static double kilogramsToDecigrams(double num)   { return gramsToDecigrams(kilogramsToGrams(num)); }
        public static double kilogramsToGrams(double num)       { return (num*Math.pow(10,3)); }
        public static double kilogramsToDecagrams(double num)   { return (num*Math.pow(10,2)); }
        public static double kilogramsToHectograms(double num)  { return (num*10); }
        public static double kilogramsToMetricTonnes(double num){ return (num/Math.pow(10,3)); }
        public static double kilogramsToOunces(double num)      { return (num*35.274); }
        public static double kilogramsToPounds(double num)      { return (num/2.205); }
        public static double kilogramsToStone(double num)       { return (num/6.35); }

        //Conversions from MetricTonnes
        public static double metrictonnesToCarats(double num)      { return gramsToCarats(metrictonnesToGrams(num)); }
        public static double metrictonnesToMilligrams(double num)  { return gramsToMilligrams(metrictonnesToGrams(num)); }
        public static double metrictonnesToCentigrams(double num)  { return gramsToCentigrams(metrictonnesToGrams(num)); }
        public static double metrictonnesToDecigrams(double num)   { return gramsToDecigrams(metrictonnesToGrams(num)); }
        public static double metrictonnesToGrams(double num)       { return (num*Math.pow(10,6)); }
        public static double metrictonnesToDecagrams(double num)   { return (num*Math.pow(10,5)); }
        public static double metrictonnesToHectograms(double num)  { return (num*Math.pow(10,4)); }
        public static double metrictonnesToKilograms(double num)   { return (num*Math.pow(10,3)); }
        public static double metrictonnesToOunces(double num)      { return (num*35274); }
        public static double metrictonnesToPounds(double num)      { return (num*2205); }
        public static double metrictonnesToStone(double num)       { return (num*157); }

        //Conversions from Ounces
        public static double ouncesToCarats(double num)       { return kilogramsToCarats(ouncesToKilograms(num)); }
        public static double ouncesToMilligrams(double num)   { return kilogramsToMilligrams(ouncesToKilograms(num)); }
        public static double ouncesToCentigrams(double num)   { return kilogramsToCentigrams(ouncesToKilograms(num)); }
        public static double ouncesToDecigrams(double num)    { return kilogramsToDecigrams(ouncesToKilograms(num)); }
        public static double ouncesToGrams(double num)        { return (num*28.3495); }
        public static double ouncesToDecagrams(double num)    { return (num*2.83495); }
        public static double ouncesToHectograms(double num)   { return (num/3.527); }
        public static double ouncesToKilograms(double num)    { return (num/35.274); }
        public static double ouncesToMetricTonnes(double num) { return kilogramsToMetricTonnes(ouncesToKilograms(num)); }
        public static double ouncesToPounds(double num)       { return (num/16); }
        public static double ouncesToStone(double num)        { return (num/224); }

        //Conversion from pounds
        public static double poundsToCarats(double num)      { return kilogramsToCarats(poundsToKilograms(num)); }
        public static double poundsToMilligrams(double num)  { return kilogramsToMilligrams(poundsToKilograms(num)); }
        public static double poundsToCentigrams(double num)  { return kilogramsToCentigrams(poundsToKilograms(num)); }
        public static double poundsToDecigrams(double num)   { return kilogramsToDecigrams(poundsToKilograms(num)); }
        public static double poundsToGrams(double num)       { return (num*453.592); }
        public static double poundsToDecagrams(double num)   { return (num*45.3592); }
        public static double poundsToHectograms(double num)  { return (num*4.53592); }
        public static double poundsToKilograms(double num)   { return (num*0.453592); }
        public static double poundsToMetricTonnes(double num){ return kilogramsToMetricTonnes(poundsToKilograms(num)); }
        public static double poundsToOunces(double num)      { return (num/16); }
        public static double poundsToStone(double num)       { return (num/14); }

        //Conversions from Stone
        public static double stoneToCarats(double num)      { return kilogramsToCarats(stoneToKilograms(num)); }
        public static double stoneToMilligrams(double num)  { return kilogramsToMilligrams(stoneToKilograms(num)); }
        public static double stoneToCentigrams(double num)  { return kilogramsToCentigrams(stoneToKilograms(num)); }
        public static double stoneToDecigrams(double num)   { return kilogramsToDecigrams(stoneToKilograms(num)); }
        public static double stoneToGrams(double num)       { return (num*6350.29); }
        public static double stoneToDecagrams(double num)   { return (num*635.029); }
        public static double stoneToHectograms(double num)  { return (num*63.5029); }
        public static double stoneToKilograms(double num)   { return (num*6.35029); }
        public static double stoneToMetricTonnes(double num){ return kilogramsToMetricTonnes(stoneToKilograms(num)); }
        public static double stoneToOunces(double num)      { return (num*224); }
        public static double stoneToPounds(double num)      { return (num*14); }
    }

    //Class for angle conversions
    public static class Angle{

        //Possible Conversions
        //Degree , Radians , Gradians , Arcseconds

        //Conversions from Degree
        public static double degreeToRadians(double num)     { return (num*0.0174533); }
        public static double degreeToGradians(double num)    { return (num*1.1111111); }
        public static double degreeToArcSeconds(double num)  { return (num*3600); }

        //Conversions from Radians
        public static double radiansToDegree(double num)     { return (num*57.2958); }
        public static double radiansToGradians(double num)   { return (num*63.662); }
        public static double radiansToArcSeconds(double num) { return (num*206265); }

        //Conversions from Gradians
        public static double gradiansToDegree(double num)    { return (num*0.9); }
        public static double gradiansToRadians(double num)   { return (num*0.015708); }
        public static double gradiansToArcSeconds(double num){ return (num*3240);}

        //Conversions from ArcSeconds
        public static double arcSecondsToDegree(double num)  { return (num/3600); }
        public static double arcSecondsToRadians(double num) { return (num*4.84814*Math.exp(-6)); }
        public static double arcSecondsToGradians(double num){ return (num/3240); }
    }

    //Class for Area
    public static class Area{
        /*Possible conversions
        Square Millimeters, Square Centimeters , Square Meters
        Hectares , Square Kilometers , Square Inches , Square Feet
        Square Yards , Acres , Square miles
        */

        //Conversions from Square Millimeters
        public static double squareMillimetersToSquareCentimeters(double num){ return (num/100); }
        public static double squareMillimetersToSquareMeters(double num)     { return (num/Math.exp(6)); }
        public static double squareMillimetersToHectares(double num)         { return (num/Math.exp(10)); }
        public static double squareMillimetersToSquareKilometers(double num) { return hectaresToSquareKiloMeters(squareMillimetersToHectares(num)); }
        public static double squareMillimetersToSquareInches(double num)     { return hectaresToSquareInches(squareMillimetersToHectares(num)); }
        public static double squareMillimetersToSquareFeet(double num)       { return hectaresToSquareFeet(squareMillimetersToHectares(num)); }
        public static double squareMillimetersToSquareYards(double num)      { return hectaresToSquareYards(squareMillimetersToHectares(num)); }
        public static double squareMillimetersToAcres(double num)            { return hectaresToAcres(squareMillimetersToHectares(num)); }
        public static double squareMillimetersToSquareMiles(double num)      { return hectaresToSquareMiles(squareMillimetersToHectares(num)); }

        //Conversions from Square Centimeters
        public static double squareCentimetersToSquareMillimeters(double num) { return (num*100); }
        public static double squareCentimetersToSquareMeters(double num)      { return (num/Math.pow(10,4)); }
        public static double squareCentimetersToHectares(double num)          { return (num/Math.exp(8)); }
        public static double squareCentimetersToSquareKiloMeters(double num)  { return hectaresToSquareKiloMeters(squareCentimetersToHectares(num)); }
        public static double squareCentimetersToSquareInches(double num)      { return hectaresToSquareInches(squareCentimetersToHectares(num)); }
        public static double squareCentimetersToSquareFeet(double num)        { return hectaresToSquareFeet(squareCentimetersToHectares(num)); }
        public static double squareCentimetersToSquareYards(double num)       { return hectaresToSquareYards(squareCentimetersToHectares(num)); }
        public static double squareCentimetersToAcres(double num)             { return hectaresToAcres(squareCentimetersToHectares(num)); }
        public static double squareCentimetersToSquareMiles(double num)       { return hectaresToSquareMiles(squareCentimetersToHectares(num)); }

        //Conversions from Square Meters
        public static double squareMetersToSquareMilliMeters(double num){ return (num*Math.pow(10,6)); }
        public static double squareMetersToSquareCentiMeters(double num){ return (num*Math.pow(10,4)); }
        public static double squareMetersToHectares(double num)         { return (num/Math.pow(10,4)); }
        public static double squareMetersToSquareKilometers(double num) { return hectaresToSquareKiloMeters(squareMetersToHectares(num)); }
        public static double squareMetersToSquareInches(double num)     { return hectaresToSquareInches(squareMetersToHectares(num)); }
        public static double squareMetersToSquareFeet(double num)       { return hectaresToSquareFeet(squareMetersToHectares(num)); }
        public static double squareMetersToSquareYards(double num)      { return hectaresToSquareYards(squareMetersToHectares(num)); }
        public static double squareMetersToAcres(double num)            { return hectaresToAcres(squareMetersToHectares(num)); }
        public static double squareMetersToSquareMiles(double num)      { return hectaresToSquareMiles(squareMetersToHectares(num)); }

        //Conversions from Hectares
        public static double hectaresToSquareMillimeters(double num){ return (num*Math.exp(10)); }
        public static double hectaresToSquareCentimeters(double num){ return (num*Math.exp(8)); }
        public static double hectaresToSquareMeters(double num)     { return (num*Math.pow(10,4)); }
        public static double hectaresToSquareKiloMeters(double num) { return (num/100); }
        public static double hectaresToSquareInches(double num)     { return (num*(1.55*Math.exp(7))); }
        public static double hectaresToSquareFeet(double num)       { return (num*107639); }
        public static double hectaresToSquareYards(double num)      { return (num*11960); }
        public static double hectaresToAcres(double num)            { return (num*2.471); }
        public static double hectaresToSquareMiles(double num)      { return (num/259); }

        //Conversions from Square Kilometers
        public static double squareKiloMetersToSquareMilliMeters(double num) { return squareCentimetersToSquareMillimeters(squareKiloMetersToSquareCentiMeters(num)); }
        public static double squareKiloMetersToSquareCentiMeters(double num) { return (num*Math.exp(10)); }
        public static double squareKiloMetersToSquareMeters(double num)      { return (num*Math.pow(10,6)); }
        public static double squareKiloMetersToHectares(double num)          { return (num*100); }
        public static double squareKiloMetersToSquareInches(double num)      { return (num*1.55*Math.exp(9)); }
        public static double squareKiloMetersToSquareFeet(double num)        { return (num*1.076*Math.exp(7)); }
        public static double squareKiloMetersToSquareYards(double num)       { return (num*1.196*Math.exp(6)); }
        public static double squareKiloMetersToAcres(double num)             { return (num*247); }
        public static double squareKiloMetersToSquareMiles(double num)       { return acresToSquareMiles(squareKiloMetersToAcres(num)); }

        //Conversions from Square Inches
        public static double squareInchesToSquareMilliMeters(double num){ return squareCentimetersToSquareMillimeters(squareInchesToSquareCentiMeters(num)); }
        public static double squareInchesToSquareCentiMeters(double num){ return (num*6.452); }
        public static double squareInchesToSquareMeters(double num)     { return (num/1550); }
        public static double squareInchesToHectares(double num)         { return (num/(1.55*Math.exp(7))); }
        public static double squareInchesToSquareKiloMeters(double num) { return (num/(1.55*Math.exp(9))); }
        public static double squareInchesToSquareFeet(double num)       { return (num/144); }
        public static double squareInchesToSquareYards(double num)      { return (num/1296); }
        public static double squareInchesToAcres(double num)            { return (num/(6.273*Math.exp(6))); }
        public static double squareInchesToSquareMiles(double num)      { return acresToSquareMiles(squareInchesToAcres(num)); }

        //Conversions from Square Feet
        public static double squareFeetToSquareMilliMeters(double num){ return squareMetersToSquareMilliMeters(squareFeetToSquareMeters(num)); }
        public static double squareFeetToSquareCentiMeters(double num){ return squareMetersToSquareCentiMeters(squareFeetToSquareMeters(num)); }
        public static double squareFeetToSquareMeters(double num)     { return (num/10.764); }
        public static double squareFeetToHectares(double num)         { return (num/107639); }
        public static double squareFeetToSquareKiloMeters(double num) { return (num/(1.076*Math.exp(7))); }
        public static double squareFeetToSquareInches(double num)     { return (num*144); }
        public static double squareFeetToSquareYards(double num)      { return (num/9); }
        public static double squareFeetToAcres(double num)            { return (num/43560); }
        public static double squareFeetToSquareMiles(double num)      { return acresToSquareMiles(squareFeetToAcres(num)); }

        //Conversions from Square Yards
        public static double squareYardsToSquareMilliMeters(double num){ return squareMetersToSquareMilliMeters(squareYardsToSquareMeters(num)); }
        public static double squareYardsToSquareCentiMeters(double num){ return squareMetersToSquareCentiMeters(squareYardsToSquareMeters(num)); }
        public static double squareYardsToSquareMeters(double num)     { return (num/1.196); }
        public static double squareYardsToHectares(double num)         { return (num/11960); }
        public static double squareYardsToSquareKilometers(double num) { return (num/(1.196*Math.exp(6))); }
        public static double squareYardsToSquareInches(double num)     { return (num*1296); }
        public static double squareYardsToSquareFeet(double num)       { return (num*9); }
        public static double squareYardsToAcres(double num)            { return (num/4840); }
        public static double squareYardsToSquareMiles(double num)      { return acresToSquareMiles(squareYardsToAcres(num)); }

        //Conversions Acres
        public static double acresToSquareMilliMeters(double num) { return squareMetersToSquareMilliMeters(acresToSquareMeters(num)); }
        public static double acresToSquareCentiMeters(double num) { return squareMetersToSquareCentiMeters(acresToSquareMeters(num)); }
        public static double acresToSquareMeters(double num)      { return (num*4047); }
        public static double acresToHectares(double num)          { return (num/2.471); }
        public static double acresToSquareKiloMeters(double num)  { return (num/247); }
        public static double acresToSquareInches(double num)      { return (num*6.273*Math.exp(6)); }
        public static double acresToSquareFeet(double num)        { return (num*43560); }
        public static double acresToSquareYards(double num)       { return (num*4840); }
        public static double acresToSquareMiles(double num)       { return (num/640); }

        //Conversions from Square Miles
        public static double squareMilesToSquareMilliMeters(double num){ return squareKiloMetersToSquareMilliMeters(squareMilesToSquareKiloMeters(num)); }
        public static double squareMilesToSquareCentiMeters(double num){ return squareKiloMetersToSquareCentiMeters(squareMilesToSquareKiloMeters(num)); }
        public static double squareMilesToSquareMeters(double num)     { return squareKiloMetersToSquareMeters(squareMilesToSquareKiloMeters(num)); }
        public static double squareMilesToHectares(double num)         { return squareKiloMetersToHectares(squareMilesToSquareKiloMeters(num)); }
        public static double squareMilesToSquareKiloMeters(double num) { return (num*2.59); }
        public static double squareMilesToSquareInches(double num)     { return (num*4.014*Math.exp(9)); }
        public static double squareMilesToSquareFeet(double num)       { return (num*2.788*Math.exp(7)); }
        public static double squareMilesToSquareYards(double num)      { return (num*3.098*Math.exp(6)); }
        public static double squareMilesToAcres(double num)            { return (num*640); }

    }

    //Class for Pressure
    public static class Pressure{

        //Possible Conversions
        //Atmosphere , Bars , Kilopascals , Millimeters of Mercury , Pascals , Pounds Per Square Inch

        //Conversions from Atmosphere
        public static double atmosphereToBars(double num)                 { return (num*1.01325); }
        public static double atmosphereToKiloPascals(double num)          { return (num*101.325); }
        public static double atmosphereToMillimetersOfMercury(double num) { return (num*760); }
        public static double atmosphereToPascals(double num)              { return (num*101325); }
        public static double atmosphereToPoundsPerSquareInch(double num)  { return (num*14.696); }

        //Conversions from Bars
        public static double barsToAtmosphere(double num)           { return (num/1.013); }
        public static double barsToKiloPascals(double num)          { return (num*100); }
        public static double barsToMillimetersOfMercury(double num) { return (num*750); }
        public static double barsToPascals(double num)              { return (num*Math.pow(10,5)); }
        public static double barsToPoundsPerSquareInch(double num)  { return (num*14.504); }

        //Conversions from KiloPascals
        public static double kiloPascalsToAtmosphere(double num)           { return (num/101); }
        public static double kiloPascalsToBars(double num)                 { return (num/100); }
        public static double kiloPascalsToMillimetersOfMercury(double num) { return (num*7.501); }
        public static double kiloPascalsToPascals(double num)              { return (num*1000); }
        public static double kiloPascalsToPoundsPerSquareInch(double num)  { return (num/6.895); }

        //Conversions from Millimeters of Mercury
        public static double millimetersOfMercuryToAtmosphere(double num)          { return (num/760); }
        public static double millimetersOfMercuryToBars(double num)                { return (num/750); }
        public static double millimetersOfMercuryToKiloPascals(double num)         { return (num/7.501); }
        public static double millimetersOfMercuryToPascals(double num)             { return (num*133); }
        public static double millimetersOfMercuryToPoundsPerSquareInch(double num) { return (num*51.715); }

        //Conversion from Pascals
        public static double pascalsToAtmosphere(double num)           { return (num/101325); }
        public static double pascalsToBars(double num)                 { return (num/Math.pow(10,5)); }
        public static double pascalsToKiloPascals(double num)          { return (num*Math.pow(10,3)); }
        public static double pascalsToMilliMetersOfMercury(double num) { return (num/133); }
        public static double pascalsToPoundsPerSquareInch(double num)  { return (num/6895); }

        //Conversions from Pounds Per Square Inch
        public static double poundsPerSquareInchToAtmosphere(double num)           { return (num/14.696); }
        public static double poundsPerSquareInchToBars(double num)                 { return (num/14.504); }
        public static double poundsPerSquareInchToKiloPascals(double num)          { return (num*6.895); }
        public static double poundsPerSquareInchToMilliMetersOfMercury(double num) { return (num*51.715); }
        public static double poundsPerSquareInchToPascals(double num)              { return (num*6895); }
    }

    //Class for Power Conversions
    public static class Power{

        //Possible Conversion
        //Watts , KiloWatts , Horsepower , Foot-pounds Per Minute , BTUs/minute

        //Conversions from Watts
        public static double wattsToKiloWatts(double num)          { return (num/Math.pow(10,3)); }
        public static double wattsToHorsePower(double num)         { return (num/746); }
        public static double wattsToFootPoundsPerMinute(double num){ return horsePowerToFootPoundsPerMinute(wattsToHorsePower(num)); }
        public static double wattsToBTUsPerMinute(double num)      { return horsePowerToBTUsPerMinute(wattsToHorsePower(num)); }

        //Conversions from KiloWatts
        public static double kiloWattsToWatts(double num)               { return (num*Math.pow(10,3)); }
        public static double kiloWattsToHorsePower(double num)          { return (num*1.341); }
        public static double kiloWattsToFootPoundsPerMinute(double num) { return horsePowerToFootPoundsPerMinute(kiloWattsToHorsePower(num)); }
        public static double kiloWattsToBTUsPerMinute(double num)       { return horsePowerToBTUsPerMinute(kiloWattsToHorsePower(num)); }

        //Conversions from HorsePower
        public static double horsePowerToWatts(double num)               { return (num*746); }
        public static double horsePowerToKiloWatts(double num)           { return (num/1.341); }
        public static double horsePowerToFootPoundsPerMinute(double num) { return (num*33000); }
        public static double horsePowerToBTUsPerMinute(double num)       { return (num*42.4072); }

        //Conversion from FootPoundsPerMinute
        public static double footPoundsPerMinuteToWatts(double num)         { return kiloWattsToWatts(footPoundsPerMinuteToKiloWatts(num)); }
        public static double footPoundsPerMinuteToKiloWatts(double num)     { return (num*2.2596*Math.pow(10,-5)); }
        public static double footPoundsPerMinuteToHorsePower(double num)    { return (num*0.00003); }
        public static double footPoundsPerMinuteToBTUsPerMinute(double num) { return (num*0.0013); }

        //Conversion from BTUsPerMinute
        public static double bTUsPerMinuteToWatts(double num)               { return horsePowerToWatts(bTUsPerMinuteToHorsePower(num)); }
        public static double bTUsPerMinuteToKiloWatts(double num)           { return horsePowerToKiloWatts(bTUsPerMinuteToHorsePower(num)); }
        public static double bTUsPerMinuteToHorsePower(double num)          { return (num*0.02358); }
        public static double bTUsPerMinuteToFootPoundsPerMinute(double num) { return (num*778.169); }
    }

    //Class for Time Conversions
    public static class Time{

        //Possible Conversions
        //MicroSeconds , MilliSeconds , Seconds , Minutes , Hours , Days , Weeks , Years

        //Conversions from Microseconds
        public static double microSecondsToMilliSeconds(double num) { return (num/Math.pow(10,3)); }
        public static double microSecondsToSeconds(double num)      { return (num/Math.exp(6)); }
        public static double microSecondsToMinutes(double num)      { return secondsToMinutes(microSecondsToSeconds(num)); }
        public static double microSecondsToHours(double num)        { return secondsToHours(microSecondsToSeconds(num)); }
        public static double microSecondsToDays(double num)         { return hoursToDays(microSecondsToHours(num)); }
        public static double microSecondsToWeeks(double num)        { return hoursToWeeks(microSecondsToHours(num)); }
        public static double microSecondsToYears(double num)        { return weeksToYears(microSecondsToWeeks(num)); }

        //Conversions from Milliseconds
        public static double milliSecondsToMicroSeconds(double num) { return (num*Math.pow(10,3)); }
        public static double milliSecondsToSeconds(double num)      { return (num/Math.pow(10,3)); }
        public static double milliSecondsToMinutes(double num)      { return (num/(6*Math.pow(10,4))); }
        public static double milliSecondsToHours(double num)        { return minutesToHours(milliSecondsToMinutes(num)); }
        public static double milliSecondsToDays(double num)         { return minutesToDays(milliSecondsToMinutes(num)); }
        public static double milliSecondsToWeeks(double num)        { return hoursToWeeks(milliSecondsToHours(num)); }
        public static double milliSecondsToYears(double num)        { return hoursToYears(milliSecondsToHours(num)); }

        //Conversions from Seconds
        public static double secondsToMicroSeconds(double num)  { return (num*Math.exp(6)); }
        public static double secondsToMilliSeconds(double num)  { return (num*Math.pow(10,3)); }
        public static double secondsToMinutes(double num)       { return (num/60); }
        public static double secondsToHours(double num)         { return (num/3600); }
        public static double secondsToDays(double num)          { return (num/86400); }
        public static double secondsToWeeks(double num)         { return hoursToWeeks(secondsToHours(num)); }
        public static double secondsToYears(double num)         { return daysToYears(secondsToDays(num)); }

        //Conversions from Minutes
        public static double minutesToMicroSeconds(double num)  { return (num*6*Math.exp(7)); }
        public static double minutesToMilliSeconds(double num)  { return (num*6*Math.pow(10,4)); }
        public static double minutesToSeconds(double num)       { return (num*60); }
        public static double minutesToHours(double num)         { return (num/60); }
        public static double minutesToDays(double num)          { return hoursToDays(minutesToHours(num)); }
        public static double minutesToWeeks(double num)         { return hoursToWeeks(minutesToHours(num)); }
        public static double minutesToYears(double num)         { return hoursToYears(minutesToHours(num)); }

        //Conversions from Hours
        public static double hoursToMicroSeconds(double num) { return secondsToMicroSeconds(hoursToSeconds(num)); }
        public static double hoursToMilliSeconds(double num) { return secondsToMilliSeconds(hoursToSeconds(num)); }
        public static double hoursToSeconds(double num)      { return (num*3600); }
        public static double hoursToMinutes(double num)      { return (num*60); }
        public static double hoursToDays(double num)         { return (num/24); }
        public static double hoursToWeeks(double num)        { return (num/168); }
        public static double hoursToYears(double num)        { return (num/8760); }

        //Conversions from Days
        public static double daysToMicroSeconds(double num)  { return minutesToMicroSeconds(daysToMinutes(num)); }
        public static double daysToMilliSeconds(double num)  { return minutesToMilliSeconds(daysToMinutes(num)); }
        public static double daysToSeconds(double num)       { return (num*86400); }
        public static double daysToMinutes(double num)       { return (num*1440); }
        public static double daysToHours(double num)         { return (num*24); }
        public static double daysToWeeks(double num)         { return (num/7); }
        public static double daysToYears(double num)         { return (num/375); }

        //Conversions from Weeks
        public static double weeksToMicroSeconds(double num) { return hoursToMicroSeconds(weeksToHours(num)); }
        public static double weeksToMilliSeconds(double num) { return hoursToMilliSeconds(weeksToHours(num)); }
        public static double weeksToSeconds(double num)      { return hoursToSeconds(weeksToHours(num)); }
        public static double weeksToMinutes(double num)      { return hoursToMinutes(weeksToHours(num)); }
        public static double weeksToHours(double num)        { return (num*168); }
        public static double weeksToDays(double num)         { return (num*7); }
        public static double weeksToYears(double num)        { return (num*52.143); }

        //Conversions from Years
        public static double yearsToMicroSeconds(double num) { return daysToMicroSeconds(yearsToDays(num)); }
        public static double yearsToMilliSeconds(double num) { return daysToMilliSeconds(yearsToDays(num)); }
        public static double yearsToSeconds(double num)      { return daysToSeconds(yearsToDays(num)); }
        public static double yearsToMinutes(double num)      { return daysToMinutes(yearsToDays(num)); }
        public static double yearsToHours(double num)        { return daysToHours(yearsToDays(num)); }
        public static double yearsToDays(double num)         { return (num*365); }
        public static double yearsToWeeks(double num)        { return (num*52.143); }
    }

    //Class for Speed Conversions
    public static class Speed{
        //Possible Conversions
        //Centimetres per second , Metres Per Second , Kilometres Per Hour , Feet Per Second , Miles Per Hour , Knots , Mach

        //Conversions from CentiMetres per second
        public static double centiMetresPerSecondToMetrePerSecond(double num)    { return (num/100); }
        public static double centiMetresPerSecondToKiloMetersPerHour(double num) { return (num/27.778); }
        public static double centiMetresPerSecondToFeetPerSecond(double num)     { return kiloMetresPerHourToFeetPerSecond(centiMetresPerSecondToKiloMetersPerHour(num)); }
        public static double centiMetresPerSecondToMilesPerHour(double num)      { return kiloMetresPerHourToMilesPerHour(centiMetresPerSecondToKiloMetersPerHour(num)); }
        public static double centiMetresPerSecondToKnots(double num)             { return kiloMetresPerHourToKnots(centiMetresPerSecondToKiloMetersPerHour(num)); }
        public static double centiMetresPerSecondToMach(double num)              { return kiloMetresPerHourToMach(centiMetresPerSecondToKiloMetersPerHour(num)); }

        //Conversions from Metres Per Second
        public static double metresPerSecondToCentiMetresPerSecond(double num)   { return (num*100); }
        public static double metresPerSecondToKiloMetresPerHour(double num)      { return (num*3.6); }
        public static double metresPerSecondToFeetPerSecond(double num)          { return kiloMetresPerHourToFeetPerSecond(metresPerSecondToKiloMetresPerHour(num)); }
        public static double metresPerSecondToMilesPerHour(double num)           { return kiloMetresPerHourToMilesPerHour(metresPerSecondToKiloMetresPerHour(num)); }
        public static double metresPerSecondToKnots(double num)                  { return kiloMetresPerHourToKnots(metresPerSecondToKiloMetresPerHour(num)); }
        public static double metresPerSecondToMach(double num)                   { return kiloMetresPerHourToMach(metresPerSecondToKiloMetresPerHour(num)); }

        //Conversions from Kilometres Per hour
        public static double kiloMetresPerHourToCentiMetresPerSecond(double num) { return (num*27.7778); }
        public static double kiloMetresPerHourToMetresPerSecond(double num)      { return (num*3.6); }
        public static double kiloMetresPerHourToFeetPerSecond(double num)        { return (num/1.097); }
        public static double kiloMetresPerHourToMilesPerHour(double num)         { return (num/1.609); }
        public static double kiloMetresPerHourToKnots(double num)                { return (num/1.852); }
        public static double kiloMetresPerHourToMach(double num)                 { return (num/1235); }

        //Conversions from Feet Per Second
        public static double feetPerSecondToCentiMetresPerSecond(double num) { return (num*30.48); }
        public static double feetPerSecondToMetresPerSecond(double num)      { return (num/0.3048); }
        public static double feetPerSecondToKiloMetresPerHour(double num)    { return (num*1.097); }
        public static double feetPerSecondToMilesPerHour(double num)         { return (num/1.467); }
        public static double feetPerSecondToKnots(double num)                { return (num/1.688); }
        public static double feetPerSecondToMach(double num)                 { return (num/1125); }

        //Conversions from Miles Per Hour
        public static double milesPerHourToCentiMetresPerSecond(double num) { return (num*44.704); }
        public static double milesPerHourToMetresPerSecond(double num)      { return (num/2.237); }
        public static double milesPerHourToKiloMetresPerHour(double num)    { return (num/1.60934); }
        public static double milesPerHourToFeetPerSecond(double num)        { return (num*1.467); }
        public static double milesPerHourToKnots(double num)                { return (num/1.151); }
        public static double milesPerHourToMach(double num)                 { return (num/767); }

        //Conversions from Knots
        public static double knotsToCentiMetresPerSecond(double num)  { return (num*51.444); }
        public static double knotsToMetresPerSecond(double num)       { return (num/1.944); }
        public static double knotsToKiloMetresPerHour(double num)     { return (num*1.852); }
        public static double knotsToFeetPerSecond(double num)         { return (num*1.688); }
        public static double knotsToMilesPerHour(double num)          { return (num*1.151); }
        public static double knotsToMach(double num)                  { return (num/667); }

        //Conversions from Mach
        public static double machToCentiMetresPerSecond(double num) { return (num/34300); }
        public static double machToMetresPerSecond(double num)      { return (num*343); }
        public static double machToKiloMetresPerHour(double num)    { return (num*1235); }
        public static double machToFeetPerSecond(double num)        { return (num*1125); }
        public static double machToMilesPerHour(double num)         { return (num*767); }
        public static double machToKnots(double num)                { return (num*667); }
    }

    //Class for Energy
    public static class Energy{
        //Possible Conversions
        //Electron volts , Joules , KiloJoules , Thermal calories , Food Calories , Foot-Pounds ,

        //Conversions from Electron Volts
        public static double electronVoltsToJoules(double num)          { return (num/(6.242*Math.exp(18))); }
        public static double electronVoltsToKiloJoules(double num)      { return (num/(9.223*Math.exp(18))); }
        public static double electronVoltsToThermalCalories(double num) { return (num*3.8293*Math.exp(-20)); }
        public static double electronVoltsToFootPounds(double num)      { return (num/(8.462*Math.exp(18))); }
        public static double electronVoltsToFoodCalories(double num)    { return (num*3.829294*Math.exp(-23) ); }
        //Conversions from Joules
        public static double joulesToElectronVolts(double num)   { return (num*6.242*Math.exp(18)); }
        public static double joulesToKiloJoules(double num)      { return (num/1000); }
        public static double joulesToThermalCalories(double num) { return (num*0.23885); }
        public static double joulesToFoodCalories(double num)    { return (num*0.000239); }
        public static double joulesToFootPounds(double num)      { return (num/1.356); }

        //Conversions from Kilo Joules
        public static double kiloJoulesToElectronVolts(double num)   { return (num*9.223*Math.exp(18)); }
        public static double kiloJoulesToJoules(double num)          { return (num*1000); }
        public static double kiloJoulesToThermalCalories(double num) { return (num*0.2); }
        public static double kiloJoulesToFoodCalories(double num)    { return (num*0.239006); }
        public static double kiloJoulesToFootPounds(double num)      { return (num*737.56); }

        //Conversions from Thermal Calories
        public static double thermalCaloriesToElectronVolts(double num){ return (num*9.223*Math.exp(18)); }
        public static double thermalCaloriesToJoules(double num)       { return (num*4184); }
        public static double thermalCaloriesToKiloJoules(double num)   { return (num*4.184); }
        public static double thermalCaloriesToFoodCalories(double num) { return (num*0.001); }
        public static double thermalCaloriesToFootPounds(double num)   { return (num*3.086); }

        //Conversions from Food Calories
        public static double foodCaloriesToElectronVolts(double num)   { return (num*2.6*Math.exp(22)); }
        public static double foodCaloriesToJoules(double num)          { return (num*4184); }
        public static double foodCaloriesToKiloJoules(double num)      { return (num*4.184); }
        public static double foodCaloriesToThermalCalories(double num) { return (num*1000); }
        public static double foodCaloriesToFootPounds(double num)      { return (num*3085.96); }

        //Conversions from Foot Pounds
        public static double footPoundsToElectronVolts(double num)   { return (num*8.462*Math.exp(18)); }
        public static double footPoundsToJoules(double num)          { return (num*1.356); }
        public static double footPoundsToKiloJoules(double num)      { return (num/738); }
        public static double footPoundsToThermalCalories(double num) { return (num/3.086); }
        public static double footPoundsToFoodCalories(double num)    { return (num*0.000324); }
    }

    //Class For Volume Conversions
    public static class Volume{

        //Possible Conversions
        /*
            Millilitres , Litres , Cubic Metres , TeaSpoons , Fluid Ounces , Cups , Pints
            Quarts , Gallons , Cubic Inches , Cubic Feet , Cubic Yards
        */

        //Conversions from Millilitres
        public static double millilitresToLitres(double num)       { return (num/1000); }
        public static double millilitresToCubicMetres(double num)  { return (num/Math.exp(6)); }
        public static double millilitresToTeaSpoons(double num)    { return (num/4.929); }
        public static double millilitresToFluidOunces(double num)  { return (num/29.754); }
        public static double millilitresToCups(double num)         { return (num/237); }
        public static double millilitresToPints(double num)        { return (num/473); }
        public static double millilitresToQuarts(double num)       { return (num/946); }
        public static double millilitresToGallons(double num)      { return (num/3785); }
        public static double millilitresToCubicInches(double num)  { return gallonsToCubicInches(millilitresToGallons(num)); }
        public static double millilitresToCubicFeet(double num)    { return gallonsToCubicFeet(millilitresToGallons(num)); }
        public static double millilitresToCubicYards(double num)   { return gallonsToCubicYards(millilitresToGallons(num)); }

        //Conversions from Litres
        public static double litresToMillilitres(double num) { return (num*1000); }
        public static double litresToCubicMetres(double num) { return (num/1000); }
        public static double litresToTeaSpoons(double num)   { return (num*203); }
        public static double litresToFluidOunces(double num) { return (num*33.814); }
        public static double litresToCups(double num)        { return (num*4.227); }
        public static double litresToPints(double num)       { return cupsToPints(litresToCups(num)); }
        public static double litresToQuarts(double num)      { return cupsToQuarts(litresToCups(num)); }
        public static double litresToGallons(double num)     { return cupsToGallons(litresToCups(num)); }
        public static double litresToCubicInches(double num) { return cupsToCubicInches(litresToCups(num)); }
        public static double litresToCubicFeet(double num)   { return gallonsToCubicFeet(litresToGallons(num)); }
        public static double litresToCubicYards(double num)  { return gallonsToCubicYards(litresToGallons(num)); }

        //Conversions from Cubic Metres
        public static double cubicMetreToMillilitres(double num) { return (num*Math.exp(6)); }
        public static double cubicMetreToLitres(double num)      { return (num*1000); }
        public static double cubicMetreToTeaSpoons(double num)   { return (num*202884); }
        public static double cubicMetreToFluidOunces(double num) { return (num*33814); }
        public static double cubicMetreToCups(double num)        { return (num*4227); }
        public static double cubicMetreToPints(double num)       { return cupsToPints(cubicMetreToCups(num)); }
        public static double cubicMetreToQuarts(double num)      { return cupsToQuarts(cubicMetreToCups(num)); }
        public static double cubicMetreToGallons(double num)     { return cupsToGallons(cubicMetreToCups(num)); }
        public static double cubicMetreToCubicInches(double num) { return cupsToCubicInches(cubicMetreToCups(num)); }
        public static double cubicMetreToCubicFeet(double num)   { return gallonsToCubicFeet(cubicMetreToGallons(num)); }
        public static double cubicMetreToCubicYards(double num)  { return gallonsToCubicYards(cubicMetreToGallons(num)); }

        //Conversions from TeaSpoons
        public static double teaSpoonsToMillilitres(double num) { return (num*4.929); }
        public static double teaSpoonsToLitres(double num)      { return (num/203); }
        public static double teaSpoonsToCubicMetres(double num) { return (num/202844); }
        public static double teaSpoonsToFluidOunces(double num) { return (num/6); }
        public static double teaSpoonsToCups(double num)        { return (num/48); }
        public static double teaSpoonsToPints(double num)       { return cupsToPints(teaSpoonsToCups(num)); }
        public static double teaSpoonsToQuarts(double num)      { return cupsToQuarts(teaSpoonsToCups(num)); }
        public static double teaSpoonsToGallons(double num)     { return (num/768); }
        public static double teaSpoonsToCubicInches(double num) { return gallonsToCubicInches(teaSpoonsToGallons(num)); }
        public static double teaSpoonsToCubicFeet(double num)   { return gallonsToCubicFeet(teaSpoonsToGallons(num)); }
        public static double teaSpoonsToCubicYards(double num)  { return gallonsToCubicYards(teaSpoonsToGallons(num)); }

        //Conversions from Fluid Ounces
        public static double fluidOuncesToMillilitres(double num) { return (num*29.574); }
        public static double fluidOuncesToLitres(double num)      { return (num/33.814); }
        public static double fluidOuncesToCubicMetres(double num) { return (num/33814); }
        public static double fluidOuncesToTeaSpoons(double num)   { return (num*6); }
        public static double fluidOuncesToCups(double num)        { return (num/8); }
        public static double fluidOuncesToPints(double num)       { return cupsToPints(fluidOuncesToCups(num)); }
        public static double fluidOuncesToQuarts(double num)      { return cupsToQuarts(fluidOuncesToCups(num)); }
        public static double fluidOuncesToGallons(double num)     { return (num/128); }
        public static double fluidOuncesToCubicInches(double num) { return gallonsToCubicInches(fluidOuncesToGallons(num)); }
        public static double fluidOuncesToCubicFeet(double num)   { return gallonsToCubicFeet(fluidOuncesToGallons(num)); }
        public static double fluidOuncesToCubicYards(double num)  { return gallonsToCubicYards(fluidOuncesToGallons(num)); }

        //Conversions from Cups
        public static double cupsToMillilitres(double num) { return (num*237); }
        public static double cupsToLitres(double num)      { return (num/4.227); }
        public static double cupsToCubicMetres(double num) { return (num/4227); }
        public static double cupsToTeaSpoons(double num)   { return (num*48); }
        public static double cupsToFluidOunces(double num) { return (num*8); }
        public static double cupsToPints(double num)       { return (num/2); }
        public static double cupsToQuarts(double num)      { return (num/4); }
        public static double cupsToGallons(double num)     { return (num/16); }
        public static double cupsToCubicInches(double num) { return (num*14.438); }
        public static double cupsToCubicFeet(double num)   { return (num/120); }
        public static double cupsToCubicYards(double num)  { return (num/3232); }

        //Conversions from Pints
        public static double pintsToMillilitres(double num) { return teaSpoonsToMillilitres(pintsToTeaSpoons(num)); }
        public static double pintsToLitres(double num)      { return teaSpoonsToLitres(pintsToTeaSpoons(num)); }
        public static double pintsToCubicMetres(double num) { return teaSpoonsToCubicMetres(pintsToTeaSpoons(num)); }
        public static double pintsToTeaSpoons(double num)   { return (num*96); }
        public static double pintsToFluidOunces(double num) { return (num*16); }
        public static double pintsToCups(double num)        { return (num*2); }
        public static double pintsToQuarts(double num)      { return (num/2); }
        public static double pintsToGallons(double num)     { return (num/8); }
        public static double pintsToCubicInches(double num) { return (num*28.875); }
        public static double pintsToCubicFeet(double num)   { return cubicInchesToCubicFeet(pintsToCubicInches(num)); }
        public static double pintsToCubicYards(double num)  { return cubicInchesToCubicYards(pintsToCubicInches(num)); }

        //Conversions from Quarts
        public static double quartsToMillilitres(double num) { return teaSpoonsToMillilitres(quartsToTeaSpoons(num)); }
        public static double quartsToLitres(double num)      { return teaSpoonsToLitres(quartsToTeaSpoons(num)); }
        public static double quartsToCubicMetres(double num) { return teaSpoonsToCubicMetres(quartsToTeaSpoons(num)); }
        public static double quartsToTeaSpoons(double num)   { return (num*192); }
        public static double quartsToFluidOunces(double num) { return (num*32); }
        public static double quartsToCups(double num)        { return (num*4); }
        public static double quartsToPints(double num)       { return (num*2); }
        public static double quartsToGallons(double num)     { return (num/4); }
        public static double quartsToCubicInches(double num) { return (num*57.75); }
        public static double quartsToCubicFeet(double num)   { return (num/29.922); }
        public static double quartsToCubicYards(double num)  { return (num/808); }

        //Conversions from Gallons
        public static double gallonsToMillilitres(double num) { return teaSpoonsToMillilitres(gallonsToTeaSpoons(num)); }
        public static double gallonsToLitres(double num)      { return teaSpoonsToLitres(gallonsToTeaSpoons(num)); }
        public static double gallonsToCubicMetres(double num) { return teaSpoonsToCubicMetres(gallonsToTeaSpoons(num)); }
        public static double gallonsToTeaSpoons(double num)   { return (num*768); }
        public static double gallonsToFluidOunces(double num) { return (num*128); }
        public static double gallonsToCups(double num)        { return (num*16); }
        public static double gallonsToPints(double num)       { return (num*8); }
        public static double gallonsToQuarts(double num)      { return (num*4); }
        public static double gallonsToCubicInches(double num) { return (num*231); }
        public static double gallonsToCubicFeet(double num)   { return (num/7.481); }
        public static double gallonsToCubicYards(double num)  { return (num/202); }

        //Conversions from CubicInches
        public static double cubicInchesToMillilitres(double num) { return teaSpoonsToMillilitres(cubicInchesToTeaSpoons(num)); }
        public static double cubicInchesToLitres(double num)      { return teaSpoonsToLitres(cubicInchesToTeaSpoons(num)); }
        public static double cubicInchesToCubicMetres(double num) { return teaSpoonsToCubicMetres(cubicInchesToTeaSpoons(num)); }
        public static double cubicInchesToTeaSpoons(double num)   { return (num*3.325); }
        public static double cubicInchesToFluidOunces(double num) { return (num/1.805); }
        public static double cubicInchesToCups(double num)        { return (num/14.438); }
        public static double cubicInchesToPints(double num)       { return (num/28.875); }
        public static double cubicInchesToQuarts(double num)      { return (num/57.75); }
        public static double cubicInchesToGallons(double num)     { return (num/231); }
        public static double cubicInchesToCubicFeet(double num)   { return (num/1728); }
        public static double cubicInchesToCubicYards(double num)  { return (num/46656); }

        //Conversions from Cubic Feet
        public static double cubicFeetToMillilitres(double num) { return cupsToMillilitres(cubicFeetToCups(num)); }
        public static double cubicFeetToLitres(double num)      { return cupsToLitres(cubicFeetToCups(num)); }
        public static double cubicFeetToCubicMetres(double num) { return cupsToCubicMetres(cubicFeetToCups(num)); }
        public static double cubicFeetToTeaSpoons(double num)   { return cupsToTeaSpoons(cubicFeetToCups(num)); }
        public static double cubicFeetToFluidOunces(double num) { return cupsToFluidOunces(cubicFeetToCups(num)); }
        public static double cubicFeetToCups(double num)        { return (num*120); }
        public static double cubicFeetToPints(double num)       { return (num*59.844); }
        public static double cubicFeetToQuarts(double num)      { return (num*29.922); }
        public static double cubicFeetToGallons(double num)     { return (num*7.481); }
        public static double cubicFeetToCubicInches(double num) { return (num*1728); }
        public static double cubicFeetToCubicYards(double num)  { return (num/27); }

        //Conversions from Cubic Yards
        public static double cubicYardsToMillilitres(double num) { return cupsToMillilitres(cubicYardsToCups(num)); }
        public static double cubicYardsToLitres(double num)      { return cupsToLitres(cubicYardsToCups(num)); }
        public static double cubicYardsToCubicMetres(double num) { return cupsToCubicMetres(cubicYardsToCups(num)); }
        public static double cubicYardsToTeaSpoons(double num)   { return cupsToTeaSpoons(cubicYardsToCups(num)); }
        public static double cubicYardsToFluidOunces(double num) { return cupsToFluidOunces(cubicYardsToCups(num)); }
        public static double cubicYardsToCups(double num)        { return (num*3232); }
        public static double cubicYardsToPints(double num)       { return (num*1616); }
        public static double cubicYardsToQuarts(double num)      { return (num*808); }
        public static double cubicYardsToGallons(double num)     { return (num*202); }
        public static double cubicYardsToCubicInches(double num) { return (num*46656); }
        public static double cubicYardsToCubicFeet(double num)   { return (num*27); }
    }
    //Class for Temperature Conversions
    public static class Temperature{
        //Possible Conversions
        //Celsius , Fahrenheit , Kelvin , Rankine

        //Conversions from Celsius
        public static double celsiusToFahrenheit(double num) { return ((num*1.8)+32); }
        public static double celsiusToKelvin(double num) { return (num*273.15); }
        public static double celsiusToRankine(double num) { return ((num*1.8)+491.67); }

        //Conversions from Fahrenheit
        public static double fahrenheitToCelsius(double num) { return ((num-32)*(0.5556)); }
        public static double fahrenheitToKelvin(double num) { return (((num-32)*(0.5556))+273.15); }
        public static double fahrenheitToRankine(double num) { return (num*459.67); }

        //Conversions from kelvin
        public static double kelvinToCelsius(double num) { return (num-273.15); }
        public static double kelvinToFahrenheit(double num) { return (((num-273.15)*(1.8))+32); }
        public static double kelvinToRankine(double num) { return (num/1.8); }

        //Conversions from Rankine
        public static double rankineToCelsius(double num) { return ((num-491.67)*(0.5556)); }
        public static double rankineToFahrenheit(double num) { return (num-459.67); }
        public static double rankineToKelvin(double num) { return (num*1.8); }
    }
    //Class for Digital Storage Conversions
    public static class digitalStorage{
        /*Possible conversions
          Bits,Bytes,Nibbles,KiloBits,KiloBytes,MegaBits,MegaBytes,GigaBits,GigaBytes,TeraBits,TeraBytes
          PetaBits,PetaBytes,ExaBits,ExaBytes,ZettaBits,ZettaBytes,YottaBits,YottaBytes
        */
        //Conversions from Bits
        public static double bitsToBytes(double num)      { return (num/8); }
        public static double bitsToNibbles(double num)    { return (num/4); }
        public static double bitsToKiloBits(double num)   { return (num/1000); }
        public static double bitsToKiloBytes(double num)  { return (num/8000); }
        public static double bitsToMegaBits(double num)   { return (num/Math.exp(6)); }
        public static double bitsToMegaBytes(double num)  { return (num/(8*Math.exp(6))); }
        public static double bitsToGigaBits(double num)   { return megaBitsToGigaBits(bitsToMegaBits(num)); }
        public static double bitsToGigaBytes(double num)  { return megaBytesToGigaBytes(bitsToMegaBytes(num)); }
        public static double bitsToTeraBits(double num)   { return megaBitsToTeraBits(bitsToMegaBits(num)); }
        public static double bitsToTeraBytes(double num)  { return megaBytesToTeraBytes(bitsToMegaBytes(num)); }
        public static double bitsToPetaBits(double num)   { return gigaBitsToPetaBits(bitsToGigaBits(num)); }
        public static double bitsToPetaBytes(double num)  { return gigaBytesToPetaBytes(bitsToGigaBytes(num)); }
        public static double bitsToExaBits(double num)    { return gigaBitsToExaBits(bitsToGigaBits(num)); }
        public static double bitsToExaBytes(double num)   { return gigaBytesToExaBytes(bitsToGigaBytes(num)); }
        public static double bitsToZettaBits(double num)  { return gigaBitsToZettaBits(bitsToGigaBits(num)); }
        public static double bitsToZettaBytes(double num) { return gigaBytesToZettaBytes(bitsToGigaBytes(num)); }
        public static double bitsToYottaBits(double num)  { return gigaBitsToYottaBits(bitsToGigaBits(num)); }
        public static double bitsToYottaBytes(double num) { return gigaBytesToYottaBytes(bitsToGigaBytes(num)); }

        //Conversions from  Bytes
        public static double bytesToBits(double num)      { return (num*8); }
        public static double bytesToNibbles(double num)   { return (num*2); }
        public static double bytesToKiloBits(double num)  { return (num/125); }
        public static double bytesToKiloBytes(double num) { return (num/1000); }
        public static double bytesToMegaBits(double num)  { return (num/125000); }
        public static double bytesToMegaBytes(double num) { return (num/Math.exp(6)); }
        public static double bytesToGigaBits(double num)  { return megaBitsToGigaBits(bytesToMegaBits(num)); }
        public static double bytesToGigaBytes(double num) { return megaBytesToGigaBytes(bytesToMegaBytes(num)); }
        public static double bytesToTeraBits(double num)  { return megaBitsToTeraBits(bytesToMegaBits(num)); }
        public static double bytesToTeraBytes(double num) { return megaBytesToTeraBytes(bytesToMegaBytes(num)); }
        public static double bytesToPetaBits(double num)  { return gigaBitsToPetaBits(bytesToGigaBits(num)); }
        public static double bytesToPetaBytes(double num) { return megaBytesToPetaBytes(bytesToMegaBytes(num)); }
        public static double bytesToExaBits(double num)   { return gigaBitsToExaBits(bytesToGigaBits(num)); }
        public static double bytesToExaBytes(double num)  { return gigaBytesToExaBytes(bytesToGigaBytes(num)); }
        public static double bytesToZettaBits(double num) { return gigaBitsToZettaBits(bytesToGigaBits(num)); }
        public static double bytesToZettaBytes(double num){ return gigaBytesToZettaBytes(bytesToGigaBytes(num)); }
        public static double bytesToYottaBits(double num) { return gigaBitsToYottaBits(bytesToGigaBits(num)); }
        public static double bytesToYottaBytes(double num){ return gigaBytesToYottaBytes(bytesToGigaBytes(num)); }

        //Conversions From Nibbles
        public static double nibblesToBits(double num)      { return (num*4); }
        public static double nibblesToBytes(double num)     { return (num/2); }
        public static double nibblesToKiloBits(double num)  { return (num/250); }
        public static double nibblesToKiloBytes(double num) { return (num/2000); }
        public static double nibblesToMegaBits(double num)  { return (num/250000); }
        public static double nibblesToMegaBytes(double num) { return (num/(2*Math.exp(6))); }
        public static double nibblesToGigaBits(double num)  { return megaBitsToGigaBits(nibblesToMegaBits(num)); }
        public static double nibblesToGigaBytes(double num) { return megaBytesToGigaBytes(nibblesToMegaBytes(num)); }
        public static double nibblesToTeraBits(double num)  { return megaBitsToTeraBits(nibblesToMegaBits(num)); }
        public static double nibblesToTeraBytes(double num) { return megaBytesToTeraBytes(nibblesToMegaBytes(num)); }
        public static double nibblesToPetaBits(double num)  { return megaBitsToPetaBits(nibblesToMegaBits(num)); }
        public static double nibblesToPetaBytes(double num) { return megaBytesToPetaBytes(nibblesToMegaBytes(num)); }
        public static double nibblesToExaBits(double num)   { return gigaBitsToExaBits(nibblesToGigaBits(num)); }
        public static double nibblesToExaBytes(double num)  { return gigaBytesToExaBytes(nibblesToGigaBytes(num)); }
        public static double nibblesToZettaBits(double num) { return gigaBitsToZettaBits(nibblesToGigaBits(num)); }
        public static double nibblesToZettaBytes(double num){ return gigaBytesToZettaBytes(nibblesToGigaBytes(num)); }
        public static double nibblesToYottaBits(double num) { return gigaBitsToYottaBits(nibblesToGigaBits(num)); }
        public static double nibblesToYottaBytes(double num){ return gigaBytesToYottaBytes(nibblesToGigaBytes(num)); }

        //Conversions from Kilo Bits
        public static double kiloBitsToBits(double num)      { return (num*1000); }
        public static double kiloBitsToBytes(double num)     { return (num*125); }
        public static double kiloBitsToNibbles(double num)   { return (num*250); }
        public static double kiloBitsToKiloBytes(double num) { return (num/8); }
        public static double kiloBitsToMegaBits(double num)  { return (num/1000); }
        public static double kiloBitsToMegaBytes(double num) { return (num/8000); }
        public static double kiloBitsToGigaBits(double num)  { return (num/Math.exp(6)); }
        public static double kiloBitsToGigaBytes(double num) { return (num/(8*Math.exp(6))); }
        public static double kiloBitsToTeraBits(double num)  { return (num/Math.exp(9)); }
        public static double kiloBitsToTeraBytes(double num) { return (num/(8*Math.exp(9))); }
        public static double kiloBitsToPetaBits(double num)  { return (num/Math.exp(12)); }
        public static double kiloBitsToPetaBytes(double num) { return (num/(8*Math.exp(12))); }
        public static double kiloBitsToExaBits(double num)   { return petaBitsToExaBits(kiloBitsToPetaBits(num)); }
        public static double kiloBitsToExaBytes(double num)  { return petaBytesToExaBytes(kiloBitsToPetaBytes(num)); }
        public static double kiloBitsToZettaBits(double num) { return petaBitsToZettaBits(kiloBitsToPetaBits(num)); }
        public static double kiloBitsToZettaBytes(double num){ return petaBytesToZettaBytes(kiloBitsToPetaBytes(num)); }
        public static double kiloBitsToYottaBits(double num) { return petaBitsToYottaBits(kiloBitsToPetaBits(num)); }
        public static double kiloBitsToYottaBytes(double num){ return petaBytesToYottaBytes(kiloBitsToPetaBytes(num)); }

        //Conversions from Kilo Bytes
        public static double kiloBytesToBits(double num)      { return (num*8000); }
        public static double kiloBytesToBytes(double num)     { return (num*1000); }
        public static double kiloBytesToNibbles(double num)   { return (num*2000); }
        public static double kiloBytesToKiloBits(double num)  { return (num*8); }
        public static double kiloBytesToMegaBits(double num)  { return (num/125); }
        public static double kiloBytesToMegaBytes(double num) { return (num/1024); }
        public static double kiloBytesToGigaBits(double num)  { return (num/125000); }
        public static double kiloBytesToGigaBytes(double num) { return (num/Math.exp(6)); }
        public static double kiloBytesToTeraBits(double num)  { return (num/(1.25*Math.exp(8))); }
        public static double kiloBytesToTeraBytes(double num) { return (num/Math.exp(9)); }
        public static double kiloBytesToPetaBits(double num)  { return (num/(1.25*Math.exp(11))); }
        public static double kiloBytesToPetaBytes(double num) { return (num/Math.exp(12)); }
        public static double kiloBytesToExaBits(double num)   { return petaBitsToExaBits(kiloBytesToPetaBits(num)); }
        public static double kiloBytesToExaBytes(double num)  { return petaBytesToExaBytes(kiloBytesToPetaBytes(num)); }
        public static double kiloBytesToZettaBits(double num) { return petaBitsToZettaBits(kiloBytesToPetaBits(num)); }
        public static double kiloBytesToZettaBytes(double num){ return petaBytesToZettaBytes(kiloBytesToPetaBytes(num)); }
        public static double kiloBytesToYottaBits(double num) { return petaBitsToYottaBits(kiloBytesToPetaBits(num)); }
        public static double kiloBytesToYottaBytes(double num){ return petaBytesToYottaBytes(kiloBytesToPetaBytes(num)); }

        //Conversions from Mega Bits
        public static double megaBitsToBits(double num)      { return (num*Math.exp(6)); }
        public static double megaBitsToBytes(double num)     { return (num*125000); }
        public static double megaBitsToNibbles(double num)   { return (num*250000); }
        public static double megaBitsToKiloBits(double num)  { return (num*1000); }
        public static double megaBitsToKiloBytes(double num) { return (num*125); }
        public static double megaBitsToMegaBytes(double num) { return (num/8); }
        public static double megaBitsToGigaBits(double num)  { return (num/1000); }
        public static double megaBitsToGigaBytes(double num) { return (num/8000); }
        public static double megaBitsToTeraBits(double num)  { return (num/Math.exp(6)); }
        public static double megaBitsToTeraBytes(double num) { return (num/(8*Math.exp(6))); }
        public static double megaBitsToPetaBits(double num)  { return (num/Math.exp(9)); }
        public static double megaBitsToPetaBytes(double num) { return (num/(8*Math.exp(9))); }
        public static double megaBitsToExaBits(double num)   { return (num/Math.exp(12)); }
        public static double megaBitsToExaBytes(double num)  { return (num/(8*Math.exp(12))); }
        public static double megaBitsToZettaBits(double num) { return (num/Math.pow(10,15)); }
        public static double megaBitsToZettaBytes(double num){ return (num/(8*Math.exp(15))); }
        public static double megaBitsToYottaBits(double num) { return teraBitsToYottaBits(megaBitsToTeraBits(num)); }
        public static double megaBitsToYottaBytes(double num){ return (num/(8*Math.exp(18))); }

        //Conversions from Mega Bytes
        public static double megaBytesToBits(double num)      { return (num*8*Math.exp(6)); }
        public static double megaBytesToBytes(double num)     { return (num*Math.exp(6)); }
        public static double megaBytesToNibbles(double num)   { return (num*2*Math.exp(6)); }
        public static double megaBytesToKiloBits(double num)  { return (num*8000); }
        public static double megaBytesToKiloBytes(double num) { return (num*1000); }
        public static double megaBytesToMegaBits(double num)  { return (num*8); }
        public static double megaBytesToGigaBits(double num)  { return (num/125); }
        public static double megaBytesToGigaBytes(double num) { return (num/1000); }
        public static double megaBytesToTeraBits(double num)  { return (num*8*Math.pow(10,-6)); }
        public static double megaBytesToTeraBytes(double num) { return (num/Math.exp(6)); }
        public static double megaBytesToPetaBits(double num)  { return (num/(1.25*Math.exp(8))); }
        public static double megaBytesToPetaBytes(double num) { return (num/Math.exp(9)); }
        public static double megaBytesToExaBits(double num)   { return (num/(1.25*Math.exp(11))); }
        public static double megaBytesToExaBytes(double num)  { return (num/Math.exp(12)); }
        public static double megaBytesToZettaBits(double num) { return (num/(1.25*Math.exp(14))); }
        public static double megaBytesToZettaBytes(double num){ return (num/Math.exp(15)); }
        public static double megaBytesToYottaBits(double num) { return (num*8*Math.pow(10,-18)); }
        public static double megaBytesToYottaBytes(double num){ return (num/Math.exp(18)); }

        //Conversions From Giga Bits
        public static double gigaBitsToBits(double num)      { return (num*Math.exp(9)); }
        public static double gigaBitsToBytes(double num)     { return (num*1.25*Math.exp(8)); }
        public static double gigaBitsToNibbles(double num)   { return (num*2.5*Math.exp(8)); }
        public static double gigaBitsToKiloBits(double num)  { return (num*1000000); }
        public static double gigaBitsToKiloBytes(double num) { return (num*125000); }
        public static double gigaBitsToMegaBits(double num)  { return (num*1000); }
        public static double gigaBitsToMegaBytes(double num) { return ((num/8)*1000); }
        public static double gigaBitsToGigaBytes(double num) { return (num/8); }
        public static double gigaBitsToTeraBits(double num)  { return (num/1000); }
        public static double gigaBitsToTeraBytes(double num) { return (num/8000); }
        public static double gigaBitsToPetaBits(double num)  { return (num/Math.exp(6)); }
        public static double gigaBitsToPetaBytes(double num) { return (num/(8*Math.exp(6))); }
        public static double gigaBitsToExaBits(double num)   { return (num*Math.pow(10,-9)); }
        public static double gigaBitsToExaBytes(double num)  { return (num/(8*Math.exp(9))); }
        public static double gigaBitsToZettaBits(double num) { return (num*Math.pow(10,-12)); }
        public static double gigaBitsToZettaBytes(double num){ return (num/(8*Math.exp(12))); }
        public static double gigaBitsToYottaBits(double num) { return (num*Math.pow(10,-15)); }
        public static double gigaBitsToYottaBytes(double num){ return (num/(8*Math.exp(15))); }

        //Conversions from Giga Bytes
        public static double gigaBytesToBits(double num)       { return megaBitsToBits(gigaBytesToMegaBits(num)); }
        public static double gigaBytesToBytes(double num)      { return megaBytesToBytes(gigaBytesToMegaBytes(num)); }
        public static double gigaBytesToNibbles(double num)    { return megaBytesToNibbles(gigaBytesToMegaBytes(num)); }
        public static double gigaBytesToKiloBits(double num)   { return (num*8*Math.exp(6)); }
        public static double gigaBytesToKiloBytes(double num)  { return (num*1000000); }
        public static double gigaBytesToMegaBits(double num)   { return (num*8000); }
        public static double gigaBytesToMegaBytes(double num)  { return (num*1024); }
        public static double gigaBytesToGigaBits(double num)   { return (num*8); }
        public static double gigaBytesToTeraBits(double num)   { return (num/125); }
        public static double gigaBytesToTeraBytes(double num)  { return (num/1000); }
        public static double gigaBytesToPetaBits(double num)   { return (num/125000); }
        public static double gigaBytesToPetaBytes(double num)  { return (num/Math.exp(6)); }
        public static double gigaBytesToExaBits(double num)    { return (num/(1.25*Math.exp(8))); }
        public static double gigaBytesToExaBytes(double num)   { return (num/Math.exp(9)); }
        public static double gigaBytesToZettaBits(double num)  { return (num/(1.25*Math.exp(11))); }
        public static double gigaBytesToZettaBytes(double num) { return (num/Math.exp(12)); }
        public static double gigaBytesToYottaBits(double num)  { return (num/(1.25*Math.exp(14))); }
        public static double gigaBytesToYottaBytes(double num) { return (num/Math.exp(15)); }

        //Conversions from Tera Bits
        public static double teraBitsToBits(double num)      { return megaBitsToBits(teraBitsToMegaBits(num)); }
        public static double teraBitsToBytes(double num)     { return megaBytesToBytes(teraBitsToMegaBytes(num)); }
        public static double teraBitsToNibbles(double num)   { return megaBytesToNibbles(teraBitsToMegaBytes(num)); }
        public static double teraBitsToKiloBits(double num)  { return megaBitsToKiloBits(teraBitsToMegaBits(num)); }
        public static double teraBitsToKiloBytes(double num) { return megaBytesToKiloBytes(teraBitsToMegaBytes(num)); }
        public static double teraBitsToMegaBits(double num)  { return (num*1000000); }
        public static double teraBitsToMegaBytes(double num) { return (num*125000); }
        public static double teraBitsToGigaBits(double num)  { return megaBitsToGigaBits(teraBitsToMegaBits(num)); }
        public static double teraBitsToGigaBytes(double num) { return megaBytesToGigaBytes(teraBitsToMegaBytes(num)); }
        public static double teraBitsToTeraBytes(double num) { return (num/8); }
        public static double teraBitsToPetaBits(double num)  { return (num/1000); }
        public static double teraBitsToPetaBytes(double num) { return (num/8000); }
        public static double teraBitsToExaBits(double num)   { return (num/Math.pow(10,6)); }
        public static double teraBitsToExaBytes(double num)  { return (num/(8*Math.exp(6))); }
        public static double teraBitsToZettaBits(double num) { return (num/Math.pow(10,-9)); }
        public static double teraBitsToZettaBytes(double num){ return (num/(8*Math.exp(9))); }
        public static double teraBitsToYottaBits(double num) { return (num/Math.pow(10,12)); }
        public static double teraBitsToYottaBytes(double num){ return (num/(8*Math.exp(12))); }

        //Conversions from Tera Bytes
        public static double teraBytesToBits(double num)      { return (num*8*Math.exp(12)); }
        public static double teraBytesToBytes(double num)     { return megaBytesToBytes(teraBytesToMegaBytes(num)); }
        public static double teraBytesToNibbles(double num)   { return megaBytesToNibbles(teraBytesToMegaBytes(num)); }
        public static double teraBytesToKiloBits(double num)  { return (num*8*Math.exp(9)); }
        public static double teraBytesToKiloBytes(double num) { return (num*Math.exp(9)); }
        public static double teraBytesToMegaBits(double num)  { return (num*8*Math.exp(6)); }
        public static double teraBytesToMegaBytes(double num) { return (num*1000000); }
        public static double teraBytesToGigaBits(double num)  { return (num*8000); }
        public static double teraBytesToGigaBytes(double num) { return (num*1000); }
        public static double teraBytesToTeraBits(double num)  { return (num*8); }
        public static double teraBytesToPetaBits(double num)  { return (num/125); }
        public static double teraBytesToPetaBytes(double num) { return (num/1000); }
        public static double teraBytesToExaBits(double num)   { return (num/125000); }
        public static double teraBytesToExaBytes(double num)  { return (num/Math.exp(6)); }
        public static double teraBytesToZettaBits(double num) { return (num/(1.25*Math.exp(8))); }
        public static double teraBytesToZettaBytes(double num){ return (num/Math.exp(9)); }
        public static double teraBytesToYottaBits(double num) { return (num/(1.25*Math.exp(11))); }
        public static double teraBytesToYottaBytes(double num){ return (num/Math.exp(12)); }

        //Conversions from Peta Bits
        public static double petaBitsToBits(double num)      { return gigaBitsToBits(petaBitsToGigaBits(num)); }
        public static double petaBitsToBytes(double num)     { return gigaBytesToBytes(petaBitsToGigaBytes(num)); }
        public static double petaBitsToNibbles(double num)   { return (num*2.5*Math.exp(14)); }
        public static double petaBitsToKiloBits(double num)  { return gigaBitsToKiloBits(petaBitsToGigaBits(num)); }
        public static double petaBitsToKiloBytes(double num) { return gigaBytesToKiloBytes(petaBitsToGigaBytes(num)); }
        public static double petaBitsToMegaBits(double num)  { return gigaBitsToMegaBits(petaBitsToGigaBits(num)); }
        public static double petaBitsToMegaBytes(double num) { return gigaBytesToMegaBytes(petaBitsToGigaBytes(num)); }
        public static double petaBitsToGigaBits(double num)  { return (num*1000000); }
        public static double petaBitsToGigaBytes(double num) { return (num*125000); }
        public static double petaBitsToTeraBits(double num)  { return (num*1000); }
        public static double petaBitsToTeraBytes(double num) { return (num*125); }
        public static double petaBitsToPetaBytes(double num) { return (num/8); }
        public static double petaBitsToExaBits(double num)   { return (num/1000); }
        public static double petaBitsToExaBytes(double num)  { return (num/8000); }
        public static double petaBitsToZettaBits(double num) { return (num/1000000); }
        public static double petaBitsToZettaBytes(double num){ return (num/(8*Math.exp(6))); }
        public static double petaBitsToYottaBits(double num) { return (num/Math.pow(10,9)); }
        public static double petaBitsToYottaBytes(double num){ return (num*1.25*Math.exp(-10)); }

        //Conversions from Peta Bytes
        public static double petaBytesToBits(double num) { return gigaBitsToBits(petaBytesToGigaBits(num)); }
        public static double petaBytesToBytes(double num) { return gigaBytesToBytes(petaBytesToGigaBytes(num)); }
        public static double petaBytesToNibbles(double num) { return (num*2*Math.exp(15)); }
        public static double petaBytesToKiloBits(double num) { return gigaBitsToKiloBits(petaBytesToGigaBits(num)); }
        public static double petaBytesToKiloBytes(double num) { return gigaBytesToKiloBytes(petaBytesToGigaBytes(num)); }
        public static double petaBytesToMegaBits(double num) { return gigaBytesToMegaBits(petaBytesToGigaBits(num)); }
        public static double petaBytesToMegaBytes(double num) { return gigaBytesToMegaBytes(petaBytesToGigaBytes(num)); }
        public static double petaBytesToGigaBits(double num) { return (num*8*Math.exp(6)); }
        public static double petaBytesToGigaBytes(double num) { return (num*1000000); }
        public static double petaBytesToTeraBits(double num) { return (num*8000); }
        public static double petaBytesToTeraBytes(double num) { return (num*1000); }
        public static double petaBytesToPetaBits(double num) { return (num*8); }
        public static double petaBytesToExaBits(double num) { return (num/125); }
        public static double petaBytesToExaBytes(double num) { return (num/1000); }
        public static double petaBytesToZettaBits(double num) { return (num/125000); }
        public static double petaBytesToZettaBytes(double num) { return (num/Math.exp(6)); }
        public static double petaBytesToYottaBits(double num) { return (num/(1.25*Math.exp(8))); }
        public static double petaBytesToYottaBytes(double num) { return (num/Math.exp(9)); }

        //Conversions from Exa Bits
        public static double exaBitsToBits(double num) { return gigaBitsToBits(exaBitsToGigaBits(num)); }
        public static double exaBitsToBytes(double num) { return gigaBytesToBytes(exaBitsToGigaBytes(num)); }
        public static double exaBitsToNibbles(double num) { return (num*2.5*Math.exp(17)); }
        public static double exaBitsToKiloBits(double num) { return gigaBitsToKiloBits(exaBitsToGigaBits(num)); }
        public static double exaBitsToKiloBytes(double num) { return gigaBytesToKiloBytes(exaBitsToGigaBytes(num)); }
        public static double exaBitsToMegaBits(double num) { return gigaBitsToMegaBits(exaBitsToGigaBits(num)); }
        public static double exaBitsToMegaBytes(double num) { return gigaBytesToMegaBytes(exaBitsToGigaBytes(num)); }
        public static double exaBitsToGigaBits(double num) { return (num*Math.exp(9)); }
        public static double exaBitsToGigaBytes(double num) { return (num*1.25*Math.exp(8)); }
        public static double exaBitsToTeraBits(double num) { return (num*1000000); }
        public static double exaBitsToTeraBytes(double num) { return (num*125000); }
        public static double exaBitsToPetaBits(double num) { return (num*1000); }
        public static double exaBitsToPetaBytes(double num) { return (num*125); }
        public static double exaBitsToExaBytes(double num) { return (num*0.125); }
        public static double exaBitsToZettaBits(double num) { return (num*0.001); }
        public static double exaBitsToZettaBytes(double num) { return (num*0.000125); }
        public static double exaBitsToYottaBits(double num) { return (num/Math.pow(10,6)); }
        public static double exaBitsToYottaBytes(double num) { return (num*1.25*Math.exp(-7)); }

        //Conversions from Exa Bytes
        public static double exaBytesToBits(double num) { return gigaBitsToBits(exaBytesToGigaBits(num)); }
        public static double exaBytesToBytes(double num) { return gigaBytesToBytes(exaBytesToGigaBytes(num)); }
        public static double exaBytesToNibbles(double num) { return (num*2*Math.exp(18)); }
        public static double exaBytesToKiloBits(double num) { return gigaBitsToKiloBits(exaBytesToGigaBits(num)); }
        public static double exaBytesToKiloBytes(double num) { return gigaBytesToKiloBytes(exaBytesToGigaBytes(num)); }
        public static double exaBytesToMegaBits(double num) { return  gigaBitsToMegaBits(exaBytesToGigaBits(num)); }
        public static double exaBytesToMegaBytes(double num) { return gigaBytesToMegaBytes(exaBytesToGigaBytes(num)); }
        public static double exaBytesToGigaBits(double num) { return (num*8*Math.exp(9)); }
        public static double exaBytesToGigaBytes(double num) { return (num*Math.exp(9)); }
        public static double exaBytesToTeraBits(double num) { return (num*8*Math.exp(6)); }
        public static double exaBytesToTeraBytes(double num) { return (num*Math.exp(6)); }
        public static double exaBytesToPetaBits(double num) { return (num*8000); }
        public static double exaBytesToPetaBytes(double num) { return (num*8000); }
        public static double exaBytesToExaBits(double num) { return (num*8); }
        public static double exaBytesToZettaBits(double num) { return (num/125); }
        public static double exaBytesToZettaBytes(double num) { return (num/1000); }
        public static double exaBytesToYottaBits(double num) { return (num/125000); }
        public static double exaBytesToYottaBytes(double num) { return (num/Math.exp(6)); }

        //Conversions from Zetta Bits
        public static double zettaBitsToBits(double num) { return gigaBitsToBits(zettaBitsToGigaBits(num)); }
        public static double zettaBitsToBytes(double num) { return gigaBytesToBytes(zettaBitsToGigaBytes(num)); }
        public static double zettaBitsToNibbles(double num) { return gigaBitsToNibbles(zettaBitsToGigaBits(num)); }
        public static double zettaBitsToKiloBits(double num) { return gigaBitsToKiloBits(zettaBitsToGigaBits(num)); }
        public static double zettaBitsToKiloBytes(double num) { return gigaBytesToKiloBytes(zettaBitsToGigaBytes(num)); }
        public static double zettaBitsToMegaBits(double num) { return gigaBitsToMegaBits(zettaBitsToGigaBits(num)); }
        public static double zettaBitsToMegaBytes(double num) { return gigaBytesToMegaBytes(zettaBitsToGigaBytes(num)); }
        public static double zettaBitsToGigaBits(double num) { return (num*Math.pow(10,12)); }
        public static double zettaBitsToGigaBytes(double num) { return (num*125*Math.pow(10,9)); }
        public static double zettaBitsToTeraBits(double num) { return (num*Math.pow(10,9)); }
        public static double zettaBitsToTeraBytes(double num) { return (num*125*Math.pow(10,6)); }
        public static double zettaBitsToPetaBits(double num) { return (num*Math.pow(10,6)); }
        public static double zettaBitsToPetaBytes(double num) { return (num*125000); }
        public static double zettaBitsToExaBits(double num) { return (num*1000); }
        public static double zettaBitsToExaBytes(double num) { return (num*125); }
        public static double zettaBitsToZettaBytes(double num) { return (num*0.125); }
        public static double zettaBitsToYottaBits(double num) { return (num*0.001); }
        public static double zettaBitsToYottaBytes(double num) { return (num*0.000125); }

        //Conversions from Zetta Bytes
        public static double zettaBytesToBits(double num) { return gigaBitsToBits(zettaBytesToGigaBits(num)); }
        public static double zettaBytesToBytes(double num) { return gigaBytesToBytes(zettaBytesToGigaBytes(num)); }
        public static double zettaBytesToNibbles(double num) { return (num*2*Math.exp(21)); }
        public static double zettaBytesToKiloBits(double num) { return gigaBitsToKiloBits(zettaBytesToGigaBits(num)); }
        public static double zettaBytesToKiloBytes(double num) { return gigaBytesToKiloBytes(zettaBytesToGigaBytes(num)); }
        public static double zettaBytesToMegaBits(double num) { return gigaBitsToMegaBits(zettaBytesToGigaBits(num)); }
        public static double zettaBytesToMegaBytes(double num) { return gigaBytesToMegaBytes(zettaBytesToGigaBytes(num)); }
        public static double zettaBytesToGigaBits(double num) { return (num*8*Math.exp(12)); }
        public static double zettaBytesToGigaBytes(double num) { return (num*Math.exp(12)); }
        public static double zettaBytesToTeraBits(double num) { return (num*8*Math.exp(9)); }
        public static double zettaBytesToTeraBytes(double num) { return (num*Math.exp(9)); }
        public static double zettaBytesToPetaBits(double num) { return (num*8*Math.exp(6)); }
        public static double zettaBytesToPetaBytes(double num) { return (num*1000000); }
        public static double zettaBytesToExaBits(double num) { return gigaBitsToExaBits(zettaBytesToGigaBits(num)); }
        public static double zettaBytesToExaBytes(double num) { return (num*1000); }
        public static double zettaBytesToZettaBits(double num) { return (num*8); }
        public static double zettaBytesToYottaBits(double num) { return (num/125); }
        public static double zettaBytesToYottaBytes(double num) { return (num/1000); }


        //Conversions from Yotta Bits
        public static double yottaBitsToBits(double num) { return gigaBitsToBits(yottaBitsToGigaBits(num)); }
        public static double yottaBitsToBytes(double num) { return gigaBytesToBytes(yottaBitsToGigaBytes(num)); }
        public static double yottaBitsToNibbles(double num) { return (num*2.5*Math.exp(23)); }
        public static double yottaBitsToKiloBits(double num) { return gigaBitsToKiloBits(yottaBitsToGigaBits(num)); }
        public static double yottaBitsToKiloBytes(double num) { return gigaBytesToKiloBytes(yottaBitsToGigaBytes(num)); }
        public static double yottaBitsToMegaBits(double num) { return gigaBitsToMegaBits(yottaBitsToGigaBits(num)); }
        public static double yottaBitsToMegaBytes(double num) { return gigaBytesToMegaBytes(yottaBitsToGigaBytes(num)); }
        public static double yottaBitsToGigaBits(double num) { return (num*Math.exp(15)); }
        public static double yottaBitsToGigaBytes(double num) { return (num*1.25*Math.pow(10,14)); }
        public static double yottaBitsToTeraBits(double num) { return (num*Math.exp(12)); }
        public static double yottaBitsToTeraBytes(double num) { return (num*1.25*Math.exp(11)); }
        public static double yottaBitsToPetaBits(double num) { return (num*Math.exp(9)); }
        public static double yottaBitsToPetaBytes(double num) { return (num*1.25*Math.exp(8)); }
        public static double yottaBitsToExaBits(double num) { return gigaBitsToExaBits(yottaBitsToGigaBits(num)); }
        public static double yottaBitsToExaBytes(double num) { return (num*1000000); }
        public static double yottaBitsToZettaBits(double num) { return (num*1000); }
        public static double yottaBitsToZettaBytes(double num) { return (num*125); }
        public static double yottaBitsToYottaBytes(double num) { return (num/8); }

        //Conversions from Yotta Bytes
        public static double yottaBytesToBits(double num) { return gigaBitsToBits(yottaBytesToGigaBits(num)); }
        public static double yottaBytesToBytes(double num) { return gigaBytesToBytes(yottaBytesToGigaBytes(num)); }
        public static double yottaBytesToNibbles(double num) { return (num*2*Math.exp(24)); }
        public static double yottaBytesToKiloBits(double num) { return gigaBitsToKiloBits(yottaBytesToGigaBits(num)); }
        public static double yottaBytesToKiloBytes(double num) { return gigaBytesToKiloBytes(yottaBytesToGigaBytes(num)); }
        public static double yottaBytesToMegaBits(double num) { return gigaBitsToMegaBits(yottaBytesToGigaBits(num)); }
        public static double yottaBytesToMegaBytes(double num) { return gigaBytesToMegaBytes(yottaBytesToGigaBytes(num)); }
        public static double yottaBytesToGigaBits(double num) { return (num*8*Math.exp(15)); }
        public static double yottaBytesToGigaBytes(double num) { return (num*Math.exp(15)); }
        public static double yottaBytesToTeraBits(double num) { return (num*8*Math.exp(12)); }
        public static double yottaBytesToTeraBytes(double num) { return (num*Math.exp(12)); }
        public static double yottaBytesToPetaBits(double num) { return (num*8*Math.exp(9)); }
        public static double yottaBytesToPetaBytes(double num) { return (num*Math.exp(9)); }
        public static double yottaBytesToExaBits(double num) { return (num*8*Math.exp(6)); }
        public static double yottaBytesToExaBytes(double num) { return (num*Math.exp(6)); }
        public static double yottaBytesToZettaBits(double num) { return (num*8000); }
        public static double yottaBytesToZettaBytes(double num) { return (num*1000); }
        public static double yottaBytesToYottaBits(double num) { return (num*8); }

    }


}
