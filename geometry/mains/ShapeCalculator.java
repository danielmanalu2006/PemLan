package praktic.geometry.mains;

import praktic.geometry.shapes.*;
import praktic.geometry.interfaces.*;
import java.util.Scanner;

/*
DANIEL SMITE MANALU - 245150701111018

______  ___   _   _ _____ _____ _
|  _  \/ _ \ | \ | |_   _|  ___| |
| | | / /_\ \|  \| | | | | |__ | |
| | | |  _  || . ` | | | |  __|| |
| |/ /| | | || |\  |_| |_| |___| |____
|___/ \_| |_/\_| \_/\___/\____/\_____/

*/

// Ini untuk definisi warna yang dipakai untuk pewarnaan
public class ShapeCalculator {
    static final String RED = "\u001B[31m"; // warna merah
    static final String GREEN = "\u001B[32m"; // warna hijau
    static final String BLUE = "\u001B[34m"; // warna biru
    static final String YELLOW = "\u001B[33m"; // warna kuning
    static final String PURPLE = "\u001B[35m"; // warna ungu
    static final String RESET = "\u001B[0m"; // reset warna supaya kembali normal

    public static void main(String[] args) {
        Scanner niel = new Scanner(System.in); // scanner untuk input dari user

        // ==================== HEADER ====================
        // menampilkan header dengan warna yang sudah ditentukan
        System.out.println(RED + "===========================================" + RESET);
        System.out.println(GREEN + "Shape Calculator" + RESET);
        System.out.println(BLUE + "DANIEL SMITE MANALU" + RESET);
        System.out.println(BLUE + "245150701111018" + RESET);
        System.out.println(RED + "===========================================" + RESET);

        // ==================== 2D CIRCLE ====================
        // menampilkan informasi untuk input data circle (lingkaran)
        System.out.println(YELLOW + "2D Circle" + RESET);
        System.out.println(RED + "===========================================" + RESET);
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter radius");
        double radius = niel.nextDouble(); // input untuk jari-jari
        System.out.println(RED + "===========================================" + RESET);

        Circle circle = new Circle(radius); // membuat objek lingkaran
        circle.printInfo(); // menampilkan informasi lingkaran
        System.out.println(RED + "===========================================" + RESET);

        // ==================== 2D SQUARE ====================
        // menampilkan informasi untuk input data square (persegi)
        System.out.println(YELLOW + "2D Square" + RESET);
        System.out.println(RED + "===========================================" + RESET);
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter side");
        double side = niel.nextDouble(); // input untuk sisi persegi
        System.out.println(RED + "===========================================" + RESET);

        Square square = new Square(side); // membuat objek persegi
        square.printInfo(); // menampilkan informasi persegi
        System.out.println(RED + "===========================================" + RESET);

        // ==================== 3D CUBE ====================
        // menampilkan informasi untuk input data cube (kubus)
        System.out.println(YELLOW + "3D Weightable Cube" + RESET);
        System.out.println(RED + "===========================================" + RESET);
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter edge");
        double edge = niel.nextDouble(); // input untuk panjang sisi kubus
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter mass");
        double cubeMass = niel.nextDouble(); // input untuk massa kubus
        System.out.println(RED + "===========================================" + RESET);

        Cube cube = new Cube(edge, cubeMass); // membuat objek kubus
        cube.printInfo(); // menampilkan informasi kubus
        System.out.println(RED + "===========================================" + RESET);

        // ==================== 3D SPHERE ====================
        // menampilkan informasi untuk input data sphere (bola)
        System.out.println(YELLOW + "3D Weightable Sphere" + RESET);
        System.out.println(RED + "===========================================" + RESET);
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter radius");
        double sphereRadius = niel.nextDouble(); // input untuk jari-jari bola
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter mass");
        double sphereMass = niel.nextDouble(); // input untuk massa bola
        System.out.println(RED + "===========================================" + RESET);

        Sphere sphere = new Sphere(sphereRadius, sphereMass); // membuat objek bola
        sphere.printInfo(); // menampilkan informasi bola
        System.out.println(RED + "===========================================" + RESET);

        // ==================== POLYMORPHISM SECTION ====================
        // menampilkan informasi volume dari kubus dan bola, menggunakan konsep polymorphism
        System.out.println(YELLOW + "Volume of Cube and Sphere" + RESET);
        System.out.println(PURPLE + "POLYMORPHISM: INTERFACE" + RESET);
        System.out.println(RED + "===========================================" + RESET);
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter edge");
        double polyEdge = niel.nextDouble(); // input untuk edge kubus
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter radius");
        double polyRadius = niel.nextDouble(); // input untuk radius bola
        System.out.printf(YELLOW + "%-18s" + RESET + " : ", "Enter mass");
        double polyMass = niel.nextDouble(); // input untuk massa
        System.out.println(RED + "===========================================" + RESET);

        // polymorphism: menjadi objek cube dan sphere dengan interface 3D
        ThreeDimensional polyCube = new Cube(polyEdge, polyMass);
        ThreeDimensional polySphere = new Sphere(polyRadius, polyMass);

        // menampilkan volume dan berat objek cube dan sphere
        System.out.println("Cube's volume      : " + polyCube.getVolume());
        System.out.println("Sphere's volume    : " + polySphere.getVolume());
        System.out.println("Weight             : " + ((Weightable) polyCube).getWeight());
        System.out.println(RED + "===========================================" + RESET);
    }
}