public class Kalkulator{
    
    public static int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public double divide(int a, int b){
        if(b == 0){
            System.out.println("Denominator tidak boleh 0!");
            return 0;
        }
        return (double) a/b;
    }

    public int gcd(int a, int b){
        while (b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public void Sederhana(int a, int b){
        System.out.println("Pecahan sederhana: "+(a/gcd(a, b))+"/"+(b/gcd(a, b)));
    }
}