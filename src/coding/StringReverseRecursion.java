package coding;

public class StringReverseRecursion {

    public static void main(String[] args) {

        System.out.println(reverse("hello"));
    }

    static String reverse(String str){

        if(str.isEmpty()){
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
