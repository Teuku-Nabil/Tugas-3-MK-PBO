import java.util.Scanner;

public class TestTabungan {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Jumlah setoran: ");
        double uang = s.nextDouble();
        Tabungan.simpanUang(0);
        //System.out.print(Tabungan.setSaldoMinimum(1000000));
        //System.out.print(Tabungan.simpanUang(0));
        //Bisnis.setSaldoMinimum(0);
    }
}
