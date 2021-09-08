package Lesson26;

public class MyInitializerBlock {

    static int i = 1;
    String string = "Ok";

    static {
        System.out.println("1) Static block, int = " + i);
    }

    {
        System.out.println("3) Non-static block, string = " + string);
        i++;
        System.out.println("4) Non-static block, i = " + i);
    }


    public MyInitializerBlock() {
        System.out.println("5) This is constructor");
    }

    public static void main(String[] args) {
        System.out.println("2) This is public static void main");
        MyInitializerBlock block = new MyInitializerBlock();
        System.out.println("6) static int i = " + MyInitializerBlock.i);
    }
}
