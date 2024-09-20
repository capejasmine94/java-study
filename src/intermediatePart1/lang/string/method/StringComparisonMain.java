package intermediatePart1.lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {

        String str1 = "Hello, Java!";
        String str2 = "Hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str2: " + str1.equalsIgnoreCase(str2));
        // 대소문자 무시하고 비교하기

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));
        // a는 b 로부터  사전적으로 몇번째에 있는가? 단, 유니코드 값으로 계산한다.
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 start with 'Hello:" + str1.startsWith("Hello"));
        System.out.println("str1 end with 'Hello:" + str1.endsWith("Java!"));
    }
}
