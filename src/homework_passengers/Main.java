package homework_passengers;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {

       Map<Integer,List<Passenger>> flightpassengers = new TreeMap<Integer,List<Passenger>>();

        for(int i=0;i<5;i++) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите Номер Рейса");
    Integer flightNumber = scanner.nextInt();
    System.out.println("Введите ФИО пассажира");
    String passname = scanner.next();
    System.out.println("Введите Номер паспорта ");
    String passport = scanner.next();
    Passenger passenger = new Passenger(passname, passport);
       // Passenger passenger = new Passenger();
        List<Passenger> passengers = new ArrayList<Passenger>();
        if(flightpassengers.containsKey(flightNumber))
             passengers=flightpassengers.get(flightNumber);
        passengers.add(passenger);

        flightpassengers.put(flightNumber,passengers);
        }

        for (Map.Entry e : flightpassengers.entrySet()) {
            System.out.println("Номер рейса " + e.getKey() + " пассажиры:");
            for (Passenger p : (ArrayList<Passenger>)e.getValue()) {
                System.out.println("  " + p.getName() + " " + p.getPassport());
            }
            System.out.println("Общее количество пассажиров: " + ((ArrayList<Passenger>) e.getValue()).size() + "\n");
        }

    }
}

