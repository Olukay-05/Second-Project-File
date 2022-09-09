package tdd;

import W3Resource.tdd.Sum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumTest {

    @Test

    void addNumber() {
        //given that
        Sum sum = new Sum();

        //when

        sum.addNumber(2, 3);
        //check that

        assertEquals(5, sum.addNumber(2, 3));

    }

    @Test

    void calculationOperations(){
        //given that
        Sum sum = new Sum();

        int result = sum.calculationOperations(-5, 8, 6);

        assertEquals(43, result);

    }
}
