// deklarasi class batak
public class batak {
    // 3 field
    String goar;
    String marga;
    String pusukbuhit;

    // constructor (untuk menginisialisasi objek saat dibuat)
    public batak(String goar, String marga, String pusukbuhit) {
        this.goar = goar;
        this.marga = marga;
        this.pusukbuhit = pusukbuhit;
    }

    // method untuk menampilkan atribut objek (informasi ttg org batak)
    public void Info() {
        System.out.println("Nama        : " + goar);
        System.out.println("Marga       : " + marga);
        System.out.println("Asal Daerah : " + pusukbuhit);
        System.out.println("---------------------------------------");
    }

    // method bebas (contohnya: menampilkan salam khas batak)
    public void Horas() {
        System.out.println("Horas! Nama saya " + goar + " marga " + marga + ". Senang bertemu dengan kalian semuaaa.");
    }
}
