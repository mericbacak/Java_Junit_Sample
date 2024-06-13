import org.example.Calculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {
    @Test
    public void AdditionTests(){
        double sum= Calculator.add(1.55,3.67);
        double sum2= Calculator.add(4,11.34);
        double sum4= Calculator.add(3.47,7);
        int sum3 =Calculator.add(5,7);
        assertEquals(5.22,sum);
        assertEquals(15.34,sum2);
        assertEquals(12,sum3);
        assertEquals(10.47,sum4);
        System.out.println("Additions test has executed");
    }

    @Test
    public void SubtractionTest(){
        double result1= Calculator.subtraction(1.54,3.68);
        double result2=Calculator.subtraction(1.7,1);
        double result3=Calculator.subtraction(4,7.8);
        int result4=Calculator.subtraction(7,19);
        assertEquals(-2.14,result1);
        assertEquals(0.7,result2);
        assertEquals(-3.8,result3);
        assertEquals(-12,result4);
        System.out.println("subtraction test has executed");
    }

    @Test
    public void MultiplyTest(){
        double result1= Calculator.multiply(1.54,3.68);
        double result2=Calculator.multiply(1.7,1);
        double result3=Calculator.multiply(4,7.8);
        int result4=Calculator.multiply(7,19);
        assertEquals(5.6672,result1);
        assertEquals(1.7,result2);
        assertEquals(31.2,result3);
        assertEquals(133,result4);
        System.out.println("multiplaction test has executed");
    }

    @Test
    public void DivideTests(){
        double result1= Calculator.dividion(9.68,3.68);
        double result2=Calculator.dividion(1.7,1);
        double result3=Calculator.dividion(4,7.8);
        int result4=Calculator.dividion(54,9);
        assertEquals(2.6304347826086953,result1);
        assertEquals(1.7,result2);
        assertEquals(0.5128205128205129,result3);
        assertEquals(6,result4);
        System.out.println("multiplaction test has executed");
    }


}
