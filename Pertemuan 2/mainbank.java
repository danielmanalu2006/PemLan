public class mainbank {
    public static void main(String[] args) {

        BankAccount akun1 = new BankAccount("6378291", "Daniel Smite Manalu", 2500000);
        BankAccount akun2 = new BankAccount("7364528", "Jonathan Sitinjak");

        System.out.println("============================================");
        akun1.displayInfo(); // menampilkan informasi akun 1
        akun1.deposit(500000); // menambahkan uang ke akun 1
        akun1.withdraw(200000); // mengambil uang dari akun 1
        akun1.deposit(-1); // menambahkan uang ke akun 1 dengan jumlah <= 0 (nominal <= 0)
        akun1.withdraw(-1); // mengambil uang dari akun 1 dengan jumlah <= 0 (nominal <= 0)
        akun1.withdraw(5000000); // mengambil uang dari akun 1 dengan jumlah besar (nominal uang yang diambil > saldo)

        System.out.println("--------------------------------------------");

        akun2.displayInfo(); // menampilkan informasi akun 2
        akun2.deposit(300000); // menambahkan uang ke akun 2
        akun2.withdraw(100000); // mengambil uang dari akun 2
        akun2.deposit(-1); // menambahkan uang ke akun 2 dengan jumlah <= 0 (nominal <= 0)
        akun2.withdraw(-1); // mengambil uang dari akun 2 dengan jumlah <= 0 (nominal <= 0)
        akun2.withdraw(5000000); // mengambil uang dari akun 2 dengan jumlah besar (nominal uang yang diambil > saldo)
        System.out.println("============================================");
    }
}
