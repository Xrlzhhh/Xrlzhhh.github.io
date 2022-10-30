package CoreCodePattern;

public class t03 {
    public static void main(String[] args) {
        System.out.println(isPrime(87));
    }

    public static boolean isPrime(int num){
        for (int i = 2; i *i < num ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
