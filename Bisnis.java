public class Bisnis extends Tabungan{
    private double SALDO_AWAL_MINIMUM = 1_000_000;
    private double SALDO_MINIMUM = 1_000_000;
    private double SETORAN_MINIMUM = 50_000;
    
    public Bisnis()
    {
        
    }
    
    public Bisnis(String nama, long noRek, double saldoAwal)
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
}