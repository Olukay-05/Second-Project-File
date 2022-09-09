package c1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMathsTest {

    MyMaths maths;

    @BeforeEach
    void setUp(){
        maths = new MyMaths();
    }

    @Test
    public void add(){
        int sum = maths.add(5,4);
        //assert
        assertEquals(9, sum);
    }

    @Test
    void sub(){
        int result = maths.subtract(5,4);
        assertEquals(1, result);
    }
}

