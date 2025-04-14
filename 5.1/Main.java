import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator a = new Kalkulator();
        
        System.out.println("Masukkan nilai 1: ");
        int x = input.nextInt();
        System.out.println("Masukkan nilai 2: ");
        int y = input.nextInt();

        System.out.println("Penjumlahan: "+x+" + "+y+" = "+Kalkulator.add(x, y));
        System.out.println("Pengurangan: "+x+" - "+y+" = "+Kalkulator.subtract(x, y));
        System.out.println("Perkalian: "+x+" * "+y+" = "+a.multiply(x, y));
        System.out.println("Pembagian: "+x+" / "+y+" = "+a.divide(x, y));

        System.out.println("Menyederhanakan pecahan: ");
        a.Sederhana(x, y);
        input.close();
    }
}
