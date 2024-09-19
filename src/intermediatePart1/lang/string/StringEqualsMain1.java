package intermediatePart1.lang.string;

public class StringEqualsMain1 {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println("new String() == 비교: " + (str1 == str2));
        // == : 참조값 주소 비교
        System.out.println("new String() equlas 비교: " + str1.equals(str2));
        // equals() : 문자열값 비교

        String str3 = "hello";
        String str4 = "hello";
        // 리터럴 : "" 안에 쓰는 값
        System.out.println("리터럴 == 비교: " + str3.equals(str4));
        System.out.println("리터럴 equals 비교: " + str3.equals(str4));
        // 리터럴 값 을 == 으로 비교했을때 왜 true 가 나오는가?
        // 문자열 리터럴을 사용하는경우 문자열 풀(String Pool)을 사용한다.

        // String Pool : 동일한 문자열 리터럴을 여러 번 사용하게 되면, 자바는 메모리 낭비르 줄이기 위해서 새로운 객체를 생성하지 않고 이미 String Pool 에 있는 기존 문자열을 재사용한다.
    }
}
