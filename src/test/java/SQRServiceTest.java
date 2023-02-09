import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/NoQR.csv")
    public void TestCalculateNoSquaresInLimit(int expected, int x, int y) {
        SQRService service = new SQRService();
        int actual = service.calcQsqrt(x, y);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/OneQR.csv")
    public void TestCalculateOneSquaresInLimit(int expected, int x, int y) {
        SQRService service = new SQRService();
        int actual = service.calcQsqrt(x, y);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SeveralQR.csv")
    public void TestCalculateSeveralSquaresInLimit(int expected, int x, int y) {
        SQRService service = new SQRService();
        int actual = service.calcQsqrt(x, y);
        Assertions.assertEquals(expected, actual);
    }


}
