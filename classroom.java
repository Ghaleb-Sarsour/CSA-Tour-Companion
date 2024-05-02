import java.util.ArrayList;

class Classroom{
    private int roomNumber;
    private int floor;
    private String teacher;
    private int xCoordinate;
    private int yCoordinate;
    private String description;
    private String[] objects;

    public Classroom(int roomNumber, int floor, String teacher, int xCoordinate, int yCoordinate, String description){
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.teacher = teacher;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.description = description;
        this.objects = new String[5];
    }

    public int getRoomNum(){
        return roomNumber;
    }

    public int getFloor(){
        return floor;
    }

    public String getTeacher(){
        return teacher;
    }

    public int getX(){
        return xCoordinate;
    }

    public int getY(){
        return yCoordinate;
    }

    public String getDescription(){
        return description;
    }

    public void getObjects(){
        for(String i:objects){
            System.out.print(i + " ");
        }
        
    }

    public void setObjectsList(String[] objects){
        this.objects = objects;
    }
}
