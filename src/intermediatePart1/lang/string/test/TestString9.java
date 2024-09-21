package intermediatePart1.lang.string.test;

public class TestString9 {
    public static void main(String[] args) {

        String email = "hello@example.com";

        String[] separation = email.split("@");
        String idPart = separation[0];
        String domainPart = separation[1];

        System.out.println("ID : " + idPart);
        System.out.println("Domain : " + domainPart);
    }
}
