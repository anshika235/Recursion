public class FirstOccurence {
    private static int sol(int[] arr,int ci,int search,int n){
        if(ci==n){
            return -1;
        }
        if(arr[ci]==search){
            return ci;
        }
        int recAns = sol(arr, ci + 1, search, n);
        return recAns;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=5;
        System.out.println(sol(arr,0,2,n));
    }
}
