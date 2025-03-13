package praktic.geometry.shapes; // Package untuk mengorganisir kelas bntuk geometri

public class Circle {
    private int id;
    private double radius;
    private final int pembilang = 22;
    private final int penyebut = 7;

    // Conctructor tanpa parameter
    public Circle() {}

    // Setter untuk ID
    public void setId(int id) {
        this.id = id;
    }

    // Setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter untuk menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * (pembilang / (double) penyebut) * radius;
    }

    // Getter untuk menghitung luas lingkaran
    public double getLuas() {
        return (pembilang / (double) penyebut) * radius * radius;
    }

    // untuk mencetak informasi lingkaran
    public void printDeskripsi() {
        System.out.println("===============================================");
        System.out.println("ID              : " + id);
        System.out.println("Radius          : " + radius);
        System.out.println("Keliling        : " + getKeliling());
        System.out.println("Luas            : " + getLuas());
        System.out.println("===============================================");
    }
}
