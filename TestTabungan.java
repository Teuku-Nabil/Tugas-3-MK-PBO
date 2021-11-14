import java.util.Scanner;

public class TestTabungan {
    private static double saldo = 100_000;
    private static  double tarik = 20_000;

    public static double getSaldo()
    {
        return saldo;
    }

    public static void setSaldo(double saldoo)
    {
        saldo = saldoo;
    }

    public static void main(String[] args) {
        if(tarik > getSaldo() * 10/100){
            System.out.println("tarik > saldo * 10%");
            setSaldo(getSaldo() - (tarik + 50_000));
            System.out.println("saldo: " +getSaldo());
        }
        else{
            System.out.println("tarik < saldo * 10%");
        }
    }
}
