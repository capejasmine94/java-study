package intermediatePart1.lang.string;

public class StringConcatMain {
    public static void main(String[] args) {

        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b;
        // 참조값 끼리 더하는건 불가능해서 concat() 메서드를 사용하는데 자바 언어에서는 편의상 특별히 + 연산을 제공한다.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
