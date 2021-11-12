public abstract class Tabungan{
    private String nama;
    private long noRekening;
    private double saldo = 0;
    private double saldo_minimum = 0;
    private double setoran_minimum = 0;
    private double uang;
    private double jumlahPenarikan;

    public void Tabungan(){
        nama = nama;
        noRekening = noRekening;
        saldo = 0;
        saldo_minimum = 0;
        setoran_minimum = 0;
    }

    public Tabungan(String nama, long noRekening){
        this.nama = nama;
        this.noRekening = noRekening;
    }

    protected void setSaldoMinimum(double saldo_minimum){
        this.saldo_minimum = saldo_minimum;
    }

    protected void setSetoranMinimum(double setoran_minimum){
        this.setoran_minimum = setoran_minimum;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void simpanUang(double uang){
        if (uang < setoran_minimum){
            System.out.println("Setoran kurang dari setoran minimum!");
        }
        else{
            this.uang = uang;
        }
    }

    public void tarikUang(double jumlahPenarikan){
        if(jumlahPenarikan < 0){
            System.out.println("Jumlah penarikan salah!");
        }else if(jumlahPenarikan > saldo){
            System.out.println("Saldo tidak cukup!");
        }else if(saldo-jumlahPenarikan < saldo_minimum){
            System.out.println("Jumlah penarikan salah!");
        }else{
            saldo = jumlahPenarikan;
        }
    }
}