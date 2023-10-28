import org.example.getBusinessDayCalculator;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class getBusinessDayCalculatorTest {

    @Test
    public void testgetWorkday() {
        // Test case 1: Starting on a Tuesday, add 2 workdays
        LocalDate startDate1 = LocalDate.of(2023, 10, 5); // Tuesday
        LocalDate expectedDate1 = LocalDate.of(2023, 10, 9); // Monday
        assertEquals(expectedDate1, getBusinessDayCalculator.getWorkday(startDate1, 2));

        // Test case 2: Starting on a Friday, add 1 workday
        LocalDate startDate2 = LocalDate.of(2023, 10, 6); // Friday
        LocalDate expectedDate2 = LocalDate.of(2023, 10, 9); // Monday
        assertEquals(expectedDate2, getBusinessDayCalculator.getWorkday(startDate2, 1));

        // Test case 3: Starting on a Saturday, add 1 workday
        LocalDate startDate3 = LocalDate.of(2023, 10, 7); // Saturday
        LocalDate expectedDate3 = LocalDate.of(2023, 10, 9); // Monday
        assertEquals(expectedDate3, getBusinessDayCalculator.getWorkday(startDate3, 1));
    }
}
