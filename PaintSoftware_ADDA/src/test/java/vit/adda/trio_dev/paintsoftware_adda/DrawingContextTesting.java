
package vit.adda.trio_dev.paintsoftware_adda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DrawingContextTesting {
    
    public DrawingContextTesting() {
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
    public void DrawingContextsetPoint() {
        DrawingContext d= new DrawingContext();
        String msg=d.setPoint();
        assertEquals("Point set on the screen.",msg);
        System.out.println("Success");
    }
}
