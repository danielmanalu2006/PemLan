package praktic.geometry.mains; // Package untuk kelas utama

import praktic.geometry.shapes.Circle;
import praktic.geometry.shapes.Rectangle;
import java.util.Scanner;

public class Main {
    static String warnaTulisan = "\u001B[94m"; // Warna hijau ANSI untuk teks output
    
    static void printGaris() { // Method untuk mencetak garis pemisah
        System.out.println("===============================================");
    }
    
    public static void main(String[] args) {
        Scanner daniel = new Scanner(System.in);
        
        printGaris();
        System.out.print("Nama    : ");
        String nama = daniel.nextLine(); // Input nama pengguna
        System.out.print("NIM     : ");
        String nim = daniel.nextLine(); // Input NIM pengguna
        printGaris();
        
        // Input untuk Circle
        System.out.println("Circle");
        printGaris();
        System.out.print("Isikan ID       : ");
        int cirleId = daniel.nextInt(); // Input ID lingkaran
        System.out.print("Isikan Radius   : ");
        double radius = daniel.nextDouble();
        
        Circle circle = new Circle();
        circle.setId(cirleId);
        circle.setRadius(radius);
        circle.printDeskripsi(); // Mencetak informasi lingkaran
        
        // Input untuk Rectangle
        System.out.println("Rectangle");
        printGaris();
        System.out.print("Isikan ID       : ");
        int rectangleId = daniel.nextInt(); // Input ID persegi panjang
        System.out.print("Isikan Panjang  : ");
        double panjang = daniel.nextDouble(); // Input panjang
        System.out.print("Isikan Lebar    : ");
        double lebar = daniel.nextDouble(); // Input lebar
        
        Rectangle rectangle = new Rectangle(rectangleId, panjang, lebar);
        rectangle.printDeskripsi(); // Mencetak informasi persegi panjang
    }
}
