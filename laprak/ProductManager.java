package laprak;

import java.util.*;

public class ProductManager {
    private final List<Product<?>> products;          // List untuk menyimpan produk
    private final Set<String> categories;             // Set untuk menyimpan kategori produk
    private final Queue<Product<?>> processedQueue;   // Queue untuk menyimpan produk yang sudah diproses
    private final Map<Integer, List<Product<?>>> userWishlist = new HashMap<>(); // Map untuk menyimpan wishlist produk berdasarkan user ID

    public ProductManager() {
        // Inisialisasi list produk, set kategori, dan queue produk yang sudah diproses
        products = new ArrayList<>();           // List untuk menyimpan produk
        categories = new HashSet<>();           // Set untuk menyimpan kategori produk
        processedQueue = new LinkedList<>();    // Queue untuk menyimpan produk yang sudah diproses
    }

    // Menambahkan produk ke dalam list produk
    public void addProduct(Product<?> product) {
        // Menambahkan produk ke dalam list produk
        products.add(product);
        // Menambahkan kategori produk ke dalam set kategori
        categories.add(product.getCategory().toString());
    }

    // Menghapus produk berdasarkan ID
    public boolean removeProductById(int id) {
        return products.removeIf(product -> product.getId() == id);
    }

    // Mencari produk berdasarkan nama
    public List<Product<?>> searchProductByName(String name) {
        List<Product<?>> result = new ArrayList<>();            // List untuk menyimpan hasil pencarian
        for (Product<?> product : products) {                   // Iterasi setiap produk dalam list
            if (product.getName().equalsIgnoreCase(name)) {     // Jika nama produk sama dengan input
                result.add(product);                            // Menambhakan produk ke dalam hasil pencarian
            }
        }
        return result;  // Mengembalikan hasil pencarian
    }

    // Mencari produk berdasarkan kategori
    public List<Product<?>> searchProductByCategory(String category) {
        List<Product<?>> result = new ArrayList<>();            // List untuk menyimpan hasil pencarian
        for (Product<?> product : products) {                   // Iterasi setiap produk dalam list
            if (product.getCategory().toString().equalsIgnoreCase(category)) {  // Jika kategori produk sama dengan input
                result.add(product);    // Menambahkan produk ke dalam hasil pencarian
            }
        }
        return result;  // Mengembalikan hasil pencarian
    }

    // Mencari produk berdasarkan ID
    public Product<?> getProductById(int id) {
        for (Product<?> product : products) {   // Iterasi setiap produk dalam list
            if (product.getId() == id) {        // Jika ID produk sama dengan input
                return product;                 // Mengembalikan produk
            }
        }
        return null; // Jika produk tidak ditemukan
    }

    // Menampilkan seluruh produk dan mengurutkannya berdasarkan kategori
    public void displayAllProductsSortedByCategory() {
        products.sort(new Comparator<Product<?>>() {    // Mengurutkan produk berdasarkan kategori
            @Override
            public int compare(Product<?> p1, Product<?> p2) {  // Method untuk membandingkan dua produk
                return p1.getCategory().toString().compareTo(p2.getCategory().toString());  // Mengembalikan hasil perbandingan kategori produk
            }
        });

        for (Product<?> product : products) {   // Iterasi setiap produk dalam list
            System.out.println(product);        // Menampilkan informasi produk
        }
    }

    // Menampilkan seluruh kategori unik
    public void displayAllUniqueCategories() {
        System.out.println("Unique Categories:");   // Menampilkan header kategori unik
        for (String category : categories) {        // Iterasi setiap kategori dalam set
            System.out.println(category);           // Menampilkan kategori
        }
    }

    // Menambahkan produk ke antrian produk yang telah diproses
    public void addToProcessedQueue(Product<?> product) {
        processedQueue.add(product);
    }

    // Menampilkan antrian produk yang telah diproses
    public void displayProcessedQueue() {
        System.out.println("Processed Products:");
        for (Product<?> product : processedQueue) { // Iterasi setiap produk dalam queue
            System.out.println(product);            // Menampilkan informasi produk
        }
    }

    // Menambahkan produk ke wishlist berdasarkan user ID
    public void addToWishlist(int userId, Product<?> product) {
        userWishlist.computeIfAbsent(userId, k -> new ArrayList<>()).add(product);
        System.out.println("Product added to wishlist for user ID: " + userId);
    }

    // Menampilkan wishlist produk berdasarkan user ID
    public void displayWishlist(int userId) {
        List<Product<?>> wishlist = userWishlist.get(userId);   // Mendapatkan wishlist berdasarkan user ID
        if (wishlist == null || wishlist.isEmpty()) {           // Jika wishlist kosong
            System.out.println("Wishlist for user ID " + userId + " is empty.");    // Menampilkan pesan bahwa wishlist kosong
            return; // Keluar dari method
        }
        System.out.println("Wishlist for user ID " + userId + ":"); // Menampilkan header wishlist
        for (Product<?> product : wishlist) {   // Iterasi setiap produk dalam wishlist
            System.out.print(product);        // Menampilkan informasi produk
        }
    }
}