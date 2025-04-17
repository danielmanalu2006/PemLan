package praktic.geometry.shapes;

import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.TwoDimensional;

public class Circle extends CircularShape implements TwoDimensional {

    // Constructor tanpa parameter
    public Circle() {}

    // Constructor dengan parameter radius
    public Circle(double radius) {
        setRadius(radius);  // Set nilai radius yang diberikan
        setName("Circle");  // Set nama objek menjadi "Circle"
    }

    // Implementasi metode untuk menghitung area lingkaran
    @Override
    public double getArea() {
        // Rumus area lingkaran: PI * r^2, tapi menggunakan konstanta PI_NUMERATOR/PI_DENOMINATOR untuk representasi PI
        return (PI_NUMERATOR * getRadius() * getRadius()) / PI_DENOMINATOR;
    }

    // Implementasi metode untuk menghitung keliling lingkaran
    @Override
    public double getPerimeter() {
        // Rumus keliling lingkaran: 2 * PI * r
        return (2 * PI_NUMERATOR * getRadius()) / PI_DENOMINATOR;
    }

    // Implementasi metode untuk mencetak informasi tentang lingkaran
    @Override
    public void printInfo() {
        System.out.println("Name               : " + getName());  // Menampilkan nama bentuk (Circle)
        System.out.println("Area               : " + getArea());  // Menampilkan area lingkaran
        System.out.println("Perimeter          : " + getPerimeter());  // Menampilkan keliling lingkaran
    }
}