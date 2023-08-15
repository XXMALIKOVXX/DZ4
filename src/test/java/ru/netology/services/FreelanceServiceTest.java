package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class FreelanceServiceTest {
    @Test
    public void testCalculateCase1() {
        FreelancerService service = new FreelancerService();
        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(actual, expected);
    }

}