//print nth fibonacci number

public class FibonacciNumber {
    private static  int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int c1=fibo(n-1);
        int c2=fibo(n-2);
        int meraAns=c1+c2;
        return meraAns;
    }

    public static void main(String[] args) {
        System.out.println(fibo(2));
    }
}
