# Program Verifikasi Marga Batak Toba
Program Java untuk memverifikasi keaslian marga Batak Toba dengan penanganan error yang intuitif.

## Tujuan
System.out.println("""
    1. Melestarikan daftar marga Batak Toba secara digital
    2. Demo praktik exception handling di Java
    3. Validasi input dengan kriteria:
       - Format penulisan benar
       - Termasuk dalam 12 marga utama""");

### DAFTAR MARGA YANG VALID
private static final String[] MARGA_BATAK = {
    "Manalu", "Sitorus", "Sinaga", "Tambunan", 
    "Lumban Tobing", "Pasaribu", "Gultom",
    "Sitinjak", "Sirait", "Sihombing",
    "Sipahutar", "Situmorang"
};

#### SISTEM PENGECUALIAN
Exception Type	          Trigger Condition	            Contoh Input
IllegalArgumentException	Input tidak kapital/kosong	  "manalu"
IllegalArgumentException	Marga tidak terdaftar	        "Manalu"

##### FITUR UNGGULAN
+ Looping input hingga data valid
+ Pesan error spesifik
+ Case-sensitive verification

###### Contoh Output
Masukkan marga anda: manalu
ERROR: Marga harus diawali huruf kapital!
Silakan coba lagi!

Masukkan marga anda: Malau 
ERROR: Marga Malau tidak terdaftar!
Contoh marga valid: Manalu, Sitorus...

Masukkan marga anda: Manalu
Marga valid! 'Horas, amang/inang Manalu!'
