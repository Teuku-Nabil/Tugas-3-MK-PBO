/**
 * Link: https://drive.google.com/drive/folders/1XAbJHcO7rRs70zW7aKa86EwXMFXgRGqk?usp=sharing
 */

public class TestTabungan {

    public static void main(String[] args) 
    {
        System.out.println("===== (Pengecekan Class Tabungan) =====");
        Tabungan test = new Tabungan("Nabil", 2080017033);
        test.setSaldo(500_000);
        test.setSaldoMinimum(500_000);
        test.setSetoranMinimum(500_000);
        System.out.println("Nama Nasabah: " +test.getNama()); 
        System.out.println("Nomor Reening: " +test.getnoRekening());
        System.out.println("Saldo Anda: " +test.getSaldo());
        System.out.println("\n===== Jika Setoran < Setoran Minimum =====");
        test.simpanUang(400_000);
        System.out.println("\n===== Jika Setoran >= Setoran Minimum =====");
        test.simpanUang(500_000);
        System.out.println("\n===== Penarikan Minus =====");
        test.tarikUang(-500_000);
        System.out.println("\n===== Penarikan Melebihi Batas Saldo Atau Saldo Minimum =====");
        test.tarikUang(1_000_000);
        System.out.println("\n===== Penarikan Benar =====");
        test.tarikUang(400_000);

        System.out.println("\n===== (Pengecekan Class Bisnis) =====");
        System.out.println("\n===== Saldo Awal Kurang Dari Saldo Awal Minimum =====");
        Bisnis test2 = new Bisnis("Teuku", 2080017032, 500_000);
        System.out.println("\n===== Saldo Awal Sesuai =====");
        Bisnis test3 = new Bisnis("Dhuha", 2080017034, 1_500_000);
        System.out.println("Saldo Anda: " + test3.getSaldo());
        System.out.println("\n===== Setoran Kurang dari Minimum =====");
        test3.simpanUang(40_000);
        System.out.println("\n===== Setoran Lebih Dari Minimum =====");
        test3.simpanUang(60_000);

        System.out.println("\n===== (Pengecekan Class Haji) =====");
        System.out.println("\n===== Saldo Awal Kurang Dari Minimum =====");
        Haji test4 = new Haji("Muhammad", 2080017035, 400_000);
        System.out.println("\n===== Saldo Awal Sesuai =====");
        Haji test5 = new Haji("Abil", 2080017036, 500_000);
        System.out.println("Saldo Anda: " + test5.getSaldo());
        System.out.println("\n===== Setoran Kurang dari Minimum =====");
        test5.simpanUang(50_000);
        System.out.println("\n===== Setoran Lebih Dari Minimum =====");
        test5.simpanUang(100_000);
        System.out.println("\n===== Penarikan Lebih 10% Saldo =====");
        test5.tarikUang(70_000);
        System.out.println("\n===== Penarikan Tidak Lebih 10% Saldo =====");
        test5.tarikUang(60_000);
    }
}
