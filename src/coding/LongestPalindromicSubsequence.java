package coding;

public class LongestPalindromicSubsequence {

    public static void main(String[] args) {

        System.out.println(palSubst("ELRMENMET", 0, "ELRMENMET".length()-1));
    }

    static int palSubst(String str, int si, int ei){

        if(si > ei){
            return 0;
        }

        if(si == ei){
            return 1;
        }

        int count1 = 0;

        if(str.charAt(si) == str.charAt(ei)){
            count1 = 2 + palSubst(str,si+1, ei-1);
        }

        int count2 = palSubst(str, si, ei-1);

        int count3 = palSubst(str, si+1, ei);

        return Math.max(count1, Math.max(count2, count3));

    }
}
