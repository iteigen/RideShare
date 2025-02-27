import java.util.*;

public class Station {

    private ArrayList<Person> waitingLeft;
    private ArrayList<Person> waitingRight;
    private ArrayList<Person> completed;
    private int number;

    public Station(int myNumber){
        waitingLeft= new ArrayList<Person>();
        waitingRight= new ArrayList<Person>();
        completed = new ArrayList<Person>();
        number = myNumber;
    }
    
}
