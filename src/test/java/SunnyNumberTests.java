import org.example.SunnyNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SunnyNumberTests {
    @Test()
    public void SunnyNumberTest1(){
        SunnyNumber.SunnyNumberChecker(8);
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
