import org.junit.jupiter.api.*;

public class JunitAnnotations {
    @BeforeAll
    public static void Setupclass(){
        System.out.println("setup class has worked");
    }

    @BeforeEach
    public  void  SetUp(){
        System.out.println("Setup method has processed");
    }

    @Disabled("test disable")
    @Test
    public void TestDisable(){
        System.out.println("disable test");
    }

    @AfterEach
    public void teardown(){
        System.out.println("teardown has processed");
    }

    @AfterAll
    public static  void tearDownClass(){
        System.out.println("teardown has process afterAll");
    }
}
