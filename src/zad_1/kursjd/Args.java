package zad_1.kursjd;

public class Args {
    private String[] args;

    Args(String[] ar) {
        this.args = ar;
    }

    void printArgs() {
        int i = 1;
        for (String a : args) {
            i = i + 1;
            System.out.println("Аргумент " + i + "=" + a);
        }
    }
}
