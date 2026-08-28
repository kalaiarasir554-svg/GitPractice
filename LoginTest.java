public class LoginTest {

    public static void main(String[] args) {

        String username = "tester";
        String password = "12345";

        if (username.equals("tester") && password.equals("12345")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}