package com.tavisca.workshops.pratham.rover;

public class MarsRoboRover {
    private static int y_coordinate = 0;
    private static int x_coordinate = 0;
    private static String direction = "";

    public static void main(String[] args) {
        
        MarsRoboRover rover = new MarsRoboRover();
        rover.getCurrentPosition(3,3,"E");
        String commands = "MMRMMRMRRM";

        System.out.println("currentPosition..." + x_coordinate + " " + y_coordinate + " " + direction);

        for (char command : commands.toCharArray()) {
            rove(command);
        }

        System.out.println("commands..." + commands);
        System.out.println("newPosition..." + x_coordinate + " " + y_coordinate + " " + direction);
    }
    
    private void getCurrentPosition(int x_coordinate, int y_coordinate, String direction ){
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.direction = direction;
    }

    private static void rove(char command) {
        if (direction.equalsIgnoreCase("N")) {
            switch (command) {
                case 'L':
                    direction = "W";
                    break;
                case 'R':
                    direction = "E";
                    break;
                case 'M':
                    y_coordinate++;
                    break;
            }
        } else if (direction.equalsIgnoreCase("E")) {
            switch (command) {
                case 'L':
                    direction = "N";
                    break;
                case 'R':
                    direction = "S";
                    break;
                case 'M':
                    x_coordinate++;
                    break;
            }
        } else if (direction.equalsIgnoreCase("S")) {
            switch (command) {
                case 'L':
                    direction = "E";
                    break;
                case 'R':
                    direction = "W";
                    break;
                case 'M':
                    y_coordinate--;
                    break;
            }
        } else if (direction.equalsIgnoreCase("W")) {
            switch (command) {
                case 'L':
                    direction = "S";
                    break;
                case 'R':
                    direction = "N";
                    break;
                case 'M':
                    x_coordinate--;
                    break;
            }
        }
    }
}
