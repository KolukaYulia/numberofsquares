public class SQRService {
    public int calcQsqrt(int x, int y) {
        int rezult = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                rezult++;
            }
        }
        return rezult;


    }
}
