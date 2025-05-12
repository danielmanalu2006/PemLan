package laprak;

public class Product<T extends Comparable<T>> implements Comparable<Product<T>> {   // kelas generik yang menyimpan data produk
    private int id;         // id produk
    private String name;    // nama produk
    private T category;     // kategori produk (tipe generik)
    private double price;   // harga produk

    public Product(int id, String nama, T kategori, double harga) { // constructor untuk inisialisasi produk dengan ID, nama, kategori, dan harga
        this.id = id;               // inisialisasi id produk
        this.name = nama;           // inisialisasi nama produk
        this.category = kategori;   // inisialisasi kategori produk
        this.price = harga;         // inisialisasi harga produk
    }

    public int getId() {    // getter untuk id produk
        return id; // mengembalikan id produk
    }

    public String getName() {   // getter untuk nama produk
        return name; // mengembalikan nama produk
    }

    public T getCategory() {    // getter untuk kategori produk
        return category; // mengembalikan kategori produk
    }

    public double getPrice() {  // getter untuk harga produk
        return price; // mengembalikan harga produk
    }

    public int CompareTo(Product<T> lainnya) {  // method untuk membandingkan produk
        return this.category.compareTo(lainnya.category);   // mengembalikan hasil perbandingan
    }

    @Override
    public String toString() {  // method untuk mengubah objek menjadi string
        return String.format("""
        ID Product       : %d
        Product's Name   : %s
        Category         : %s
        Price            : %.0f
        """,
        id, name, category, price); // menampilkan informasi produk dalam format yang terstruktur
    }

    @Override
    public int compareTo(Product<T> o) {    // method untuk membandingkan produk
        return 0;   // mengembalikan 0 jika produk sama
    }
}