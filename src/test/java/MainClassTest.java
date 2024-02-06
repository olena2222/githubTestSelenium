import org.junit.jupiter.api.*;

public class MainClassTest {
    @BeforeAll
    public void beforeClassMethod(){
    }
    @BeforeEach
    public void setUp(){
    }
    @Test
    public void method1(){}
    @Test
    public void method2(){}
    @Test
    public void method3(){}
    @AfterEach
    public void tearDown(){
    }

    @AfterAll
    @Disabled
    public void afterClassMethod(){
    }
}
