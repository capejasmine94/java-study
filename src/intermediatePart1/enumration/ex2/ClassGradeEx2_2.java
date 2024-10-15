package intermediatePart1.enumration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        // 새로운 참조값이 생성되면서 잘못된 값이 출력된다. 생성자를 외부에서 생성 못하게 막아야한다.
        int price = 10000;

        DiscountService discountService = new DiscountService();

//        ClassGrade classGrade = new ClassGrade();
//
//        int result = discountService.discount(classGrade, price);
//
//        System.out.println("newClassGrade 등급의 할인 금액 : " + result);
    }
}
