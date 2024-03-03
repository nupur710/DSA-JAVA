package heap;

public class DigitalSum {
    public static void main(String[] args) {
        int x= 16;
        System.out.println(digital_root(942));
    }

    public static int digital_root(int n) {
//        if(n/10 == 0) return 0;

        int sum= 0;
        while(n > 0) {
            int lastDigit= n % 10;
            sum += lastDigit;
            n= n/10;
        }
        return sum;
    }
}
