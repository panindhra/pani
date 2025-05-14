public class sec {
    String name;

    public sec(String userName) {
        name = userName;
    }
    public void greetUser() {
        System.out.println("Welcome, " + name + "!");
    }

    public static void main(String[] args) {
        sec obj = new sec("pani");

        obj.greetUser();
    }
}