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
        }
    }

    @Override
    public void tarikUang(double jumlahPenarikan)
    {
        if(jumlahPenarikan > getSaldo() * 10/100){
            setSaldo(getSaldo() - (jumlahPenarikan + 50_000));
            System.out.println("Karena Penarikan Anda Melebihi 10% Saldo Maka Akan Ada Pemotongan Tambahan 50.000\n");
            System.out.println("Saldo Anda: " +getSaldo());
        }
        else{
            setSaldo(getSaldo() - jumlahPenarikan);
            System.out.println("Saldo Anda: " +getSaldo());
        }

    }
}