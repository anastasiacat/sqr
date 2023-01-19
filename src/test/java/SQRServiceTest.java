import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    /*@CsvSource({
            "3, 200, 300",
            "6, 10, 99",
            "22, 100, 1000",
            "21, 0, 401"
    })*/
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void testFoundSqrInTheRangeOfTwoNumbers(int expected, int firstNumber, int secondNumber) {
        SQRService service = new SQRService();

        int actual = service.calcSqr(firstNumber, secondNumber);
        Assertions.assertEquals(expected, actual);
    }
}
