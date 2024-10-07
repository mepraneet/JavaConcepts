package problems;

public class StringCharacterOccurance {
    public static void main(String[] args) {

        String str="India is Great country";

        long count = str.chars().filter(s -> (char) s == 'i').count();

        System.out.println(count);


    }
}
