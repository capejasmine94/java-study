package intermediatePart1.enumration.ex3;


import static intermediatePart1.enumration.ex3.Grade.*;

public class DiscountService {

    public int discount(Grade classGrage, int price) {
        int discountPercent = 0;

        if (classGrage == BASIC) {
            discountPercent = 10;
        } else if (classGrage == GOLD) {
            discountPercent = 20;
        } else if (classGrage == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }


        return price * discountPercent / 100;
    }
}
