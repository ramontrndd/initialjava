public class Soma {
    public static void main(String[] args) {
        int number = 248;
        checkOddOrEven(number);
    }

    public static void checkOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " é par.");
        } else {
            System.out.println(number + " é ímpar.");
        }
    }
}