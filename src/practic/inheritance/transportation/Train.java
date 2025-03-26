package practic.inheritance.transportation;

public class Train extends Vehicle{ // Tarif tetap per penumpang
    private static final int FIXED_FARE = 10000;

    // Constructor yang memanggil constructor dari Vehicle
    public Train(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    // Method untuk menghitung tarif kereta
    public void calculateFare() {
        int totalFare = FIXED_FARE * getCurrentPassengers();
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Tarif tetap per penumpang: Rp " + FIXED_FARE);
        System.out.println("Total tarif perjalanan kereta: Rp " + totalFare);
    }
}