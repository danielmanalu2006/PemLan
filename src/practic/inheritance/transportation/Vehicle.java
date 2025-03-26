package practic.inheritance.transportation;

public class Vehicle {
    // Atribut private, jadi cuma bisa di akses di dalam kelas ini
    private String name;            // nama kendaraan
    private int capacity;           // kapasitas maksimal penumpang
    private String route;           // jalur perjalanan
    private int currentPassengers;  // jumlah penumpang saat ini

    // Constructor untuk inisialisai kendaraan
    public Vehicle(String name, int capacity, String route) {
        this.name = name;
        this.capacity = capacity;
        this.route = route;
        this.currentPassengers = 0; // Awalnya tidak ada penumpang
    }

    // Method untuk menambah penumpang kendaraan
    public void boardPassengers(int count) {
        if (currentPassengers + count <= capacity) {
            currentPassengers += count;
            System.out.println(count + " penumpang naik ke dalam " + name);
        } else {
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " + count + " penumpang");
        }
    }

    // Method untuk menurunkan penumpang
    public void dropPassengers(int count) {
        if (currentPassengers >= count) {
            currentPassengers -= count;
            System.out.println(count + " penumpang turun dari " + name);
        } else {
            System.out.println("Tidak ada cukup penumpang untuk turun");
        }
    }

    // Method untuk memulai perjalanan
    public void startJourney() {
        System.out.println(name + " memulai perjalanan di " + route);
    }

    // Method untuk tujuan akhir perjalanan
    public void stopJourney() {
        System.out.println(name + " mencapai tujuan akhir dan berhenti");
        dropPassengers(currentPassengers);
    }

    // Getter untuk mengambil jumlah penumpang saat ini
    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void calculateFare() { // akan di implementasikan di subclass
    }
}