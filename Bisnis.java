public class Bisnis extends Tabungan{
    private static double SaldoMinimum = 0;
    private static double SALDO_AWAL_MINIMUM = 1000000;
    private double SALDO_MINIMUM = 1000000;
    private static double SETORAN_MINIMUM = 50.000;
    
    public Bisnis(String nama, long noRek, double SaldoAwal){
        super(nama, noRek);
        SaldoAwal = SaldoAwal;
    }

    public static void setSaldoMinimum(Class<Double> class1){
        System.out.println("SaldoMinimum: " + class1);
    }
}