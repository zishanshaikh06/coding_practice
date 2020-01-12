package coding;

public class CountDigitsNumber {

    public static void main(String[] args) {

        System.out.println(count(243987650));


    }

    static int count(int num){

        if(num<=1){
            return 0;
        }

        num = num/10;

        return 1 + count(num);


    }
}
