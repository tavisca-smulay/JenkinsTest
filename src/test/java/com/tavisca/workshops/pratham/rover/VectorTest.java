package com.tavisca.workshops.pratham.rover;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {

    @Test
    void vectorInitializesWithGivenPosition(){
        Vector r = new Vector(10,10,'N');
        assertEquals(10, r.x);
        assertEquals(10, r.y);
        assertEquals('N', r.direction);
    }

    @Test
    void vectorCanRotateLeftFromNorth(){
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.turnLeft();
        assertEquals('W', newVector.direction);
    }

    @Test
    void vectorCanRotateLeftFromWest(){
        Vector r = new Vector(10,10,'W');
        Vector newVector = r.turnLeft();
        assertEquals('S', newVector.direction);
    }

    @Test
    void vectorCanRotateLeftFromEast(){
        Vector r = new Vector(10,10,'E');
        Vector newVector = r.turnLeft();
        assertEquals('N', newVector.direction);
    }

    @Test
    void vectorCanRotateLeftFromSouth(){
        Vector r = new Vector(10,10,'S');
        Vector newVector = r.turnLeft();
        assertEquals('E', newVector.direction);
    }

    @Test
    void vectorCanRotateRightFromSouth(){
        Vector r = new Vector(10,10,'S');
        Vector newVector = r.turnRight();
        assertEquals('W', newVector.direction);
    }

    @Test
    void vectorCanRotateRightFromEast(){
        Vector r = new Vector(10,10,'E');
        Vector newVector = r.turnRight();
        assertEquals('S', newVector.direction);
    }

    @Test
    void vectorCanRotateRightFromWest(){
        Vector r = new Vector(10,10,'W');
        Vector newVector = r.turnRight();
        assertEquals('N', newVector.direction);
    }

    @Test
    void vectorCanRotateRightFromNorth(){
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.turnRight();
        assertEquals('E', newVector.direction);
    }

    @Test
    void vectorCanMoveVerticallyUp(){
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.moveUp();
        assertEquals(11,newVector.y);
    }

    @Test
    void vectorCanMoveVerticallyDown(){
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.moveDown();
        assertEquals(9,newVector.y);
    }

    @Test
    void vectorCanMoveHorizontallyRight(){
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.moveRight();
        assertEquals(11,newVector.x);
    }

    @Test
    void vectorCanMoveHorizontallyLeft(){
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.moveLeft();
        assertEquals(9,newVector.x);
    }

}