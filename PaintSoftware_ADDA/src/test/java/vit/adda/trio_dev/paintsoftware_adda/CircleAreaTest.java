package vit.adda.trio_dev.paintsoftware_adda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleAreaTest {
    
    public CircleAreaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    
    @Test
    public void CircleTest() {
        Circle c=new Circle();
        float a=c.areaCal(5);
        assertEquals(78.5,a);
        System.out.println("success");
    }
}
