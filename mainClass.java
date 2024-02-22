public class mainClass {

    public static void main(String[] args){

        //Creating all 3 floors
        int[][] floor1 = new int[7][10];
        int[][] floor2 = new int[8][11];
        int[][] floor3 = new int[6][10];

        //list of rooms on each floor
        int[] floor1rooms = {188, 184, 184, 0, 0, 0, 118, 172, 174, 192, 188, 188, 184, 0, 0, 0, 0, 0, 173, 191, 0, 1000, 1000, 1000, 1000, 144, 110, 2000, 113, 0, 189, 187, 183, 181, 0, 124, 122, 0, 0, 0, 189, 187, 0, 181, 145, 123, 121, 0, 0, 152, 0, 0, 0, 0, 147, 144, 0, 0, 0, 158, 0, 0, 0, 0, 147, 146, 0, 0, 0, 158};
        int[] floor2rooms = {};
        int[] floor3rooms = {};

        //Creating Object 
        Building IA = new Building(floor1, floor2, floor3);

        //Creating Floor 
        IA.setFloor(floor1, floor1rooms);
        
        for(int i = 0; i < floor1.length; i++){
            for(int j = 0; j < floor1[i].length; j++){
                System.out.print(floor1[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
