package practic.inheritance.transportation;

public class Bus extends Vehicle { // Tarif per pemberhentian
    private static final int FARE_PER_STOP = 2000;

    // Constructor di subclass ini memanggil constructor dari Vehicle pakai super()
    public Bus(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    public void calculateFare(int stops) {
        int totalFare = FARE_PER_STOP * stops * getCurrentPassengers();
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Total pemberhentian: " + stops);
        System.out.println("Total per halte: Rp " + FARE_PER_STOP);
        System.out.println("Total tafif perjalanan bus: Rp " + totalFare);
    }
}