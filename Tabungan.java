public abstract class Tabungan{
    private String nama;
    private long noRek;
    private double saldo = 0;
    private double saldo_minimum = 0;
    private double setoran_minimum = 0;
    private double jumlahPenarikan;

    public void Tabungan(){
    
    }

    public Tabungan(String nama, long noRek){
        this.nama = nama;
        this.noRek = noRek;
    }

    protected static void setSaldoMinimum(double saldo_minimum){
        saldo_minimum = saldo_minimum;
    }

    protected void setSetoranMinimum(double setoran_minimum){
        setoran_minimum = setoran_minimum;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void simpanUang(double uang){
        if (uang >= setoran_minimum){
            setSaldo(saldo+uang);
            System.out.println("Saldo: " + getSaldo());
        }
        else{
            System.out.println("Setoran Minimum: " +setoran_minimum);
        }
    }

    public static void tarikUang(double jumlahPenarikan){
        if(jumlahPenarikan < 0){
            System.out.println("Jumlah penarikan salah!");
        }else if(jumlahPenarikan > saldo){
            System.out.println("Saldo tidak cukup!");
        }else if(saldo-jumlahPenarikan < saldo_minimum){
            System.out.println("Jumlah penarikan salah!");
        }else{
            saldo = saldo-jumlahPenarikan;
        }
    }
}