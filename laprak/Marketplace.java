package laprak;

import java.util.Scanner;

public class Marketplace {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager(); // Inisialisasi ProductManager
        Scanner niel = new Scanner(System.in); // Scanner untuk input user
        int choice; // Variabel untuk menyimpan pilihan menu

        System.out.println("==========================================="); // Garis pemisah
        System.out.println("Welcome to the Marketplace!"); // Menampilkan pesan selamat datang
        System.out.println("DANIEL'S MARKETPLACE"); // Menampilkan nama marketplace
        System.out.println("245150701111018");  // Menampilkan NIM
        System.out.println("==========================================="); // Garis pemisah

        do {
            // Menampilkan menu utama
            System.out.println("==========================================="); // Garis pemisah
            System.out.println("Marketplace Menu:");                // Menampilkan judul menu
            System.out.println("1. Add Product");                   // Pilihan 1: Menambahkan produk
            System.out.println("2. Remove Product");                // Pilihan 2: Menghapus produk
            System.out.println("3. Display Products");              // Pilihan 3: Menampilkan semua produk
            System.out.println("4. Display Unique Categories");     // Pilihan 4: Menampilkan kategori unik produk
            System.out.println("5. Process Product");               // Pilihan 5: Memproses produk
            System.out.println("6. Display Processed Products");    // Pilihan 6: Menampilkan produk yang telah diproses
            System.out.println("7. Add to Wishlist");               // Pilihan 7: Menambahkan produk ke wishlist
            System.out.println("8. View Wishlist");                 // Pilihan 8: Melihat produk di wishlist
            System.out.println("0. Exit");                          // Pilihan 0: Keluar dari program
            System.out.println("==========================================="); // Garis pemisah
            System.out.print("Enter your choice: ");                // Meminta input pilihan dari user
            choice = niel.nextInt();                                // Membaca pilihan dari user
            niel.nextLine();                                        // Menghapus newline yang tersisa setelah input angka

            switch (choice) { // Mulai switch-case untuk menangani pilihan menu
                case 1:
                    // Menambahkan produk baru
                    System.out.print("Enter Product ID: ");         // Meminta ID produk
                    int id = niel.nextInt();                        // Membaca ID produk
                    niel.nextLine();                                // Menghapus newline yang tersisa setelah input angka
                    System.out.print("Enter Product Name: ");       // Meminta nama produk
                    String name = niel.nextLine();                  // Membaca nama produk
                    System.out.print("Enter Product Category: ");   // Meminta kategori produk
                    String category = niel.nextLine();              // Membaca kategori produk
                    System.out.print("Enter Product Price: ");      // Meminta harga produk
                    double price = niel.nextDouble();               // Membaca harga produk
                    productManager.addProduct(new Product<>(id, name, category, price));    // Menambahkan produk baru ke dalam list produk
                    break;  // Keluar dari case 1

                case 2:
                    // Menghapus produk berdasarkan ID
                    System.out.print("Enter Product ID to remove: ");   // Meminta ID produk yang akan dihapus
                    int removeId = niel.nextInt();                      // Membaca ID produk yang akan dihapus
                    productManager.removeProductById(removeId);         // Menghapus produk dari list berdasarkan ID
                    break;  // Keluar dari case 2

                case 3:
                    // Menampilkan semua produk
                    productManager.displayAllProductsSortedByCategory();    // Menampilkan semua produk yang telah diurutkan berdasarkan kategori
                    break;  // Keluar dari case 3

                case 4:
                    // Menampilkan kategori unik produk
                    productManager.displayAllUniqueCategories();    // Menampilkan semua kategori unik produk
                    break;  // Keluar dari case 4

                case 5:
                    // Memproses produk berdasarkan ID
                    System.out.print("Enter Product ID to process: ");  // Meminta ID produk yang akan diproses
                    int processId = niel.nextInt(); // Membaca ID produk yang akan diproses
                    Product<?> productToProcess = productManager.getProductById(processId); // Mencari produk berdasarkan ID
                    if (productToProcess != null) { // Jika produk ditemukan
                        productManager.addToProcessedQueue(productToProcess);   // Menambahkan produk ke antrian produk yang telah diproses
                    } else {    // Jika produk tidak ditemukan
                        System.out.println("Product with ID " + processId + " not found."); // Menampilkan pesan bahwa produk tidak ditemukan
                    }
                    break;  // Keluar dari case 5

                case 6:
                    // Menampilkan produk yang telah diproses
                    productManager.displayProcessedQueue(); // Menampilkan produk yang telah diproses
                    break;  // Keluar dari case 6

                case 7:
                    // Menambahkan produk ke wishlist
                    System.out.print("Enter User ID: ");    // Meminta ID user
                    int userId = niel.nextInt();            // Membaca ID user
                    System.out.print("Enter Product ID to add to wishlist: ");  // Meminta ID produk yang akan ditambahkan ke wishlist
                    int wishlistProductId = niel.nextInt();                     // Membaca ID produk yang akan ditambahkan ke wishlist
                    Product<?> wishlistProduct = productManager.getProductById(wishlistProductId);  // Mencari produk berdasarkan ID
                    if (wishlistProduct != null) {  // Jika produk ditemukan
                        productManager.addToWishlist(userId, wishlistProduct);  // Menambahkan produk ke wishlist berdasarkan ID user
                    } else {    // Jika produk tidak ditemukan
                        System.out.println("Product with ID " + wishlistProductId + " not found."); // Menampilkan pesan bahwa produk tidak ditemukan
                    }
                    break;  // Keluar dari case 7

                case 8:
                    // Melihat produk di wishlist
                    System.out.print("Enter User ID to view wishlist: ");   // Meminta ID user untuk melihat wishlist
                    int viewUserId = niel.nextInt();                        // Membaca ID user
                    productManager.displayWishlist(viewUserId);             // Menampilkan produk di wishlist berdasarkan ID user
                    break;  // Keluar dari case 8

                case 0:
                    // Keluar dari program
                    System.out.println("Exiting...");   // Menampilkan pesan keluar
                    break;  // Keluar dari case 0

                default:
                    // Pilihan tidak valid
                    System.out.println("Invalid choice. Please try again.");    // Menampilkan pesan bahwa pilihan tidak valid
            }
        } while (choice != 0);  // Mengulangi menu hingga user memilih untuk keluar (0)

        niel.close();   // Menutup scanner
    }
}