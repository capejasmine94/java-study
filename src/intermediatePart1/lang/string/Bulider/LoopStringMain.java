package intermediatePart1.lang.string.Bulider;

public class LoopStringMain {
    public static void main(String[] args) {

        // System.currentTimeMillis(); = 시스템에서 현재 밀리세컨드 시간
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
