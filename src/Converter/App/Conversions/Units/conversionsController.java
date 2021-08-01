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

        public ForDistance(String stringNum, String fromUnit) {
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

        public ForArea(String value, String fromUnit) {
            this.value = conversionsInputValidator(value);
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

    //Class for Temperature
    public static class ForTemperature{
        //Variables
        public static final String Cel = "Celsius";
        public static final String Fah = "Fahrenheit";
        public static final String Kel = "Kelvin";
        public static final String Rankine = "Rankine";

        private final String fromUnit;
        private final double value;

        public ForTemperature(String value, String fromUnit) {
            this.value = conversionsInputValidator(value);
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

        public ForPower(String value, String fromUnit) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toWatts() {
            switch (this.fromUnit){
                case watt:
                    return value;
                case KiloWatt:
                    return UnitConversion.Power.wattsToKiloWatts(value);
                case HP:
                    return UnitConversion.Power.wattsToHorsePower(value);
                case FTPpm:
                    return UnitConversion.Power.wattsToFootPoundsPerMinute(value);
                case BTU:
                    return UnitConversion.Power.wattsToBTUsPerMinute(value);
                default:
                    return 0;
            }
        }

        public double toKiloWatts() {
            switch (this.fromUnit){
                case watt:
                    return UnitConversion.Power.kiloWattsToWatts(value);
                case KiloWatt:
                    return (value);
                case HP:
                    return UnitConversion.Power.kiloWattsToHorsePower(value);
                case FTPpm:
                    return UnitConversion.Power.kiloWattsToFootPoundsPerMinute(value);
                case BTU:
                    return UnitConversion.Power.kiloWattsToBTUsPerMinute(value);
                default:
                    return 0;
            }
        }

        public double toHorsePower() {
            switch (this.fromUnit){
                case watt:
                    return UnitConversion.Power.horsePowerToWatts(value);
                case KiloWatt:
                    return UnitConversion.Power.horsePowerToKiloWatts(value);
                case HP:
                    return (value);
                case FTPpm:
                    return UnitConversion.Power.horsePowerToFootPoundsPerMinute(value);
                case BTU:
                    return UnitConversion.Power.horsePowerToBTUsPerMinute(value);
                default:
                    return 0;
            }
        }

        public double toFootPoundsPerMinute() {
            switch (this.fromUnit){
                case watt:
                    return UnitConversion.Power.footPoundsPerMinuteToWatts(value);
                case KiloWatt:
                    return UnitConversion.Power.footPoundsPerMinuteToKiloWatts(value);
                case HP:
                    return UnitConversion.Power.footPoundsPerMinuteToHorsePower(value);
                case FTPpm:
                    return (value);
                case BTU:
                    return UnitConversion.Power.footPoundsPerMinuteToBTUsPerMinute(value);
                default:
                    return 0;
            }
        }

        public double toBTUsPerMinute() {
            switch (this.fromUnit){
                case watt:
                    return UnitConversion.Power.bTUsPerMinuteToWatts(value);
                case KiloWatt:
                    return UnitConversion.Power.bTUsPerMinuteToKiloWatts(value);
                case HP:
                    return UnitConversion.Power.bTUsPerMinuteToHorsePower(value);
                case FTPpm:
                    return UnitConversion.Power.bTUsPerMinuteToFootPoundsPerMinute(value);
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
        public static final String MilliSec = " Milli Second";
        public static final String Sec  = "Second";
        public static final String Min  = "Minute";
        public static final String Hrs  = "Hours";
        public static final String Day  = "Day";
        public static final String Week = "Week";
        public static final String Year = "Year";

        private final double value;
        private final String fromUnit;

        public ForTime(String value, String fromUnit) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toMicroSeconds() {
            switch (this.fromUnit){
                case MicroSec:
                    return (value);
                case MilliSec:
                    return UnitConversion.Time.microSecondsToMilliSeconds(value);
                case Sec:
                    return UnitConversion.Time.microSecondsToSeconds(value);
                case Min:
                    return UnitConversion.Time.microSecondsToMinutes(value);
                case Hrs:
                    return UnitConversion.Time.microSecondsToHours(value);
                case Day:
                    return UnitConversion.Time.microSecondsToDays(value);
                case Week:
                    return UnitConversion.Time.microSecondsToWeeks(value);
                case Year:
                    return UnitConversion.Time.microSecondsToYears(value);
                default:
                    return 0.0;
            }
        }

        public double toMilliSeconds() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.milliSecondsToMicroSeconds(value);
                case MilliSec:
                    return (value);
                case Sec:
                    return UnitConversion.Time.milliSecondsToSeconds(value);
                case Min:
                    return UnitConversion.Time.milliSecondsToMinutes(value);
                case Hrs:
                    return UnitConversion.Time.milliSecondsToHours(value);
                case Day:
                    return UnitConversion.Time.milliSecondsToDays(value);
                case Week:
                    return UnitConversion.Time.milliSecondsToWeeks(value);
                case Year:
                    return UnitConversion.Time.milliSecondsToYears(value);
                default:
                    return 0.0;
            }
        }

        public double toSeconds() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.secondsToMicroSeconds(value);
                case MilliSec:
                    return UnitConversion.Time.secondsToMilliSeconds(value);
                case Sec:
                    return (value);
                case Min:
                    return UnitConversion.Time.secondsToMinutes(value);
                case Hrs:
                    return UnitConversion.Time.secondsToHours(value);
                case Day:
                    return UnitConversion.Time.secondsToDays(value);
                case Week:
                    return UnitConversion.Time.secondsToWeeks(value);
                case Year:
                    return UnitConversion.Time.secondsToYears(value);
                default:
                    return 0.0;
            }
        }

        public double toMinutes() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.minutesToMicroSeconds(value);
                case MilliSec:
                    return UnitConversion.Time.minutesToMilliSeconds(value);
                case Sec:
                    return UnitConversion.Time.minutesToSeconds(value);
                case Min:
                    return (value);
                case Hrs:
                    return UnitConversion.Time.minutesToHours(value);
                case Day:
                    return UnitConversion.Time.minutesToDays(value);
                case Week:
                    return UnitConversion.Time.minutesToWeeks(value);
                case Year:
                    return UnitConversion.Time.minutesToYears(value);
                default:
                    return 0.0;
            }
        }

        public double toHours() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.hoursToMicroSeconds(value);
                case MilliSec:
                    return UnitConversion.Time.hoursToMilliSeconds(value);
                case Sec:
                    return UnitConversion.Time.hoursToSeconds(value);
                case Min:
                    return UnitConversion.Time.hoursToMinutes(value);
                case Hrs:
                    return (value);
                case Day:
                    return UnitConversion.Time.hoursToDays(value);
                case Week:
                    return UnitConversion.Time.hoursToWeeks(value);
                case Year:
                    return UnitConversion.Time.hoursToYears(value);
                default:
                    return 0.0;
            }
        }

        public double toDays() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.daysToMicroSeconds(value);
                case MilliSec:
                    return UnitConversion.Time.daysToMilliSeconds(value);
                case Sec:
                    return UnitConversion.Time.daysToSeconds(value);
                case Min:
                    return UnitConversion.Time.daysToMinutes(value);
                case Hrs:
                    return UnitConversion.Time.daysToHours(value);
                case Day:
                    return (value);
                case Week:
                    return UnitConversion.Time.daysToWeeks(value);
                case Year:
                    return UnitConversion.Time.daysToYears(value);
                default:
                    return 0.0;
            }
        }

        public double toWeeks() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.weeksToMicroSeconds(value);
                case MilliSec:
                    return UnitConversion.Time.weeksToMilliSeconds(value);
                case Sec:
                    return UnitConversion.Time.weeksToSeconds(value);
                case Min:
                    return UnitConversion.Time.weeksToMinutes(value);
                case Hrs:
                    return UnitConversion.Time.weeksToHours(value);
                case Day:
                    return UnitConversion.Time.weeksToDays(value);
                case Week:
                    return (value);
                case Year:
                    return UnitConversion.Time.weeksToYears(value);
                default:
                    return 0.0;
            }
        }

        public double toYears() {
            switch (this.fromUnit){
                case MicroSec:
                    return UnitConversion.Time.yearsToMicroSeconds(value);
                case MilliSec:
                    return UnitConversion.Time.yearsToMilliSeconds(value);
                case Sec:
                    return UnitConversion.Time.yearsToSeconds(value);
                case Min:
                    return UnitConversion.Time.yearsToMinutes(value);
                case Hrs:
                    return UnitConversion.Time.yearsToHours(value);
                case Day:
                    return UnitConversion.Time.yearsToDays(value);
                case Week:
                    return UnitConversion.Time.yearsToWeeks(value);
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
        public static final String MMOFMERC = " Millimetre Of Mercury";
        public static final String PASC = "Pascal";
        public static final String PPSPERINCH = "Pounds Per Square Inch";


        private final double value;
        private final String fromUnit;

        public ForPressure(String value, String fromUnit) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public  double toAtm(){
            switch (this.fromUnit){
                case ATM:
                    return value;
                case BARR:
                    return UnitConversion.Pressure.atmosphereToBars(value);
                case KILOPASC:
                    return UnitConversion.Pressure.atmosphereToKiloPascals(value);
                case MMOFMERC:
                    return UnitConversion.Pressure.atmosphereToMillimetersOfMercury(value);
                case PASC:
                    return UnitConversion.Pressure.atmosphereToPascals(value);
                case PPSPERINCH:
                    return UnitConversion.Pressure.atmosphereToPoundsPerSquareInch(value);
                default:
                    return 0.0;
            }
    }
        public double toBarr(){
        switch (this.fromUnit){
            case ATM:
                return UnitConversion.Pressure.barsToAtmosphere(value);
            case BARR:
                return (value);
            case KILOPASC:
                return UnitConversion.Pressure.barsToKiloPascals(value);
            case MMOFMERC:
                return UnitConversion.Pressure.barsToMillimetersOfMercury(value);
            case PASC:
                return UnitConversion.Pressure.barsToPascals(value);
            case PPSPERINCH:
                return UnitConversion.Pressure.barsToPoundsPerSquareInch(value);
            default:
                return 0.0;
        }
        }
        public double toKiloPascals(){
            switch (this.fromUnit){
                case ATM:
                    return UnitConversion.Pressure.kiloPascalsToAtmosphere(value);
                case BARR:
                    return UnitConversion.Pressure.kiloPascalsToBars(value);
                case KILOPASC:
                    return (value);
                case MMOFMERC:
                    return UnitConversion.Pressure.kiloPascalsToMillimetersOfMercury(value);
                case PASC:
                    return UnitConversion.Pressure.kiloPascalsToPascals(value);
                case PPSPERINCH:
                    return UnitConversion.Pressure.kiloPascalsToPoundsPerSquareInch(value);
                default:
                    return 0.0;
            }
        }
        public double toMMofMerc(){
            switch (this.fromUnit){
                case ATM:
                    return UnitConversion.Pressure.millimetersOfMercuryToAtmosphere(value);
                case BARR:
                    return UnitConversion.Pressure.millimetersOfMercuryToBars(value);
                case KILOPASC:
                    return UnitConversion.Pressure.millimetersOfMercuryToKiloPascals(value);
                case MMOFMERC:
                    return (value);
                case PASC:
                    return UnitConversion.Pressure.millimetersOfMercuryToPascals(value);
                case PPSPERINCH:
                    return UnitConversion.Pressure.millimetersOfMercuryToPoundsPerSquareInch(value);
                default:
                    return 0.0;
            }
        }
        public double toPascals(){
            switch (this.fromUnit){
                case ATM:
                    return UnitConversion.Pressure.pascalsToAtmosphere(value);
                case BARR:
                    return UnitConversion.Pressure.pascalsToBars(value);
                case KILOPASC:
                    return UnitConversion.Pressure.pascalsToKiloPascals(value);
                case MMOFMERC:
                    return UnitConversion.Pressure.pascalsToMilliMetersOfMercury(value);
                case PASC:
                    return (value);
                case PPSPERINCH:
                    return UnitConversion.Pressure.pascalsToPoundsPerSquareInch(value);
                default:
                    return 0.0;
            }
        }
        public double toPpsPerInch(){
            switch (this.fromUnit){
                case ATM:
                    return UnitConversion.Pressure.poundsPerSquareInchToAtmosphere(value);
                case BARR:
                    return UnitConversion.Pressure.poundsPerSquareInchToBars(value);
                case KILOPASC:
                    return UnitConversion.Pressure.poundsPerSquareInchToKiloPascals(value);
                case MMOFMERC:
                    return UnitConversion.Pressure.poundsPerSquareInchToMilliMetersOfMercury(value);
                case PASC:
                    return UnitConversion.Pressure.poundsPerSquareInchToPascals(value);
                case PPSPERINCH:
                    return UnitConversion.Pressure.kiloPascalsToPoundsPerSquareInch(value);
                default:
                    return 0.0;
            }
        }
    }

    //Class For Speed
    public static class ForSpeed{
        //Variables
        public static final String CmPerSec = " Centimetre/s";
        public static final String MPerSec  = " Metre/s";
        public static final String KmPerHr  = " Kilometre/hr";
        public static final String FtPerSec = " Feet/s";
        public static final String MiPerHr  = "Miles/hr";
        public static final String Knot = "Knots";
        public static final String Mach = " Mach";

        private final double value;
        private final String fromUnit;

        public ForSpeed(String value, String fromUnit) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toCmPerSec(){
            switch (this.fromUnit){
                case CmPerSec:
                    return (value);
                case MPerSec:
                    return UnitConversion.Speed.centiMetresPerSecondToMetrePerSecond(value);
                case KmPerHr:
                    return UnitConversion.Speed.centiMetresPerSecondToKiloMetersPerHour(value);
                case FtPerSec:
                    return UnitConversion.Speed.centiMetresPerSecondToFeetPerSecond(value);
                case MiPerHr:
                    return UnitConversion.Speed.centiMetresPerSecondToMilesPerHour(value);
                case Knot:
                    return UnitConversion.Speed.centiMetresPerSecondToKnots(value);
                case Mach:
                    return UnitConversion.Speed.centiMetresPerSecondToMach(value);
                default:
                    return 0.0;
            }
        }
        public double toMPerSec(){
            switch (this.fromUnit){
                case CmPerSec:
                    return UnitConversion.Speed.metresPerSecondToCentiMetresPerSecond(value);
                case MPerSec:
                    return (value);
                case KmPerHr:
                    return UnitConversion.Speed.metresPerSecondToKiloMetresPerHour(value);
                case FtPerSec:
                    return UnitConversion.Speed.metresPerSecondToFeetPerSecond(value);
                case MiPerHr:
                    return UnitConversion.Speed.metresPerSecondToMilesPerHour(value);
                case Knot:
                    return UnitConversion.Speed.metresPerSecondToKnots(value);
                case Mach:
                    return UnitConversion.Speed.metresPerSecondToMach(value);
                default:
                    return 0.0;
            }
        }
        public double toKmPerHr(){
            switch (this.fromUnit){
                case CmPerSec:
                    return UnitConversion.Speed.kiloMetresPerHourToCentiMetresPerSecond(value);
                case MPerSec:
                    return UnitConversion.Speed.kiloMetresPerHourToMetresPerSecond(value);
                case KmPerHr:
                    return (value);
                case FtPerSec:
                    return UnitConversion.Speed.kiloMetresPerHourToFeetPerSecond(value);
                case MiPerHr:
                    return UnitConversion.Speed.kiloMetresPerHourToMilesPerHour(value);
                case Knot:
                    return UnitConversion.Speed.kiloMetresPerHourToKnots(value);
                case Mach:
                    return UnitConversion.Speed.kiloMetresPerHourToMach(value);
                default:
                    return 0.0;
            }
        }
        public double toFtPerSec(){
            switch (this.fromUnit){
                case CmPerSec:
                    return UnitConversion.Speed.feetPerSecondToCentiMetresPerSecond(value);
                case MPerSec:
                    return UnitConversion.Speed.feetPerSecondToMetresPerSecond(value);
                case KmPerHr:
                    return UnitConversion.Speed.feetPerSecondToKiloMetresPerHour(value);
                case FtPerSec:
                    return (value);
                case MiPerHr:
                    return UnitConversion.Speed.feetPerSecondToMilesPerHour(value);
                case Knot:
                    return UnitConversion.Speed.feetPerSecondToKnots(value);
                case Mach:
                    return UnitConversion.Speed.feetPerSecondToMach(value);
                default:
                    return 0.0;
            }
        }
        public double toMiPerHr(){
            switch (this.fromUnit){
                case CmPerSec:
                    return UnitConversion.Speed.milesPerHourToCentiMetresPerSecond(value);
                case MPerSec:
                    return UnitConversion.Speed.milesPerHourToMetresPerSecond(value);
                case KmPerHr:
                    return UnitConversion.Speed.milesPerHourToKiloMetresPerHour(value);
                case FtPerSec:
                    return UnitConversion.Speed.milesPerHourToFeetPerSecond(value);
                case MiPerHr:
                    return (value);
                case Knot:
                    return UnitConversion.Speed.milesPerHourToKnots(value);
                case Mach:
                    return UnitConversion.Speed.milesPerHourToMach(value);
                default:
                    return 0.0;
            }
        }
        public double toKnot(){
            switch (this.fromUnit){
                case CmPerSec:
                    return UnitConversion.Speed.knotsToCentiMetresPerSecond(value);
                case MPerSec:
                    return UnitConversion.Speed.knotsToMetresPerSecond(value);
                case KmPerHr:
                    return UnitConversion.Speed.knotsToKiloMetresPerHour(value);
                case FtPerSec:
                    return UnitConversion.Speed.knotsToFeetPerSecond(value);
                case MiPerHr:
                    return UnitConversion.Speed.knotsToMilesPerHour(value);
                case Knot:
                    return (value);
                case Mach:
                    return UnitConversion.Speed.knotsToMach(value);
                default:
                    return 0.0;
            }
        }
        public double toMach(){
            switch (this.fromUnit){
                case CmPerSec:
                    return UnitConversion.Speed.machToCentiMetresPerSecond(value);
                case MPerSec:
                    return UnitConversion.Speed.machToMetresPerSecond(value);
                case KmPerHr:
                    return UnitConversion.Speed.machToKiloMetresPerHour(value);
                case FtPerSec:
                    return UnitConversion.Speed.machToFeetPerSecond(value);
                case MiPerHr:
                    return UnitConversion.Speed.machToMilesPerHour(value);
                case Knot:
                    return UnitConversion.Speed.machToKnots(value);
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

        public ForEnergy(String value, String fromUnit) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toEv(){
            switch (this.fromUnit){
                case EV:
                    return (value);
                case J:
                    return UnitConversion.Energy.electronVoltsToJoules(value);
                case KJ:
                    return UnitConversion.Energy.electronVoltsToKiloJoules(value);
                case CAL:
                    return UnitConversion.Energy.electronVoltsToThermalCalories(value);
                case FTPOUNDS:
                    return UnitConversion.Energy.electronVoltsToFootPounds(value);
                case FCAL:
                    return UnitConversion.Energy.electronVoltsToFoodCalories(value);
                default:
                    return 0.0;
            }
        }
        public double toJ(){
            switch (this.fromUnit){
                case EV:
                    return UnitConversion.Energy.joulesToElectronVolts(value);
                case J:
                    return (value);
                case KJ:
                    return UnitConversion.Energy.joulesToKiloJoules(value);
                case CAL:
                    return UnitConversion.Energy.joulesToThermalCalories(value);
                case FTPOUNDS:
                    return UnitConversion.Energy.joulesToFootPounds(value);
                case FCAL:
                    return UnitConversion.Energy.joulesToFoodCalories(value);
                default:
                    return 0.0;
            }
        }
        public double toKj(){
            switch (this.fromUnit){
                case EV:
                    return UnitConversion.Energy.kiloJoulesToElectronVolts(value);
                case J:
                    return UnitConversion.Energy.kiloJoulesToJoules(value);
                case KJ:
                    return (value);
                case CAL:
                    return UnitConversion.Energy.kiloJoulesToThermalCalories(value);
                case FTPOUNDS:
                    return UnitConversion.Energy.kiloJoulesToFootPounds(value);
                case FCAL:
                    return UnitConversion.Energy.kiloJoulesToFoodCalories(value);
                default:
                    return 0.0;
            }
        }
        public double toCal(){
            switch (this.fromUnit){
                case EV:
                    return UnitConversion.Energy.thermalCaloriesToElectronVolts(value);
                case J:
                    return UnitConversion.Energy.thermalCaloriesToJoules(value);
                case KJ:
                    return UnitConversion.Energy.thermalCaloriesToKiloJoules(value);
                case CAL:
                    return (value);
                case FTPOUNDS:
                    return UnitConversion.Energy.thermalCaloriesToFootPounds(value);
                case FCAL:
                    return UnitConversion.Energy.thermalCaloriesToFoodCalories(value);
                default:
                    return 0.0;
            }
        }
        public double toFCal(){
            switch (this.fromUnit){
                case EV:
                    return UnitConversion.Energy.foodCaloriesToElectronVolts(value);
                case J:
                    return UnitConversion.Energy.foodCaloriesToJoules(value);
                case KJ:
                    return UnitConversion.Energy.foodCaloriesToKiloJoules(value);
                case CAL:
                    return UnitConversion.Energy.foodCaloriesToThermalCalories(value);
                case FTPOUNDS:
                    return UnitConversion.Energy.foodCaloriesToFootPounds(value);
                case FCAL:
                    return (value);
                default:
                    return 0.0;
            }
        }
        public double toFootPounds(){
            switch (this.fromUnit){
                case EV:
                    return UnitConversion.Energy.footPoundsToElectronVolts(value);
                case J:
                    return UnitConversion.Energy.footPoundsToJoules(value);
                case KJ:
                    return UnitConversion.Energy.footPoundsToKiloJoules(value);
                case CAL:
                    return UnitConversion.Energy.footPoundsToThermalCalories(value);
                case FTPOUNDS:
                    return (value);
                case FCAL:
                    return UnitConversion.Energy.footPoundsToFoodCalories(value);
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

        public ForVolume(String value, String fromUnit) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toMilliLitres(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return (value);
                case LTRS:
                    return UnitConversion.Volume.millilitresToLitres(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.millilitresToCubicMetres(value);
                case TEASPOON:
                    return UnitConversion.Volume.millilitresToTeaSpoons(value);
                case FLDONC:
                    return UnitConversion.Volume.millilitresToFluidOunces(value);
                case PINTS:
                    return UnitConversion.Volume.millilitresToPints(value);
                case CUPS:
                    return UnitConversion.Volume.millilitresToCups(value);
                case QUARTS:
                    return UnitConversion.Volume.millilitresToQuarts(value);
                case GALL:
                    return UnitConversion.Volume.millilitresToGallons(value);
                case CUBICINCH:
                    return UnitConversion.Volume.millilitresToCubicInches(value);
                case CUBICFT:
                    return UnitConversion.Volume.millilitresToCubicFeet(value);
                case CUBICYARD:
                    return UnitConversion.Volume.millilitresToCubicYards(value);
                default:
                    return 0.0;
            }
        }
        public double toLitres(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.litresToMillilitres(value);
                case LTRS:
                    return (value);
                case CUBICMETRE:
                    return UnitConversion.Volume.litresToCubicMetres(value);
                case TEASPOON:
                    return UnitConversion.Volume.litresToTeaSpoons(value);
                case FLDONC:
                    return UnitConversion.Volume.litresToFluidOunces(value);
                case PINTS:
                    return UnitConversion.Volume.litresToPints(value);
                case CUPS:
                    return UnitConversion.Volume.litresToCups(value);
                case QUARTS:
                    return UnitConversion.Volume.litresToQuarts(value);
                case GALL:
                    return UnitConversion.Volume.litresToGallons(value);
                case CUBICINCH:
                    return UnitConversion.Volume.litresToCubicInches(value);
                case CUBICFT:
                    return UnitConversion.Volume.litresToCubicFeet(value);
                case CUBICYARD:
                    return UnitConversion.Volume.litresToCubicYards(value);
                default:
                    return 0.0;
            }
        }
        public double toCubicMetre(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.cubicMetreToMillilitres(value);
                case LTRS:
                    return UnitConversion.Volume.cubicMetreToLitres(value);
                case CUBICMETRE:
                    return (value);
                case TEASPOON:
                    return UnitConversion.Volume.cubicMetreToTeaSpoons(value);
                case FLDONC:
                    return UnitConversion.Volume.cubicMetreToFluidOunces(value);
                case PINTS:
                    return UnitConversion.Volume.cubicMetreToPints(value);
                case CUPS:
                    return UnitConversion.Volume.cubicMetreToCups(value);
                case QUARTS:
                    return UnitConversion.Volume.cubicMetreToQuarts(value);
                case GALL:
                    return UnitConversion.Volume.cubicMetreToGallons(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicMetreToCubicInches(value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicMetreToCubicFeet(value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicMetreToCubicYards(value);
                default:
                    return 0.0;
            }
        }
        public double toTeaSpoon(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.teaSpoonsToMillilitres(value);
                case LTRS:
                    return UnitConversion.Volume.teaSpoonsToLitres(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.teaSpoonsToCubicMetres(value);
                case TEASPOON:
                    return (value);
                case FLDONC:
                    return UnitConversion.Volume.teaSpoonsToFluidOunces(value);
                case PINTS:
                    return UnitConversion.Volume.teaSpoonsToPints(value);
                case CUPS:
                    return UnitConversion.Volume.teaSpoonsToCups(value);
                case QUARTS:
                    return UnitConversion.Volume.teaSpoonsToQuarts(value);
                case GALL:
                    return UnitConversion.Volume.teaSpoonsToGallons(value);
                case CUBICINCH:
                    return UnitConversion.Volume.teaSpoonsToCubicInches(value);
                case CUBICFT:
                    return UnitConversion.Volume.teaSpoonsToCubicFeet(value);
                case CUBICYARD:
                    return UnitConversion.Volume.teaSpoonsToCubicYards(value);
                default:
                    return 0.0;
            }
        }
        public double toFluidOunce(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.fluidOuncesToMillilitres(value);
                case LTRS:
                    return UnitConversion.Volume.fluidOuncesToLitres(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.fluidOuncesToCubicMetres(value);
                case TEASPOON:
                    return UnitConversion.Volume.fluidOuncesToTeaSpoons(value);
                case FLDONC:
                    return (value);
                case PINTS:
                    return UnitConversion.Volume.fluidOuncesToPints(value);
                case CUPS:
                    return UnitConversion.Volume.fluidOuncesToCups(value);
                case QUARTS:
                    return UnitConversion.Volume.fluidOuncesToQuarts(value);
                case GALL:
                    return UnitConversion.Volume.fluidOuncesToGallons(value);
                case CUBICINCH:
                    return UnitConversion.Volume.fluidOuncesToCubicInches(value);
                case CUBICFT:
                    return UnitConversion.Volume.fluidOuncesToCubicFeet(value);
                case CUBICYARD:
                    return UnitConversion.Volume.fluidOuncesToCubicYards(value);
                default:
                    return 0.0;
            }
        }
        public double toPints(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.pintsToMillilitres(value);
                case LTRS:
                    return UnitConversion.Volume.pintsToLitres(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.pintsToCubicMetres(value);
                case TEASPOON:
                    return UnitConversion.Volume.pintsToTeaSpoons(value);
                case FLDONC:
                    return UnitConversion.Volume.pintsToFluidOunces(value);
                case PINTS:
                    return (value);
                case CUPS:
                    return UnitConversion.Volume.pintsToCups(value);
                case QUARTS:
                    return UnitConversion.Volume.pintsToQuarts(value);
                case GALL:
                    return UnitConversion.Volume.pintsToGallons(value);
                case CUBICINCH:
                    return UnitConversion.Volume.pintsToCubicInches(value);
                case CUBICFT:
                    return UnitConversion.Volume.pintsToCubicFeet(value);
                case CUBICYARD:
                    return UnitConversion.Volume.pintsToCubicYards(value);
                default:
                    return 0.0;
            }
        }
        public double toCups(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.cupsToMillilitres(value);
                case LTRS:
                    return UnitConversion.Volume.cupsToLitres(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cupsToCubicMetres(value);
                case TEASPOON:
                    return UnitConversion.Volume.cupsToTeaSpoons(value);
                case FLDONC:
                    return UnitConversion.Volume.cupsToFluidOunces(value);
                case PINTS:
                    return UnitConversion.Volume.cupsToPints(value);
                case CUPS:
                    return (value);
                case QUARTS:
                    return UnitConversion.Volume.cupsToQuarts(value);
                case GALL:
                    return UnitConversion.Volume.cupsToGallons(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cupsToCubicInches(value);
                case CUBICFT:
                    return UnitConversion.Volume.cupsToCubicFeet(value);
                case CUBICYARD:
                    return UnitConversion.Volume.cupsToCubicYards(value);
                default:
                    return 0.0;
            }
        }
        public double toQuarts(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.quartsToMillilitres(value);
                case LTRS:
                    return UnitConversion.Volume.quartsToLitres(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.quartsToCubicMetres(value);
                case TEASPOON:
                    return UnitConversion.Volume.quartsToTeaSpoons(value);
                case FLDONC:
                    return UnitConversion.Volume.quartsToFluidOunces(value);
                case PINTS:
                    return UnitConversion.Volume.quartsToPints(value);
                case CUPS:
                    return UnitConversion.Volume.quartsToCups(value);
                case QUARTS:
                    return (value);
                case GALL:
                    return UnitConversion.Volume.quartsToGallons(value);
                case CUBICINCH:
                    return UnitConversion.Volume.quartsToCubicInches(value);
                case CUBICFT:
                    return UnitConversion.Volume.quartsToCubicFeet(value);
                case CUBICYARD:
                    return UnitConversion.Volume.quartsToCubicYards(value);
                default:
                    return 0.0;
            }
        }
        public double toGall(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.gallonsToMillilitres(value);
                case LTRS:
                    return UnitConversion.Volume.gallonsToLitres(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.gallonsToCubicMetres(value);
                case TEASPOON:
                    return UnitConversion.Volume.gallonsToTeaSpoons(value);
                case FLDONC:
                    return UnitConversion.Volume.gallonsToFluidOunces(value);
                case PINTS:
                    return UnitConversion.Volume.gallonsToPints(value);
                case CUPS:
                    return UnitConversion.Volume.gallonsToCups(value);
                case QUARTS:
                    return UnitConversion.Volume.gallonsToQuarts(value);
                case GALL:
                    return (value);
                case CUBICINCH:
                    return UnitConversion.Volume.gallonsToCubicInches(value);
                case CUBICFT:
                    return UnitConversion.Volume.gallonsToCubicFeet(value);
                case CUBICYARD:
                    return UnitConversion.Volume.gallonsToCubicYards(value);
                default:
                    return 0.0;
            }
        }
        public double toCubicInch(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.cubicInchesToMillilitres(value);
                case LTRS:
                    return UnitConversion.Volume.cubicInchesToLitres(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicInchesToCubicMetres(value);
                case TEASPOON:
                    return UnitConversion.Volume.cubicInchesToTeaSpoons(value);
                case FLDONC:
                    return UnitConversion.Volume.cubicInchesToFluidOunces(value);
                case PINTS:
                    return UnitConversion.Volume.cubicInchesToPints(value);
                case CUPS:
                    return UnitConversion.Volume.cubicInchesToCups(value);
                case QUARTS:
                    return UnitConversion.Volume.cubicInchesToQuarts(value);
                case GALL:
                    return UnitConversion.Volume.cubicInchesToGallons(value);
                case CUBICINCH:
                    return (value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicInchesToCubicFeet(value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicInchesToCubicYards(value);
                default:
                    return 0.0;
        }


    }
        public double toCubicFt(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.cubicFeetToMillilitres(value);
                case LTRS:
                    return UnitConversion.Volume.cubicFeetToLitres(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicFeetToCubicMetres(value);
                case TEASPOON:
                    return UnitConversion.Volume.cubicFeetToTeaSpoons(value);
                case FLDONC:
                    return UnitConversion.Volume.cubicFeetToFluidOunces(value);
                case PINTS:
                    return UnitConversion.Volume.cubicFeetToPints(value);
                case CUPS:
                    return UnitConversion.Volume.cubicFeetToCups(value);
                case QUARTS:
                    return UnitConversion.Volume.cubicFeetToQuarts(value);
                case GALL:
                    return UnitConversion.Volume.cubicFeetToGallons(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicFeetToCubicInches(value);
                case CUBICFT:
                    return (value);
                case CUBICYARD:
                    return UnitConversion.Volume.cubicFeetToCubicYards(value);
                default:
                    return 0.0;
            }
        }
        public double toCubicYard(){
            switch (this.fromUnit){
                case MILLILITRS:
                    return UnitConversion.Volume.cubicYardsToMillilitres(value);
                case LTRS:
                    return UnitConversion.Volume.cubicYardsToLitres(value);
                case CUBICMETRE:
                    return UnitConversion.Volume.cubicYardsToCubicMetres(value);
                case TEASPOON:
                    return UnitConversion.Volume.cubicYardsToTeaSpoons(value);
                case FLDONC:
                    return UnitConversion.Volume.cubicYardsToFluidOunces(value);
                case PINTS:
                    return UnitConversion.Volume.cubicYardsToPints(value);
                case CUPS:
                    return UnitConversion.Volume.cubicYardsToCups(value);
                case QUARTS:
                    return UnitConversion.Volume.cubicYardsToQuarts(value);
                case GALL:
                    return UnitConversion.Volume.cubicYardsToGallons(value);
                case CUBICINCH:
                    return UnitConversion.Volume.cubicYardsToCubicInches(value);
                case CUBICFT:
                    return UnitConversion.Volume.cubicYardsToCubicFeet(value);
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

        public ForDigitalStorage(String value, String fromUnit) {
            this.value = conversionsInputValidator(value);
            this.fromUnit = fromUnit;
        }

        public double toBit(){
            switch (this.fromUnit){
                case Bit:
                    return value;
                case Bytes:
                    return UnitConversion.digitalStorage.bitsToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.bitsToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.bitsToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.bitsToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.bitsToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.bitsToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.bitsToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.bitsToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.bitsToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.bitsToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.bitsToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.bitsToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.bitsToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.bitsToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.bitsToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.bitsToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.bitsToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.bitsToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toBytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.bytesToBits(value);
                case Bytes:
                    return (value);
                case Nibble:
                    return UnitConversion.digitalStorage.bytesToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.bytesToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.bytesToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.bytesToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.bytesToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.bytesToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.bytesToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.bytesToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.bytesToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.bytesToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.bytesToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.bytesToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.bytesToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.bytesToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.bytesToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.bytesToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.bytesToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toNibble(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.nibblesToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.nibblesToBytes(value);
                case Nibble:
                    return (value);
                case Kbi:
                    return UnitConversion.digitalStorage.nibblesToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.nibblesToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.nibblesToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.nibblesToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.nibblesToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.nibblesToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.nibblesToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.nibblesToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.nibblesToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.nibblesToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.nibblesToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.nibblesToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.nibblesToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.nibblesToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.nibblesToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.nibblesToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toKilobits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.kiloBitsToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.kiloBitsToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.kiloBitsToNibbles(value);
                case Kbi:
                    return (value);
                case Kby:
                    return UnitConversion.digitalStorage.kiloBitsToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.kiloBitsToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.kiloBitsToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.kiloBitsToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.kiloBitsToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.kiloBitsToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.kiloBitsToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.kiloBitsToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.kiloBitsToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.kiloBitsToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.kiloBitsToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.kiloBitsToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.kiloBitsToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.kiloBitsToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.kiloBitsToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toKilobytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.kiloBytesToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.kiloBytesToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.kiloBytesToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.kiloBytesToKiloBits(value);
                case Kby:
                    return (value);
                case Mbi:
                    return UnitConversion.digitalStorage.kiloBytesToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.kiloBytesToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.kiloBytesToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.kiloBytesToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.kiloBytesToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.kiloBytesToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.kiloBytesToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.kiloBytesToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.kiloBytesToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.kiloBytesToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.kiloBytesToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.kiloBytesToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.kiloBytesToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.kiloBytesToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toMegabits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.megaBitsToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.megaBitsToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.megaBitsToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.megaBitsToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.megaBitsToKiloBytes(value);
                case Mbi:
                    return (value);
                case Mby:
                    return UnitConversion.digitalStorage.megaBitsToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.megaBitsToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.megaBitsToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.megaBitsToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.megaBitsToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.megaBitsToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.megaBitsToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.megaBitsToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.megaBitsToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.megaBitsToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.megaBitsToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.megaBitsToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.megaBitsToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toMegabytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.megaBytesToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.megaBytesToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.megaBytesToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.megaBytesToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.megaBytesToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.megaBytesToMegaBits(value);
                case Mby:
                    return (value);
                case Gbi:
                    return UnitConversion.digitalStorage.megaBytesToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.megaBytesToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.megaBytesToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.megaBytesToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.megaBytesToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.megaBytesToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.megaBytesToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.megaBytesToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.megaBytesToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.megaBytesToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.megaBytesToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.megaBytesToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toGigabits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.gigaBitsToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.gigaBitsToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.gigaBitsToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.gigaBitsToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.gigaBitsToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.gigaBitsToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.gigaBitsToMegaBytes(value);
                case Gbi:
                    return (value);
                case Gby:
                    return UnitConversion.digitalStorage.gigaBitsToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.gigaBitsToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.gigaBitsToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.gigaBitsToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.gigaBitsToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.gigaBitsToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.gigaBitsToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.gigaBitsToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.gigaBitsToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.gigaBitsToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.gigaBitsToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toGigabytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.gigaBytesToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.gigaBytesToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.gigaBytesToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.gigaBytesToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.gigaBytesToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.gigaBytesToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.gigaBytesToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.gigaBytesToGigaBits(value);
                case Gby:
                    return (value);
                case Tbi:
                    return UnitConversion.digitalStorage.gigaBytesToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.gigaBytesToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.gigaBytesToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.gigaBytesToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.gigaBytesToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.gigaBytesToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.gigaBytesToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.gigaBytesToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.gigaBytesToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.gigaBytesToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toTerabits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.teraBitsToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.teraBitsToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.teraBitsToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.teraBitsToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.teraBitsToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.teraBitsToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.teraBitsToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.teraBitsToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.teraBitsToGigaBytes(value);
                case Tbi:
                    return (value);
                case Tby:
                    return UnitConversion.digitalStorage.teraBitsToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.teraBitsToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.teraBitsToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.teraBitsToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.teraBitsToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.teraBitsToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.teraBitsToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.teraBitsToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.teraBitsToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toTerabytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.teraBytesToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.teraBytesToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.teraBytesToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.teraBytesToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.teraBytesToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.teraBytesToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.teraBytesToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.teraBytesToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.teraBytesToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.teraBytesToTeraBits(value);
                case Tby:
                    return (value);
                case Pbi:
                    return UnitConversion.digitalStorage.teraBytesToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.teraBytesToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.teraBytesToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.teraBytesToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.teraBytesToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.teraBytesToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.teraBytesToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.teraBytesToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toPetabits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.petaBitsToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.petaBitsToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.petaBitsToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.petaBitsToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.petaBitsToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.petaBitsToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.petaBitsToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.petaBitsToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.petaBitsToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.petaBitsToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.petaBitsToTeraBytes(value);
                case Pbi:
                    return (value);
                case Pby:
                    return UnitConversion.digitalStorage.petaBitsToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.petaBitsToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.petaBitsToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.petaBitsToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.petaBitsToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.petaBitsToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.petaBitsToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toPetabytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.petaBytesToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.petaBytesToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.petaBytesToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.petaBytesToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.petaBytesToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.petaBytesToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.petaBytesToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.petaBytesToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.petaBytesToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.petaBytesToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.petaBytesToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.petaBytesToPetaBits(value);
                case Pby:
                    return (value);
                case Ebi:
                    return UnitConversion.digitalStorage.petaBytesToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.petaBytesToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.petaBytesToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.petaBytesToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.petaBytesToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.petaBytesToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toExabits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.exaBitsToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.exaBitsToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.exaBitsToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.exaBitsToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.exaBitsToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.exaBitsToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.exaBitsToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.exaBitsToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.exaBitsToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.exaBitsToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.exaBitsToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.exaBitsToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.exaBitsToPetaBytes(value);
                case Ebi:
                    return (value);
                case Eby:
                    return UnitConversion.digitalStorage.exaBitsToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.exaBitsToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.exaBitsToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.exaBitsToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.exaBitsToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toExaBytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.exaBytesToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.exaBytesToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.exaBytesToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.exaBytesToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.exaBytesToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.exaBytesToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.exaBytesToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.exaBytesToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.exaBytesToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.exaBytesToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.exaBytesToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.exaBytesToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.exaBytesToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.exaBytesToExaBits(value);
                case Eby:
                    return (value);
                case Zbi:
                    return UnitConversion.digitalStorage.exaBytesToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.exaBytesToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.exaBytesToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.exaBytesToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toZettaBits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.zettaBitsToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.zettaBitsToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.zettaBitsToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.zettaBitsToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.zettaBitsToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.zettaBitsToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.zettaBitsToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.zettaBitsToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.zettaBitsToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.zettaBitsToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.zettaBitsToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.zettaBitsToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.zettaBitsToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.zettaBitsToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.zettaBitsToExaBytes(value);
                case Zbi:
                    return (value);
                case Zby:
                    return UnitConversion.digitalStorage.zettaBitsToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.zettaBitsToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.zettaBitsToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toZettaBytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.zettaBytesToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.zettaBytesToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.zettaBytesToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.zettaBytesToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.zettaBytesToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.zettaBytesToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.zettaBytesToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.zettaBytesToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.zettaBytesToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.zettaBytesToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.zettaBytesToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.zettaBytesToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.zettaBytesToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.zettaBytesToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.zettaBytesToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.zettaBytesToZettaBits(value);
                case Zby:
                    return (value);
                case Ybi:
                    return UnitConversion.digitalStorage.zettaBytesToYottaBits(value);
                case Yby:
                    return UnitConversion.digitalStorage.zettaBytesToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toYottaBits(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.yottaBitsToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.yottaBitsToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.yottaBitsToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.yottaBitsToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.yottaBitsToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.yottaBitsToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.yottaBitsToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.yottaBitsToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.yottaBitsToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.yottaBitsToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.yottaBitsToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.yottaBitsToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.yottaBitsToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.yottaBitsToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.yottaBitsToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.yottaBitsToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.yottaBitsToZettaBytes(value);
                case Ybi:
                    return (value);
                case Yby:
                    return UnitConversion.digitalStorage.yottaBitsToYottaBytes(value);
                default:
                    return 0.0;
            }
        }
        public double toYottaBytes(){
            switch (this.fromUnit){
                case Bit:
                    return UnitConversion.digitalStorage.yottaBytesToBits(value);
                case Bytes:
                    return UnitConversion.digitalStorage.yottaBytesToBytes(value);
                case Nibble:
                    return UnitConversion.digitalStorage.yottaBytesToNibbles(value);
                case Kbi:
                    return UnitConversion.digitalStorage.yottaBytesToKiloBits(value);
                case Kby:
                    return UnitConversion.digitalStorage.yottaBytesToKiloBytes(value);
                case Mbi:
                    return UnitConversion.digitalStorage.yottaBytesToMegaBits(value);
                case Mby:
                    return UnitConversion.digitalStorage.yottaBytesToMegaBytes(value);
                case Gbi:
                    return UnitConversion.digitalStorage.yottaBytesToGigaBits(value);
                case Gby:
                    return UnitConversion.digitalStorage.yottaBytesToGigaBytes(value);
                case Tbi:
                    return UnitConversion.digitalStorage.yottaBytesToTeraBits(value);
                case Tby:
                    return UnitConversion.digitalStorage.yottaBytesToTeraBytes(value);
                case Pbi:
                    return UnitConversion.digitalStorage.yottaBytesToPetaBits(value);
                case Pby:
                    return UnitConversion.digitalStorage.yottaBytesToPetaBytes(value);
                case Ebi:
                    return UnitConversion.digitalStorage.yottaBytesToExaBits(value);
                case Eby:
                    return UnitConversion.digitalStorage.yottaBytesToExaBytes(value);
                case Zbi:
                    return UnitConversion.digitalStorage.yottaBytesToZettaBits(value);
                case Zby:
                    return UnitConversion.digitalStorage.yottaBytesToZettaBytes(value);
                case Ybi:
                    return UnitConversion.digitalStorage.yottaBytesToYottaBits(value);
                case Yby:
                    return (value);
                default:
                    return 0.0;
            }
        }
    }
}
