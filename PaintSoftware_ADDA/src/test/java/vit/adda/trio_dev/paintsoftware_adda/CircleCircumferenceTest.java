package vit.adda.trio_dev.paintsoftware_adda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bmpav
 */
public class CircleCircumferenceTest {
    
    public CircleCircumferenceTest() {
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
        float cir=c.circumference(10);
        assertEquals(62.79999923706055,cir);
        System.out.println("success");
     }
}
