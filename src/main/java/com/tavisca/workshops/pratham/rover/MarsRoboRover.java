package com.tavisca.workshops.pratham.rover;

public class MarsRoboRover {
    private static int y_coordinate = 0;
    private static int x_coordinate = 0;
    private static String direction = "";

    public static void main(String[] args) {
        
        MarsRoboRover rover = new MarsRoboRover();
        rover.getCurrentPosition(3,3,"E");
        String commands = "MMRMMRMRRM";
        rover.getCommand(commands);

        System.out.println("currentPosition..." + x_coordinate + " " + y_coordinate + " " + direction);
        System.out.println("commands..." + commands);
        System.out.println("newPosition..." + x_coordinate + " " + y_coordinate + " " + direction);
    }
    
    private void getCurrentPosition(int x_coordinate, int y_coordinate, String direction ){
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.direction = direction;
    }

    private void getCommand(String command){
        for (char eachCommand : command.toCharArray()) {
            rove(eachCommand);
        }
    }

    private void setDirectionToEast(){
        direction = "E";
    }

    private void setDirectionToWest(){
        direction = "W";
    }

    private void setDirectionToNorth(){
        direction = "N";
    }

    private void setDirectionToSouth(){
        direction = "S";
    }

    private void rove(char command) {
        if (direction.equalsIgnoreCase("N")) {
            switch (command) {
                case 'L':
                    setDirectionToWest();
                    break;
                case 'R':
                    setDirectionToEast();
                    break;
                case 'M':
                    y_coordinate++;
                    break;
            }
        } else if (direction.equalsIgnoreCase("E")) {
            switch (command) {
                case 'L':
                    setDirectionToNorth();
                    break;
                case 'R':
                    setDirectionToSouth();
                    break;
                case 'M':
                    x_coordinate++;
                    break;
            }
        } else if (direction.equalsIgnoreCase("S")) {
            switch (command) {
                case 'L':
                    setDirectionToEast();
                    break;
                case 'R':
                    setDirectionToWest();
                    break;
                case 'M':
                    y_coordinate--;
                    break;
            }
        } else if (direction.equalsIgnoreCase("W")) {
            switch (command) {
                case 'L':
                    setDirectionToSouth();
                    break;
                case 'R':
                    setDirectionToNorth();
                    break;
                case 'M':
                    x_coordinate--;
                    break;
            }
        }
    }
}
