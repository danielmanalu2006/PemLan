package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

public class Cube extends Shape implements ThreeDimensional, Weightable {
    private double edge;  // panjang sisi kubus
    private double mass;  // massa kubus

    // Constructor tanpa parameter
    public Cube() {}

    // Constructor dengan parameter untuk sisi dan massa kubus
    public Cube(double edge, double mass) {
        this.edge = edge;  // menginisialisasi sisi kubus
        this.mass = mass;  // menginisialisasi massa kubus
        setName("Cube");  // memberi nama objek "Cube"
    }

    // Menghitung luas permukaan kubus
    @Override
    public double getSurfaceArea() {
        // Rumus luas permukaan kubus: 6 * sisi^2
        return 6 * edge * edge;
    }

    // Menghitung volume kubus
    @Override
    public double getVolume() {
        // Rumus volume kubus: sisi^3
        return edge * edge * edge;
    }

    // Menghitung berat kubus
    @Override
    public double getWeight() {
        // Rumus berat kubus: massa * volume * gravitasi
        return mass * getVolume() * g;
    }

    // Menampilkan informasi tentang kubus
    @Override
    public void printInfo() {
        System.out.println("Name               : " + getName());  // Menampilkan nama objek "Cube"
        System.out.println("Surface area       : " + getSurfaceArea());  // Menampilkan luas permukaan kubus
        System.out.println("Volume             : " + getVolume());  // Menampilkan volume kubus
        System.out.println("Weight             : " + getWeight());  // Menampilkan berat kubus
    }
}