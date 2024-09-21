package intermediatePart1.lang.string.test;

public class TestString10 {
    public static void main(String[] args) {

        String fruits = "apple,banana,mango";

        String[] separation = fruits.split(",");
        for (String fruit : separation) {
            System.out.println(fruit);
        }

        String combine = String.join("->", separation);
        System.out.println("combine = " + combine);

    }
}
