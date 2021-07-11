public class Permutations {
    private static void sol(String inp, String ans) {

        if(inp.length() == 0) {
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < inp.length(); i++) {
            String bachiHuiString = inp.substring(0, i) + inp.substring(i + 1);
            char nikalaFixed = inp.charAt(i);

            sol(bachiHuiString, ans + nikalaFixed);
        }
    }
    public static void main(String[] args) {
        sol("abc", "");
    }

}
