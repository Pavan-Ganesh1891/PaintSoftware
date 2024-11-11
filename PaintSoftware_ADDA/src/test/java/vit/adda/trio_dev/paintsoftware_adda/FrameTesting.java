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
public class FrameTesting {
    
    public FrameTesting() {
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
    public void FrameshowingTesting() {
        Frame f=new Frame();
        String msg=f.showFrame();
        assertEquals("Frame shown.", msg);
        System.out.println("Success");
    }
}
