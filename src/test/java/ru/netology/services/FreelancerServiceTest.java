package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FreelancerServiceTest {

    @ParameterizedTest
    @CsvSource({
            "10000, 3000, 20000, 3",
            "100000, 60000, 150000, 2"
    })
    void shouldCountRestMonths(int income, int expenses, int threshold, int expected) {
        FreelancerService service = new FreelancerService();
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }
}