package com.unstop.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RobotLoopTest {

    @Test
    public void testMovementBackToOrigin() {
        assertEquals("YES", DY_04_RobotLoops.movement("RRLL"));
    }

    @Test
    public void testMovementNotBackToOrigin() {
        assertEquals("NO", DY_04_RobotLoops.movement("RUL"));
    }

    @Test
    public void testEmptyMovement() {
        assertEquals("YES", DY_04_RobotLoops.movement(""));
    }

    @Test
    public void testComplexMovementBackToOrigin() {
        assertEquals("YES", DY_04_RobotLoops.movement("RULDUDLR"));
    }

    @Test
    public void testComplexMovementNotBackToOrigin() {
        assertEquals("NO", DY_04_RobotLoops.movement("RUULLDDRR"));
    }
}
