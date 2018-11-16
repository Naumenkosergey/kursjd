package zad_1.kursjd;

public class Args {
    private String[] args;

    Args(String[] ar) {
        this.args = ar;
    }

    void printArgs() {
        int i = 0;
       for (String a : args) {
            i ++;
            System.out.println("Аргумент " + i + " = " + a);

        }


    }
}
