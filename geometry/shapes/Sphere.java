package praktic.geometry.shapes;

import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

// Kelas Sphere ini representasi bola 3D, warisin CircularShape dan implement interface 3D & Weightable
public class Sphere extends CircularShape implements ThreeDimensional, Weightable {
    private double mass; // Massa dari bola

    // Constructor tanpa parameter, buat jaga-jaga kalau mau bikin objek kosong
    public Sphere() {
    }

    // Constructor dengan parameter radius dan massa
    public Sphere(double radius, double mass) {
        setRadius(radius);      // Set jari-jari dari parent class CircularShape
        this.mass = mass;       // Set massa bola
        setName("Sphere");      // Set nama biar nanti bisa dipanggil
    }

    // Menghitung luas permukaan bola
    @Override
    public double getSurfaceArea() {
        // Rumus luas permukaan bola: 4 * PI * r^2
        return (4 * PI_NUMERATOR * getRadius() * getRadius()) / PI_DENOMINATOR;
    }

    // Menghitung volume bola
    @Override
    public double getVolume() {
        // Rumus volume bola: (4/3) * PI * r^3
        return (4 * PI_NUMERATOR * getRadius() * getRadius() * getRadius()) / (3 * PI_DENOMINATOR);
    }

    // Menghitung berat bola
    @Override
    public double getWeight() {
        // Berat = massa * volume * gravitasi
        return mass * getVolume() * g;
    }

    // Menampilkan info lengkap tentang bola
    @Override
    public void printInfo() {
        System.out.println("Name               : " + getName());
        System.out.println("Surface area       : " + getSurfaceArea());
        System.out.println("Volume             : " + getVolume());
        System.out.println("Weight             : " + getWeight());
    }
}