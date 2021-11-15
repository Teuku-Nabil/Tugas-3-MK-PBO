import java.util.Scanner;

public class Haji extends Tabungan{
    private double SALDO_AWAL_MINIMUM = 500_000;
    private double SALDO_MINIMUM = 500_000;
    private double SETORAN_MINIMUM = 100_000;

    public Haji(String nama, long noRek, double saldoAwal)
    {
        super(nama, noRek);
        setSaldoMinimum(SALDO_MINIMUM);
        setSetoranMinimum(SETORAN_MINIMUM);
        if(saldoAwal >= SALDO_AWAL_MINIMUM){
            setSaldo(saldoAwal);
        }
        else{
            System.out.println("Saldo Tidak Memenuhi Nilai Minimum!");
            System.out.println("Saldo Awal Minimum: " + SALDO_AWAL_MINIMUM);
        }
    }

    @Override
    public void tarikUang(double jumlahPenarikan)
    {
        double jumlah = jumlahPenarikan;
        Scanner s = new Scanner(System.in);
        if(jumlah > getSaldo() * 10/100){
        System.out.println("Karena Penarikan Melebihi 10% Saldo, Maka Akan Ada Pemotongan 50.000");
        System.out.println("Jumlah Penarikan: " + jumlah);
        System.out.println("Saldo Anda: " +getSaldo());
        System.out.print("Masukkan Lagi Jumlah Penarikan: ");
        jumlah = s.nextDouble();
        }
        if(jumlah > getSaldo() * 10/100){
            setSaldo(getSaldo() - (jumlah + 50_000));
            System.out.println("Karena Penarikan Anda Melebihi 10% Saldo Maka Akan Ada Pemotongan Tambahan 50.000");
            System.out.println("Saldo Anda: " +getSaldo());
        }
        else{
            setSaldo(getSaldo() - jumlah);
            System.out.println("Saldo Anda: " +getSaldo());
        }
        s.close();
    }
}