import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jaket jaket = new Jaket();

        System.out.print("Masukkan jumlah jaket A yang dibeli: ");
        int jumlahA = input.nextInt();
        jaket.beliJaketA(jumlahA);

        System.out.print("Masukkan jumlah jaket B yang dibeli: ");
        int jumlahB = input.nextInt();
        jaket.beliJaketB(jumlahB);

        System.out.print("Masukkan jumlah jaket C yang dibeli: ");
        int jumlahC = input.nextInt();
        jaket.beliJaketC(jumlahC);

        jaket.hitungTotal();
        input.close();
    }
}
