package com.tavisca.workshops.pratham.rover;

public class Vector {

    private final int x;
    private final int y;
    private final char direction;

    public Vector(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public char direction() {
        return direction;
    }

    public Vector turnLeft() {
        char newDirection = '\0';
        if(direction == 'N')
            newDirection = 'W';
        else if(direction == 'E')
            newDirection = 'N';
        else if(direction == 'S')
            newDirection = 'E';
        else if(direction == 'W')
            newDirection = 'S';
        return new Vector(this.x, this.y, newDirection);
    }
}
