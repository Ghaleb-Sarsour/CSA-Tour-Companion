import java.util.*;

public class mainClass {
    public static void main(String[] args){
        
        //Creating all 3 floors
        int[][] floor1 = new int[7][10];
        int[][] floor2 = new int[8][11];
        int[][] floor3 = new int[6][10];

        //list of rooms on each floor 
        int[] floor1rooms = {188, 184, 184, 0, 0, 0, 118, 172, 174, 192, 188, 188, 184, 0, 0, 0, 0, 0, 173, 191, 0, 1000, 1000, 1000, 1000, 144, 110, 2000, 113, 0, 189, 187, 183, 181, 0, 124, 122, 0, 0, 0, 189, 187, 0, 181, 145, 123, 121, 0, 0, 152, 0, 0, 0, 0, 147, 144, 0, 0, 0, 158, 0, 0, 0, 0, 147, 146, 0, 0, 0, 158};
        int[] floor2rooms = {283, 281, 267, 265, 263, 0, 272, 274, 0, 292, 294, 284, 282, 268, 264, 0, 0, 273, 275, 277, 291, 293, 0, 0, 0, 0, 0, 210, 210, 210 ,210, 0, 0, 0, 0, 0, 224, 0, 0, 232, 236, 236, 252, 0, 0, 0, 0, 223, 0, 0, 233, 235, 251, 252, 0, 0, 0, 242, 0, 0, 0, 0, 0, 0, 0, 0, 0, 249, 244, 0, 0, 0, 0, 0, 253, 258, 0, 0, 249, 246, 0, 0, 0, 0, 0, 253, 258, 0};
        int[] floor3rooms = {383, 381, 367, 363, 0, 372, 372, 0, 392, 394, 384, 382, 364, 362, 0, 373, 375, 377, 391, 393, 0, 0, 0, 310, 310, 310, 0, 0, 0, 0, 0, 0, 324, 322, 0, 332, 334, 0, 0, 0, 345, 342, 0, 0, 301, 331, 333, 351, 354, 0, 349, 346, 0, 0, 0, 0, 0, 359, 356, 0};

        //Creating Object 
        Building IA = new Building(floor1, floor2, floor3);
        chara user = new chara();
        user.setZloc(3);
        
        //Creating Floor 
        IA.setFloor(floor1, floor1rooms);
        IA.setFloor(floor2, floor2rooms);
        IA.setFloor(floor3, floor3rooms);

        //Creating Classrooms:
        classroom IA188 = new classroom(188, -6, 2, 1, "rand teacher", "IA188",  "This is a cool office igess");

        ArrayList<classroom> classes = new ArrayList<classroom>();
        classes.add(IA188);
        //Main Area:

        
        boolean exit = false;
    do{
        Scanner console = new Scanner(System.in);
        System.out.println("You are currently at: " + user.getXloc() + " " + user.getYloc() + " " + user.getZloc());
        System.out.println("Where do you want to go?");
        int room = console.nextInt();

        for(classroom i : classes){
            if(i.getNumber() == room){
                System.out.println(i.getName());

                if(i.getZloc() == user.getZloc() && i.getYloc() == user.getYloc() && i.getXloc() == user.getXloc()){
                    System.out.println("You are already in this room.");
                }
                else{
                //Finding Zloc
                int z = i.getZloc() - user.getZloc();
                if (z > 0){
                    System.out.println("Move up " + z + " floors");
                }
                
                else if (z < 0){
                    System.out.println("Move down " + Math.abs(z) + " floors");
                }

                //Finding Xloc
                int x = i.getXloc() - user.getXloc();
                if (x > 0){
                    System.out.println("Move right " + x + " moves.");
                }

                else if (x < 0){
                    System.out.println("Move left " + Math.abs(x) + " moves");
                }
                
                //Finding Yloc
                int y = i.getYloc() - user.getYloc();
                if (y > 0){
                    System.out.println("Move forward " + y + " moves");
                }
                else if (y < 0){
                    System.out.println("Move backward " + Math.abs(y) + " moves");
                }
                user.setXloc(i.getXloc());
                user.setYloc(i.getYloc());
                user.setZloc(i.getZloc());
            }
        }
        }
        Scanner console2 = new Scanner(System.in);
        System.out.print("Do you want to exit? (y/n): ");
        String exitChoice = console2.nextLine();

        if(exitChoice.equalsIgnoreCase("y") || exitChoice.equalsIgnoreCase("yes")){
            exit = true;
        }
        else{
            exit = false;
        }
        
    }while(!exit);

    }
}
