package lambda;

public class Main {
    public static void main(String Args[])
    {
        System.out.println("System started...");

//        MyInterImpl myInter = new MyInterImpl();
//        myInter.Hello();

        MyInterface i= ()-> System.out.println("Lambda using");

        i.Hello();

    }
}
