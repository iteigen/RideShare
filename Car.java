
import java.util.*;

public class Car {
    //fields
    private int destination;
    private int currentLocation;
    private boolean direction;
    private ArrayList<Person> passengers;
    
    public Car(int myDestination, int start){
        destination = myDestination;
        currentLocation=start;
        direction = destination>currentLocation;
        passengers = new ArrayList<Person>();
    }

    public void addPassenger(Person p){
        if(passengers.size()>=3){
            System.out.println("ERROR: No room!");
        }else{
            passengers.add(p);
        }
    }
    public boolean hasRoom(){
        return passengers.size()<3;
    }
    public int getDestination(){
        return destination;
    }
    public boolean getDirection(){
        return direction;
    }
    public int getLocation(){
        return currentLocation;
    }

    public String toString(){
        return super.toString() + " Destination: " + destination + " Current location: " + currentLocation + " Going right? " + direction + " Passengers: " + passengers;
    }
    
}
