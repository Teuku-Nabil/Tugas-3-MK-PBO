public class Tabungan{
    private String nama;
    private long noRekening;
    private double saldo = 0;
    private double saldo_minimum = 0;
    private double setoran_minimum = 0;


    public Tabungan()
    {
    
    }

    public Tabungan(String nama, long noRekening)
    {
        this.nama = nama;
        this.noRekening = noRekening;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public long getnoRekening()
    {
        return noRekening;
    }

    public void setnoRekening(long noRekening)
    {
        this.noRekening = noRekening;
    }

    protected void setSaldoMinimum(double saldo_minimum)
    {
        this.saldo_minimum = saldo_minimum;
    }

    protected void setSetoranMinimum(double setoran_minimum)
    {
        this.setoran_minimum = setoran_minimum;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public void simpanUang(double uang)
    {
        if (uang >= setoran_minimum){
            setSaldo(saldo+uang);
            System.out.println("Saldo: " + getSaldo());
        }
        else{
            System.out.println("Setoran Minimum: " +setoran_minimum);
        }
    }

    public void tarikUang(double jumlahPenarikan)
    {
        if(jumlahPenarikan >= 0 && jumlahPenarikan <= getSaldo()){
            setSaldo(getSaldo() - jumlahPenarikan);
            if(getSaldo() >= saldo_minimum){
                System.out.println("Saldo Anda: " +getSaldo());
            }
            else{
                setSaldo(getSaldo() + jumlahPenarikan);
                System.out.println("Saldo Kurang Dari Nilai Minimum!\n");
                System.out.println("Saldo Anda: " +getSaldo());
            }
        }
        else{
            System.out.println("Jumlah Penarikan Salah!\n");
            System.out.println("Saldo Anda: " +getSaldo());
        }
    }
}