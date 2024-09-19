package intermediatePart1.lang.string;

public class StringEqualsMain2 {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));

    }

    // 어떤 문자열이 들어올지 모른다 문자열 비교는 무조건 equals() 를 사용한다. / 동등성 비교를 한다.
    private static boolean isSame(String x, String y) {
        //return x == y;
        return x.equals(y);
    }
}
