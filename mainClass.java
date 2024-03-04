import java.util.*;

public class mainClass {
    public static void main(String[] args){
        
        //Creating Object 
        chara user = new chara();
        user.setZloc(3);
        
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
                    System.out.println("Move up " + z + " rooms");
                }
                
                else if (z < 0){
                    System.out.println("Move down " + Math.abs(z) + " rooms");
                }

                //Finding Xloc
                int x = i.getXloc() - user.getXloc();
                if (x > 0){
                    System.out.println("Move right " + x + " rooms");
                }

                else if (x < 0){
                    System.out.println("Move left " + Math.abs(x) + " rooms");
                }
                
                //Finding Yloc
                int y = i.getYloc() - user.getYloc();
                if (y > 0){
                    System.out.println("Move forward " + y + " rooms");
                }
                else if (y < 0){
                    System.out.println("Move backward " + Math.abs(y) + " rooms");
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
