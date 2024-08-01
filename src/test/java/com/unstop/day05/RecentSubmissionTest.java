package com.unstop.day05;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RecentSubmissionTest {

    @Test
    public void testGetMaxQueueSize() {
        int[] timestamps1 = {300, 6000, 100000};
        assertEquals(1, DY_08_RecentSubmission.getMaxQueueSize(3, timestamps1));
        
        int[] timestamps2 = {1000, 2000, 3000, 4000, 5000, 6000, 7000};
        assertEquals(5, DY_08_RecentSubmission.getMaxQueueSize(7, timestamps2));
        
        int[] timestamps3 = {1, 1001, 2001, 3001, 4001, 5001, 6001};
        assertEquals(5, DY_08_RecentSubmission.getMaxQueueSize(7, timestamps3));
        
        int[] timestamps4 = {1000, 2000, 3000, 4000, 5000, 15000, 16000, 17000, 18000, 19000};
        assertEquals(5, DY_08_RecentSubmission.getMaxQueueSize(10, timestamps4));
    }
}
