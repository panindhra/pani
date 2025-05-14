public class fifth {

    public void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static void main(String[] args) {
        fifth obj = new fifth();

        obj.checkEvenOdd(7);
    }
}