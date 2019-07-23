package com.tavisca.workshops.pratham.rover;

import java.util.HashMap;

public class Vector {

    public final int x;
    public final int y;
    public final char direction;

    public Vector(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Vector turnLeft() {
        return new Vector(this.x, this.y, leftMap.get(this.direction));
    }

    public Vector turnRight() {
        return new Vector(this.x, this.y, rightMap.get(this.direction));
    }

    private static HashMap<Character, Character> leftMap = new HashMap<>() {{
        put('N', 'W');
        put('W', 'S');
        put('S', 'E');
        put('E', 'N');
    }};

    private static HashMap<Character, Character> rightMap = new HashMap<>() {{
        put('N', 'E');
        put('W', 'N');
        put('S', 'W');
        put('E', 'S');
    }};

    private int incrementCoordinate(int coordinateValue){
        return coordinateValue+1;
    }

    private int decrementCoordinate(int coordinateValue){
        return coordinateValue-1;
    }

    public Vector moveUp() {
        return new Vector(this.x, incrementCoordinate(this.y), this.direction);
    }

    public Vector moveDown() {
        return new Vector(this.x, decrementCoordinate(this.y), this.direction);
    }

    public Vector moveRight() {
        return new Vector(incrementCoordinate(this.x), this.y, this.direction);
    }

    public Vector moveLeft() {
        return new Vector(decrementCoordinate(this.x), this.y, this.direction);
    }
}
