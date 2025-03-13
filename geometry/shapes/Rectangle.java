package praktic.geometry.shapes;

import org.w3c.dom.ls.LSOutput;

public class Rectangle {
    private int id;
    private double panjang;
    private double lebar;

    public Rectangle(int id, double panjang, double lebar) {
        this.id = id;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter ID
    public int getId() {
        return id;
    }

    // Getter panjang
    public double getPanjang() {
        return panjang;
    }

    // Getter lebar
    public double getLebar() {
        return lebar;
    }

    // Menghitung keliling persegi panjang
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    public double getLuas() {
        return panjang * lebar;
    }

    // Mencetak informasi persegi panjang
    public void printDeskripsi() {
        System.out.println("===============================================");
        System.out.println("ID              : " + id);
        System.out.println("Panjang         : " + panjang);
        System.out.println("Keliling        : " + getKeliling());
        System.out.println("Luas            : " + getLuas());
        System.out.println("===============================================");
    }
}
