//Yunhao LI
//lab02
//Sept 4, 2015
//CSE 002
//Cyclometer Program

//  define a class
public class Cyclometer {
    //main method required for every Java program
    public static void main (String [] args){
        int secsTrip1 = 480; //number of secs for trip 1
        int secsTrip2 = 3220; //number of secs for trip 2
        int countsTrip1 = 1561; //number of counts for trip 1
        int countsTrip2 = 9037; //number of counts for trip 2
        
        double wheelDiameter = 27.0; //diameter of wheel
        double PI = 3.14159; //numerical value of pi
        double feetPerMile = 5280; //convert mile into feet
        double inchesPerFoot = 12; //convert foot into inches
        double secondsPerMinute = 60; //convert minute into secs
        double distanceTrip1, distanceTrip2, totalDistance; //assign these variables with double
        
        //print out time and counts for both trip1 and trip2
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute) +" minutes and had "+
            countsTrip1 +" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute) +" minutes and had "+
            countsTrip2 +" counts.");
        
        //calculate distances with wheel diameter and pi and convert distance to miles
        //add two trip distances together for total distance
        distanceTrip1 = countsTrip1 * wheelDiameter * PI / inchesPerFoot / feetPerMile;
        distanceTrip2 = countsTrip2 * wheelDiameter * PI / inchesPerFoot / feetPerMile;
        totalDistance = distanceTrip1 + distanceTrip2;
        
        //print out the output data of distances of trip 1 and trip 2
        //print out the total distance of trip 1 and trip 2 combined
        System.out.println("Trip 1 was "+ distanceTrip1+" miles");
        System.out.println("Trip 2 was "+ distanceTrip2+" miles");
        System.out.println("The total distance was "+ totalDistance+" miles");
        
    }   //end of main method
}   //end of class