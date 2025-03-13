import java.util.*;
public class Road {

    private ArrayList<Station> stations;
    private ArrayList<Person> persons;
    private ArrayList<Car> cars;
    private ArrayList<Person> completed;

    public Road(int p, int c){
        cars=new ArrayList<Car>();
        for (int i = 0; i<c; i++){
            int rand = (int)(Math.random() * 32 + 1);
            int dest = (int)(Math.random()*2+1);
            int desti;
            if(dest==1){
                desti=1;
            } else{ 
                desti = 32;
            }
            cars.add(new Car(desti, rand));
        }
        persons=new ArrayList<Person>();
        for (int i = 0; i<p;i++){
            int rand = (int)(Math.random() * 32 + 1);
            int rand2 = (int)(Math.random() * 32 + 1);
            persons.add(new Person(rand,rand2));
        }
        stations = new ArrayList<Station>();
        for (int i =1; i<33;i++){
            stations.add(new Station(i));
        }
        completed = new ArrayList<Person>();

    }
    public void pickupPassengers(){
        for (int i = 0; i< cars.size();i++){
            if(cars.get(i).hasRoom()){
                for(int j = 0; j<persons.size();j++){
                    if(persons.get(j).getStartLocation()==cars.get(i).getLocation()){
                        if(persons.get(j).getDirection()==cars.get(i).getDirection()){
                            if(cars.get(i).hasRoom()){
                                cars.get(i).addPassenger(persons.remove(j));
                            }
                        }
                    }
                }
            }
        }
    }
    public void moveCars(){
        Person unloaded;
        int a;
        for (int i = 0; i< cars.size();i++){
            a = cars.get(i).numPassengers();
            for(int j = 0; j<a;j++){
            unloaded = cars.get(i).unload();
            if(unloaded != null){
                completed.add(unloaded);
            }
        }
            cars.get(i).move();
        }
    }
    public int getCompleted(){
        return completed.size();
    }
    public int getWaiting(){
        return persons.size();
    }
    public String toString(){
        String s = "Cars: \n";
        for (Car c: cars){
            s+=c.toString();
            s+="\n";
        }
        s+= " Waiting people: \n";
        for(Person p:persons){
            s+=p.toString();
            s+="\n";
        }
        if(completed.size()>0){
        s+="Completed people: \n";
        for(int i = 0; i<completed.size();i++){
            s+=completed.get(i).toString();
            s+="\n";
        }
    }
        return s;
    }


    
}
