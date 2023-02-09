public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int x = 400;
        int y = 9000;
        int rezult = (int) service.calcQsqrt(x, y);
        System.out.println(rezult);

    }

}