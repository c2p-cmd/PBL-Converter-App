package Converter.App.Conversions.Units;

import Converter.App.Conversions.Units.UnitConversion.*;

public class conversionsController {
    public static final String DISTANCE = "Distance";
    public static final String WEIGHT = "Weight";
    public static final String ANGLE = "Angle";
    public static final String AREA = "Area";
    public static final String TEMPERATURE = "Temperature";
    public static final String POWERUNIT = "Power";
    public static final String TIME = "Time";
    public static final String PRESSURE = "Pressure";
    public static final String SPEED = "Speed";
    public static final String ENERGY = "Energy";
    public static final String VOLUME = "Volume";
    public static final String DIGITALSTORAGE = "DigitalStorage";

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

        public ForDistance( String fromUnit,String stringNum) {
            this.value = conversionsInputValidator(stringNum);
            this.fromUnit = fromUnit;
        }

        public double toCM(){
            switch (this.fromUnit){
                case Cm:
                    return value;
                case m:
                    return Distance.meterToCenti(value);
                case KM:
                    return Distance.kiloToCenti(value);
                case Miles:
                    return Distance.milesToCenti(value);
                case Yards:
                    return Distance.yardToCenti(value);
                case Ft:
                    return Distance.footToCenti(value);
                case Inch:
                    return Distance.inchesToCenti(value);
                case NauticalMi:
                    return Distance.nauticalMilesToCenti(value);
                default:
                    return 0.0;
            }
        }

        public double toMeter() {
            switch (this.fromUnit){
                case Cm:
                    return UnitConversion.Distance.centiToMeter(value);
                case m:
                    return value;
                case KM:
                    return UnitConversion.Distance.kiloToMeter(value);
                case Miles:
                    return UnitConversion.Distance.milesToMeter(value);
                case Yards:
                    return UnitConversion.Distance.yardToMeter(value);
                case Ft:
                    return UnitConversion.Distance.footToMeter(value);
                case Inch:
                    return UnitConversion.Distance.inchesToMeter(value);
                case NauticalMi:
                    return UnitConversion.Distance.nauticalMilesToMeter(value);
                default:
                    return 0.0;
            }
        }

        public double toKiloMeter() {
            switch (this.fromUnit) {
                case Cm:
                    return UnitConversion.Distance.centiToKilo(value);
                case m:
                    return UnitConversion.Distance.meterToKilo(value);
                case KM:
                    return value;
                case Miles:
                    return UnitConversion.Distance.milesToKilo(value);
                case Yards:
                    return UnitConversion.Distance.yardToKilo(value);
                case Ft:
                    return UnitConversion.Distance.footToKilo(value);
                case Inch:
                    return UnitConversion.Distance.inchesToKilo(value);
                case NauticalMi:
                    return UnitConversion.Distance.nauticalMilesToKilo(value);
                default:
                    return 0.0;
            }
        }

        public double toMiles() {
            switch (this.fromUnit){
                case Cm:
                    return UnitConversion.Distance.centiToMiles(value);
                case m:
                    return UnitConversion.Distance.meterToMiles(value);
                case KM:
                    return  UnitConversion.Distance.kiloToMiles(value);
                case Miles:
                    return value;
                case Yards:
                    return UnitConversion.Distance.yardToMiles(value);
                case Ft:
                    return UnitConversion.Distance.footToMiles(value);
                case Inch:
                    return UnitConversion.Distance.inchesToMiles(value);
                case NauticalMi:
                    return UnitConversion.Distance.nauticalMilesToMiles(value);
                default:
                    return 0.0;
            }
        }

        public double toYards() {
            switch (this.fromUnit){
                case Cm:
                    return UnitConversion.Distance.centiToYard(value);
                case m:
                    return UnitConversion.Distance.meterToYard(value);
                case KM:
                    return UnitConversion.Distance.kiloToYard(value);
                case Miles:
                    return UnitConversion.Distance.milesToYard(value);
                case Yards:
                    return value;
                case Ft:
                    return UnitConversion.Distance.footToYard(value);
                case Inch:
                    return UnitConversion.Distance.inchesToYard(value);
                case NauticalMi:
                    return UnitConversion.Distance.nauticalMilesToYard(value);
                default:
                    return 0.0;
            }
        }

        public double toFeet() {
            switch (this.fromUnit){
                case Cm:
                    return UnitConversion.Distance.centiToFoot(value);
                case m:
                    return UnitConversion.Distance.meterToFoot(value);
                case KM:
                    return  UnitConversion.Distance.kiloToFoot( value);
                case Miles:
                    return UnitConversion.Distance.milesToFoot(value);
                case Yards:
                    return UnitConversion.Distance.yardToFoot(value);
                case Ft:
                    return value;
                case Inch:
                    return UnitConversion.Distance.inchesToFoot(value);
                case NauticalMi:
                    return UnitConversion.Distance.nauticalMilesToFoot(value);
                default:
                    return 0.0;
            }
        }

        public double toInches() {
            switch (this.fromUnit) {
                case Cm:
                    return UnitConversion.Distance.centiToInches(value);
                case m:
                    return UnitConversion.Distance.meterToInches(value);
                case KM:
                    return  UnitConversion.Distance.kiloToInches(value);
                case Miles:
                    return UnitConversion.Distance.milesToInches(value);
                case Yards:
                    return UnitConversion.Distance.yardToInches(value);
                case Ft:
                    return UnitConversion.Distance.footToInches(value);
                case Inch:
                    return value;
                case NauticalMi:
                    return UnitConversion.Distance.nauticalMilesToInches(value);
                default:
                    return 0.0;
            }
        }

        public double toNauticalMiles() {
            switch (this.fromUnit) {
                case Cm:
                    return UnitConversion.Distance.centiToNauticalMiles(value);
                case m:
                    return UnitConversion.Distance.meterToNauticalMiles(value);
                case KM:
                    return  UnitConversion.Distance.kiloToNauticalMiles(value);
                case Miles:
                    return UnitConversion.Distance.milesToNauticalMiles(value);
                case Yards:
                    return UnitConversion.Distance.yardToNauticalMiles(value);
                case Ft:
                    return UnitConversion.Distance.footToNauticalMiles(value);
                case Inch:
                    return UnitConversion.Distance.inchesToNauticalMiles(value);
                case NauticalMi:
                    return value;
                default:
                    return 0.0;
            }
        }
    }

    //Class if user wants to perform conversions on Distances
    public static class ForWeight{
        //Variables
        public static final String Carat    = "Carat";
        public static final String MilliGm  = "Milligram";
        public static final String CentiGM  = "Centigram";
        public static final String DeciGm   = "DeciGram";
        public static final String gm       = "Gram";
        public static final String DecaGm   = "DecaGram";
        public static final String HectoGm  = "Hectogram";
        public static final String kg       = "Kilogram";
        public static final String metricTn = "Metric Tonne";
        public static final String Ounces   = "Ounce";
        public static final String Pounds   = "Pound";
        public static final String Stone    = "Stone";

        private final String fromUnit;
        private final double value;

        public ForWeight(String fromUnit, String value) {
            this.fromUnit = fromUnit;
            this.value = conversionsInputValidator(value);
        }

        public double toCarat() {
            switch (this.fromUnit){
                case Carat:
                    return value;
                case MilliGm:
                    return UnitConversion.Weight.milligramsToCarats(value);
                case CentiGM:
                    return UnitConversion.Weight.centigramsToCarats(value);
                case DeciGm:
                    return UnitConversion.Weight.decigramsToCarats(value);
                case gm:
                    return UnitConversion.Weight.gramsToCarats(value);
                case DecaGm:
                    return UnitConversion.Weight.decagramsToCarats(value);
                case HectoGm:
                    return UnitConversion.Weight.hectogramsToCarats(value);
                case kg:
                    return UnitConversion.Weight.kilogramsToCarats(value);
                case metricTn:
                    return UnitConversion.Weight.metrictonnesToCarats(value);
                case Ounces:
                    return UnitConversion.Weight.ouncesToCarats(value);
                case Pounds:
                    return UnitConversion.Weight.poundsToCarats(value);
                case Stone:
                    return UnitConversion.Weight.stoneToCarats(value);
                default:
                    return 0.0;
            }
        }

        public double toMilliGram() {
            switch (this.fromUnit) {
                case Carat:
                    return UnitConversion.Weight.caratsToMilligrams(value);
                case MilliGm:
                    return value;
                case CentiGM:
                    return UnitConversion.Weight.centigramsToMilligrams(value);
                case DeciGm:
                    return UnitConversion.Weight.decigramsToMilligrams(value);
                case gm:
                    return UnitConversion.Weight.gramsToMilligrams(value);
                case DecaGm:
                    return UnitConversion.Weight.decagramsToMilligrams(value);
                case HectoGm:
                    return UnitConversion.Weight.hectogramsToMilligrams(value);
                case kg:
                    return UnitConversion.Weight.kilogramsToMilligrams(value);
                case metricTn:
                    return UnitConversion.Weight.metrictonnesToMilligrams(value);
                case Ounces:
                    return UnitConversion.Weight.ouncesToMilligrams(value);
                case Pounds:
                    return UnitConversion.Weight.poundsToMilligrams(value);
                case Stone:
                    return UnitConversion.Weight.stoneToMilligrams(value);
                default:
                    return 0.0;
            }
        }

        public double toCentiGram() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.caratsToCentigrams(value);
                case MilliGm:
                    return UnitConversion.Weight.milligramsToCentigrams(value);
                case CentiGM:
                    return value;
                case DeciGm:
                    return UnitConversion.Weight.decigramsToCentigrams(value);
                case gm:
                    return UnitConversion.Weight.gramsToCentigrams(value);
                case DecaGm:
                    return UnitConversion.Weight.decagramsToCentigrams(value);
                case HectoGm:
                    return UnitConversion.Weight.hectogramsToCentigrams(value);
                case kg:
                    return UnitConversion.Weight.kilogramsToCentigrams(value);
                case metricTn:
                    return UnitConversion.Weight.metrictonnesToCentigrams(value);
                case Ounces:
                    return UnitConversion.Weight.ouncesToCentigrams(value);
                case Pounds:
                    return UnitConversion.Weight.poundsToCentigrams(value);
                case Stone:
                    return UnitConversion.Weight.stoneToCentigrams(value);
                default:
                    return 0.0;
            }
        }

        public double toDeciGram() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.caratsToDecigrams(value);
                case MilliGm:
                    return UnitConversion.Weight.milligramsToDecigrams(value);
                case CentiGM:
                    return UnitConversion.Weight.centigramsToDecigrams(value);
                case DeciGm:
                    return value;
                case gm:
                    return UnitConversion.Weight.gramsToDecigrams(value);
                case DecaGm:
                    return UnitConversion.Weight.decagramsToDecigrams(value);
                case HectoGm:
                    return UnitConversion.Weight.hectogramsToDecigrams(value);
                case kg:
                    return UnitConversion.Weight.kilogramsToDecigrams(value);
                case metricTn:
                    return UnitConversion.Weight.metrictonnesToDecigrams(value);
                case Ounces:
                    return UnitConversion.Weight.ouncesToDecigrams(value);
                case Pounds:
                    return UnitConversion.Weight.poundsToDecigrams(value);
                case Stone:
                    return UnitConversion.Weight.stoneToDecigrams(value);
                default:
                    return 0.0;
            }
        }

        public double toGrams() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.caratsToGrams(value);
                case MilliGm:
                    return UnitConversion.Weight.milligramsToGrams(value);
                case CentiGM:
                    return UnitConversion.Weight.centigramsToGrams(value);
                case DeciGm:
                    return UnitConversion.Weight.decigramsToGrams(value);
                case gm:
                    return value;
                case DecaGm:
                    return UnitConversion.Weight.decagramsToGrams(value);
                case HectoGm:
                    return UnitConversion.Weight.hectogramsToGrams(value);
                case kg:
                    return UnitConversion.Weight.kilogramsToGrams(value);
                case metricTn:
                    return UnitConversion.Weight.metrictonnesToGrams(value);
                case Ounces:
                    return UnitConversion.Weight.ouncesToGrams(value);
                case Pounds:
                    return UnitConversion.Weight.poundsToGrams(value);
                case Stone:
                    return UnitConversion.Weight.stoneToGrams(value);
                default:
                    return 0.0;
            }
        }

        public double toDecaGrams() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.caratsToDecagrams(value);
                case MilliGm:
                    return UnitConversion.Weight.milligramsToDecagrams(value);
                case CentiGM:
                    return UnitConversion.Weight.centigramsToDecagrams(value);
                case DeciGm:
                    return UnitConversion.Weight.decigramsToDecagrams(value);
                case gm:
                    return UnitConversion.Weight.gramsToDecagrams(value);
                case DecaGm:
                    return value;
                case HectoGm:
                    return UnitConversion.Weight.hectogramsToDecagrams(value);
                case kg:
                    return UnitConversion.Weight.kilogramsToDecagrams(value);
                case metricTn:
                    return UnitConversion.Weight.metrictonnesToDecagrams(value);
                case Ounces:
                    return UnitConversion.Weight.ouncesToDecagrams(value);
                case Pounds:
                    return UnitConversion.Weight.poundsToDecagrams(value);
                case Stone:
                    return UnitConversion.Weight.stoneToDecagrams(value);
                default:
                    return 0.0;
            }
        }

        public double toHectoGrams() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.caratsToHectograms(value);
                case MilliGm:
                    return UnitConversion.Weight.milligramsToHectograms(value);
                case CentiGM:
                    return UnitConversion.Weight.centigramsToHectograms(value);
                case DeciGm:
                    return UnitConversion.Weight.decigramsToHectograms(value);
                case gm:
                    return UnitConversion.Weight.gramsToHectograms(value);
                case DecaGm:
                    return UnitConversion.Weight.decagramsToHectograms(value);
                case HectoGm:
                    return (value);
                case kg:
                    return UnitConversion.Weight.kilogramsToHectograms(value);
                case metricTn:
                    return UnitConversion.Weight.metrictonnesToHectograms(value);
                case Ounces:
                    return UnitConversion.Weight.ouncesToHectograms(value);
                case Pounds:
                    return UnitConversion.Weight.poundsToHectograms(value);
                case Stone:
                    return UnitConversion.Weight.stoneToHectograms(value);
                default:
                    return 0.0;
            }
        }

        public double toKiloGrams() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.caratsToKilograms(value);
                case MilliGm:
                    return UnitConversion.Weight.milligramsToKilograms(value);
                case CentiGM:
                    return UnitConversion.Weight.centigramsToKilograms(value);
                case DeciGm:
                    return UnitConversion.Weight.decigramsToKilograms(value);
                case gm:
                    return UnitConversion.Weight.gramsToKilograms(value);
                case DecaGm:
                    return UnitConversion.Weight.decagramsToKilograms(value);
                case HectoGm:
                    return UnitConversion.Weight.hectogramsToKilograms(value);
                case kg:
                    return (value);
                case metricTn:
                    return UnitConversion.Weight.metrictonnesToKilograms(value);
                case Ounces:
                    return UnitConversion.Weight.ouncesToKilograms(value);
                case Pounds:
                    return UnitConversion.Weight.poundsToKilograms(value);
                case Stone:
                    return UnitConversion.Weight.stoneToKilograms(value);
                default:
                    return 0.0;
            }
        }

        public double toMetricTonnes() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.caratsToMetricTonnes(value);
                case MilliGm:
                    return UnitConversion.Weight.milligramsToMetricTonnes(value);
                case CentiGM:
                    return UnitConversion.Weight.centigramsToMetricTonnes(value);
                case DeciGm:
                    return UnitConversion.Weight.decigramsToMetricTonnes(value);
                case gm:
                    return UnitConversion.Weight.gramsToMetricTonnes(value);
                case DecaGm:
                    return UnitConversion.Weight.decagramsToMetricTonnes(value);
                case HectoGm:
                    return UnitConversion.Weight.hectogramsToMetricTonnes(value);
                case kg:
                    return UnitConversion.Weight.kilogramsToMetricTonnes(value);
                case metricTn:
                    return value;
                case Ounces:
                    return UnitConversion.Weight.ouncesToMetricTonnes(value);
                case Pounds:
                    return UnitConversion.Weight.poundsToMetricTonnes(value);
                case Stone:
                    return UnitConversion.Weight.stoneToMetricTonnes(value);
                default:
                    return 0.0;
            }
        }

        public double toOunces() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.caratsToOunces(value);
                case MilliGm:
                    return UnitConversion.Weight.milligramsToOunces(value);
                case CentiGM:
                    return UnitConversion.Weight.centigramsToOunces(value);
                case DeciGm:
                    return UnitConversion.Weight.decigramsToOunces(value);
                case gm:
                    return UnitConversion.Weight.gramsToOunces(value);
                case DecaGm:
                    return UnitConversion.Weight.decagramsToOunces(value);
                case HectoGm:
                    return UnitConversion.Weight.hectogramsToOunces(value);
                case kg:
                    return UnitConversion.Weight.kilogramsToOunces(value);
                case metricTn:
                    return UnitConversion.Weight.metrictonnesToOunces(value);
                case Ounces:
                    return value;
                case Pounds:
                    return UnitConversion.Weight.poundsToOunces(value);
                case Stone:
                    return UnitConversion.Weight.stoneToOunces(value);
                default:
                    return 0.0;
            }
        }

        public double toPounds() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.caratsToPounds(value);
                case MilliGm:
                    return UnitConversion.Weight.milligramsToPounds(value);
                case CentiGM:
                    return UnitConversion.Weight.centigramsToPounds(value);
                case DeciGm:
                    return UnitConversion.Weight.decigramsToPounds(value);
                case gm:
                    return UnitConversion.Weight.gramsToPounds(value);
                case DecaGm:
                    return UnitConversion.Weight.decagramsToPounds(value);
                case HectoGm:
                    return UnitConversion.Weight.hectogramsToPounds(value);
                case kg:
                    return UnitConversion.Weight.kilogramsToPounds(value);
                case metricTn:
                    return UnitConversion.Weight.metrictonnesToPounds(value);
                case Ounces:
                    return UnitConversion.Weight.ouncesToPounds(value);
                case Pounds:
                    return value;
                case Stone:
                    return UnitConversion.Weight.stoneToPounds(value);
                default:
                    return 0.0;
            }
        }

        public double toStones() {
            switch (this.fromUnit){
                case Carat:
                    return UnitConversion.Weight.caratsToStone(value);
                case MilliGm:
                    return UnitConversion.Weight.milligramsToStone(value);
                case CentiGM:
                    return UnitConversion.Weight.centigramsToStone(value);
                case DeciGm:
                    return UnitConversion.Weight.decigramsToStone(value);
                case gm:
                    return UnitConversion.Weight.gramsToStone(value);
                case DecaGm:
                    return UnitConversion.Weight.decagramsToStone(value);
                case HectoGm:
                    return UnitConversion.Weight.hectogramsToStone(value);
                case kg:
                    return UnitConversion.Weight.kilogramsToStone(value);
                case metricTn:
                    return UnitConversion.Weight.metrictonnesToStone(value);
                case Ounces:
                    return UnitConversion.Weight.ouncesToStone(value);
                case Pounds:
                    return UnitConversion.Weight.poundsToStone(value);
                case Stone:
                    return value;
                default:
                    return 0.0;
            }
        }
    }

    //Class if user wants to perform conversions on angles
    public static class ForAngle{

        //Variables
        public static final String Deg    = "Degree";
        public static final String Rad    = "Radian";
        public static final String ArcSec = "ArcSecond";
        public static final String Grad   = "Gradian";

        private final String fromUnit;
        private final double value;

        public ForAngle(String fromUnit, String value) {
            this.fromUnit = fromUnit;
            this.value = conversionsInputValidator(value);
        }

        public double toDegrees() {
            switch (this.fromUnit){
                case Deg:
                    return value;
                case Rad:
                    return UnitConversion.Angle.radiansToDegree(value);
                case ArcSec:
                    return UnitConversion.Angle.arcSecondsToDegree(value);
                case Grad:
                    return UnitConversion.Angle.gradiansToDegree(value);
                default:
                    return 0.0;
            }
        }

        public double toRadians() {
            switch (this.fromUnit) {
                case Deg:
                    return UnitConversion.Angle.degreeToRadians(value);
                case Rad:
                    return (value);
                case ArcSec:
                    return UnitConversion.Angle.arcSecondsToRadians(value);
                case Grad:
                    return UnitConversion.Angle.gradiansToRadians(value);
                default:
                    return 0.0;
            }
        }

        public double toArcSeconds() {
            switch (this.fromUnit){
                case Deg:
                    return UnitConversion.Angle.degreeToArcSeconds(value);
                case Rad:
                    return UnitConversion.Angle.radiansToArcSeconds(value);
                case ArcSec:
                    return (value);
                case Grad:
                    return UnitConversion.Angle.gradiansToArcSeconds(value);
                default:
                    return 0.0;
            }
        }

        public double toGradian() {
            switch (this.fromUnit){
                case Deg:
                    return UnitConversion.Angle.degreeToGradians(value);
                case Rad:
                    return UnitConversion.Angle.radiansToGradians(value);
                case ArcSec:
                    return UnitConversion.Angle.arcSecondsToGradians(value);
                case Grad:
                    return (value);
                default:
                    return 0.0;
            }
        }
    }

    //Class if user wants to perform conversions on Areas
    public static class ForArea{
        //Variables
        public static final String SqMm = "Square Millimetre";
        public static final String SqCm   = "Square Centimetre";
        public static final String Sqm    = "Square Metre";
        public static final String Hectare = "Hectare";
        public static final String SqKm   = "Square Kilometre";
        public static final String SqInch = "Square Inch";
        public static final String SqFt   = "Square Feet";
        public static final String SqYard = "Square Yards";
        public static final String Acres  = "Acre";
        public static final String SqMi   = "Square Miles";

        private final String fromUnit;
        private final double value;

        public ForArea( String fromUnit, String value) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toSquareMilimeters() {
            switch (this.fromUnit){
                case SqMm:
                    return value;
                case SqCm:
                    return UnitConversion.Area.squareCentimetersToSquareMillimeters(value);
                case Sqm:
                    return UnitConversion.Area.squareMetersToSquareMilliMeters(value);
                case Hectare:
                    return UnitConversion.Area.hectaresToSquareMillimeters(value);
                case SqKm:
                    return UnitConversion.Area.squareKiloMetersToSquareMilliMeters(value);
                case SqInch:
                    return UnitConversion.Area.squareInchesToSquareMilliMeters(value);
                case SqFt:
                    return UnitConversion.Area.squareFeetToSquareMilliMeters(value);
                case SqYard:
                    return UnitConversion.Area.squareYardsToSquareMilliMeters(value);
                case Acres:
                    return UnitConversion.Area.acresToSquareMilliMeters(value);
                case SqMi:
                    return UnitConversion.Area.squareMilesToSquareMilliMeters(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareCentimeters() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareMillimetersToSquareCentimeters(value);
                case SqCm:
                    return (value);
                case Sqm:
                    return UnitConversion.Area.squareMetersToSquareCentiMeters(value);
                case Hectare:
                    return UnitConversion.Area.hectaresToSquareCentimeters(value);
                case SqKm:
                    return UnitConversion.Area.squareKiloMetersToSquareCentiMeters(value);
                case SqInch:
                    return UnitConversion.Area.squareInchesToSquareCentiMeters(value);
                case SqFt:
                    return UnitConversion.Area.squareFeetToSquareCentiMeters(value);
                case SqYard:
                    return UnitConversion.Area.squareYardsToSquareCentiMeters(value);
                case Acres:
                    return UnitConversion.Area.acresToSquareCentiMeters(value);
                case SqMi:
                    return UnitConversion.Area.squareMilesToSquareCentiMeters(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareMeters() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareMillimetersToSquareMeters(value);
                case SqCm:
                    return UnitConversion.Area.squareCentimetersToSquareMeters(value);
                case Sqm:
                    return (value);
                case Hectare:
                    return UnitConversion.Area.hectaresToSquareMeters(value);
                case SqKm:
                    return UnitConversion.Area.squareKiloMetersToSquareMeters(value);
                case SqInch:
                    return UnitConversion.Area.squareInchesToSquareMeters(value);
                case SqFt:
                    return UnitConversion.Area.squareFeetToSquareMeters(value);
                case SqYard:
                    return UnitConversion.Area.squareYardsToSquareMeters(value);
                case Acres:
                    return UnitConversion.Area.acresToSquareMeters(value);
                case SqMi:
                    return UnitConversion.Area.squareMilesToSquareMeters(value);
                default:
                    return 0.0;
            }
        }

        public double toHectare() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareMillimetersToHectares(value);
                case SqCm:
                    return UnitConversion.Area.squareCentimetersToHectares(value);
                case Sqm:
                    return UnitConversion.Area.squareMetersToHectares(value);
                case Hectare:
                    return (value);
                case SqKm:
                    return UnitConversion.Area.squareKiloMetersToHectares(value);
                case SqInch:
                    return UnitConversion.Area.squareInchesToHectares(value);
                case SqFt:
                    return UnitConversion.Area.squareFeetToHectares(value);
                case SqYard:
                    return UnitConversion.Area.squareYardsToHectares(value);
                case Acres:
                    return UnitConversion.Area.acresToHectares(value);
                case SqMi:
                    return UnitConversion.Area.squareMilesToHectares(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareKiloMeters() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareMillimetersToSquareKilometers(value);
                case SqCm:
                    return UnitConversion.Area.squareCentimetersToSquareKiloMeters(value);
                case Sqm:
                    return UnitConversion.Area.squareMetersToSquareKilometers(value);
                case Hectare:
                    return UnitConversion.Area.hectaresToSquareKiloMeters(value);
                case SqKm:
                    return (value);
                case SqInch:
                    return UnitConversion.Area.squareInchesToSquareKiloMeters(value);
                case SqFt:
                    return UnitConversion.Area.squareFeetToSquareKiloMeters(value);
                case SqYard:
                    return UnitConversion.Area.squareYardsToSquareKilometers(value);
                case Acres:
                    return UnitConversion.Area.acresToSquareKiloMeters(value);
                case SqMi:
                    return UnitConversion.Area.squareMilesToSquareKiloMeters(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareInches() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareMillimetersToSquareInches(value);
                case SqCm:
                    return UnitConversion.Area.squareCentimetersToSquareInches(value);
                case Sqm:
                    return UnitConversion.Area.squareMetersToSquareInches(value);
                case Hectare:
                    return UnitConversion.Area.hectaresToSquareInches(value);
                case SqKm:
                    return UnitConversion.Area.squareKiloMetersToSquareInches(value);
                case SqInch:
                    return (value);
                case SqFt:
                    return UnitConversion.Area.squareFeetToSquareInches(value);
                case SqYard:
                    return UnitConversion.Area.squareYardsToSquareInches(value);
                case Acres:
                    return UnitConversion.Area.acresToSquareInches(value);
                case SqMi:
                    return UnitConversion.Area.squareMilesToSquareInches(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareFeet() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareMillimetersToSquareFeet(value);
                case SqCm:
                    return UnitConversion.Area.squareCentimetersToSquareFeet(value);
                case Sqm:
                    return UnitConversion.Area.squareMetersToSquareFeet(value);
                case Hectare:
                    return UnitConversion.Area.hectaresToSquareFeet(value);
                case SqKm:
                    return UnitConversion.Area.squareKiloMetersToSquareFeet(value);
                case SqInch:
                    return UnitConversion.Area.squareInchesToSquareFeet(value);
                case SqFt:
                    return (value);
                case SqYard:
                    return UnitConversion.Area.squareYardsToSquareFeet(value);
                case Acres:
                    return UnitConversion.Area.acresToSquareFeet(value);
                case SqMi:
                    return UnitConversion.Area.squareMilesToSquareFeet(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareYards() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareMillimetersToSquareYards(value);
                case SqCm:
                    return UnitConversion.Area.squareCentimetersToSquareYards(value);
                case Sqm:
                    return UnitConversion.Area.squareMetersToSquareYards(value);
                case Hectare:
                    return UnitConversion.Area.hectaresToSquareYards(value);
                case SqKm:
                    return UnitConversion.Area.squareKiloMetersToSquareYards(value);
                case SqInch:
                    return UnitConversion.Area.squareInchesToSquareYards(value);
                case SqFt:
                    return UnitConversion.Area.squareFeetToSquareYards(value);
                case SqYard:
                    return (value);
                case Acres:
                    return UnitConversion.Area.acresToSquareYards(value);
                case SqMi:
                    return UnitConversion.Area.squareMilesToSquareYards(value);
                default:
                    return 0.0;
            }
        }

        public double toAcres() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareMillimetersToAcres(value);
                case SqCm:
                    return UnitConversion.Area.squareCentimetersToAcres(value);
                case Sqm:
                    return UnitConversion.Area.squareMetersToAcres(value);
                case Hectare:
                    return UnitConversion.Area.hectaresToAcres(value);
                case SqKm:
                    return UnitConversion.Area.squareKiloMetersToAcres(value);
                case SqInch:
                    return UnitConversion.Area.squareInchesToAcres(value);
                case SqFt:
                    return UnitConversion.Area.squareFeetToAcres(value);
                case SqYard:
                    return UnitConversion.Area.squareYardsToAcres(value);
                case Acres:
                    return (value);
                case SqMi:
                    return UnitConversion.Area.squareMilesToAcres(value);
                default:
                    return 0.0;
            }
        }

        public double toSquareMiles() {
            switch (this.fromUnit){
                case SqMm:
                    return UnitConversion.Area.squareMillimetersToSquareMiles(value);
                case SqCm:
                    return UnitConversion.Area.squareCentimetersToSquareMiles(value);
                case Sqm:
                    return UnitConversion.Area.squareMetersToSquareMiles(value);
                case Hectare:
                    return UnitConversion.Area.hectaresToSquareMiles(value);
                case SqKm:
                    return UnitConversion.Area.squareKiloMetersToSquareMiles(value);
                case SqInch:
                    return UnitConversion.Area.squareInchesToSquareMiles(value);
                case SqFt:
                    return UnitConversion.Area.squareFeetToSquareMiles(value);
                case SqYard:
                    return UnitConversion.Area.squareYardsToSquareMiles(value);
                case Acres:
                    return UnitConversion.Area.acresToSquareMiles(value);
                case SqMi:
                    return (value);
                default:
                    return 0.0;
            }
        }
    }

    //Class for Temperature
    public static class ForTemperature{
        //Variables
        public static final String Cel = "Celsius";
        public static final String Fah = "Fahrenheit";
        public static final String Kel = "Kelvin";
        public static final String Rankine = "Rankine";

        private final String fromUnit;
        private final double value;

        public ForTemperature( String fromUnit ,String value) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toCelsius() {
            switch (this.fromUnit){
                case Cel:
                    return value;
                case Fah:
                    return Temperature.fahrenheitToCelsius(value);
                case Kel:
                    return Temperature.kelvinToCelsius(value);
                case Rankine:
                    return Temperature.rankineToCelsius(value);
                default:
                    return 0.0;
            }
        }

        public double toFahrenheit() {
            switch (this.fromUnit){
                case Cel:
                    return UnitConversion.Temperature.celsiusToFahrenheit(value);
                case Fah:
                    return (value);
                case Kel:
                    return UnitConversion.Temperature.kelvinToFahrenheit(value);
                case Rankine:
                    return UnitConversion.Temperature.rankineToFahrenheit(value);
                default:
                    return 0.0;
            }
        }

        public double toKelvin() {
            switch (this.fromUnit){
                case Cel:
                    return UnitConversion.Temperature.celsiusToKelvin(value);
                case Fah:
                    return UnitConversion.Temperature.fahrenheitToKelvin(value);
                case Kel:
                    return (value);
                case Rankine:
                    return UnitConversion.Temperature.rankineToKelvin(value);
                default:
                    return 0.0;
            }
        }

        public double toRankine() {
            switch (this.fromUnit){
                case Cel:
                    return UnitConversion.Temperature.celsiusToRankine(value);
                case Fah:
                    return UnitConversion.Temperature.fahrenheitToRankine(value);
                case Kel:
                    return UnitConversion.Temperature.kelvinToRankine(value);
                case Rankine:
                    return (value);
                default:
                    return 0.0;
            }
        }
    }

    //Class for Power conversions
    public static class ForPower{
        //Variables
        public static final String watt ="Watt";
        public static final String KiloWatt = "KiloWatt";
        public static final String HP = "HorsePower";
        public static final String FTPpm = "Foot-Pounds Per Minute";
        public static final String BTU = " BTUs/Minute";

        private final double value;
        private final String fromUnit;

        public ForPower( String fromUnit , String value) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toWatts() {
            switch (this.fromUnit){
                case watt:
                    return value;
                case KiloWatt:
                    return UnitConversion.Power.kiloWattsToWatts(value);
                case HP:
                    return UnitConversion.Power.horsePowerToWatts(value);
                case FTPpm:
                    return UnitConversion.Power.footPoundsPerMinuteToWatts(value);
                case BTU:
                    return UnitConversion.Power.bTUsPerMinuteToWatts(value);
                default:
                    return 0;
            }
        }

        public double toKiloWatts() {
            switch (this.fromUnit){
                case watt:
                    return UnitConversion.Power.wattsToKiloWatts(value);
                case KiloWatt:
                    return (value);
                case HP:
                    return UnitConversion.Power.horsePowerToKiloWatts(value);
                case FTPpm:
                    return UnitConversion.Power.footPoundsPerMinuteToKiloWatts(value);
                case BTU:
                    return UnitConversion.Power.bTUsPerMinuteToKiloWatts(value);
                default:
                    return 0;
            }
        }

        public double toHorsePower() {
            switch (this.fromUnit){
                case watt:
                    return UnitConversion.Power.wattsToHorsePower(value);
                case KiloWatt:
                    return UnitConversion.Power.kiloWattsToHorsePower(value);
                case HP:
                    return (value);
                case FTPpm:
                    return UnitConversion.Power.footPoundsPerMinuteToHorsePower(value);
                case BTU:
                    return UnitConversion.Power.bTUsPerMinuteToHorsePower(value);
                default:
                    return 0;
            }
        }

        public double toFootPoundsPerMinute() {
            switch (this.fromUnit){
                case watt:
                    return UnitConversion.Power.wattsToFootPoundsPerMinute(value);
                case KiloWatt:
                    return UnitConversion.Power.kiloWattsToFootPoundsPerMinute(value);
                case HP:
                    return UnitConversion.Power.horsePowerToFootPoundsPerMinute(value);
                case FTPpm:
                    return (value);
                case BTU:
                    return UnitConversion.Power.bTUsPerMinuteToFootPoundsPerMinute(value);
                default:
                    return 0;
            }
        }

        public double toBTUsPerMinute() {
            switch (this.fromUnit){
                case watt:
                    return UnitConversion.Power.wattsToBTUsPerMinute(value);
                case KiloWatt:
                    return UnitConversion.Power.kiloWattsToBTUsPerMinute(value);
                case HP:
                    return UnitConversion.Power.horsePowerToBTUsPerMinute(value);
                case FTPpm:
                    return UnitConversion.Power.footPoundsPerMinuteToBTUsPerMinute(value);
                case BTU:
                    return (value);
                default:
                    return 0;
            }
        }
    }

    //Class for Time Conversions
    public static class ForTime{
        //Variables
        public static final String MicroSec = "Micro Second";
        public static final String MilliSec = "Milli Second";
        public static final String Sec  = "Second";
        public static final String Min  = "Minute";
        public static final String Hrs  = "Hours";
        public static final String Day  = "Day";
        public static final String Week = "Week";
        public static final String Year = "Year";

        private final double value;
        private final String fromUnit;

        public ForTime(String fromUnit, String value) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toMicroSeconds() {
            switch (this.fromUnit){
                case MicroSec:
                    return (value);
                case MilliSec:
                    return UnitConversion.Time.milliSecondsToMicroSeconds(value);
                case Sec:
                    return UnitConversion.Time.secondsToMicroSeconds(value);
                case Min:
                    return UnitConversion.Time.minutesToMicroSeconds(value);
                case Hrs:
                    return UnitConversion.Time.hoursToMicroSeconds(value);
                case Day:
                    return UnitConversion.Time.daysToMicroSeconds(value);
                case Week:
                    return UnitConversion.Time.weeksToMicroSeconds(value);
                case Year:
                    return UnitConversion.Time.yearsToMicroSeconds(value);
                default:
                    return 0.0;
            }
        }

        public double toMilliSeconds() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.microSecondsToMilliSeconds(value);
                case MilliSec:
                    return (value);
                case Sec:
                    return UnitConversion.Time.secondsToMilliSeconds(value);
                case Min:
                    return UnitConversion.Time.minutesToMilliSeconds(value);
                case Hrs:
                    return UnitConversion.Time.hoursToMilliSeconds(value);
                case Day:
                    return UnitConversion.Time.daysToMilliSeconds(value);
                case Week:
                    return UnitConversion.Time.weeksToMilliSeconds(value);
                case Year:
                    return UnitConversion.Time.yearsToMilliSeconds(value);
                default:
                    return 0.0;
            }
        }

        public double toSeconds() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.microSecondsToSeconds(value);
                case MilliSec:
                    return UnitConversion.Time.milliSecondsToSeconds(value);
                case Sec:
                    return (value);
                case Min:
                    return UnitConversion.Time.minutesToSeconds(value);
                case Hrs:
                    return UnitConversion.Time.hoursToSeconds(value);
                case Day:
                    return UnitConversion.Time.daysToSeconds(value);
                case Week:
                    return UnitConversion.Time.weeksToSeconds(value);
                case Year:
                    return UnitConversion.Time.yearsToSeconds(value);
                default:
                    return 0.0;
            }
        }

        public double toMinutes() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.microSecondsToMinutes(value);
                case MilliSec:
                    return UnitConversion.Time.milliSecondsToMinutes(value);
                case Sec:
                    return UnitConversion.Time.secondsToMinutes(value);
                case Min:
                    return (value);
                case Hrs:
                    return UnitConversion.Time.hoursToMinutes(value);
                case Day:
                    return UnitConversion.Time.daysToMinutes(value);
                case Week:
                    return UnitConversion.Time.weeksToMinutes(value);
                case Year:
                    return UnitConversion.Time.yearsToMinutes(value);
                default:
                    return 0.0;
            }
        }

        public double toHours() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.microSecondsToHours(value);
                case MilliSec:
                    return UnitConversion.Time.milliSecondsToHours(value);
                case Sec:
                    return UnitConversion.Time.secondsToHours(value);
                case Min:
                    return UnitConversion.Time.minutesToHours(value);
                case Hrs:
                    return (value);
                case Day:
                    return UnitConversion.Time.daysToHours(value);
                case Week:
                    return UnitConversion.Time.weeksToHours(value);
                case Year:
                    return UnitConversion.Time.yearsToHours(value);
                default:
                    return 0.0;
            }
        }

        public double toDays() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.microSecondsToDays(value);
                case MilliSec:
                    return UnitConversion.Time.milliSecondsToDays(value);
                case Sec:
                    return UnitConversion.Time.secondsToDays(value);
                case Min:
                    return UnitConversion.Time.minutesToDays(value);
                case Hrs:
                    return UnitConversion.Time.hoursToDays(value);
                case Day:
                    return (value);
                case Week:
                    return UnitConversion.Time.weeksToDays(value);
                case Year:
                    return UnitConversion.Time.yearsToDays(value);
                default:
                    return 0.0;
            }
        }

        public double toWeeks() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.microSecondsToWeeks(value);
                case MilliSec:
                    return UnitConversion.Time.milliSecondsToWeeks(value);
                case Sec:
                    return UnitConversion.Time.secondsToWeeks(value);
                case Min:
                    return UnitConversion.Time.minutesToWeeks(value);
                case Hrs:
                    return UnitConversion.Time.hoursToWeeks(value);
                case Day:
                    return UnitConversion.Time.daysToWeeks(value);
                case Week:
                    return (value);
                case Year:
                    return UnitConversion.Time.yearsToWeeks(value);
                default:
                    return 0.0;
            }
        }

        public double toYears() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.microSecondsToYears(value);
                case MilliSec:
                    return UnitConversion.Time.milliSecondsToYears(value);
                case Sec:
                    return UnitConversion.Time.secondsToYears(value);
                case Min:
                    return UnitConversion.Time.minutesToYears(value);
                case Hrs:
                    return UnitConversion.Time.hoursToYears(value);
                case Day:
                    return UnitConversion.Time.daysToYears(value);
                case Week:
                    return UnitConversion.Time.weeksToYears(value);
                case Year:
                    return (value);
                default:
                    return 0.0;
            }
        }
    }

    //Class if user wants to perform conversions on Pressure
    public static class ForPressure{

        //Variables
        public static final String ATM = "Atmosphere";
        public static final String BARR = "Bars";
        public static final String KILOPASC = "KiloPascal";
        public static final String MMOFMERC = "Millimetre Of Mercury";
        public static final String PASC = "Pascal";
        public static final String PPSPERINCH = "Pounds Per Square Inch";


        private final double value;
        private final String fromUnit;

        public ForPressure( String fromUnit,String value) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public  double toAtm(){
            switch (this.fromUnit){
                case ATM:
                    return value;
                case BARR:
                    return UnitConversion.Pressure.barsToAtmosphere(value);
                case KILOPASC:
                    return UnitConversion.Pressure.kiloPascalsToAtmosphere(value);
                case MMOFMERC:
                    return UnitConversion.Pressure.millimetersOfMercuryToAtmosphere(value);
                case PASC:
                    return UnitConversion.Pressure.pascalsToAtmosphere(value);
                case PPSPERINCH:
                    return UnitConversion.Pressure.poundsPerSquareInchToAtmosphere(value);
                default:
                    return 0.0;
            }
    }
        public double toBarr(){
        switch (this.fromUnit){
            case ATM:
                return UnitConversion.Pressure.atmosphereToBars(value);
            case BARR:
                return (value);
            case KILOPASC:
                return UnitConversion.Pressure.kiloPascalsToBars(value);
            case MMOFMERC:
                return UnitConversion.Pressure.millimetersOfMercuryToBars(value);
            case PASC:
                return UnitConversion.Pressure.pascalsToBars(value);
            case PPSPERINCH:
                return UnitConversion.Pressure.poundsPerSquareInchToBars(value);
            default:
                return 0.0;
        }
        }
        public double toKiloPascals(){
            switch (this.fromUnit){
                case ATM:
                    return UnitConversion.Pressure.atmosphereToKiloPascals(value);
                case BARR:
                    return UnitConversion.Pressure.barsToKiloPascals(value);
                case KILOPASC:
                    return (value);
                case MMOFMERC:
                    return UnitConversion.Pressure.millimetersOfMercuryToKiloPascals(value);
                case PASC:
                    return UnitConversion.Pressure.pascalsToKiloPascals(value);
                case PPSPERINCH:
                    return UnitConversion.Pressure.poundsPerSquareInchToKiloPascals(value);
                default:
                    return 0.0;
            }
        }
        public double toMMofMerc(){
            switch (this.fromUnit){
                case ATM:
                    return UnitConversion.Pressure.atmosphereToMillimetersOfMercury(value);
                case BARR:
                    return UnitConversion.Pressure.barsToMillimetersOfMercury(value);
                case KILOPASC:
                    return UnitConversion.Pressure.kiloPascalsToMillimetersOfMercury(value);
                case MMOFMERC:
                    return (value);
                case PASC:
                    return UnitConversion.Pressure.pascalsToMilliMetersOfMercury(value);
                case PPSPERINCH:
                    return UnitConversion.Pressure.poundsPerSquareInchToMilliMetersOfMercury(value);
                default:
                    return 0.0;
            }
        }
        public double toPascals(){
            switch (this.fromUnit){
                case ATM:
                    return UnitConversion.Pressure.atmosphereToPascals(value);
                case BARR:
                    return UnitConversion.Pressure.barsToPascals(value);
                case KILOPASC:
                    return UnitConversion.Pressure.kiloPascalsToPascals(value);
                case MMOFMERC:
                    return UnitConversion.Pressure.millimetersOfMercuryToPascals(value);
                case PASC:
                    return (value);
                case PPSPERINCH:
                    return UnitConversion.Pressure.poundsPerSquareInchToPascals(value);
                default:
                    return 0.0;
            }
        }
        public double toPpsPerInch(){
            switch (this.fromUnit){
                case ATM:
                    return UnitConversion.Pressure.atmosphereToPoundsPerSquareInch(value);
                case BARR:
                    return UnitConversion.Pressure.barsToPoundsPerSquareInch(value);
                case KILOPASC:
                    return UnitConversion.Pressure.kiloPascalsToPoundsPerSquareInch(value);
                case MMOFMERC:
                    return UnitConversion.Pressure.millimetersOfMercuryToPoundsPerSquareInch(value);
                case PASC:
                    return UnitConversion.Pressure.pascalsToPoundsPerSquareInch(value);
                case PPSPERINCH:
                    return (value);
                default:
                    return 0.0;
            }
        }
    }

    //Class For Speed
    public static class ForSpeed{
        //Variables
        public static final String CmPerSec = "Centimetre/s";
        public static final String MPerSec  = "Metre/s";
        public static final String KmPerHr  = "Kilometre/hr";
        public static final String FtPerSec = "Feet/s";
        public static final String MiPerHr  = "Miles/hr";
        public static final String Knot = "Knots";
        public static final String Mach = "Mach";

        private final double value;
        private final String fromUnit;

        public ForSpeed(String fromUnit ,String value) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toCmPerSec(){
            switch (this.fromUnit){
                case CmPerSec:
                    return (value);
                case MPerSec:
                    return UnitConversion.Speed.metresPerSecondToCentiMetresPerSecond(value);
                case KmPerHr:
                    return UnitConversion.Speed.kiloMetresPerHourToCentiMetresPerSecond(value);
                case FtPerSec:
                    return UnitConversion.Speed.feetPerSecondToCentiMetresPerSecond(value);
                case MiPerHr:
                    return UnitConversion.Speed.milesPerHourToCentiMetresPerSecond(value);
                case Knot:
                    return UnitConversion.Speed.knotsToCentiMetresPerSecond(value);
                case Mach:
                    return UnitConversion.Speed.machToCentiMetresPerSecond(value);
                default:
                    return 0.0;
            }
        }
        public double toMPerSec(){
            switch (this.fromUnit){
                case CmPerSec:
                    return UnitConversion.Speed.centiMetresPerSecondToMetrePerSecond(value);
                case MPerSec:
                    return (value);
                case KmPerHr:
                    return UnitConversion.Speed.kiloMetresPerHourToMetresPerSecond(value);
                case FtPerSec:
                    return UnitConversion.Speed.feetPerSecondToMetresPerSecond(value);
                case MiPerHr:
                    return UnitConversion.Speed.milesPerHourToMetresPerSecond(value);
                case Knot:
                    return UnitConversion.Speed.knotsToMetresPerSecond(value);
                case Mach:
                    return UnitConversion.Speed.machToMetresPerSecond(value);
                default:
                    return 0.0;
            }
        }
        public double toKmPerHr(){
            switch (this.fromUnit){
                case CmPerSec:
                    return UnitConversion.Speed.centiMetresPerSecondToKiloMetersPerHour(value);
                case MPerSec:
                    return UnitConversion.Speed.metresPerSecondToKiloMetresPerHour(value);
                case KmPerHr:
                    return (value);
                case FtPerSec:
                    return UnitConversion.Speed.feetPerSecondToKiloMetresPerHour(value);
                case MiPerHr:
                    return UnitConversion.Speed.milesPerHourToKiloMetresPerHour(value);
                case Knot:
                    return UnitConversion.Speed.knotsToKiloMetresPerHour(value);
                case Mach:
                    return UnitConversion.Speed.machToKiloMetresPerHour(value);
                default:
                    return 0.0;
            }
        }
        public double toFtPerSec(){
            switch (this.fromUnit){
                case CmPerSec:
                    return UnitConversion.Speed.centiMetresPerSecondToFeetPerSecond(value);
                case MPerSec:
                    return UnitConversion.Speed.metresPerSecondToFeetPerSecond(value);
                case KmPerHr:
                    return UnitConversion.Speed.kiloMetresPerHourToFeetPerSecond(value);
                case FtPerSec:
                    return (value);
                case MiPerHr:
                    return UnitConversion.Speed.milesPerHourToFeetPerSecond(value);
                case Knot:
                    return UnitConversion.Speed.knotsToFeetPerSecond(value);
                case Mach:
                    return UnitConversion.Speed.machToFeetPerSecond(value);
                default:
                    return 0.0;
            }
        }
        public double toMiPerHr(){
            switch (this.fromUnit){
                case CmPerSec:
                    return UnitConversion.Speed.centiMetresPerSecondToMilesPerHour(value);
                case MPerSec:
                    return UnitConversion.Speed.metresPerSecondToMilesPerHour(value);
                case KmPerHr:
                    return UnitConversion.Speed.kiloMetresPerHourToMilesPerHour(value);
                case FtPerSec:
                    return UnitConversion.Speed.feetPerSecondToMilesPerHour(value);
                case MiPerHr:
                    return (value);
                case Knot:
                    return UnitConversion.Speed.knotsToMilesPerHour(value);
                case Mach:
                    return UnitConversion.Speed.machToMilesPerHour(value);
                default:
                    return 0.0;
            }
        }
        public double toKnot(){
            switch (this.fromUnit){
                case CmPerSec:
                    return UnitConversion.Speed.centiMetresPerSecondToKnots(value);
                case MPerSec:
                    return UnitConversion.Speed.metresPerSecondToKnots(value);
                case KmPerHr:
                    return UnitConversion.Speed.kiloMetresPerHourToKnots(value);
                case FtPerSec:
                    return UnitConversion.Speed.feetPerSecondToKnots(value);
                case MiPerHr:
                    return UnitConversion.Speed.milesPerHourToKnots(value);
                case Knot:
                    return (value);
                case Mach:
                    return UnitConversion.Speed.machToKnots(value);
                default:
                    return 0.0;
            }
        }
        public double toMach(){
            switch (this.fromUnit){
                case CmPerSec:
                    return UnitConversion.Speed.centiMetresPerSecondToMach(value);
                case MPerSec:
                    return UnitConversion.Speed.metresPerSecondToMach(value);
                case KmPerHr:
                    return UnitConversion.Speed.kiloMetresPerHourToMach(value);
                case FtPerSec:
                    return UnitConversion.Speed.feetPerSecondToMach(value);
                case MiPerHr:
                    return UnitConversion.Speed.milesPerHourToMach(value);
                case Knot:
                    return UnitConversion.Speed.knotsToMach(value);
                case Mach:
                    return (value);
                default:
                    return 0.0;
            }
        }

    }

    //Class for Energy Conversions
    public static class ForEnergy{
        //Variables
        public static final String EV = "Electron Volt";
        public static final String J = "Joule";
        public static final String KJ = "Kilo Joule";
        public static final String CAL = "Thermal Calories";
        public static final String FCAL = "Food Calories";
        public static final String FTPOUNDS = "Foot-Pounds";

        private final double value;
        private final String fromUnit;

        public ForEnergy(String fromUnit, String value) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toEv(){
            switch (this.fromUnit){
                case EV:
                    return (value);
                case J:
                    return UnitConversion.Energy.joulesToElectronVolts(value);
                case KJ:
                    return UnitConversion.Energy.kiloJoulesToElectronVolts(value);
                case CAL:
                    return UnitConversion.Energy.thermalCaloriesToElectronVolts(value);
                case FTPOUNDS:
                    return UnitConversion.Energy.footPoundsToElectronVolts(value);
                case FCAL:
                    return UnitConversion.Energy.foodCaloriesToElectronVolts(value);
                default:
                    return 0.0;
            }
        }
        public double toJ(){
            switch (this.fromUnit){
                case EV:
                    return UnitConversion.Energy.electronVoltsToJoules(value);
                case J:
                    return (value);
                case KJ:
                    return UnitConversion.Energy.kiloJoulesToJoules(value);
                case CAL:
                    return UnitConversion.Energy.thermalCaloriesToJoules(value);
                case FTPOUNDS:
                    return UnitConversion.Energy.footPoundsToJoules(value);
                case FCAL:
                    return UnitConversion.Energy.foodCaloriesToJoules(value);
                default:
                    return 0.0;
            }
        }
        public double toKj(){
            switch (this.fromUnit){
                case EV:
                    return UnitConversion.Energy.electronVoltsToKiloJoules(value);
                case J:
                    return UnitConversion.Energy.joulesToKiloJoules(value);
                case KJ:
                    return (value);
                case CAL:
                    return UnitConversion.Energy.thermalCaloriesToKiloJoules(value);
                case FTPOUNDS:
                    return UnitConversion.Energy.footPoundsToKiloJoules(value);
                case FCAL:
                    return UnitConversion.Energy.foodCaloriesToKiloJoules(value);
                default:
                    return 0.0;
            }
        }
        public double toCal(){
            switch (this.fromUnit){
                case EV:
                    return UnitConversion.Energy.electronVoltsToThermalCalories(value);
                case J:
                    return UnitConversion.Energy.joulesToThermalCalories(value);
                case KJ:
                    return UnitConversion.Energy.kiloJoulesToThermalCalories(value);
                case CAL:
                    return (value);
                case FTPOUNDS:
                    return UnitConversion.Energy.footPoundsToThermalCalories(value);
                case FCAL:
                    return UnitConversion.Energy.foodCaloriesToThermalCalories(value);
                default:
                    return 0.0;
            }
        }
        public double toFCal(){
            switch (this.fromUnit){
                case EV:
                    return UnitConversion.Energy.electronVoltsToFoodCalories(value);
                case J:
                    return UnitConversion.Energy.joulesToFoodCalories(value);
                case KJ:
                    return UnitConversion.Energy.kiloJoulesToFoodCalories(value);
                case CAL:
                    return UnitConversion.Energy.thermalCaloriesToFoodCalories(value);
                case FTPOUNDS:
                    return UnitConversion.Energy.footPoundsToFoodCalories(value);
                case FCAL:
                    return (value);
                default:
                    return 0.0;
            }
        }
        public double toFootPounds(){
            switch (this.fromUnit){
                case EV:
                    return UnitConversion.Energy.electronVoltsToFootPounds(value);
                case J:
                    return UnitConversion.Energy.joulesToFootPounds(value);
                case KJ:
                    return UnitConversion.Energy.kiloJoulesToFootPounds(value);
                case CAL:
                    return UnitConversion.Energy.thermalCaloriesToFootPounds(value);
                case FTPOUNDS:
                    return (value);
                case FCAL:
                    return UnitConversion.Energy.foodCaloriesToFootPounds(value);
                default:
                    return 0.0;
            }
        }
    }
    //Energy Class ends

    //Class for Volume
    public static class ForVolume{
        //Variables
        public static final String  MILLILITRS   = "Millilitre";
        public static final String  LTRS      = "Litre";
        public static final String  CUBICMETRE= "Cubic Metre";
        public static final String  TEASPOON    = "Tea Spoon";
        public static final String  FLDONC    = "Fluid Ounce";
        public static final String  CUPS      = "Cup";
        public static final String  PINTS     = "Pint";
        public static final String  QUARTS    = "Quart";
        public static final String  GALL      = "Gallon";
        public static final String  CUBICINCH = "Cubic Inch";
        public static final String  CUBICFT   = "Cubic Feet";
        public static final String  CUBICYARD  = "Cubic Yard";

        private final double value;
        private final String fromUnit;

        public ForVolume( String fromUnit,String value) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toMilliLitres(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return (value);
                case LTRS:
                    return UnitConversion.Volume.litresToMillilitres(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicMetreToMillilitres(value);
                case TEASPOON:
                    return UnitConversion.Volume.teaSpoonsToMillilitres(value);
                case FLDONC:
                    return UnitConversion.Volume.fluidOuncesToMillilitres(value);
                case PINTS:
                    return UnitConversion.Volume.pintsToMillilitres(value);
                case CUPS:
                    return UnitConversion.Volume.cupsToMillilitres(value);
                case QUARTS:
                    return UnitConversion.Volume.quartsToMillilitres(value);
                case GALL:
                    return UnitConversion.Volume.gallonsToMillilitres(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicInchesToMillilitres(value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicFeetToMillilitres(value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicYardsToMillilitres(value);
                default:
                    return 0.0;
            }
        }
        public double toLitres(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.millilitresToLitres(value);
                case LTRS:
                    return (value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicMetreToLitres(value);
                case TEASPOON:
                    return UnitConversion.Volume.teaSpoonsToLitres(value);
                case FLDONC:
                    return UnitConversion.Volume.fluidOuncesToLitres(value);
                case PINTS:
                    return UnitConversion.Volume.pintsToLitres(value);
                case CUPS:
                    return UnitConversion.Volume.cupsToLitres(value);
                case QUARTS:
                    return UnitConversion.Volume.quartsToLitres(value);
                case GALL:
                    return UnitConversion.Volume.gallonsToLitres(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicInchesToLitres(value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicFeetToLitres(value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicYardsToLitres(value);
                default:
                    return 0.0;
            }
        }
        public double toCubicMetre(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.millilitresToCubicMetres(value);
                case LTRS:
                    return UnitConversion.Volume.litresToCubicMetres(value);
                case CUBICMETRE:
                    return (value);
                case TEASPOON:
                    return UnitConversion.Volume.teaSpoonsToCubicMetres(value);
                case FLDONC:
                    return UnitConversion.Volume.fluidOuncesToCubicMetres(value);
                case PINTS:
                    return UnitConversion.Volume.pintsToCubicMetres(value);
                case CUPS:
                    return UnitConversion.Volume.cupsToCubicMetres(value);
                case QUARTS:
                    return UnitConversion.Volume.quartsToCubicMetres(value);
                case GALL:
                    return UnitConversion.Volume.gallonsToCubicMetres(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicInchesToCubicMetres(value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicFeetToCubicMetres(value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicYardsToCubicMetres(value);
                default:
                    return 0.0;
            }
        }
        public double toTeaSpoon(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.millilitresToTeaSpoons(value);
                case LTRS:
                    return UnitConversion.Volume.litresToTeaSpoons(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicMetreToTeaSpoons(value);
                case TEASPOON:
                    return (value);
                case FLDONC:
                    return UnitConversion.Volume.fluidOuncesToTeaSpoons(value);
                case PINTS:
                    return UnitConversion.Volume.pintsToTeaSpoons(value);
                case CUPS:
                    return UnitConversion.Volume.cupsToTeaSpoons(value);
                case QUARTS:
                    return UnitConversion.Volume.quartsToTeaSpoons(value);
                case GALL:
                    return UnitConversion.Volume.gallonsToTeaSpoons(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicInchesToTeaSpoons(value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicFeetToTeaSpoons(value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicYardsToTeaSpoons(value);
                default:
                    return 0.0;
            }
        }
        public double toFluidOunce(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.millilitresToFluidOunces(value);
                case LTRS:
                    return UnitConversion.Volume.litresToFluidOunces(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicMetreToFluidOunces(value);
                case TEASPOON:
                    return UnitConversion.Volume.teaSpoonsToFluidOunces(value);
                case FLDONC:
                    return (value);
                case PINTS:
                    return UnitConversion.Volume.pintsToFluidOunces(value);
                case CUPS:
                    return UnitConversion.Volume.cupsToFluidOunces(value);
                case QUARTS:
                    return UnitConversion.Volume.quartsToFluidOunces(value);
                case GALL:
                    return UnitConversion.Volume.gallonsToFluidOunces(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicInchesToFluidOunces(value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicFeetToFluidOunces(value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicYardsToFluidOunces(value);
                default:
                    return 0.0;
            }
        }
        public double toPints(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.millilitresToPints(value);
                case LTRS:
                    return UnitConversion.Volume.litresToPints(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicMetreToPints(value);
                case TEASPOON:
                    return UnitConversion.Volume.teaSpoonsToPints(value);
                case FLDONC:
                    return UnitConversion.Volume.fluidOuncesToPints(value);
                case PINTS:
                    return (value);
                case CUPS:
                    return UnitConversion.Volume.cupsToPints(value);
                case QUARTS:
                    return UnitConversion.Volume.quartsToPints(value);
                case GALL:
                    return UnitConversion.Volume.gallonsToPints(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicInchesToPints(value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicFeetToPints(value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicYardsToPints(value);
                default:
                    return 0.0;
            }
        }
        public double toCups(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.millilitresToCups(value);
                case LTRS:
                    return UnitConversion.Volume.litresToCups(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicMetreToCups(value);
                case TEASPOON:
                    return UnitConversion.Volume.teaSpoonsToCups(value);
                case FLDONC:
                    return UnitConversion.Volume.fluidOuncesToCups(value);
                case PINTS:
                    return UnitConversion.Volume.pintsToCups(value);
                case CUPS:
                    return (value);
                case QUARTS:
                    return UnitConversion.Volume.quartsToCups(value);
                case GALL:
                    return UnitConversion.Volume.gallonsToCups(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicInchesToCups(value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicFeetToCups(value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicYardsToCups(value);
                default:
                    return 0.0;
            }
        }
        public double toQuarts(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.millilitresToQuarts(value);
                case LTRS:
                    return UnitConversion.Volume.litresToQuarts(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicMetreToQuarts(value);
                case TEASPOON:
                    return UnitConversion.Volume.teaSpoonsToQuarts(value);
                case FLDONC:
                    return UnitConversion.Volume.fluidOuncesToQuarts(value);
                case PINTS:
                    return UnitConversion.Volume.pintsToQuarts(value);
                case CUPS:
                    return UnitConversion.Volume.cupsToQuarts(value);
                case QUARTS:
                    return (value);
                case GALL:
                    return UnitConversion.Volume.gallonsToQuarts(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicInchesToQuarts(value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicFeetToQuarts(value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicYardsToQuarts(value);
                default:
                    return 0.0;
            }
        }
        public double toGall(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.millilitresToGallons(value);
                case LTRS:
                    return UnitConversion.Volume.litresToGallons(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicMetreToGallons(value);
                case TEASPOON:
                    return UnitConversion.Volume.gallonsToTeaSpoons(value);
                case FLDONC:
                    return UnitConversion.Volume.fluidOuncesToTeaSpoons(value);
                case PINTS:
                    return UnitConversion.Volume.pintsToTeaSpoons(value);
                case CUPS:
                    return UnitConversion.Volume.cupsToTeaSpoons(value);
                case QUARTS:
                    return UnitConversion.Volume.quartsToTeaSpoons(value);
                case GALL:
                    return (value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicInchesToTeaSpoons(value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicFeetToTeaSpoons(value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicYardsToTeaSpoons(value);
                default:
                    return 0.0;
            }
        }
        public double toCubicInch(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.millilitresToCubicInches(value);
                case LTRS:
                    return UnitConversion.Volume.litresToCubicInches(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicMetreToCubicInches(value);
                case TEASPOON:
                    return UnitConversion.Volume.teaSpoonsToCubicInches(value);
                case FLDONC:
                    return UnitConversion.Volume.fluidOuncesToCubicInches(value);
                case PINTS:
                    return UnitConversion.Volume.pintsToCubicInches(value);
                case CUPS:
                    return UnitConversion.Volume.cupsToCubicInches(value);
                case QUARTS:
                    return UnitConversion.Volume.quartsToCubicInches(value);
                case GALL:
                    return UnitConversion.Volume.gallonsToCubicInches(value);
                case CUBICINCH:
                    return (value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicFeetToCubicInches(value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicYardsToCubicInches(value);
                default:
                    return 0.0;
        }


    }
        public double toCubicFt(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.millilitresToCubicFeet(value);
                case LTRS:
                    return UnitConversion.Volume.litresToCubicFeet(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicMetreToCubicFeet(value);
                case TEASPOON:
                    return UnitConversion.Volume.teaSpoonsToCubicFeet(value);
                case FLDONC:
                    return UnitConversion.Volume.fluidOuncesToCubicFeet(value);
                case PINTS:
                    return UnitConversion.Volume.pintsToCubicFeet(value);
                case CUPS:
                    return UnitConversion.Volume.cupsToCubicFeet(value);
                case QUARTS:
                    return UnitConversion.Volume.quartsToCubicFeet(value);
                case GALL:
                    return UnitConversion.Volume.gallonsToCubicFeet(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicInchesToCubicFeet(value);
                case CUBICFT:
                    return (value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicYardsToCubicFeet(value);
                default:
                    return 0.0;
            }
        }
        public double toCubicYard(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.millilitresToCubicYards(value);
                case LTRS:
                    return UnitConversion.Volume.litresToCubicYards(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicMetreToCubicYards(value);
                case TEASPOON:
                    return UnitConversion.Volume.teaSpoonsToCubicYards(value);
                case FLDONC:
                    return UnitConversion.Volume.fluidOuncesToCubicYards(value);
                case PINTS:
                    return UnitConversion.Volume.pintsToCubicYards(value);
                case CUPS:
                    return UnitConversion.Volume.cupsToCubicYards(value);
                case QUARTS:
                    return UnitConversion.Volume.quartsToCubicYards(value);
                case GALL:
                    return UnitConversion.Volume.gallonsToCubicYards(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicInchesToCubicYards(value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicFeetToCubicYards(value);
                case CUBICYARD:
                    return (value);
                default:
                    return 0.0;
            }
        }
    }

    //Class for Digital Storage
    public static class ForDigitalStorage{
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

        private final double value;
        private final String fromUnit;

        public ForDigitalStorage( String fromUnit,String value) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toBit(){
            switch (this.fromUnit){
                case Bit:
                    return value;
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToBits(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToBits(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToBits(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToBits(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToBits(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToBits(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToBits(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToBits(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToBits(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToBits(value);
                default:
                    return 0.0;
            }
        }
        public double toBytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToBytes(value);
                case Bytes:
                    return (value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToBytes(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToBytes(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToBytes(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToBytes(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToBytes(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToBytes(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToBytes(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToBytes(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToBytes(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toNibble(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToNibbles(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToNibbles(value);
                case Nibble:
                    return (value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToNibbles(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToNibbles(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToNibbles(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToNibbles(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToNibbles(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToNibbles(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToNibbles(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToNibbles(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToNibbles(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToNibbles(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToNibbles(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToNibbles(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToNibbles(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToNibbles(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToNibbles(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToNibbles(value);
                default:
                    return 0.0;
            }
        }
        public double toKilobits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToKiloBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToKiloBits(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToKiloBits(value);
                case Kbi:
                    return (value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToKiloBits(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToKiloBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToKiloBits(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToKiloBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToKiloBits(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToKiloBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToKiloBits(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToKiloBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToKiloBits(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToKiloBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToKiloBits(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToKiloBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToKiloBits(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToKiloBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToKiloBits(value);
                default:
                    return 0.0;
            }
        }
        public double toKilobytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToKiloBytes(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToKiloBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToKiloBytes(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToKiloBytes(value);
                case Kby:
                    return (value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToKiloBytes(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToKiloBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToKiloBytes(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToKiloBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToKiloBytes(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToKiloBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToKiloBytes(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToKiloBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToKiloBytes(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToKiloBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToKiloBytes(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToKiloBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToKiloBytes(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToKiloBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toMegabits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToMegaBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToMegaBits(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToMegaBits(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToMegaBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToMegaBits(value);
                case Mbi:
                    return (value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToMegaBits(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToMegaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToMegaBits(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToMegaBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToMegaBits(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToMegaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToMegaBits(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToMegaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToMegaBits(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToMegaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToMegaBits(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToMegaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToMegaBits(value);
                default:
                    return 0.0;
            }
        }
        public double toMegabytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToMegaBytes(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToMegaBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToMegaBytes(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToMegaBytes(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToMegaBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToMegaBytes(value);
                case Mby:
                    return (value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToMegaBytes(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToMegaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToMegaBytes(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToMegaBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToMegaBytes(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToMegaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToMegaBytes(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToMegaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToMegaBytes(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToMegaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToMegaBytes(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToMegaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toGigabits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToGigaBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToGigaBits(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToGigaBits(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToGigaBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToGigaBits(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToGigaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToGigaBits(value);
                case Gbi:
                    return (value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToGigaBits(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToGigaBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToGigaBits(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToGigaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToGigaBits(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToGigaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToGigaBits(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToGigaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToGigaBits(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToGigaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToGigaBits(value);
                default:
                    return 0.0;
            }
        }
        public double toGigabytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToGigaBytes(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToGigaBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToGigaBytes(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToGigaBytes(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToGigaBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToGigaBytes(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToGigaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToGigaBytes(value);
                case Gby:
                    return (value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToGigaBytes(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToGigaBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToGigaBytes(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToGigaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToGigaBytes(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToGigaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToGigaBytes(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToGigaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToGigaBytes(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToGigaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toTerabits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToTeraBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToTeraBits(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToTeraBits(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToTeraBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToTeraBits(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToTeraBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToTeraBits(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToTeraBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToTeraBytes(value);
                case Tbi:
                    return (value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToTeraBits(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToTeraBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToTeraBits(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToTeraBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToTeraBits(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToTeraBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToTeraBits(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToTeraBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToTeraBits(value);
                default:
                    return 0.0;
            }
        }
        public double toTerabytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToTeraBytes(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToTeraBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToTeraBytes(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToTeraBytes(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToTeraBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToTeraBytes(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToTeraBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToTeraBytes(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToTeraBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToTeraBytes(value);
                case Tby:
                    return (value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToTeraBytes(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToTeraBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToTeraBytes(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToTeraBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToTeraBytes(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToTeraBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToTeraBytes(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToTeraBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toPetabits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToPetaBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToPetaBits(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToPetaBits(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToPetaBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToPetaBits(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToPetaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToPetaBits(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToPetaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToPetaBits(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToPetaBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToPetaBits(value);
                case Pbi:
                    return (value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToPetaBits(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToPetaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToPetaBits(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToPetaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToPetaBits(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToPetaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToPetaBits(value);
                default:
                    return 0.0;
            }
        }
        public double toPetabytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToPetaBytes(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToPetaBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToPetaBytes(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToPetaBytes(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToPetaBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToPetaBytes(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToPetaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToPetaBytes(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToPetaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToPetaBytes(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToPetaBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToPetaBytes(value);
                case Pby:
                    return (value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToPetaBytes(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToPetaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToPetaBytes(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToPetaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToPetaBytes(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToPetaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toExabits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToExaBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToExaBits(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToExaBits(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToExaBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToExaBits(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToExaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToExaBits(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToExaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToExaBits(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToExaBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToExaBits(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToExaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToExaBits(value);
                case Ebi:
                    return (value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToExaBits(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToExaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToExaBits(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToExaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToExaBits(value);
                default:
                    return 0.0;
            }
        }
        public double toExaBytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToExaBytes(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToExaBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToExaBytes(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToExaBytes(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToExaBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToExaBytes(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToExaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToExaBytes(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToExaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToExaBytes(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToExaBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToExaBytes(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToExaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToExaBytes(value);
                case Eby:
                    return (value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToExaBytes(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToExaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToExaBytes(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToExaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toZettaBits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToZettaBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToZettaBits(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToZettaBits(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToZettaBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToZettaBits(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToZettaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToZettaBits(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToZettaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToZettaBits(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToZettaBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToZettaBits(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToZettaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToZettaBits(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToZettaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToZettaBits(value);
                case Zbi:
                    return (value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToZettaBits(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToZettaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToZettaBits(value);
                default:
                    return 0.0;
            }
        }
        public double toZettaBytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToZettaBytes(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToZettaBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToZettaBytes(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToZettaBytes(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToZettaBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToZettaBytes(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToZettaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToZettaBytes(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToZettaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToZettaBytes(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToZettaBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToZettaBytes(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToZettaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToZettaBytes(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToZettaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToZettaBytes(value);
                case Zby:
                    return (value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToZettaBytes(value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToZettaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toYottaBits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToYottaBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToYottaBits(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToYottaBits(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToYottaBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToYottaBits(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToYottaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToYottaBits(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToYottaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToYottaBits(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToYottaBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToYottaBits(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToYottaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToYottaBits(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToYottaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToYottaBits(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToYottaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToYottaBits(value);
                case Ybi:
                    return (value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBytesToYottaBits(value);
                default:
                    return 0.0;
            }
        }
        public double toYottaBytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bitsToYottaBytes(value);
                case Bytes:
                    return UnitConversion.digitalStorage.bytesToYottaBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.nibblesToYottaBytes(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBitsToYottaBytes(value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBytesToYottaBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBitsToYottaBytes(value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBytesToYottaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBitsToYottaBytes(value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBytesToYottaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBitsToYottaBytes(value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBytesToYottaBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBitsToYottaBytes(value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBytesToYottaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBitsToYottaBytes(value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBytesToYottaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBitsToYottaBytes(value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBytesToYottaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBitsToYottaBytes(value);
                case Yby:
                    return (value);
                default:
                    return 0.0;
            }
        }
    }
}
