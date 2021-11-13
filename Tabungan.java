import java.util.Scanner; 

public abstract class Tabungan{
    private String nama;
    private long noRek;
    private static double saldo = 0;
    private static double saldo_minimum = 0;
    private static double setoran_minimum = 0;
    private double uang;
    private double jumlahPenarikan;
    static Scanner s = new Scanner(System.in);

    public void Tabungan(){
        nama = nama;
        noRek = noRek;
        saldo = 0;
        saldo_minimum = 0;
        setoran_minimum = 0;
    }

    public Tabungan(String nama, long noRek){
        this.nama = nama;
        this.noRek = noRek;
    }

    protected static void setSaldoMinimum(double saldo_minimum){
        saldo_minimum = saldo_minimum;
    }

    protected void setSetoranMinimum(double setoran_minimum){
        this.setoran_minimum = setoran_minimum;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public static double setSaldo(double saldo){
        System.out.print("Masukkan Saldo Anda: ");
        saldo = s.nextDouble();
        saldo = saldo;
        return saldo;
    }

    public static double simpanUang(double uang){
        System.out.print("Masukkan jumlah setoran: ");
        uang = s.nextDouble();
        if (uang < saldo_minimum){
            System.out.println("Setoran kurang dari setoran minimum!");
        }
        else{
            uang = uang;
        }
        return uang;
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