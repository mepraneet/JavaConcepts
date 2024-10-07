package problems;

public class RemoveSpecialChar {
    public static void main(String[] args) {

        String str="abgg63268462bdsab14564hkshk";

        String newstr=str.replaceAll("[^0=9, a-z,A-Z]","");
        System.out.println(newstr);
    }
}
