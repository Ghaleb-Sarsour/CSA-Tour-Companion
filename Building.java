public class Building {
    
    //Creating each floor in public class Building {
    private int[][] floor1;
    private int[][] floor2;
    private int[][] floor3;
    
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
    

}



