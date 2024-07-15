import JavaExamples.BasicPrograms.fibonacciExample1;
import org.junit.jupiter.api.Test;


public class FibonacciTests {
    @Test
    public void FibonacciTest(){
        fibonacciExample1.FibonacciWriter(10);
    }
    @Test
    public void FibonacciTest2(){
        fibonacciExample1.FibonacciWriter(-5);
    }
    @Test
    public void FibonacciTest3(){
        fibonacciExample1.FibonacciWriter(0);
    }
}
