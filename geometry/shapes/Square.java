package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.TwoDimensional;

// Class Square mewakili bangun datar persegi
// Dia extends Shape (abstract class) dan implements TwoDimensional (interface buat bangun datar)
public class Square extends Shape implements TwoDimensional {
    private double side; // panjang sisi persegi

    // Constructor tanpa parameter (default)
    public Square() {}

    // Constructor dengan parameter sisi
    public Square(double side) {
        this.side = side;      // set nilai sisi dari input
        setName("Square");     // set nama bangunnya biar bisa dipanggil nanti
    }

    // Menghitung luas persegi: sisi * sisi
    @Override
    public double getArea() {
        return side * side;
    }

    // Menghitung keliling persegi: 4 * sisi
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Menampilkan semua info tentang persegi
    @Override
    public void printInfo() {
        System.out.println("Name               : " + getName());
        System.out.println("Area               : " + getArea());
        System.out.println("Perimeter          : " + getPerimeter());
    }
}