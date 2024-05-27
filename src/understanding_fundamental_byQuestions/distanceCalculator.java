package understanding_fundamental_byQuestions;

//Assume a suitable value for distance between two cities (in km.). Write a java program
//to convert and print this distance in meters, feet, inches and centimeters.


public class distanceCalculator {
    public static void main(String[] args){
        System.out.println("distanceCalculator");

        //Assuming a suitable value of distance between two cities (in km.) is. -
        double distbtwncities = 1436.5;

        //java program to convert and print this distance in meters, feet, inches and centimeters.
        double intoMeters = distbtwncities * 1000;
        double intoFeet = distbtwncities * 3280.84;
        double intoInches = distbtwncities * 39370.1;
        double intoCentimeters = distbtwncities * 100000;

        //print statment. -
        System.out.println("Distance between Delhi to Mumbai in kilometers = " + distbtwncities + "km");
        System.out.println("Distance between Delhi to Mumbai in meters = " + intoMeters + "mtr");
        System.out.println("Distance between Delhi to Mumbai in feet = " + intoFeet + "ft");
        System.out.println("Distance between Delhi to Mumbai in inches = " + intoInches + "in");
        System.out.println("Distance between Delhi to Mumbai in centimeters = " + intoCentimeters + "cm");
    }
}