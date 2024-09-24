package intermediatePart1.lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {

        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용 반환 , 그 외에 숫자는 객체를 새로 만들다.
        Integer integerObj1 = Integer.valueOf(10);

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj));
        System.out.println("equals : " + newInteger.equals(integerObj));

        System.out.println("== : " + (integerObj == integerObj1));
        System.out.println("equals : " + newInteger.equals(integerObj));
    }
}
