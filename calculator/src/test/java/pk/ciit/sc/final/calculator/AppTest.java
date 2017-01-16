package pk.ciit.sc.final.calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
    extends TestCase
{
    /**
     * max value
     *
     * @param testName name of the test case
     */
	
    @test
    public void squareTest(int num){
    	square=new square()
    	assertEquals("Result", 0, square.square("5", "0"));
    		
    }
    @test
    public void findmax(int num1,int num2,int num3){
       Max m = new Max();
       assertEquals(m.findMax(arr), m.findMax(arr));
    }
}

@test
}