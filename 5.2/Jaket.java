public class Jaket {
    public static final int A = 100000;
    public static final int B = 125000;
    public static final int C = 175000;

    private int totalHarga, harga, total = 0;

    public void beliJaketA(int jumlah){
        if (jumlah<=100) {
            harga = A;
        }
        else{
            harga = 95000;
        }
        total = harga*jumlah;
        totalHarga += total;
        System.out.println("Total harga jaket A = "+total);
    }

    public void beliJaketB(int jumlah){
        if (jumlah<=100) {
            harga = B;
        }
        else{
            harga = 120000;
        }
        total = harga*jumlah;
        totalHarga += total;
        System.out.println("Total harga jaket B = "+total);

    }

    public void beliJaketC(int jumlah){
        if (jumlah<=100) {
            harga = C;
        }
        else{
            harga = 160000;
        }
        total = harga*jumlah;
        totalHarga += total;
        System.out.println("Total harga jaket C = "+total);
    }

    public void hitungTotal(){
        System.out.println("Total keseluruhan: "+totalHarga);
    }
}
