package chapter1_fundamentals._1_basic_programming_model;

public class _113_equalThreeNum {

    // Exercise 1.1.3
    public static void main(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException("must input 3 numbers to compare");
        }

        if (args[0].equals(args[1]) && args[1].equals(args[2])) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
