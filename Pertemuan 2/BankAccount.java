public class BankAccount {
    
    // tiga field
    String noRek; // Nomor rekening
    String namaPemilik; // Nama pemilik rekening
    double saldo; // Saldo rekening

    // constructor dengan 3 parameter (noRek, namaPemilik, saldo)
    public BankAccount(String noRek, String namaPemilik, double saldo) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // constructor dengan 2 parameter (noRek, namaPemilik)
    public BankAccount(String noRek, String namaPemilik) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = 0; // tanpa saldo, di beri nilai default 0.0
    }

    // method untuk menampilkan informasi rekening
    public void displayInfo() {
        System.out.println("No. Rekening    : " + noRek);
        System.out.println("Nama Pemilik    : " + namaPemilik);
        System.out.println("Saldo           : Rp" + saldo);
    }

    // method untuk menambahkan uang ke dalam rekening
    public void deposit(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal deposit harus lebih dari 0!");
        } else {
            saldo += nominal;
            System.out.println("Uang sebesar Rp" + nominal + " berhasil dideposit.");
        }
    }

    // method untuk mengambil uang dari rekening
    public void withdraw(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal penarikan harus lebih dari 0!");
        } else if (nominal > saldo) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo -= nominal;
            System.out.println("Uang sebesar Rp" + nominal + " berhasil ditarik.");
        }
    }
}
