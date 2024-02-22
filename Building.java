public class Building {
    
    //Creating each floor in public class Building {
    private int[][] floor1;
    private int[][] floor2;
    private int[][] floor3;

    //Location
    private int x;
    private int y;
    
    //Constructor creating object 
    public Building(int[][] floor1, int[][] floor2, int[][] floor3){
        floor1 = this.floor1;
        floor2 = this.floor2;
        floor3 = this.floor3;
    }
    
    //Setting the rooms of a floor 
    public void setFloor(int[][] floor, int[] floorRooms){
        int counter = 0;
        for(int i = 0; i < floor.length; i++){
            for(int j = 0; j < floor[i].length; j++){
                floor[i][j] = floorRooms[counter];
                counter++;
            }
        }
    }

    //Find coordinate of room
    public void setLocation(int[][] floor, int room){
        for(int i = 0; i < floor.length; i++){
            for(int j = 0; j < floor[i].length; j++){
                if(floor[i][j] == room){
                    x = j;
                    y = i;
                }
            }
        }
    }

    //Getting coordinates
    public int getX(){
        return x + 1;
    }
    public int getY(){
        return y + 1;
    }
    

}



