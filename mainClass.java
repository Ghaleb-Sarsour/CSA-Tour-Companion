public class mainClass {

    public static void main(String[] args){

        //Creating all 3 floors
        int[][] floor1 = new int[9][6];
        int[][] floor2 = new int[10][7];
        int[][] floor3 = new int[9][5];

        //list of rooms on each floor
        int[] floor1rooms = {188, 184, 184, 0, 0, 0, 118, 172, 174, 192, 188, 188, 184, 0, 0, 0, 0, 0, 173, 191, 0, 1000, 1000, 1000, 1000, 144, 110, 2000, 113, 0, 189, 187, 0, 181, 145, 123, 121, 0, 0, 152, 0, 0, 0, 0, 147, 144, 0, 0, 0, 158, 0, 0, 0, 0, 147, 146, 0, 0, 0, 158};
        int[] floor2rooms = {};
        int[] floor3rooms = {};

        //Creating Object 
        Building IA = new Building(floor1, floor2, floor3);
        IA.setFloor(floor1, floor1rooms);
        int test = floor1[0][0];
        System.out.println(test);

    }
}
