package intermediatePart1.enumration.ref3;


public class DiscountService {

    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }

    // 리팩토링후 DiscountService 가 필요가 없어진다
}
