package lastmeet;

import java.util.Scanner;
import java.util.Arrays;

public class MargaBatak {

    // Daftar marga Batak Toba yang valid (12 marga disimpan dalam array)
    private static final String[] MARGA_BATAK = {
            "Manalu", "Sitorus", "Sinaga", "Tambunan", "Lumban Tobing",
            "Pasaribu", "Gultom", "Sitinjak", "Sirait", "Sihombing",
            "Sipahutar", "Situmorang"
    };

    /**
     * Method untuk memverifikasi apakah marga yang diinput termasuk ke dalam daftar marga Batak Toba.
     * Jika tidak ditemukan, akan melempar IllegalArgumentException.
     */

    public static void verifikasiMarga(String marga) throws IllegalArgumentException {
        // Mengubah array menjadi List, lalu memeriksa apakah marga ada di dalamnya
        if (!Arrays.asList(MARGA_BATAK).contains(marga)) {
            throw new IllegalArgumentException(
                    "Marga " + marga + " tidak termasuk ke dalam 12 daftar marga Batak Toba yang disini ya hasian ku!\n" +
                            "Contoh marga Batak Toba yang valid: Manalu, Sitorus, Sinaga, Tambunan."
            );
        }
    }

    public static void main(String[] args) {
        Scanner niel = new Scanner(System.in); // Scanner untuk membaca input dari user
        boolean inputValid = false; // Flag untuk menandai apakah input user sudah valid atau belum

        // Menampilkan informasi awal program
        System.out.println("===============================================================");
        System.out.println("HORAS!!! Selamat datang di program verifikasi marga Batak Toba!");
        System.out.println("VERIFIKASI MARGA BATAK TOBA");
        System.out.println("Daniel Smite Manalu");
        System.out.println("245150701111018");
        System.out.println("===============================================================");

        // Perulangan untuk meminta input sampai pengguna memasukkan marga yang valid
        while (!inputValid) {
            try {
                // Meminta pengguna memasukkan marga
                System.out.print("Masukkan marga anda: ");
                String inputMarga = niel.nextLine().trim(); // Menghilangkan spasi di awal/akhir input

                // Memverifikasi bahwa input tidak kosong dan dimulai dengan huruf kapital
                if (inputMarga.isEmpty() || !Character.isUpperCase(inputMarga.charAt(0))) {
                    throw new IllegalArgumentException("Marga harus diawali dengan huruf kapital dan tidak kosong!");
                }

                // Memanggil method verifikasi untuk memeriksa apakah marga valid
                verifikasiMarga(inputMarga);

                // Jika tidak terjadi exception, berarti input valid
                inputValid = true;
                System.out.println("Marga valid! 'Horas, amang/inang " + inputMarga + "!'");

            } catch (IllegalArgumentException a) {
                // Menangkap dan menampilkan pesan kesalahan jika marga tidak valid
                System.err.println("ERROR: " + a.getMessage());
                System.out.println("Silakan coba lagi!\n");
            }
        }

        niel.close(); // Menutup scanner setelah tidak digunakan
        System.out.println("\nMauliateee sudah memakai program ini, HORASSS!");
    }
}