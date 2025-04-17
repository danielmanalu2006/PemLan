package praktic.geometry.interfaces;

// Interface ini buat kelas yang merepresentasikan bentuk 3D
// Jadi kelas yang implement interface ini harus punya method untuk menghitung luas permukaan dan volume
public interface ThreeDimensional {
    // Method buat ngambil luas permukaan bentuk 3D
    // Diimplementasi di kelas turunan kayak Cube, Sphere, dll
    double getSurfaceArea();

    // Method buat ngambil volume bentuk 3D
    // Diimplementasi di kelas turunan kayak Cube, Sphere, dll
    double getVolume();
}