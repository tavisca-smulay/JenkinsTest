package com.tavisca.workshops.pratham.rover;

public class MarsRoboRover {
    private static int y_coordinate = 0;
    private static int x_coordinate = 0;
    private static String direction = "";

    public static void main(String[] args) {

        MarsRoboRover rover = new MarsRoboRover();
        rover.getCurrentPosition(3, 3, "E");
        String commands = "MMRMMRMRRM";
        rover.getCommand(commands);

        System.out.println("currentPosition..." + x_coordinate + " " + y_coordinate + " " + direction);
        System.out.println("commands..." + commands);
        System.out.println("newPosition..." + x_coordinate + " " + y_coordinate + " " + direction);
    }

    private void getCurrentPosition(int x_coordinate, int y_coordinate, String direction) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.direction = direction;
    }

    private void getCommand(String command) {
        for (char eachCommand : command.toCharArray()) {
            rove(eachCommand);
        }
    }

    private void setDirectionToEast() {
        direction = "E";
    }

    private void setDirectionToWest() {
        direction = "W";
    }

    private void setDirectionToNorth() {
        direction = "N";
    }

    private void setDirectionToSouth() {
        direction = "S";
    }

    private void moveLeft(){
        if (direction.equalsIgnoreCase("N"))
            setDirectionToWest();
        else if (direction.equalsIgnoreCase("E"))
            setDirectionToNorth();
        else if (direction.equalsIgnoreCase("S"))
            setDirectionToEast();
        else if (direction.equalsIgnoreCase("W"))
            setDirectionToSouth();
    }

    private void moveRight(){
        if (direction.equalsIgnoreCase("N"))
            setDirectionToEast();
        else if (direction.equalsIgnoreCase("E"))
            setDirectionToSouth();
        else if (direction.equalsIgnoreCase("S"))
            setDirectionToWest();
        else if (direction.equalsIgnoreCase("W"))
            setDirectionToNorth();
    }

    private void move(){
        if (direction.equalsIgnoreCase("N"))
            y_coordinate++;
        else if (direction.equalsIgnoreCase("E"))
            x_coordinate++;
        else if (direction.equalsIgnoreCase("S"))
            y_coordinate--;
        else if (direction.equalsIgnoreCase("W"))
            x_coordinate--;
    }

    private void rove(char command) {
        switch (command) {
            case 'L':
                moveLeft();
                break;
            case 'R':
                moveRight();
                break;
            case 'M':
                move();
                break;
        }
    }
}
