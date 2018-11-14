package zad_1.kursjd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hello hello = new Hello();
        hello.printSlogan();
        hello.setS("Привет, Сергей");
        hello.printSlogan();
        Args argObj = new Args(args);
        argObj.printArgs();
    }
}
