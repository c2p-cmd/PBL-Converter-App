package Converter.App.Unit.Conversion;

import Converter.App.Unit.Conversion.UnitConversion.*;

public class conversionsController {

    public static double conversionsInputValidator(String number) throws NumberFormatException {
        try {
            return Double.parseDouble(number);
        }
        catch (NumberFormatException parseException) {
            return Double.NaN;
        }
    }

    //Class if user wants to perform conversions on Distances
    public static class ForDistance{

        //Variables
        public static final String  Cm    = "Centimeter";
        public static final String  m     = "Meter ";
        public static final String  KM    = "KiloMeter ";
        public static final String  Miles = "Mile ";
        public static final String  Yards = "Yard ";
        public static final String  Ft    = "Feet";
        public static final String  Inch  = "Inch";
        public static final String  NauticalMi = "Nautical Mile ";

        private final String fromUnit;
        private final double value;

        ForDistance(String stringNum, String fromUnit) {
            this.value = conversionsInputValidator(stringNum);
            this.fromUnit = fromUnit;
        }

        public double toCM(){
            switch (this.fromUnit){
                case Cm:
                    return value;
                case m:
                    return Distance.centiToMeter(value);
                case KM:
                    return Distance.centiToKilo(value);
                case Miles:
                    return Distance.centiToMiles(value);
                case Yards:
                    return Distance.centiToYard(value);
                case Ft:
                    return Distance.centiToFoot(value);
                case Inch:
                    return Distance.centiToInches(value);
                case NauticalMi:
                    return Distance.centiToNauticalMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toMeter() {
            switch (this.fromUnit){
                case Cm:
                    return UnitConversion.Distance.meterToCenti(value);
                case m:
                    return value;
                case KM:
                    return UnitConversion.Distance.meterToKilo(value);
                case Miles:
                    return UnitConversion.Distance.meterToMiles(value);
                case Yards:
                    return UnitConversion.Distance.meterToYard(value);
                case Ft:
                    return UnitConversion.Distance.meterToFoot(value);
                case Inch:
                    return UnitConversion.Distance.meterToInches(value);
                case NauticalMi:
                    return UnitConversion.Distance.meterToNauticalMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toKiloMeter() {
            switch (this.fromUnit) {
                case Cm:
                    return UnitConversion.Distance.kiloToCenti(value);
                case m:
                    return UnitConversion.Distance.kiloToMeter(value);
                case KM:
                    return value;
                case Miles:
                    return UnitConversion.Distance.kiloToMiles(value);
                case Yards:
                    return UnitConversion.Distance.kiloToYard(value);
                case Ft:
                    return UnitConversion.Distance.kiloToFoot(value);
                case Inch:
                    return UnitConversion.Distance.kiloToInches(value);
                case NauticalMi:
                    return UnitConversion.Distance.kiloToNauticalMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toMiles() {
            switch (this.fromUnit){
                case Cm:
                    return UnitConversion.Distance.milesToCenti(value);
                case m:
                    return UnitConversion.Distance.milesToMeter(value);
                case KM:
                    return  UnitConversion.Distance.milesToKilo(value);
                case Miles:
                    return value;
                case Yards:
                    return UnitConversion.Distance.milesToYard(value);
                case Ft:
                    return UnitConversion.Distance.milesToFoot(value);
                case Inch:
                    return UnitConversion.Distance.milesToInches(value);
                case NauticalMi:
                    return UnitConversion.Distance.milesToNauticalMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toYards() {
            switch (this.fromUnit){
                case Cm:
                    return UnitConversion.Distance.yardToCenti(value);
                case m:
                    return UnitConversion.Distance.yardToMeter(value);
                case KM:
                    return UnitConversion.Distance.yardToKilo(value);
                case Miles:
                    return UnitConversion.Distance.yardToMiles(value);
                case Yards:
                    return value;
                case Ft:
                    return UnitConversion.Distance.yardToFoot(value);
                case Inch:
                    return UnitConversion.Distance.yardToInches(value);
                case NauticalMi:
                    return UnitConversion.Distance.yardToNauticalMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toFeet() {
            switch (this.fromUnit){
                case Cm:
                    return UnitConversion.Distance.footToCenti(value);
                case m:
                    return UnitConversion.Distance.footToMeter(value);
                case KM:
                    return  UnitConversion.Distance.footToKilo(value);
                case Miles:
                    return UnitConversion.Distance.footToMiles(value);
                case Yards:
                    return UnitConversion.Distance.footToYard(value);
                case Ft:
                    return value;
                case Inch:
                    return UnitConversion.Distance.footToInches(value);
                case NauticalMi:
                    return UnitConversion.Distance.footToNauticalMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toInches() {
            switch (this.fromUnit) {
                case Cm:
                    return UnitConversion.Distance.inchesToCenti(value);
                case m:
                    return UnitConversion.Distance.inchesToMeter(value);
                case KM:
                    return  UnitConversion.Distance.inchesToKilo(value);
                case Miles:
                    return UnitConversion.Distance.inchesToMiles(value);
                case Yards:
                    return UnitConversion.Distance.inchesToYard(value);
                case Ft:
                    return UnitConversion.Distance.inchesToFoot(value);
                case Inch:
                    return value;
                case NauticalMi:
                    return UnitConversion.Distance.inchesToNauticalMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toNauticalMiles() {
            switch (this.fromUnit) {
                case Cm:
                    return UnitConversion.Distance.nauticalMilesToCenti(value);
                case m:
                    return UnitConversion.Distance.nauticalMilesToMeter(value);
                case KM:
                    return  UnitConversion.Distance.nauticalMilesToKilo(value);
                case Miles:
                    return UnitConversion.Distance.nauticalMilesToMiles(value);
                case Yards:
                    return UnitConversion.Distance.nauticalMilesToYard(value);
                case Ft:
                    return UnitConversion.Distance.nauticalMilesToFoot(value);
                case Inch:
                    return UnitConversion.Distance.nauticalMilesToInches(value);
                case NauticalMi:
                    return value;
                default:
                    return 0.0;
            }
        }
    }
    //Class For distance Ends

    //Class if user wants to perform conversions on Distances
    public static class ForWeight{
        //Variables
        private static final String Carat    = "Carat";
        private static final String MilliGm  = "Milligram";
        private static final String CentiGM  = "Centigram";
        private static final String DeciGm   = "DeciGram";
        private static final String gm       = "Gram";
        private static final String DecaGm   = "DecaGram";
        private static final String HectoGm  = "Hectogram";
        private static final String kg       = "Kilogram";
        private static final String metricTn = "Metric Tonne";
        private static final String Ounces   = "Ounce";
        private static final String Pounds   = "Pound";
        private static final String Stone    = "Stone";

        private final String fromUnit;
        private final double value;

        ForWeight(String fromUnit, double value) {
            this.fromUnit = fromUnit;
            this.value = value;
        }

        public double toCarat() {
            switch (this.fromUnit){
                case Carat:
                    return value;
                case MilliGm:
                    return UnitConversion.Weight.caratsToMilligrams(value);
                case CentiGM:
                    return UnitConversion.Weight.caratsToCentigrams(value);
                case DeciGm:
                    return UnitConversion.Weight.caratsToDecigrams(value);
                case gm:
                    return UnitConversion.Weight.caratsToGrams(value);
                case DecaGm:
                    return UnitConversion.Weight.caratsToDecagrams(value);
                case HectoGm:
                    return UnitConversion.Weight.caratsToHectograms(value);
                case kg:
                    return UnitConversion.Weight.caratsToKilograms(value);
                case metricTn:
                    return UnitConversion.Weight.caratsToMetricTonnes(value);
                case Ounces:
                    return UnitConversion.Weight.caratsToOunces(value);
                case Pounds:
                    return UnitConversion.Weight.caratsToPounds(value);
                case Stone:
                    return UnitConversion.Weight.caratsToStone(value);
                default:
                    return 0.0;
            }
        }

        public double toMilliGram() {
            switch (this.fromUnit) {
                case Carat:
                    return UnitConversion.Weight.milligramsToCarats(value);
                case MilliGm:
                    return value;
                case CentiGM:
                    return UnitConversion.Weight.milligramsToCentigrams(value);
                case DeciGm:
                    return UnitConversion.Weight.milligramsToDecigrams(value);
                case gm:
                    return UnitConversion.Weight.milligramsToGrams(value);
                case DecaGm:
                    return UnitConversion.Weight.milligramsToDecagrams(value);
                case HectoGm:
                    return UnitConversion.Weight.milligramsToHectograms(value);
                case kg:
                    return UnitConversion.Weight.milligramsToKilograms(value);
                case metricTn:
                    return UnitConversion.Weight.milligramsToMetricTonnes(value);
                case Ounces:
                    return UnitConversion.Weight.milligramsToOunces(value);
                case Pounds:
                    return UnitConversion.Weight.milligramsToPounds(value);
                case Stone:
                    return UnitConversion.Weight.milligramsToStone(value);
                default:
                    return 0.0;
            }
        }

        public double toCentiGram() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.centigramsToCarats(value);
                case MilliGm:
                    return UnitConversion.Weight.centigramsToMilligrams(value);
                case CentiGM:
                    return value;
                case DeciGm:
                    return UnitConversion.Weight.centigramsToDecigrams(value);
                case gm:
                    return UnitConversion.Weight.centigramsToGrams(value);
                case DecaGm:
                    return UnitConversion.Weight.centigramsToDecagrams(value);
                case HectoGm:
                    return UnitConversion.Weight.centigramsToHectograms(value);
                case kg:
                    return UnitConversion.Weight.centigramsToKilograms(value);
                case metricTn:
                    return UnitConversion.Weight.centigramsToMetricTonnes(value);
                case Ounces:
                    return UnitConversion.Weight.centigramsToOunces(value);
                case Pounds:
                    return UnitConversion.Weight.centigramsToPounds(value);
                case Stone:
                    return UnitConversion.Weight.centigramsToStone(value);
                default:
                    return 0.0;
            }
        }

        public double toDeciGram() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.decigramsToCarats(value);
                case MilliGm:
                    return UnitConversion.Weight.decigramsToMilligrams(value);
                case CentiGM:
                    return UnitConversion.Weight.decigramsToCentigrams(value);
                case DeciGm:
                    return value;
                case gm:
                    return UnitConversion.Weight.decigramsToGrams(value);
                case DecaGm:
                    return UnitConversion.Weight.decigramsToDecagrams(value);
                case HectoGm:
                    return UnitConversion.Weight.decigramsToHectograms(value);
                case kg:
                    return UnitConversion.Weight.decigramsToKilograms(value);
                case metricTn:
                    return UnitConversion.Weight.decigramsToMetricTonnes(value);
                case Ounces:
                    return UnitConversion.Weight.decigramsToOunces(value);
                case Pounds:
                    return UnitConversion.Weight.decigramsToPounds(value);
                case Stone:
                    return UnitConversion.Weight.decigramsToStone(value);
                default:
                    return 0.0;
            }
        }

        public double toGrams() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.gramsToCarats(value);
                case MilliGm:
                    return UnitConversion.Weight.gramsToMilligrams(value);
                case CentiGM:
                    return UnitConversion.Weight.gramsToCentigrams(value);
                case DeciGm:
                    return UnitConversion.Weight.gramsToDecigrams(value);
                case gm:
                    return value;
                case DecaGm:
                    return UnitConversion.Weight.gramsToDecagrams(value);
                case HectoGm:
                    return UnitConversion.Weight.gramsToHectograms(value);
                case kg:
                    return UnitConversion.Weight.gramsToKilograms(value);
                case metricTn:
                    return UnitConversion.Weight.gramsToMetricTonnes(value);
                case Ounces:
                    return UnitConversion.Weight.gramsToOunces(value);
                case Pounds:
                    return UnitConversion.Weight.gramsToPounds(value);
                case Stone:
                    return UnitConversion.Weight.gramsToStone(value);
                default:
                    return 0.0;
            }
        }

        public double toDecaGrams() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.decagramsToCarats(value);
                case MilliGm:
                    return UnitConversion.Weight.decagramsToMilligrams(value);
                case CentiGM:
                    return UnitConversion.Weight.decagramsToCentigrams(value);
                case DeciGm:
                    return UnitConversion.Weight.decagramsToDecigrams(value);
                case gm:
                    return UnitConversion.Weight.decagramsToGrams(value);
                case DecaGm:
                    return value;
                case HectoGm:
                    return UnitConversion.Weight.decagramsToHectograms(value);
                case kg:
                    return UnitConversion.Weight.decagramsToKilograms(value);
                case metricTn:
                    return UnitConversion.Weight.decagramsToMetricTonnes(value);
                case Ounces:
                    return UnitConversion.Weight.decagramsToOunces(value);
                case Pounds:
                    return UnitConversion.Weight.decagramsToPounds(value);
                case Stone:
                    return UnitConversion.Weight.decagramsToStone(value);
                default:
                    return 0.0;
            }
        }

        public double toHectoGrams() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.hectogramsToCarats(value);
                case MilliGm:
                    return UnitConversion.Weight.hectogramsToMilligrams(value);
                case CentiGM:
                    return UnitConversion.Weight.hectogramsToCentigrams(value);
                case DeciGm:
                    return UnitConversion.Weight.hectogramsToDecigrams(value);
                case gm:
                    return UnitConversion.Weight.hectogramsToGrams(value);
                case DecaGm:
                    return UnitConversion.Weight.hectogramsToDecagrams(value);
                case HectoGm:
                    return (value);
                case kg:
                    return UnitConversion.Weight.hectogramsToKilograms(value);
                case metricTn:
                    return UnitConversion.Weight.hectogramsToMetricTonnes(value);
                case Ounces:
                    return UnitConversion.Weight.hectogramsToOunces(value);
                case Pounds:
                    return UnitConversion.Weight.hectogramsToPounds(value);
                case Stone:
                    return UnitConversion.Weight.hectogramsToStone(value);
                default:
                    return 0.0;
            }
        }

        public double toKiloGrams() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.kilogramsToCarats(value);
                case MilliGm:
                    return UnitConversion.Weight.kilogramsToMilligrams(value);
                case CentiGM:
                    return UnitConversion.Weight.kilogramsToCentigrams(value);
                case DeciGm:
                    return UnitConversion.Weight.kilogramsToDecigrams(value);
                case gm:
                    return UnitConversion.Weight.kilogramsToGrams(value);
                case DecaGm:
                    return UnitConversion.Weight.kilogramsToDecagrams(value);
                case HectoGm:
                    return UnitConversion.Weight.kilogramsToHectograms(value);
                case kg:
                    return (value);
                case metricTn:
                    return UnitConversion.Weight.kilogramsToMetricTonnes(value);
                case Ounces:
                    return UnitConversion.Weight.kilogramsToOunces(value);
                case Pounds:
                    return UnitConversion.Weight.kilogramsToPounds(value);
                case Stone:
                    return UnitConversion.Weight.kilogramsToStone(value);
                default:
                    return 0.0;
            }
        }

        public double toMetricTonnes() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.metrictonnesToCarats(value);
                case MilliGm:
                    return UnitConversion.Weight.metrictonnesToMilligrams(value);
                case CentiGM:
                    return UnitConversion.Weight.metrictonnesToCentigrams(value);
                case DeciGm:
                    return UnitConversion.Weight.metrictonnesToDecigrams(value);
                case gm:
                    return UnitConversion.Weight.metrictonnesToGrams(value);
                case DecaGm:
                    return UnitConversion.Weight.metrictonnesToDecagrams(value);
                case HectoGm:
                    return UnitConversion.Weight.metrictonnesToHectograms(value);
                case kg:
                    return UnitConversion.Weight.metrictonnesToKilograms(value);
                case metricTn:
                    return value;
                case Ounces:
                    return UnitConversion.Weight.metrictonnesToOunces(value);
                case Pounds:
                    return UnitConversion.Weight.metrictonnesToPounds(value);
                case Stone:
                    return UnitConversion.Weight.metrictonnesToStone(value);
                default:
                    return 0.0;
            }
        }

        public double toOunces() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.ouncesToCarats(value);
                case MilliGm:
                    return UnitConversion.Weight.ouncesToMilligrams(value);
                case CentiGM:
                    return UnitConversion.Weight.ouncesToCentigrams(value);
                case DeciGm:
                    return UnitConversion.Weight.ouncesToDecigrams(value);
                case gm:
                    return UnitConversion.Weight.ouncesToGrams(value);
                case DecaGm:
                    return UnitConversion.Weight.ouncesToDecagrams(value);
                case HectoGm:
                    return UnitConversion.Weight.ouncesToHectograms(value);
                case kg:
                    return UnitConversion.Weight.ouncesToKilograms(value);
                case metricTn:
                    return UnitConversion.Weight.ouncesToMetricTonnes(value);
                case Ounces:
                    return value;
                case Pounds:
                    return UnitConversion.Weight.ouncesToPounds(value);
                case Stone:
                    return UnitConversion.Weight.ouncesToStone(value);
                default:
                    return 0.0;
            }
        }

        public double toPounds() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.poundsToCarats(value);
                case MilliGm:
                    return UnitConversion.Weight.poundsToMilligrams(value);
                case CentiGM:
                    return UnitConversion.Weight.poundsToCentigrams(value);
                case DeciGm:
                    return UnitConversion.Weight.poundsToDecigrams(value);
                case gm:
                    return UnitConversion.Weight.poundsToGrams(value);
                case DecaGm:
                    return UnitConversion.Weight.poundsToDecagrams(value);
                case HectoGm:
                    return UnitConversion.Weight.poundsToHectograms(value);
                case kg:
                    return UnitConversion.Weight.poundsToKilograms(value);
                case metricTn:
                    return UnitConversion.Weight.poundsToMetricTonnes(value);
                case Ounces:
                    return UnitConversion.Weight.poundsToOunces(value);
                case Pounds:
                    return value;
                case Stone:
                    return UnitConversion.Weight.poundsToStone(value);
                default:
                    return 0.0;
            }
        }

        public double toStones() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.stoneToCarats(value);
                case MilliGm:
                    return UnitConversion.Weight.stoneToMilligrams(value);
                case CentiGM:
                    return UnitConversion.Weight.stoneToCentigrams(value);
                case DeciGm:
                    return UnitConversion.Weight.stoneToDecigrams(value);
                case gm:
                    return UnitConversion.Weight.stoneToGrams(value);
                case DecaGm:
                    return UnitConversion.Weight.stoneToDecagrams(value);
                case HectoGm:
                    return UnitConversion.Weight.stoneToHectograms(value);
                case kg:
                    return UnitConversion.Weight.stoneToKilograms(value);
                case metricTn:
                    return UnitConversion.Weight.stoneToMetricTonnes(value);
                case Ounces:
                    return UnitConversion.Weight.stoneToOunces(value);
                case Pounds:
                    return UnitConversion.Weight.stoneToPounds(value);
                case Stone:
                    return value;
                default:
                    return 0.0;
            }
        }
    }
    //Weight Class Ends

    //Class if user wants to perform conversions on angles
    public static class ForAngle{

        //Variables
        public static final String Deg    = "Degree";
        public static final String Rad    = "Radian";
        public static final String ArcSec = "ArcSecond";
        public static final String Grad   = "Gradian";

        private final String fromUnit;
        private final double value;

        ForAngle(String fromUnit, double value) {
            this.fromUnit = fromUnit;
            this.value = value;
        }

        public double toDegrees() {
            switch (this.fromUnit){
                case Deg:
                    return value;
                case Rad:
                    return UnitConversion.Angle.degreeToRadians(value);
                case ArcSec:
                    return UnitConversion.Angle.degreeToArcSeconds(value);
                case Grad:
                    return UnitConversion.Angle.degreeToGradians(value);
                default:
                    return 0.0;
            }
        }

        public double toRadians() {
            switch (this.fromUnit) {
                case Deg:
                    return UnitConversion.Angle.radiansToDegree(value);
                case Rad:
                    return (value);
                case ArcSec:
                    return UnitConversion.Angle.radiansToArcSeconds(value);
                case Grad:
                    return UnitConversion.Angle.radiansToGradians(value);
                default:
                    return 0.0;
            }
        }

        public double toArcSeconds() {
            switch (this.fromUnit){
                case Deg:
                    return UnitConversion.Angle.arcSecondsToDegree(value);
                case Rad:
                    return UnitConversion.Angle.arcSecondsToRadians(value);
                case ArcSec:
                    return (value);
                case Grad:
                    return UnitConversion.Angle.arcSecondsToGradians(value);
                default:
                    return 0.0;
            }
        }

        public double toGradian() {
            switch (this.fromUnit){
                case Deg:
                    return UnitConversion.Angle.gradiansToDegree(value);
                case Rad:
                    return UnitConversion.Angle.gradiansToRadians(value);
                case ArcSec:
                    return UnitConversion.Angle.gradiansToArcSeconds(value);
                case Grad:
                    return (value);
                default:
                    return 0.0;
            }
        }
    }
    //Angle Class ends

    //Class if user wants to perform conversions on Areas
    public static class ForArea{
        //Variables
        private static final String SqMm = "Square Millimetre";
        private static final String SqCm   = "Square Centimetre";
        private static final String Sqm    = "Square Metre";
        private static final String Hectare = "Hectare";
        private static final String SqKm   = "Square Kilometre";
        private static final String SqInch = "Square Inch";
        private static final String SqFt   = "Square Feet";
        private static final String SqYard = "Square Yards";
        private static final String Acres  = "Acre";
        private static final String SqMi   = "Square Miles";

        private final String fromUnit;
        private final double value;

        ForArea(double value, String fromUnit) {
            this.value = value;
            this.fromUnit = fromUnit;
        }

        public double toSquareMilimeters() {
            switch (this.fromUnit){
                case SqMm:
                    return value;
                case SqCm:
                    return UnitConversion.Area.squareMillimetersToSquareCentimeters(value);
                case Sqm:
                    return UnitConversion.Area.squareMillimetersToSquareMeters(value);
                case Hectare:
                    return UnitConversion.Area.squareMillimetersToHectares(value);
                case SqKm:
                    return UnitConversion.Area.squareMillimetersToSquareKilometers(value);
                case SqInch:
                    return UnitConversion.Area.squareMillimetersToSquareInches(value);
                case SqFt:
                    return UnitConversion.Area.squareMillimetersToSquareFeet(value);
                case SqYard:
                    return UnitConversion.Area.squareMillimetersToSquareYards(value);
                case Acres:
                    return UnitConversion.Area.squareMillimetersToAcres(value);
                case SqMi:
                    return UnitConversion.Area.squareMillimetersToSquareMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareCentimeters() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareCentimetersToSquareMillimeters(value);
                case SqCm:
                    return (value);
                case Sqm:
                    return UnitConversion.Area.squareCentimetersToSquareMeters(value);
                case Hectare:
                    return UnitConversion.Area.squareCentimetersToHectares(value);
                case SqKm:
                    return UnitConversion.Area.squareCentimetersToSquareKiloMeters(value);
                case SqInch:
                    return UnitConversion.Area.squareCentimetersToSquareInches(value);
                case SqFt:
                    return UnitConversion.Area.squareCentimetersToSquareFeet(value);
                case SqYard:
                    return UnitConversion.Area.squareCentimetersToSquareYards(value);
                case Acres:
                    return UnitConversion.Area.squareCentimetersToAcres(value);
                case SqMi:
                    return UnitConversion.Area.squareCentimetersToSquareMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareMeters() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareMetersToSquareMilliMeters(value);
                case SqCm:
                    return UnitConversion.Area.squareMetersToSquareCentiMeters(value);
                case Sqm:
                    return (value);
                case Hectare:
                    return UnitConversion.Area.squareMetersToHectares(value);
                case SqKm:
                    return UnitConversion.Area.squareMetersToSquareKilometers(value);
                case SqInch:
                    return UnitConversion.Area.squareMetersToSquareInches(value);
                case SqFt:
                    return UnitConversion.Area.squareMetersToSquareFeet(value);
                case SqYard:
                    return UnitConversion.Area.squareMetersToSquareYards(value);
                case Acres:
                    return UnitConversion.Area.squareMetersToAcres(value);
                case SqMi:
                    return UnitConversion.Area.squareMetersToSquareMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toHectare() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.hectaresToSquareMillimeters(value);
                case SqCm:
                    return UnitConversion.Area.hectaresToSquareCentimeters(value);
                case Sqm:
                    return UnitConversion.Area.hectaresToSquareMeters(value);
                case Hectare:
                    return (value);
                case SqKm:
                    return UnitConversion.Area.hectaresToSquareKiloMeters(value);
                case SqInch:
                    return UnitConversion.Area.hectaresToSquareInches(value);
                case SqFt:
                    return UnitConversion.Area.hectaresToSquareFeet(value);
                case SqYard:
                    return UnitConversion.Area.hectaresToSquareYards(value);
                case Acres:
                    return UnitConversion.Area.hectaresToAcres(value);
                case SqMi:
                    return UnitConversion.Area.hectaresToSquareMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareKiloMeters() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareKiloMetersToSquareMilliMeters(value);
                case SqCm:
                    return UnitConversion.Area.squareKiloMetersToSquareCentiMeters(value);
                case Sqm:
                    return UnitConversion.Area.squareKiloMetersToSquareMeters(value);
                case Hectare:
                    return UnitConversion.Area.squareKiloMetersToHectares(value);
                case SqKm:
                    return (value);
                case SqInch:
                    return UnitConversion.Area.squareKiloMetersToSquareInches(value);
                case SqFt:
                    return UnitConversion.Area.squareKiloMetersToSquareFeet(value);
                case SqYard:
                    return UnitConversion.Area.squareKiloMetersToSquareYards(value);
                case Acres:
                    return UnitConversion.Area.squareKiloMetersToAcres(value);
                case SqMi:
                    return UnitConversion.Area.squareKiloMetersToSquareMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareInches() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareInchesToSquareMilliMeters(value);
                case SqCm:
                    return UnitConversion.Area.squareInchesToSquareCentiMeters(value);
                case Sqm:
                    return UnitConversion.Area.squareInchesToSquareMeters(value);
                case Hectare:
                    return UnitConversion.Area.squareInchesToHectares(value);
                case SqKm:
                    return UnitConversion.Area.squareInchesToSquareKiloMeters(value);
                case SqInch:
                    return (value);
                case SqFt:
                    return UnitConversion.Area.squareInchesToSquareFeet(value);
                case SqYard:
                    return UnitConversion.Area.squareInchesToSquareYards(value);
                case Acres:
                    return UnitConversion.Area.squareInchesToAcres(value);
                case SqMi:
                    return UnitConversion.Area.squareInchesToSquareMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareFeet() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareFeetToSquareMilliMeters(value);
                case SqCm:
                    return UnitConversion.Area.squareFeetToSquareCentiMeters(value);
                case Sqm:
                    return UnitConversion.Area.squareFeetToSquareMeters(value);
                case Hectare:
                    return UnitConversion.Area.squareFeetToHectares(value);
                case SqKm:
                    return UnitConversion.Area.squareFeetToSquareKiloMeters(value);
                case SqInch:
                    return UnitConversion.Area.squareFeetToSquareInches(value);
                case SqFt:
                    return (value);
                case SqYard:
                    return UnitConversion.Area.squareFeetToSquareYards(value);
                case Acres:
                    return UnitConversion.Area.squareFeetToAcres(value);
                case SqMi:
                    return UnitConversion.Area.squareFeetToSquareMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareYards() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareYardsToSquareMilliMeters(value);
                case SqCm:
                    return UnitConversion.Area.squareYardsToSquareCentiMeters(value);
                case Sqm:
                    return UnitConversion.Area.squareYardsToSquareMeters(value);
                case Hectare:
                    return UnitConversion.Area.squareYardsToHectares(value);
                case SqKm:
                    return UnitConversion.Area.squareYardsToSquareKilometers(value);
                case SqInch:
                    return UnitConversion.Area.squareYardsToSquareInches(value);
                case SqFt:
                    return UnitConversion.Area.squareYardsToSquareFeet(value);
                case SqYard:
                    return (value);
                case Acres:
                    return UnitConversion.Area.squareYardsToAcres(value);
                case SqMi:
                    return UnitConversion.Area.squareYardsToSquareMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toAcres() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.acresToSquareMilliMeters(value);
                case SqCm:
                    return UnitConversion.Area.acresToSquareCentiMeters(value);
                case Sqm:
                    return UnitConversion.Area.acresToSquareMeters(value);
                case Hectare:
                    return UnitConversion.Area.acresToHectares(value);
                case SqKm:
                    return UnitConversion.Area.acresToSquareKiloMeters(value);
                case SqInch:
                    return UnitConversion.Area.acresToSquareInches(value);
                case SqFt:
                    return UnitConversion.Area.acresToSquareFeet(value);
                case SqYard:
                    return UnitConversion.Area.acresToSquareYards(value);
                case Acres:
                    return (value);
                case SqMi:
                    return UnitConversion.Area.acresToSquareMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareMiles() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareMilesToSquareMilliMeters(value);
                case SqCm:
                    return UnitConversion.Area.squareMilesToSquareCentiMeters(value);
                case Sqm:
                    return UnitConversion.Area.squareMilesToSquareMeters(value);
                case Hectare:
                    return UnitConversion.Area.squareMilesToHectares(value);
                case SqKm:
                    return UnitConversion.Area.squareMilesToSquareKiloMeters(value);
                case SqInch:
                    return UnitConversion.Area.squareMilesToSquareInches(value);
                case SqFt:
                    return UnitConversion.Area.squareMilesToSquareFeet(value);
                case SqYard:
                    return UnitConversion.Area.squareMilesToSquareYards(value);
                case Acres:
                    return UnitConversion.Area.squareMilesToAcres(value);
                case SqMi:
                    return (value);
                default:
                    return 0.0;
            }
        }
    }
    //Area Class ends

    //Class for Temperature
    public static class ForTemperature{
        //Variables
        public static final String Cel = "Celsius";
        public static final String Fah = "Fahrenheit";
        public static final String Kel = "Kelvin";
        public static final String Rankine = "Rankine";

        private final String fromUnit;
        private final double value;

        ForTemperature(double value, String fromUnit) {
            this.value = value;
            this.fromUnit = fromUnit;
        }

        public double toCelsius() {
            switch (this.fromUnit){
                case Cel:
                    return value;
                case Fah:
                    return Temperature.celsiusToFahrenheit(value);
                case Kel:
                    return Temperature.celsiusToKelvin(value);
                case Rankine:
                    return Temperature.celsiusToRankine(value);
                default:
                    return 0.0;
            }
        }

        public double toFahrenheit() {
            switch (this.fromUnit){
                case Cel:
                    return UnitConversion.Temperature.fahrenheitToCelsius(value);
                case Fah:
                    return (value);
                case Kel:
                    return UnitConversion.Temperature.fahrenheitToKelvin(value);
                case Rankine:
                    return UnitConversion.Temperature.fahrenheitToRankine(value);
                default:
                    return 0.0;
            }
        }

        public double toKelvin() {
            switch (this.fromUnit){
                case Cel:
                    return UnitConversion.Temperature.kelvinToCelsius(value);
                case Fah:
                    return UnitConversion.Temperature.kelvinToFahrenheit(value);
                case Kel:
                    return (value);
                case Rankine:
                    return UnitConversion.Temperature.kelvinToRankine(value);
                default:
                    return 0.0;
            }
        }

        public double toRankine() {
            switch (this.fromUnit){
                case Cel:
                    return UnitConversion.Temperature.rankineToCelsius(value);
                case Fah:
                    return UnitConversion.Temperature.rankineToFahrenheit(value);
                case Kel:
                    return UnitConversion.Temperature.rankineToKelvin(value);
                case Rankine:
                    return (value);
                default:
                    return 0.0;
            }
        }
    }
    //Class for Temperature ends

    //Class if user wants to perform conversions on Pressure
    public static class forPressure{

        //Variables
        public static final String Atm = "Atmosphere";
        public static final String Barr = "Bars";
        public static final String KiloPasc = "KiloPascal";
        public static final String MMofMerc = " Millimetre Of Mercury";
        public static final String Pasc = "Pascal";
        public static final String PPSperInch = "Pounds Per Square Inch";

        public static double pressure(String num , String unit1 , String unit2){

            try{
                double value = conversionsInputValidator(num);

                switch (unit1){

                    //Case if user wants conversions from Atmosphere
                    case Atm:
                        switch (unit2){
                            case Atm:
                                return value;
                            case Barr:
                                return Pressure.atmosphereToBars(value);
                            case KiloPasc:
                                return Pressure.atmosphereToKiloPascals(value);
                            case MMofMerc:
                                return Pressure.atmosphereToMillimetersOfMercury(value);
                            case Pasc:
                                return Pressure.atmosphereToPascals(value);
                            case PPSperInch:
                                return Pressure.atmosphereToPoundsPerSquareInch(value);
                        }
                        break;

                    //Case if user wants conversions from Bars
                    case Barr:
                        switch (unit2){
                            case Atm:
                                return Pressure.barsToAtmosphere(value);
                            case Barr:
                                return (value);
                            case KiloPasc:
                                return Pressure.barsToKiloPascals(value);
                            case MMofMerc:
                                return Pressure.barsToMillimetersOfMercury(value);
                            case Pasc:
                                return Pressure.barsToPascals(value);
                            case PPSperInch:
                                return Pressure.barsToPoundsPerSquareInch(value);
                        }
                        break;

                    //Case if user wants conversions from KiloPascals
                    case KiloPasc:
                        switch (unit2){
                            case Atm:
                                return Pressure.kiloPascalsToAtmosphere(value);
                            case Barr:
                                return Pressure.kiloPascalsToBars(value);
                            case KiloPasc:
                                return (value);
                            case MMofMerc:
                                return Pressure.kiloPascalsToMillimetersOfMercury(value);
                            case Pasc:
                                return Pressure.kiloPascalsToPascals(value);
                            case PPSperInch:
                                return Pressure.kiloPascalsToPoundsPerSquareInch(value);
                        }
                        break;

                    //Case if user wants conversions from Millimetres Of Mercury
                    case MMofMerc:
                        switch (unit2){
                            case Atm:
                                return Pressure.millimetersOfMercuryToAtmosphere(value);
                            case Barr:
                                return Pressure.millimetersOfMercuryToBars(value);
                            case KiloPasc:
                                return Pressure.millimetersOfMercuryToKiloPascals(value);
                            case MMofMerc:
                                return (value);
                            case Pasc:
                                return Pressure.millimetersOfMercuryToPascals(value);
                            case PPSperInch:
                                return Pressure.millimetersOfMercuryToPoundsPerSquareInch(value);
                        }
                        break;

                    //Case if user wants conversions from Pascals
                    case Pasc:
                        switch (unit2){
                            case Atm:
                                return Pressure.pascalsToAtmosphere(value);
                            case Barr:
                                return Pressure.pascalsToBars(value);
                            case KiloPasc:
                                return Pressure.pascalsToKiloPascals(value);
                            case MMofMerc:
                                return Pressure.pascalsToMilliMetersOfMercury(value);
                            case Pasc:
                                return (value);
                            case PPSperInch:
                                return Pressure.pascalsToPoundsPerSquareInch(value);
                        }
                        break;

                    //Case if user wants conversions from Pounds Per Inch
                    case PPSperInch:
                        switch (unit2){
                            case Atm:
                                return Pressure.poundsPerSquareInchToAtmosphere(value);
                            case Barr:
                                return Pressure.poundsPerSquareInchToBars(value);
                            case KiloPasc:
                                return Pressure.poundsPerSquareInchToKiloPascals(value);
                            case MMofMerc:
                                return Pressure.poundsPerSquareInchToMilliMetersOfMercury(value);
                            case Pasc:
                                return Pressure.poundsPerSquareInchToPascals(value);
                            case PPSperInch:
                                return Pressure.kiloPascalsToPoundsPerSquareInch(value);
                        }
                        break;
                }
            }
            catch (NumberFormatException numberFormatException){
                return 0.0;
            }
            return 0.0;
        }
    }
    //Pressure Class ends

    //Class for Power conversions
    public static class forPower{
        //Variables
        public static final String watt ="Watt";
        public static final String KiloWatt = "Kilo Watt";
        public static final String HP = "Horse Power";
        public static final String FTPpm = "Foot-Pounds Per Minute";
        public static final String BTU = " BTUs/Minute";

        public static double power(String num , String unit1 , String unit2){

            try{
                double value = conversionsInputValidator(num);
                switch (unit1){
                    //Case if user wants conversions from watts
                    case watt:
                        switch (unit2){
                            case watt:
                                return value;
                            case KiloWatt:
                                return Power.wattsToKiloWatts(value);
                            case HP:
                                return Power.wattsToHorsePower(value);
                            case FTPpm:
                                return Power.wattsToFootPoundsPerMinute(value);
                            case BTU:
                                return Power.wattsToBTUsPerMinute(value);
                        }
                        break;

                    //Case if user wants conversions from KiloWatts
                    case KiloWatt:
                        switch (unit2){
                            case watt:
                                return Power.kiloWattsToWatts(value);
                            case KiloWatt:
                                return (value);
                            case HP:
                                return Power.kiloWattsToHorsePower(value);
                            case FTPpm:
                                return Power.kiloWattsToFootPoundsPerMinute(value);
                            case BTU:
                                return Power.kiloWattsToBTUsPerMinute(value);
                        }
                        break;

                    //Case if user wants conversions from Horse Power
                    case HP:
                        switch (unit2){
                            case watt:
                                return Power.horsePowerToWatts(value);
                            case KiloWatt:
                                return Power.horsePowerToKiloWatts(value);
                            case HP:
                                return (value);
                            case FTPpm:
                                return Power.horsePowerToFootPoundsPerMinute(value);
                            case BTU:
                                return Power.horsePowerToBTUsPerMinute(value);
                        }
                        break;

                    //Case if user wants conversions from Foot-pounds Per Minute
                    case FTPpm:
                        switch (unit2){
                            case watt:
                                return Power.footPoundsPerMinuteToWatts(value);
                            case KiloWatt:
                                return Power.footPoundsPerMinuteToKiloWatts(value);
                            case HP:
                                return Power.footPoundsPerMinuteToHorsePower(value);
                            case FTPpm:
                                return (value);
                            case BTU:
                                return Power.footPoundsPerMinuteToBTUsPerMinute(value);
                        }
                        break;

                    //Case if user wants conversions from BTUs/minute
                    case BTU:
                        switch (unit2){
                            case watt:
                                return Power.bTUsPerMinuteToWatts(value);
                            case KiloWatt:
                                return Power.bTUsPerMinuteToKiloWatts(value);
                            case HP:
                                return Power.bTUsPerMinuteToHorsePower(value);
                            case FTPpm:
                                return Power.bTUsPerMinuteToFootPoundsPerMinute(value);
                            case BTU:
                                return (value);
                        }
                        break;
                }
            }
            catch (NumberFormatException numberFormatException){
                return 0.0;
            }
            return 0.0;
        }
    }
    //Power Class ends

    //Class for Time Conversions
    public static class forTime{
        //Variables
        public static final String MicroSec = "Micro Second";
        public static final String MilliSec = " Milli Second";
        public static final String Sec  = "Second";
        public static final String Min  = "Minute";
        public static final String Hrs  = "Hours";
        public static final String Day  = " Day";
        public static final String Week = "Week";
        public static final String Year = "Year";

        public static double time(String num , String unit1 , String unit2){
            try{
                double value = conversionsInputValidator(num);
                switch (unit1){

                    //Case is user wants conversions from MicroSeconds
                    case MicroSec:
                        switch (unit2){
                            case MicroSec:
                                return (value);
                            case MilliSec:
                                return Time.microSecondsToMilliSeconds(value);
                            case Sec:
                                return Time.microSecondsToSeconds(value);
                            case Min:
                                return Time.microSecondsToMinutes(value);
                            case Hrs:
                                return Time.microSecondsToHours(value);
                            case Day:
                                return Time.microSecondsToDays(value);
                            case Week:
                                return Time.microSecondsToWeeks(value);
                            case Year:
                                return Time.microSecondsToYears(value);
                        }
                        break;

                    //Case is user wants conversions from MilliSeconds
                    case MilliSec:
                        switch (unit2){
                            case MicroSec:
                                return Time.milliSecondsToMicroSeconds(value);
                            case MilliSec:
                                return (value);
                            case Sec:
                                return Time.milliSecondsToSeconds(value);
                            case Min:
                                return Time.milliSecondsToMinutes(value);
                            case Hrs:
                                return Time.milliSecondsToHours(value);
                            case Day:
                                return Time.milliSecondsToDays(value);
                            case Week:
                                return Time.milliSecondsToWeeks(value);
                            case Year:
                                return Time.milliSecondsToYears(value);
                        }
                        break;

                    //Case is user wants conversions from Seconds
                    case Sec:
                        switch (unit2){
                            case MicroSec:
                                return Time.secondsToMicroSeconds(value);
                            case MilliSec:
                                return Time.secondsToMilliSeconds(value);
                            case Sec:
                                return (value);
                            case Min:
                                return Time.secondsToMinutes(value);
                            case Hrs:
                                return Time.secondsToHours(value);
                            case Day:
                                return Time.secondsToDays(value);
                            case Week:
                                return Time.secondsToWeeks(value);
                            case Year:
                                return Time.secondsToYears(value);
                        }
                        break;

                    //Case is user wants conversions from Minutes
                    case Min:
                        switch (unit2){
                            case MicroSec:
                                return Time.minutesToMicroSeconds(value);
                            case MilliSec:
                                return Time.minutesToMilliSeconds(value);
                            case Sec:
                                return Time.minutesToSeconds(value);
                            case Min:
                                return (value);
                            case Hrs:
                                return Time.minutesToHours(value);
                            case Day:
                                return Time.minutesToDays(value);
                            case Week:
                                return Time.minutesToWeeks(value);
                            case Year:
                                return Time.minutesToYears(value);
                        }
                        break;

                    //Case is user wants conversions from Hours
                    case Hrs:
                        switch (unit2){
                            case MicroSec:
                                return Time.hoursToMicroSeconds(value);
                            case MilliSec:
                                return Time.hoursToMilliSeconds(value);
                            case Sec:
                                return Time.hoursToSeconds(value);
                            case Min:
                                return Time.hoursToMinutes(value);
                            case Hrs:
                                return (value);
                            case Day:
                                return Time.hoursToDays(value);
                            case Week:
                                return Time.hoursToWeeks(value);
                            case Year:
                                return Time.hoursToYears(value);
                        }
                        break;

                    //Case is user wants conversions from Days
                    case Day:
                        switch (unit2){
                            case MicroSec:
                                return Time.daysToMicroSeconds(value);
                            case MilliSec:
                                return Time.daysToMilliSeconds(value);
                            case Sec:
                                return Time.daysToSeconds(value);
                            case Min:
                                return Time.daysToMinutes(value);
                            case Hrs:
                                return Time.daysToHours(value);
                            case Day:
                                return (value);
                            case Week:
                                return Time.daysToWeeks(value);
                            case Year:
                                return Time.daysToYears(value);
                        }
                        break;

                    //Case is user wants conversions from MicroSeconds
                    case Week:
                        switch (unit2){
                            case MicroSec:
                                return Time.weeksToMicroSeconds(value);
                            case MilliSec:
                                return Time.weeksToMilliSeconds(value);
                            case Sec:
                                return Time.weeksToSeconds(value);
                            case Min:
                                return Time.weeksToMinutes(value);
                            case Hrs:
                                return Time.weeksToHours(value);
                            case Day:
                                return Time.weeksToDays(value);
                            case Week:
                                return (value);
                            case Year:
                                return Time.weeksToYears(value);
                        }
                        break;

                    //Case is user wants conversions from Years
                    case Year:
                        switch (unit2){
                            case MicroSec:
                                return Time.yearsToMicroSeconds(value);
                            case MilliSec:
                                return Time.yearsToMilliSeconds(value);
                            case Sec:
                                return Time.yearsToSeconds(value);
                            case Min:
                                return Time.yearsToMinutes(value);
                            case Hrs:
                                return Time.yearsToHours(value);
                            case Day:
                                return Time.yearsToDays(value);
                            case Week:
                                return Time.yearsToWeeks(value);
                            case Year:
                                return (value);
                        }
                        break;
                }
            }
            catch (NumberFormatException numberFormatException){
                return 0.0;
            }
            return 0.0;
        }
    }
    //Time Class ends

    //Class For Speed
    public static class forSpeed{
        //Variables
        public static final String CmPerSec = " Centimetre/s";
        public static final String MPerSec  = " Metre/s";
        public static final String KmPerHr  = " Kilometre/hr";
        public static final String FtPerSec = " Feet/s";
        public static final String MiPerHr  = "Miles/hr";
        public static final String Knot = "Knots";
        public static final String Mach = " Mach";

        public static double speed(String num , String unit1 , String unit2){

            try{
                double value = conversionsInputValidator(num);
                switch (unit1){
                    //Case if user wants conversion from CentiMetre Per Seconds
                    case CmPerSec:
                        switch (unit2){
                            case CmPerSec:
                                return (value);
                            case MPerSec:
                                return Speed.centiMetresPerSecondToMetrePerSecond(value);
                            case KmPerHr:
                                return Speed.centiMetresPerSecondToKiloMetersPerHour(value);
                            case FtPerSec:
                                return Speed.centiMetresPerSecondToFeetPerSecond(value);
                            case MiPerHr:
                                return Speed.centiMetresPerSecondToMilesPerHour(value);
                            case Knot:
                                return Speed.centiMetresPerSecondToKnots(value);
                            case Mach:
                                return Speed.centiMetresPerSecondToMach(value);
                        }
                        break;

                    //Case if user wants conversion from Metres Per Seconds
                    case MPerSec:
                        switch (unit2){
                            case CmPerSec:
                                return Speed.metresPerSecondToCentiMetresPerSecond(value);
                            case MPerSec:
                                return (value);
                            case KmPerHr:
                                return Speed.metresPerSecondToKiloMetresPerHour(value);
                            case FtPerSec:
                                return Speed.metresPerSecondToFeetPerSecond(value);
                            case MiPerHr:
                                return Speed.metresPerSecondToMilesPerHour(value);
                            case Knot:
                                return Speed.metresPerSecondToKnots(value);
                            case Mach:
                                return Speed.metresPerSecondToMach(value);
                        }
                        break;

                    //Case if user wants conversion from KiloMetres Per Hours
                    case KmPerHr:
                        switch (unit2){
                            case CmPerSec:
                                return Speed.kiloMetresPerHourToCentiMetresPerSecond(value);
                            case MPerSec:
                                return Speed.kiloMetresPerHourToMetresPerSecond(value);
                            case KmPerHr:
                                return (value);
                            case FtPerSec:
                                return Speed.kiloMetresPerHourToFeetPerSecond(value);
                            case MiPerHr:
                                return Speed.kiloMetresPerHourToMilesPerHour(value);
                            case Knot:
                                return Speed.kiloMetresPerHourToKnots(value);
                            case Mach:
                                return Speed.kiloMetresPerHourToMach(value);
                        }
                        break;

                    //Case if user wants conversion from Metres Per Seconds
                    case FtPerSec:
                        switch (unit2){
                            case CmPerSec:
                                return Speed.feetPerSecondToCentiMetresPerSecond(value);
                            case MPerSec:
                                return Speed.feetPerSecondToMetresPerSecond(value);
                            case KmPerHr:
                                return Speed.feetPerSecondToKiloMetresPerHour(value);
                            case FtPerSec:
                                return (value);
                            case MiPerHr:
                                return Speed.feetPerSecondToMilesPerHour(value);
                            case Knot:
                                return Speed.feetPerSecondToKnots(value);
                            case Mach:
                                return Speed.feetPerSecondToMach(value);
                        }
                        break;

                    //Case if user wants conversion from Miles Per Hour
                    case MiPerHr:
                        switch (unit2){
                            case CmPerSec:
                                return Speed.milesPerHourToCentiMetresPerSecond(value);
                            case MPerSec:
                                return Speed.milesPerHourToMetresPerSecond(value);
                            case KmPerHr:
                                return Speed.milesPerHourToKiloMetresPerHour(value);
                            case FtPerSec:
                                return Speed.milesPerHourToFeetPerSecond(value);
                            case MiPerHr:
                                return (value);
                            case Knot:
                                return Speed.milesPerHourToKnots(value);
                            case Mach:
                                return Speed.milesPerHourToMach(value);
                        }
                        break;

                    //Case if user wants conversion from Knots
                    case Knot:
                        switch (unit2){
                            case CmPerSec:
                                return Speed.knotsToCentiMetresPerSecond(value);
                            case MPerSec:
                                return Speed.knotsToMetresPerSecond(value);
                            case KmPerHr:
                                return Speed.knotsToKiloMetresPerHour(value);
                            case FtPerSec:
                                return Speed.knotsToFeetPerSecond(value);
                            case MiPerHr:
                                return Speed.knotsToMilesPerHour(value);
                            case Knot:
                                return (value);
                            case Mach:
                                return Speed.knotsToMach(value);
                        }
                        break;

                    //Case if user wants conversion from Metres Per Seconds
                    case Mach:
                        switch (unit2){
                            case CmPerSec:
                                return Speed.machToCentiMetresPerSecond(value);
                            case MPerSec:
                                return Speed.machToMetresPerSecond(value);
                            case KmPerHr:
                                return Speed.machToKiloMetresPerHour(value);
                            case FtPerSec:
                                return Speed.machToFeetPerSecond(value);
                            case MiPerHr:
                                return Speed.machToMilesPerHour(value);
                            case Knot:
                                return Speed.machToKnots(value);
                            case Mach:
                                return (value);
                        }
                        break;
                }
            }
            catch (NumberFormatException numberFormatException){
                return 0.0;
            }

            return 0.0;
        }
    }
    //Speed Class ends

    //Class for Energy Conversions
    public static class forEnergy{
        //Variables
        public static final String Ev = "Electron Volt";
        public static final String J = "Joule";
        public static final String KJ = "Kilo Joule";
        public static final String Cal = "Thermal Calories";
        public static final String FCal = "Food Calories";
        public static final String FtPounds = "Foot-Pounds";

        public static double energy(String num , String unit1 , String unit2){
            try{
                double value = conversionsInputValidator(num);
                switch (unit1){
                    //Case if user wants to perform conversions from Electron volt
                    case Ev:
                        switch (unit2){
                            case Ev:
                                return (value);
                            case J:
                                return Energy.electronVoltsToJoules(value);
                            case KJ:
                                return Energy.electronVoltsToKiloJoules(value);
                            case Cal:
                                return Energy.electronVoltsToThermalCalories(value);
                            case FtPounds:
                                return Energy.electronVoltsToFootPounds(value);
                            case FCal:
                                return Energy.electronVoltsToFoodCalories(value);
                        }
                        break;

                    //Case if user wants to perform conversions from Joules
                    case J:
                        switch (unit2){
                            case Ev:
                                return Energy.joulesToElectronVolts(value);
                            case J:
                                return (value);
                            case KJ:
                                return Energy.joulesToKiloJoules(value);
                            case Cal:
                                return Energy.joulesToThermalCalories(value);
                            case FtPounds:
                                return Energy.joulesToFootPounds(value);
                            case FCal:
                                return Energy.joulesToFoodCalories(value);
                        }
                        break;

                    //Case if user wants to perform conversions from Kilo Joules
                    case KJ:
                        switch (unit2){
                            case Ev:
                                return Energy.kiloJoulesToElectronVolts(value);
                            case J:
                                return Energy.kiloJoulesToJoules(value);
                            case KJ:
                                return (value);
                            case Cal:
                                return Energy.kiloJoulesToThermalCalories(value);
                            case FtPounds:
                                return Energy.kiloJoulesToFootPounds(value);
                            case FCal:
                                return Energy.kiloJoulesToFoodCalories(value);
                        }
                        break;

                    //Case if user wants to perform conversions from Calories
                    case Cal:
                        switch (unit2){
                            case Ev:
                                return Energy.thermalCaloriesToElectronVolts(value);
                            case J:
                                return Energy.thermalCaloriesToJoules(value);
                            case KJ:
                                return Energy.thermalCaloriesToKiloJoules(value);
                            case Cal:
                                return (value);
                            case FtPounds:
                                return Energy.thermalCaloriesToFootPounds(value);
                            case FCal:
                                return Energy.thermalCaloriesToFoodCalories(value);
                        }
                        break;

                    //Case if user wants to perform conversions from Foot-Pounds
                    case FtPounds:
                        switch (unit2){
                            case Ev:
                                return Energy.footPoundsToElectronVolts(value);
                            case J:
                                return Energy.footPoundsToJoules(value);
                            case KJ:
                                return Energy.footPoundsToKiloJoules(value);
                            case Cal:
                                return Energy.footPoundsToThermalCalories(value);
                            case FtPounds:
                                return (value);
                            case FCal:
                                return Energy.footPoundsToFoodCalories(value);
                        }
                        break;

                    //Case if user wants to perform conversions from Food Calories
                    case FCal:
                        switch (unit2){
                            case Ev:
                                return Energy.foodCaloriesToElectronVolts(value);
                            case J:
                                return Energy.foodCaloriesToJoules(value);
                            case KJ:
                                return Energy.foodCaloriesToKiloJoules(value);
                            case Cal:
                                return Energy.foodCaloriesToThermalCalories(value);
                            case FtPounds:
                                return Energy.foodCaloriesToFootPounds(value);
                            case FCal:
                                return (value);
                        }
                        break;
                }
            }
            catch (NumberFormatException numberFormatException) {
                return 0.0;
            }
            return 0.0;
        }
    }
    //Energy Class ends

    //Class for Volume
    public static class forVolume{
        //Variables
        public static final String MillLtrs   = "Millilitre";
        public static final String  Ltrs      = "Litre";
        public static final String  CubicMetre= "Cubic Metre";
        public static final String  TeaSpn    = "Tea Spoon";
        public static final String  FldOnc    = "Fluid Ounce";
        public static final String  Cups      = "Cup";
        public static final String  Pints     = "Pint";
        public static final String  Quarts    = "Quart";
        public static final String  Gall      = "Gallon";
        public static final String  CubicInch = "Cubic Inch";
        public static final String  CubicFt   = "Cubic Feet";
        public static final String  CubicYrd  = "Cubic Yard";

        public static double volume(String num , String unit1 , String unit2){
            try{
                double value = conversionsInputValidator(num);
                switch (unit1){
                    //Case if user wants conversion from Millilitres
                    case MillLtrs:
                        switch (unit2){
                            case MillLtrs:
                                return (value);
                            case Ltrs:
                                return Volume.millilitresToLitres(value);
                            case CubicMetre:
                                return Volume.millilitresToCubicMetres(value);
                            case TeaSpn:
                                return Volume.millilitresToTeaSpoons(value);
                            case FldOnc:
                                return Volume.millilitresToFluidOunces(value);
                            case Pints:
                                return Volume.millilitresToPints(value);
                            case Cups:
                                return Volume.millilitresToCups(value);
                            case Quarts:
                                return Volume.millilitresToQuarts(value);
                            case Gall:
                                return Volume.millilitresToGallons(value);
                            case CubicInch:
                                return Volume.millilitresToCubicInches(value);
                            case CubicFt:
                                return Volume.millilitresToCubicFeet(value);
                            case CubicYrd:
                                return Volume.millilitresToCubicYards(value);
                        }
                        break;

                    //Case if user wants conversion from Litres
                    case Ltrs:
                        switch (unit2){
                            case MillLtrs:
                                return Volume.litresToMillilitres(value);
                            case Ltrs:
                                return (value);
                            case CubicMetre:
                                return Volume.litresToCubicMetres(value);
                            case TeaSpn:
                                return Volume.litresToTeaSpoons(value);
                            case FldOnc:
                                return Volume.litresToFluidOunces(value);
                            case Pints:
                                return Volume.litresToPints(value);
                            case Cups:
                                return Volume.litresToCups(value);
                            case Quarts:
                                return Volume.litresToQuarts(value);
                            case Gall:
                                return Volume.litresToGallons(value);
                            case CubicInch:
                                return Volume.litresToCubicInches(value);
                            case CubicFt:
                                return Volume.litresToCubicFeet(value);
                            case CubicYrd:
                                return Volume.litresToCubicYards(value);
                        }
                        break;

                    //Case if user wants conversion from Cubic Metre
                    case CubicMetre:
                        switch (unit2){
                            case MillLtrs:
                                return Volume.cubicMetreToMillilitres(value);
                            case Ltrs:
                                return Volume.cubicMetreToLitres(value);
                            case CubicMetre:
                                return (value);
                            case TeaSpn:
                                return Volume.cubicMetreToTeaSpoons(value);
                            case FldOnc:
                                return Volume.cubicMetreToFluidOunces(value);
                            case Pints:
                                return Volume.cubicMetreToPints(value);
                            case Cups:
                                return Volume.cubicMetreToCups(value);
                            case Quarts:
                                return Volume.cubicMetreToQuarts(value);
                            case Gall:
                                return Volume.cubicMetreToGallons(value);
                            case CubicInch:
                                return Volume.cubicMetreToCubicInches(value);
                            case CubicFt:
                                return Volume.cubicMetreToCubicFeet(value);
                            case CubicYrd:
                                return Volume.cubicMetreToCubicYards(value);
                        }
                        break;

                    //Case if user wants conversion from Tea Spoons
                    case TeaSpn:
                        switch (unit2){
                            case MillLtrs:
                                return Volume.teaSpoonsToMillilitres(value);
                            case Ltrs:
                                return Volume.teaSpoonsToLitres(value);
                            case CubicMetre:
                                return Volume.teaSpoonsToCubicMetres(value);
                            case TeaSpn:
                                return (value);
                            case FldOnc:
                                return Volume.teaSpoonsToFluidOunces(value);
                            case Pints:
                                return Volume.teaSpoonsToPints(value);
                            case Cups:
                                return Volume.teaSpoonsToCups(value);
                            case Quarts:
                                return Volume.teaSpoonsToQuarts(value);
                            case Gall:
                                return Volume.teaSpoonsToGallons(value);
                            case CubicInch:
                                return Volume.teaSpoonsToCubicInches(value);
                            case CubicFt:
                                return Volume.teaSpoonsToCubicFeet(value);
                            case CubicYrd:
                                return Volume.teaSpoonsToCubicYards(value);
                        }
                        break;

                    //Case if user wants conversion from Fluid Ounce
                    case FldOnc:
                        switch (unit2){
                            case MillLtrs:
                                return Volume.fluidOuncesToMillilitres(value);
                            case Ltrs:
                                return Volume.fluidOuncesToLitres(value);
                            case CubicMetre:
                                return Volume.fluidOuncesToCubicMetres(value);
                            case TeaSpn:
                                return Volume.fluidOuncesToTeaSpoons(value);
                            case FldOnc:
                                return (value);
                            case Pints:
                                return Volume.fluidOuncesToPints(value);
                            case Cups:
                                return Volume.fluidOuncesToCups(value);
                            case Quarts:
                                return Volume.fluidOuncesToQuarts(value);
                            case Gall:
                                return Volume.fluidOuncesToGallons(value);
                            case CubicInch:
                                return Volume.fluidOuncesToCubicInches(value);
                            case CubicFt:
                                return Volume.fluidOuncesToCubicFeet(value);
                            case CubicYrd:
                                return Volume.fluidOuncesToCubicYards(value);
                        }
                        break;

                    //Case if user wants conversion from Pints
                    case Pints:
                        switch (unit2){
                            case MillLtrs:
                                return Volume.pintsToMillilitres(value);
                            case Ltrs:
                                return Volume.pintsToLitres(value);
                            case CubicMetre:
                                return Volume.pintsToCubicMetres(value);
                            case TeaSpn:
                                return Volume.pintsToTeaSpoons(value);
                            case FldOnc:
                                return Volume.pintsToFluidOunces(value);
                            case Pints:
                                return (value);
                            case Cups:
                                return Volume.pintsToCups(value);
                            case Quarts:
                                return Volume.pintsToQuarts(value);
                            case Gall:
                                return Volume.pintsToGallons(value);
                            case CubicInch:
                                return Volume.pintsToCubicInches(value);
                            case CubicFt:
                                return Volume.pintsToCubicFeet(value);
                            case CubicYrd:
                                return Volume.pintsToCubicYards(value);
                        }
                        break;

                    //Case if user wants conversion from Cups
                    case Cups:
                        switch (unit2){
                            case MillLtrs:
                                return Volume.cupsToMillilitres(value);
                            case Ltrs:
                                return Volume.cupsToLitres(value);
                            case CubicMetre:
                                return Volume.cupsToCubicMetres(value);
                            case TeaSpn:
                                return Volume.cupsToTeaSpoons(value);
                            case FldOnc:
                                return Volume.cupsToFluidOunces(value);
                            case Pints:
                                return Volume.cupsToPints(value);
                            case Cups:
                                return (value);
                            case Quarts:
                                return Volume.cupsToQuarts(value);
                            case Gall:
                                return Volume.cupsToGallons(value);
                            case CubicInch:
                                return Volume.cupsToCubicInches(value);
                            case CubicFt:
                                return Volume.cupsToCubicFeet(value);
                            case CubicYrd:
                                return Volume.cupsToCubicYards(value);
                        }
                        break;

                    //Case if user wants conversion from Quarts
                    case Quarts:
                        switch (unit2){
                            case MillLtrs:
                                return Volume.quartsToMillilitres(value);
                            case Ltrs:
                                return Volume.quartsToLitres(value);
                            case CubicMetre:
                                return Volume.quartsToCubicMetres(value);
                            case TeaSpn:
                                return Volume.quartsToTeaSpoons(value);
                            case FldOnc:
                                return Volume.quartsToFluidOunces(value);
                            case Pints:
                                return Volume.quartsToPints(value);
                            case Cups:
                                return Volume.quartsToCups(value);
                            case Quarts:
                                return (value);
                            case Gall:
                                return Volume.quartsToGallons(value);
                            case CubicInch:
                                return Volume.quartsToCubicInches(value);
                            case CubicFt:
                                return Volume.quartsToCubicFeet(value);
                            case CubicYrd:
                                return Volume.quartsToCubicYards(value);
                        }
                        break;

                    //Case if user wants conversion from Gallons
                    case Gall:
                        switch (unit2){
                            case MillLtrs:
                                return Volume.gallonsToMillilitres(value);
                            case Ltrs:
                                return Volume.gallonsToLitres(value);
                            case CubicMetre:
                                return Volume.gallonsToCubicMetres(value);
                            case TeaSpn:
                                return Volume.gallonsToTeaSpoons(value);
                            case FldOnc:
                                return Volume.gallonsToFluidOunces(value);
                            case Pints:
                                return Volume.gallonsToPints(value);
                            case Cups:
                                return Volume.gallonsToCups(value);
                            case Quarts:
                                return Volume.gallonsToQuarts(value);
                            case Gall:
                                return (value);
                            case CubicInch:
                                return Volume.gallonsToCubicInches(value);
                            case CubicFt:
                                return Volume.gallonsToCubicFeet(value);
                            case CubicYrd:
                                return Volume.gallonsToCubicYards(value);
                        }
                        break;

                    //Case if user wants conversion from Cubic Inches
                    case CubicInch:
                        switch (unit2){
                            case MillLtrs:
                                return Volume.cubicInchesToMillilitres(value);
                            case Ltrs:
                                return Volume.cubicInchesToLitres(value);
                            case CubicMetre:
                                return Volume.cubicInchesToCubicMetres(value);
                            case TeaSpn:
                                return Volume.cubicInchesToTeaSpoons(value);
                            case FldOnc:
                                return Volume.cubicInchesToFluidOunces(value);
                            case Pints:
                                return Volume.cubicInchesToPints(value);
                            case Cups:
                                return Volume.cubicInchesToCups(value);
                            case Quarts:
                                return Volume.cubicInchesToQuarts(value);
                            case Gall:
                                return Volume.cubicInchesToGallons(value);
                            case CubicInch:
                                return (value);
                            case CubicFt:
                                return Volume.cubicInchesToCubicFeet(value);
                            case CubicYrd:
                                return Volume.cubicInchesToCubicYards(value);
                        }
                        break;

                    //Case if user wants conversion from Cubic Feet
                    case CubicFt:
                        switch (unit2){
                            case MillLtrs:
                                return Volume.cubicFeetToMillilitres(value);
                            case Ltrs:
                                return Volume.cubicFeetToLitres(value);
                            case CubicMetre:
                                return Volume.cubicFeetToCubicMetres(value);
                            case TeaSpn:
                                return Volume.cubicFeetToTeaSpoons(value);
                            case FldOnc:
                                return Volume.cubicFeetToFluidOunces(value);
                            case Pints:
                                return Volume.cubicFeetToPints(value);
                            case Cups:
                                return Volume.cubicFeetToCups(value);
                            case Quarts:
                                return Volume.cubicFeetToQuarts(value);
                            case Gall:
                                return Volume.cubicFeetToGallons(value);
                            case CubicInch:
                                return Volume.cubicFeetToCubicInches(value);
                            case CubicFt:
                                return (value);
                            case CubicYrd:
                                return Volume.cubicFeetToCubicYards(value);
                        }
                        break;

                    //Case if user wants conversion from Cubic Yards
                    case CubicYrd:
                        switch (unit2){
                            case MillLtrs:
                                return Volume.cubicYardsToMillilitres(value);
                            case Ltrs:
                                return Volume.cubicYardsToLitres(value);
                            case CubicMetre:
                                return Volume.cubicYardsToCubicMetres(value);
                            case TeaSpn:
                                return Volume.cubicYardsToTeaSpoons(value);
                            case FldOnc:
                                return Volume.cubicYardsToFluidOunces(value);
                            case Pints:
                                return Volume.cubicYardsToPints(value);
                            case Cups:
                                return Volume.cubicYardsToCups(value);
                            case Quarts:
                                return Volume.cubicYardsToQuarts(value);
                            case Gall:
                                return Volume.cubicYardsToGallons(value);
                            case CubicInch:
                                return Volume.cubicYardsToCubicInches(value);
                            case CubicFt:
                                return Volume.cubicYardsToCubicFeet(value);
                            case CubicYrd:
                                return (value);
                        }
                        break;
                }
            }
            catch (NumberFormatException numberFormatException){
                return 0.0;
            }
            return 0.0;
        }
    }
    //Volume Class Ends

    //Class for Digital Storage
    public static class forDigitalStorage{
        //Variables
        public static final String Bit = "Bit";
        public static final String Bytes = "Byte";
        public static final String Nibble = "Nibble";
        public static final String Kbi = "KiloBit";
        public static final String Kby = "KiloByte";
        public static final String Mbi = "MegaBit";
        public static final String Mby = "MegaByte";
        public static final String Gbi = "GigaBit";
        public static final String Gby = "GigaByte";
        public static final String Tbi = "TeraBit";
        public static final String Tby = "TeraByte";
        public static final String Pbi = "PetaBit";
        public static final String Pby = "PetaByte";
        public static final String Ebi = "ExaBit";
        public static final String Eby = "ExaByte";
        public static final String Zbi = "ZettaBit";
        public static final String Zby = "ZettaByte";
        public static final String Ybi = "YottaBit";
        public static final String Yby = "YottaByte";

        public static double digitalStorage(String num , String unit1 , String unit2){
            try{
                double value = conversionsInputValidator(num);
                switch (unit1){
                    //Case conversions from Bit
                    case Bit:
                        switch (unit2){
                            case Bit:
                                return value;
                            case Bytes:
                                return digitalStorage.bitsToBytes(value);
                            case Nibble:
                                return digitalStorage.bitsToNibbles(value);
                            case Kbi:
                                return digitalStorage.bitsToKiloBits(value);
                            case Kby:
                                return digitalStorage.bitsToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.bitsToMegaBits(value);
                            case Mby:
                                return digitalStorage.bitsToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.bitsToGigaBits(value);
                            case Gby:
                                return digitalStorage.bitsToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.bitsToTeraBits(value);
                            case Tby:
                                return digitalStorage.bitsToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.bitsToPetaBits(value);
                            case Pby:
                                return digitalStorage.bitsToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.bitsToExaBits(value);
                            case Eby:
                                return digitalStorage.bitsToExaBytes(value);
                            case Zbi:
                                return digitalStorage.bitsToZettaBits(value);
                            case Zby:
                                return digitalStorage.bitsToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.bitsToYottaBits(value);
                            case Yby:
                                return digitalStorage.bitsToYottaBytes(value);
                        }
                        break;

                    //Case conversions from Bytes
                    case Bytes:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.bytesToBits(value);
                            case Bytes:
                                return (value);
                            case Nibble:
                                return digitalStorage.bytesToNibbles(value);
                            case Kbi:
                                return digitalStorage.bytesToKiloBits(value);
                            case Kby:
                                return digitalStorage.bytesToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.bytesToMegaBits(value);
                            case Mby:
                                return digitalStorage.bytesToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.bytesToGigaBits(value);
                            case Gby:
                                return digitalStorage.bytesToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.bytesToTeraBits(value);
                            case Tby:
                                return digitalStorage.bytesToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.bytesToPetaBits(value);
                            case Pby:
                                return digitalStorage.bytesToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.bytesToExaBits(value);
                            case Eby:
                                return digitalStorage.bytesToExaBytes(value);
                            case Zbi:
                                return digitalStorage.bytesToZettaBits(value);
                            case Zby:
                                return digitalStorage.bytesToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.bytesToYottaBits(value);
                            case Yby:
                                return digitalStorage.bytesToYottaBytes(value);
                        }
                        break;

                    //Case conversions from Nibbles
                    case Nibble:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.nibblesToBits(value);
                            case Bytes:
                                return digitalStorage.nibblesToBytes(value);
                            case Nibble:
                                return (value);
                            case Kbi:
                                return digitalStorage.nibblesToKiloBits(value);
                            case Kby:
                                return digitalStorage.nibblesToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.nibblesToMegaBits(value);
                            case Mby:
                                return digitalStorage.nibblesToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.nibblesToGigaBits(value);
                            case Gby:
                                return digitalStorage.nibblesToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.nibblesToTeraBits(value);
                            case Tby:
                                return digitalStorage.nibblesToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.nibblesToPetaBits(value);
                            case Pby:
                                return digitalStorage.nibblesToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.nibblesToExaBits(value);
                            case Eby:
                                return digitalStorage.nibblesToExaBytes(value);
                            case Zbi:
                                return digitalStorage.nibblesToZettaBits(value);
                            case Zby:
                                return digitalStorage.nibblesToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.nibblesToYottaBits(value);
                            case Yby:
                                return digitalStorage.nibblesToYottaBytes(value);
                        }
                        break;

                    //Case conversions from KiloBits
                    case Kbi:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.kiloBitsToBits(value);
                            case Bytes:
                                return digitalStorage.kiloBitsToBytes(value);
                            case Nibble:
                                return digitalStorage.kiloBitsToNibbles(value);
                            case Kbi:
                                return (value);
                            case Kby:
                                return digitalStorage.kiloBitsToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.kiloBitsToMegaBits(value);
                            case Mby:
                                return digitalStorage.kiloBitsToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.kiloBitsToGigaBits(value);
                            case Gby:
                                return digitalStorage.kiloBitsToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.kiloBitsToTeraBits(value);
                            case Tby:
                                return digitalStorage.kiloBitsToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.kiloBitsToPetaBits(value);
                            case Pby:
                                return digitalStorage.kiloBitsToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.kiloBitsToExaBits(value);
                            case Eby:
                                return digitalStorage.kiloBitsToExaBytes(value);
                            case Zbi:
                                return digitalStorage.kiloBitsToZettaBits(value);
                            case Zby:
                                return digitalStorage.kiloBitsToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.kiloBitsToYottaBits(value);
                            case Yby:
                                return digitalStorage.kiloBitsToYottaBytes(value);
                        }
                        break;

                    //Case conversions from Kilo Bytes
                    case Kby:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.kiloBytesToBits(value);
                            case Bytes:
                                return digitalStorage.kiloBytesToBytes(value);
                            case Nibble:
                                return digitalStorage.kiloBytesToNibbles(value);
                            case Kbi:
                                return digitalStorage.kiloBytesToKiloBits(value);
                            case Kby:
                                return (value);
                            case Mbi:
                                return digitalStorage.kiloBytesToMegaBits(value);
                            case Mby:
                                return digitalStorage.kiloBytesToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.kiloBytesToGigaBits(value);
                            case Gby:
                                return digitalStorage.kiloBytesToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.kiloBytesToTeraBits(value);
                            case Tby:
                                return digitalStorage.kiloBytesToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.kiloBytesToPetaBits(value);
                            case Pby:
                                return digitalStorage.kiloBytesToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.kiloBytesToExaBits(value);
                            case Eby:
                                return digitalStorage.kiloBytesToExaBytes(value);
                            case Zbi:
                                return digitalStorage.kiloBytesToZettaBits(value);
                            case Zby:
                                return digitalStorage.kiloBytesToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.kiloBytesToYottaBits(value);
                            case Yby:
                                return digitalStorage.kiloBytesToYottaBytes(value);
                        }
                        break;

                    //Case conversions from Mega Bits
                    case Mbi:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.megaBitsToBits(value);
                            case Bytes:
                                return digitalStorage.megaBitsToBytes(value);
                            case Nibble:
                                return digitalStorage.megaBitsToNibbles(value);
                            case Kbi:
                                return digitalStorage.megaBitsToKiloBits(value);
                            case Kby:
                                return digitalStorage.megaBitsToKiloBytes(value);
                            case Mbi:
                                return (value);
                            case Mby:
                                return digitalStorage.megaBitsToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.megaBitsToGigaBits(value);
                            case Gby:
                                return digitalStorage.megaBitsToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.megaBitsToTeraBits(value);
                            case Tby:
                                return digitalStorage.megaBitsToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.megaBitsToPetaBits(value);
                            case Pby:
                                return digitalStorage.megaBitsToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.megaBitsToExaBits(value);
                            case Eby:
                                return digitalStorage.megaBitsToExaBytes(value);
                            case Zbi:
                                return digitalStorage.megaBitsToZettaBits(value);
                            case Zby:
                                return digitalStorage.megaBitsToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.megaBitsToYottaBits(value);
                            case Yby:
                                return digitalStorage.megaBitsToYottaBytes(value);
                        }
                        break;

                    //Case conversions from MegaBytes
                    case Mby:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.megaBytesToBits(value);
                            case Bytes:
                                return digitalStorage.megaBytesToBytes(value);
                            case Nibble:
                                return digitalStorage.megaBytesToNibbles(value);
                            case Kbi:
                                return digitalStorage.megaBytesToKiloBits(value);
                            case Kby:
                                return digitalStorage.megaBytesToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.megaBytesToMegaBits(value);
                            case Mby:
                                return (value);
                            case Gbi:
                                return digitalStorage.megaBytesToGigaBits(value);
                            case Gby:
                                return digitalStorage.megaBytesToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.megaBytesToTeraBits(value);
                            case Tby:
                                return digitalStorage.megaBytesToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.megaBytesToPetaBits(value);
                            case Pby:
                                return digitalStorage.megaBytesToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.megaBytesToExaBits(value);
                            case Eby:
                                return digitalStorage.megaBytesToExaBytes(value);
                            case Zbi:
                                return digitalStorage.megaBytesToZettaBits(value);
                            case Zby:
                                return digitalStorage.megaBytesToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.megaBytesToYottaBits(value);
                            case Yby:
                                return digitalStorage.megaBytesToYottaBytes(value);
                        }
                        break;

                    //Case conversions from GigaBits
                    case Gbi:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.gigaBitsToBits(value);
                            case Bytes:
                                return digitalStorage.gigaBitsToBytes(value);
                            case Nibble:
                                return digitalStorage.gigaBitsToNibbles(value);
                            case Kbi:
                                return digitalStorage.gigaBitsToKiloBits(value);
                            case Kby:
                                return digitalStorage.gigaBitsToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.gigaBitsToMegaBits(value);
                            case Mby:
                                return digitalStorage.gigaBitsToMegaBytes(value);
                            case Gbi:
                                return (value);
                            case Gby:
                                return digitalStorage.gigaBitsToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.gigaBitsToTeraBits(value);
                            case Tby:
                                return digitalStorage.gigaBitsToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.gigaBitsToPetaBits(value);
                            case Pby:
                                return digitalStorage.gigaBitsToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.gigaBitsToExaBits(value);
                            case Eby:
                                return digitalStorage.gigaBitsToExaBytes(value);
                            case Zbi:
                                return digitalStorage.gigaBitsToZettaBits(value);
                            case Zby:
                                return digitalStorage.gigaBitsToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.gigaBitsToYottaBits(value);
                            case Yby:
                                return digitalStorage.gigaBitsToYottaBytes(value);
                        }
                        break;

                    //Case conversions from Giga Bytes
                    case Gby:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.gigaBytesToBits(value);
                            case Bytes:
                                return digitalStorage.gigaBytesToBytes(value);
                            case Nibble:
                                return digitalStorage.gigaBytesToNibbles(value);
                            case Kbi:
                                return digitalStorage.gigaBytesToKiloBits(value);
                            case Kby:
                                return digitalStorage.gigaBytesToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.gigaBytesToMegaBits(value);
                            case Mby:
                                return digitalStorage.gigaBytesToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.gigaBytesToGigaBits(value);
                            case Gby:
                                return (value);
                            case Tbi:
                                return digitalStorage.gigaBytesToTeraBits(value);
                            case Tby:
                                return digitalStorage.gigaBytesToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.gigaBytesToPetaBits(value);
                            case Pby:
                                return digitalStorage.gigaBytesToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.gigaBytesToExaBits(value);
                            case Eby:
                                return digitalStorage.gigaBytesToExaBytes(value);
                            case Zbi:
                                return digitalStorage.gigaBytesToZettaBits(value);
                            case Zby:
                                return digitalStorage.gigaBytesToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.gigaBytesToYottaBits(value);
                            case Yby:
                                return digitalStorage.gigaBytesToYottaBytes(value);
                        }
                        break;

                    //Case conversions from TeraBits
                    case Tbi:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.teraBitsToBits(value);
                            case Bytes:
                                return digitalStorage.teraBitsToBytes(value);
                            case Nibble:
                                return digitalStorage.teraBitsToNibbles(value);
                            case Kbi:
                                return digitalStorage.teraBitsToKiloBits(value);
                            case Kby:
                                return digitalStorage.teraBitsToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.teraBitsToMegaBits(value);
                            case Mby:
                                return digitalStorage.teraBitsToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.teraBitsToGigaBits(value);
                            case Gby:
                                return digitalStorage.teraBitsToGigaBytes(value);
                            case Tbi:
                                return (value);
                            case Tby:
                                return digitalStorage.teraBitsToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.teraBitsToPetaBits(value);
                            case Pby:
                                return digitalStorage.teraBitsToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.teraBitsToExaBits(value);
                            case Eby:
                                return digitalStorage.teraBitsToExaBytes(value);
                            case Zbi:
                                return digitalStorage.teraBitsToZettaBits(value);
                            case Zby:
                                return digitalStorage.teraBitsToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.teraBitsToYottaBits(value);
                            case Yby:
                                return digitalStorage.teraBitsToYottaBytes(value);
                        }
                        break;

                    //Case conversions from TeraBytes
                    case Tby:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.teraBytesToBits(value);
                            case Bytes:
                                return digitalStorage.teraBytesToBytes(value);
                            case Nibble:
                                return digitalStorage.teraBytesToNibbles(value);
                            case Kbi:
                                return digitalStorage.teraBytesToKiloBits(value);
                            case Kby:
                                return digitalStorage.teraBytesToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.teraBytesToMegaBits(value);
                            case Mby:
                                return digitalStorage.teraBytesToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.teraBytesToGigaBits(value);
                            case Gby:
                                return digitalStorage.teraBytesToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.teraBytesToTeraBits(value);
                            case Tby:
                                return (value);
                            case Pbi:
                                return digitalStorage.teraBytesToPetaBits(value);
                            case Pby:
                                return digitalStorage.teraBytesToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.teraBytesToExaBits(value);
                            case Eby:
                                return digitalStorage.teraBytesToExaBytes(value);
                            case Zbi:
                                return digitalStorage.teraBytesToZettaBits(value);
                            case Zby:
                                return digitalStorage.teraBytesToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.teraBytesToYottaBits(value);
                            case Yby:
                                return digitalStorage.teraBytesToYottaBytes(value);
                        }
                        break;

                    //Case conversions from PetaBits
                    case Pbi:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.petaBitsToBits(value);
                            case Bytes:
                                return digitalStorage.petaBitsToBytes(value);
                            case Nibble:
                                return digitalStorage.petaBitsToNibbles(value);
                            case Kbi:
                                return digitalStorage.petaBitsToKiloBits(value);
                            case Kby:
                                return digitalStorage.petaBitsToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.petaBitsToMegaBits(value);
                            case Mby:
                                return digitalStorage.petaBitsToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.petaBitsToGigaBits(value);
                            case Gby:
                                return digitalStorage.petaBitsToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.petaBitsToTeraBits(value);
                            case Tby:
                                return digitalStorage.petaBitsToTeraBytes(value);
                            case Pbi:
                                return (value);
                            case Pby:
                                return digitalStorage.petaBitsToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.petaBitsToExaBits(value);
                            case Eby:
                                return digitalStorage.petaBitsToExaBytes(value);
                            case Zbi:
                                return digitalStorage.petaBitsToZettaBits(value);
                            case Zby:
                                return digitalStorage.petaBitsToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.petaBitsToYottaBits(value);
                            case Yby:
                                return digitalStorage.petaBitsToYottaBytes(value);
                        }
                        break;

                    //Case conversions from PetaBytes
                    case Pby:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.petaBytesToBits(value);
                            case Bytes:
                                return digitalStorage.petaBytesToBytes(value);
                            case Nibble:
                                return digitalStorage.petaBytesToNibbles(value);
                            case Kbi:
                                return digitalStorage.petaBytesToKiloBits(value);
                            case Kby:
                                return digitalStorage.petaBytesToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.petaBytesToMegaBits(value);
                            case Mby:
                                return digitalStorage.petaBytesToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.petaBytesToGigaBits(value);
                            case Gby:
                                return digitalStorage.petaBytesToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.petaBytesToTeraBits(value);
                            case Tby:
                                return digitalStorage.petaBytesToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.petaBytesToPetaBits(value);
                            case Pby:
                                return (value);
                            case Ebi:
                                return digitalStorage.petaBytesToExaBits(value);
                            case Eby:
                                return digitalStorage.petaBytesToExaBytes(value);
                            case Zbi:
                                return digitalStorage.petaBytesToZettaBits(value);
                            case Zby:
                                return digitalStorage.petaBytesToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.petaBytesToYottaBits(value);
                            case Yby:
                                return digitalStorage.petaBytesToYottaBytes(value);
                        }
                        break;

                    //Case conversions from ExaBits
                    case Ebi:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.exaBitsToBits(value);
                            case Bytes:
                                return digitalStorage.exaBitsToBytes(value);
                            case Nibble:
                                return digitalStorage.exaBitsToNibbles(value);
                            case Kbi:
                                return digitalStorage.exaBitsToKiloBits(value);
                            case Kby:
                                return digitalStorage.exaBitsToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.exaBitsToMegaBits(value);
                            case Mby:
                                return digitalStorage.exaBitsToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.exaBitsToGigaBits(value);
                            case Gby:
                                return digitalStorage.exaBitsToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.exaBitsToTeraBits(value);
                            case Tby:
                                return digitalStorage.exaBitsToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.exaBitsToPetaBits(value);
                            case Pby:
                                return digitalStorage.exaBitsToPetaBytes(value);
                            case Ebi:
                                return (value);
                            case Eby:
                                return digitalStorage.exaBitsToExaBytes(value);
                            case Zbi:
                                return digitalStorage.exaBitsToZettaBits(value);
                            case Zby:
                                return digitalStorage.exaBitsToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.exaBitsToYottaBits(value);
                            case Yby:
                                return digitalStorage.exaBitsToYottaBytes(value);
                        }
                        break;

                    //Case conversions from ExaBytes
                    case Eby:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.exaBytesToBits(value);
                            case Bytes:
                                return digitalStorage.exaBytesToBytes(value);
                            case Nibble:
                                return digitalStorage.exaBytesToNibbles(value);
                            case Kbi:
                                return digitalStorage.exaBytesToKiloBits(value);
                            case Kby:
                                return digitalStorage.exaBytesToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.exaBytesToMegaBits(value);
                            case Mby:
                                return digitalStorage.exaBytesToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.exaBytesToGigaBits(value);
                            case Gby:
                                return digitalStorage.exaBytesToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.exaBytesToTeraBits(value);
                            case Tby:
                                return digitalStorage.exaBytesToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.exaBytesToPetaBits(value);
                            case Pby:
                                return digitalStorage.exaBytesToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.exaBytesToExaBits(value);
                            case Eby:
                                return (value);
                            case Zbi:
                                return digitalStorage.exaBytesToZettaBits(value);
                            case Zby:
                                return digitalStorage.exaBytesToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.exaBytesToYottaBits(value);
                            case Yby:
                                return digitalStorage.exaBytesToYottaBytes(value);
                        }
                        break;

                    //Case conversions from ZettaBits
                    case Zbi:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.zettaBitsToBits(value);
                            case Bytes:
                                return digitalStorage.zettaBitsToBytes(value);
                            case Nibble:
                                return digitalStorage.zettaBitsToNibbles(value);
                            case Kbi:
                                return digitalStorage.zettaBitsToKiloBits(value);
                            case Kby:
                                return digitalStorage.zettaBitsToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.zettaBitsToMegaBits(value);
                            case Mby:
                                return digitalStorage.zettaBitsToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.zettaBitsToGigaBits(value);
                            case Gby:
                                return digitalStorage.zettaBitsToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.zettaBitsToTeraBits(value);
                            case Tby:
                                return digitalStorage.zettaBitsToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.zettaBitsToPetaBits(value);
                            case Pby:
                                return digitalStorage.zettaBitsToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.zettaBitsToExaBits(value);
                            case Eby:
                                return digitalStorage.zettaBitsToExaBytes(value);
                            case Zbi:
                                return (value);
                            case Zby:
                                return digitalStorage.zettaBitsToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.zettaBitsToYottaBits(value);
                            case Yby:
                                return digitalStorage.zettaBitsToYottaBytes(value);
                        }
                        break;

                    //Case conversions from ZettaBytes
                    case Zby:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.zettaBytesToBits(value);
                            case Bytes:
                                return digitalStorage.zettaBytesToBytes(value);
                            case Nibble:
                                return digitalStorage.zettaBytesToNibbles(value);
                            case Kbi:
                                return digitalStorage.zettaBytesToKiloBits(value);
                            case Kby:
                                return digitalStorage.zettaBytesToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.zettaBytesToMegaBits(value);
                            case Mby:
                                return digitalStorage.zettaBytesToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.zettaBytesToGigaBits(value);
                            case Gby:
                                return digitalStorage.zettaBytesToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.zettaBytesToTeraBits(value);
                            case Tby:
                                return digitalStorage.zettaBytesToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.zettaBytesToPetaBits(value);
                            case Pby:
                                return digitalStorage.zettaBytesToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.zettaBytesToExaBits(value);
                            case Eby:
                                return digitalStorage.zettaBytesToExaBytes(value);
                            case Zbi:
                                return digitalStorage.zettaBytesToZettaBits(value);
                            case Zby:
                                return (value);
                            case Ybi:
                                return digitalStorage.zettaBytesToYottaBits(value);
                            case Yby:
                                return digitalStorage.zettaBytesToYottaBytes(value);
                        }
                        break;

                    //Case conversions from YottaBits
                    case Ybi:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.yottaBitsToBits(value);
                            case Bytes:
                                return digitalStorage.yottaBitsToBytes(value);
                            case Nibble:
                                return digitalStorage.yottaBitsToNibbles(value);
                            case Kbi:
                                return digitalStorage.yottaBitsToKiloBits(value);
                            case Kby:
                                return digitalStorage.yottaBitsToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.yottaBitsToMegaBits(value);
                            case Mby:
                                return digitalStorage.yottaBitsToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.yottaBitsToGigaBits(value);
                            case Gby:
                                return digitalStorage.yottaBitsToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.yottaBitsToTeraBits(value);
                            case Tby:
                                return digitalStorage.yottaBitsToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.yottaBitsToPetaBits(value);
                            case Pby:
                                return digitalStorage.yottaBitsToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.yottaBitsToExaBits(value);
                            case Eby:
                                return digitalStorage.yottaBitsToExaBytes(value);
                            case Zbi:
                                return digitalStorage.yottaBitsToZettaBits(value);
                            case Zby:
                                return digitalStorage.yottaBitsToZettaBytes(value);
                            case Ybi:
                                return (value);
                            case Yby:
                                return digitalStorage.yottaBitsToYottaBytes(value);
                        }
                        break;

                    //Case conversions from YottaBytes
                    case Yby:
                        switch (unit2){
                            case Bit:
                                return digitalStorage.yottaBytesToBits(value);
                            case Bytes:
                                return digitalStorage.yottaBytesToBytes(value);
                            case Nibble:
                                return digitalStorage.yottaBytesToNibbles(value);
                            case Kbi:
                                return digitalStorage.yottaBytesToKiloBits(value);
                            case Kby:
                                return digitalStorage.yottaBytesToKiloBytes(value);
                            case Mbi:
                                return digitalStorage.yottaBytesToMegaBits(value);
                            case Mby:
                                return digitalStorage.yottaBytesToMegaBytes(value);
                            case Gbi:
                                return digitalStorage.yottaBytesToGigaBits(value);
                            case Gby:
                                return digitalStorage.yottaBytesToGigaBytes(value);
                            case Tbi:
                                return digitalStorage.yottaBytesToTeraBits(value);
                            case Tby:
                                return digitalStorage.yottaBytesToTeraBytes(value);
                            case Pbi:
                                return digitalStorage.yottaBytesToPetaBits(value);
                            case Pby:
                                return digitalStorage.yottaBytesToPetaBytes(value);
                            case Ebi:
                                return digitalStorage.yottaBytesToExaBits(value);
                            case Eby:
                                return digitalStorage.yottaBytesToExaBytes(value);
                            case Zbi:
                                return digitalStorage.yottaBytesToZettaBits(value);
                            case Zby:
                                return digitalStorage.yottaBytesToZettaBytes(value);
                            case Ybi:
                                return digitalStorage.yottaBytesToYottaBits(value);
                            case Yby:
                                return (value);
                        }
                        break;

                }
            }
            catch (NumberFormatException numberFormatException){
                return 0.0;
            }
            return 0.0;
        }
    }
}
