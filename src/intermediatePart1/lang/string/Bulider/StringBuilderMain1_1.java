package intermediatePart1.lang.string.Bulider;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);

        // StringBuilder 를 사용하면 가변객체를 만들수있다. 이로 인해 메모리 사용을 줄이고 성능을 향상시킬수 있다.
    }
}
