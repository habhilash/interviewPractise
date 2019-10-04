package practise.java.concepts;

public class AddOneToANumber {

    public static void addOne(int num) {
        int m = 1;

        System.out.println("Added one to number = " + (-(~num)));
    }

    public static void main(String[] args) {
        int num = 13;
        addOne(num);
    }
}
