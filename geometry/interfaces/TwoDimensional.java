package praktic.geometry.interfaces;

// Interface ini buat kelas yang merepresentasikan bentuk 2D
// Jadi kelas yang implement interface ini harus punya method untuk menghitung luas dan keliling
public interface TwoDimensional {
    // Method buat ngambil luas bentuk 2D
    double getArea();

    // Method buat ngambil keliling bentuk 2D
    double getPerimeter();
}