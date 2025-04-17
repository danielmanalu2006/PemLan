package praktic.geometry.interfaces;

// Interface ini buat kelas yang punya berat
// Kelas yang implement interface ini harus punya method untuk ngitung beratnya
public interface Weightable {
    // Konstanta untuk gravitasi
    double g = 9.8;

    // Method buat ngambil berat bentuk 3D
    double getWeight();
}