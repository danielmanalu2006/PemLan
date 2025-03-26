package practic.inheritance.transportation;

public class Taxi extends Vehicle{ // Tarif per km perjalanan
    private static final int FARE_PER_KM = 5000;

    // Constructor yang memanggil constructor dari Vehicle
    public Taxi(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    // Method untuk menghitung tarif taxi berdasarkan jarak tempuhnya
    public void calculateFare(int distance) {
        int totalFare = distance * FARE_PER_KM;
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Total jarak rute: " + distance + " km");
        System.out.println("Tarif per km: " + FARE_PER_KM);
        System.out.println("Total tarif perjalanan taksi: Rp " + totalFare);
    }
}