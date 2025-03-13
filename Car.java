
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
        }else if(p.getDirection() != direction){
            System.out.println("ERROR: Trying to add person in wrong direction!");
        }else{
            passengers.add(p);
        }
    }
    public void move(){
        if(currentLocation == destination){
            return; //kick out early before trying to move
        }

        if(direction){
            currentLocation++;
        } else{
            currentLocation--;
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
    public int numPassengers(){
        return passengers.size();
    }
    // Method for handing back a person that is eligible to be dropped off, also removes the person from the car
    // @return one person eligible to be dropped off, null if nobody is available
    public Person unload(){
        for (int i = 0; i<passengers.size(); i++){
            Person a = passengers.get(i);
            if(a.getDestination()==currentLocation){
                return passengers.remove(i);
            }
        }
        return null;
        
    }

    public String toString(){
        return super.toString() + " Destination: " + destination + " Current location: " + currentLocation + " Going right? " + direction + " Passengers: " + passengers;
    }

    
}
