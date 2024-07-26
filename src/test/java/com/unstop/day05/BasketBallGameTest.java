package com.unstop.day05;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class BasketBallGameTest {
    
    @Test
    public void testCalculateScore() {
        // Test case 1
        assertEquals(49, DY_05_BasketBallGame.calculateScore(Arrays.asList("3", "4", "+", "D", "C", "D", "+")));
        
        // Test case 2
        assertEquals(30, DY_05_BasketBallGame.calculateScore(Arrays.asList("5", "2", "C", "D", "+")));
        
        // Test case 3
        assertEquals(70, DY_05_BasketBallGame.calculateScore(Arrays.asList("10", "20", "C", "D", "D")));
        
        // Test case 4
        assertEquals(0, DY_05_BasketBallGame.calculateScore(Arrays.asList("0", "C")));
        
        // Test case 5
        assertEquals(20, DY_05_BasketBallGame.calculateScore(Arrays.asList("5", "5", "+")));
        
        // Test case 6: No operations
        assertEquals(0, DY_05_BasketBallGame.calculateScore(Arrays.asList()));
    }
}
