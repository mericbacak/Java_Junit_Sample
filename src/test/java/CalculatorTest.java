import org.example.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeAll
    public static void Setupclass(){
        //beforeall ve afterall kullanırken static olur
        System.out.println("setup class has worked");
    }

    @BeforeEach
    public  void  SetUp(){
        calculator= new Calculator();
        System.out.println("Setup method çalıştırıldı");
    }

    @Test
    public void toplamaTesti(){
        //Calculator calculator=new Calculator();
        double sum= calculator.toplama(1.5,3.6);
        Assertions.assertEquals(5.1,sum);
    }

    @Disabled("Test devre dışı")
    @Test
    public void CikarmaTesti(){
        //Calculator calculator=new Calculator();
        double fark= calculator.cikarma(1.5,3.6);
        Assertions.assertEquals(-2.1,fark);
    }

    //@Disabled("Test devre dışı")
    @Test
    public void CarpmaTest(){
        //Calculator calculator=new Calculator();
        double carpim= calculator.carpma(2.5,4);
        Assertions.assertEquals(10,carpim);
    }

    @AfterEach
    public void teardown(){
        System.out.println("teardown method çalıştırıldı.");
    }

    @AfterAll
    public static  void tearDownClass(){
        //beforeall ve afterall kullanırken static olur
        System.out.println("teardown class çalıştırıldı");
    }

}
