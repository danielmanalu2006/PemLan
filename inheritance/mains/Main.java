package practic.inheritance.mains;

import practic.inheritance.transportation.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek bus dan menjalankan simulasi perjalanan
        Bus bus = new Bus("Bus TransJakarta", 50, "Terminal A - Terminal B");

        // Membuat objek kereta dan menjalankan simulasi perjalanan
        Train kereta = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat");

        // Membuat objek taksi dan menjalankan simulasi perjalanan
        Taxi taksi = new Taxi("Taxi BlueBird", 4, "Bandara - Hotel");

        // Simulasi perjalanan bus
        bus.startJourney(); // bus mulai berjalan
        bus.boardPassengers(30);   // 30 penumpang naik
        bus.boardPassengers(20);   // tambah penumpang
        bus.calculateFare(5);   // total pemberhentian
        bus.stopJourney(); // bus sampai di tujuan
//        bus.dropPassengers(50);    // semua penumpang turun

        // pindah ke transportasi lain
        System.out.println("=====================================================================");

        kereta.startJourney(); // Kereta melakukan perjalanan
        kereta.boardPassengers(150);  // 150 penumpang naik
//        kereta.boardPassengers(300);    // tambah penumpang
        kereta.calculateFare();   // Hitung tarif
        kereta.stopJourney(); // Kereta sampai di tujuan
//        kereta.dropPassengers(150);   // semua penumpang turun

        // pindah ke transportasi lain
        System.out.println("=====================================================================");

        taksi.startJourney(); // Taksi mulai berjalan
        taksi.boardPassengers(3); // 3 penumpang naik
//        taksi.boardPassengers(10);  // tambah penumpang
        taksi.calculateFare(10); // Perjalanan sejauh 10 km
        taksi.stopJourney(); // Taksi sampai di tujuan
//        taksi.dropPassengers(0); // semua penumpang turun
    }
}