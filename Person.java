
public class Person{
    //fields
    private int destination;
    private boolean direction; //true for going right, false for left
    private int startLocation;

    //constructors
    public Person(int myDestination, int myStartLocation){
        destination = myDestination;
        startLocation=myStartLocation;
        direction = (destination>startLocation);
        
    }

    //methods

    public int getDestination(){
        return destination;
    }
    public boolean getDirection(){
        return direction;
    }
    public int startLocation(){
        return startLocation;
    }

    public String toString(){
        return super.toString() + "Start: " +startLocation +" Destination: " + destination + " Going right? " +direction;
    }



}