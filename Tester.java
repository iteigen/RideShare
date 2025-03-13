
public class Tester {
    public static void main(String[] args) {
        Person a = new Person(5,7);
        Person b = new Person(2,0);
        Person c = new Person(10,24);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Car n = new Car(5,9);
        System.out.println(n);
        n.addPassenger(a);
        System.out.println(n);

        System.out.println(n.unload());

        Road r = new Road(50,20);
        double reachdestination = 0;
        double notreach= 0;
        for (int i =0; i<100; i++){
        //System.out.println(r.toString());
        for(int j = 0; j<32; j++){
            r.pickupPassengers();
            r.moveCars();
        } reachdestination += r.getCompleted();
        notreach += r.getWaiting();
        r = new Road(50,20);
        }
        //Testing with 40 cars
        Road m = new Road(50,40);
        double reachdestination2 = 0;
        double notreach2= 0;
        for (int i =0; i<100; i++){
        //System.out.println(m.toString());
        for(int j = 0; j<32; j++){
            m.pickupPassengers();
            m.moveCars();
        } reachdestination2 += m.getCompleted();
        notreach2 += m.getWaiting();
        m = new Road(50,40);
    }

        System.out.println("Average number of people that reached their destination with 50 passengers and 20 cars, 100 runs: " + reachdestination/100);
        System.out.println("Average number of people that didn't reach their destination with 50 passengers and 20 cars, 100 runs: " + notreach/100);

        System.out.println("Average number of people that reached their destination with 50 passengers and 40 cars, 100 runs: " + reachdestination2/100);
        System.out.println("Average number of people that didn't reach their destination with 50 passengers and 40 cars, 100 runs: " + notreach2/100);
        //System.out.println(r.toString());
        //System.out.println("Total number of passengers that got to their destination: "+ r.getCompleted());
        //System.out.println("Total number of passengers that didn't get to their destination: " + r.getWaiting());
    }
    
}

    

