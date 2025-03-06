public class main { // class utama untuk menjalankan program
    public static void main(String[] args) {
        // membuat objek pertama dengan goar, marga, dan pusukbuhit
        batak parjolo = new batak("Daniel", "Manalu", "Labuhanbatu");

        // membuat objek kedua dengan format yang sama seperti objek pertama
        batak paduahon = new batak("Jonathan", "Sitinjak", "Tarutung");

        // memanggil method untuk menampilkan info objek pertama
        parjolo.Info();
        parjolo.Horas();

        System.out.println(); // membuat baris baru untuk memisahkan output

        // memanggil output untuk menampilkan info objek kedua
        paduahon.Info();
        paduahon.Horas();
    }
}