import JavaExamples.BasicPrograms.SunnyNumber;
import org.junit.jupiter.api.Test;


public class SunnyNumberTests {
    @Test()
    public void SunnyNumberTest1(){
       SunnyNumber.SunnyNumberChecker(10);
    }

    @Test
    public void SunnyNumberTest2(){
        SunnyNumber.SunnyNumberChecker(13);
    }

    @Test
    public void SunnyNumberTest3(){
        SunnyNumber.SunnyNumberChecker(15);
    }
    @Test
    public void SunnyNumberTest4(){
        SunnyNumber.SunnyNumberChecker(63);
    }
}
