import java.util.ArrayList;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Main{
       public static void main(String[] args){
        //1st floor rooms
        Classroom room1881 = new Classroom(188, 1, "Denato", -6, 2, "Engineeering Room");
        Classroom room1841 = new Classroom(184, 1, "Dr. P", -5, 2, "Engineeering Room");
        Classroom room1842 = new Classroom(184, 1, "Dr. P", -4, 2, "Woodshop");
        Classroom musicTech = new Classroom(118, 1, "McCown and Vu", 0, 2, "Music Technology Room");
        Classroom room172 = new Classroom(172, 1, "", 1, 2, "Classroom");
        Classroom room174 = new Classroom(174, 1, "Mr. Hizny", 2, 2, "Classroom");
        Classroom visArtLab = new Classroom(192, 1, "Reid", 3, 2, "Visual Arts Lab");
        Classroom room1882 = new Classroom(188, 1, "Denato", -6, 1, "Engineering Classroom");
        Classroom room1883 = new Classroom(188, 1, "Denato", -5, 1, "3-D Printing Lab");
        Classroom room1843 = new Classroom(184, 1, "Dr. P", -4, 1, "Engineering Room");
        Classroom room173 = new Classroom(173, 1, "", 2, 1, "Career Center");
        Classroom room191 = new Classroom(191, 1, "Ms. Garth", 3, 1, "Media Arts Lab");
        Classroom launchpad1 = new Classroom(190, 1, "none", -5, 0, "Launchpad");
        Classroom launchpad2 = new Classroom(190, 1, "none", -4, 0, "Launchpad");
        Classroom launchpad3 = new Classroom(190, 1, "none", -3, 0, "Launchpad");
        Classroom launchpad4 = new Classroom(190, 1, "none", -2, 0, "Launchpad");
        Classroom hangar1 = new Classroom(144, 1, "none", -1, 0, "Hangar/cafeteria");
        Classroom gamingPod = new Classroom(110, 1, "none", 0, 0, "Gaming Pod");
        Classroom hangar2 = new Classroom(113, 1, "none", 1, 0, "Hangar/Cafeteria");
        Classroom hangar3 = new Classroom(113, 1, "none", 2, 0, "Hangar/Cafeteria");
        Classroom room1891 = new Classroom(189, 1, "Huntley", -6, -1, "Engineering Room");
        Classroom room1871 = new Classroom(187, 1, "Huntley", -5, -1, "Metal Working Lab");
        Classroom room183 = new Classroom(183, 1, "Huntley", -4, -1, "Engineering Room");
        Classroom room1811 = new Classroom(181, 1, "Reid", -3, -1, "Engineering Room");
        Classroom room124 = new Classroom(124, 1, "", -1, -1, "Classroom");
        Classroom room122 = new Classroom(122, 1, "none", 0, -1, "Lecture Hall");
        Classroom room1892 = new Classroom(189, 1, "Reid", -6, -2, "Engineering Room");
        Classroom room1872 = new Classroom(187, 1, "", -5, -2, "Engineering Room");
        Classroom room1812 = new Classroom(181, 1, "", -3, -2, "Engineering Room");
        Classroom room145 = new Classroom(145, 1, "", -2, -2, "Lab");
        Classroom room123 = new Classroom(123, 1, "Ms. Curry", -1, -2, "Classroom");
        Classroom room121 = new Classroom(121, 1, "Mr. Pomerance", 0, -2, "Classroom");
        Classroom fitnessRoom = new Classroom(152, 1, "none", 3, -2, "Fitness Room");
        Classroom room1471 = new Classroom(147, 1, "Mr. Fouts", -2, -3, "Lab");
        Classroom room144 = new Classroom(144, 1, "Ms. Cramer", -1, -3, "Classroom");
        Classroom fitnessRoom2 = new Classroom(158, 1, "none", 3, -3, "Fitness Room");
        Classroom room1472 = new Classroom(147, 1, "Mr. Fouts", -2, -4, "Lab");
        Classroom room146 = new Classroom(146, 1, "Ms. Cramer", -1, -4, "Lab");
        Classroom fitnessRoom3 = new Classroom(158, 1, "none", 3, -4, "Fitness Room");

        //2nd floor rooms
        Classroom room283 = new Classroom(283, 2, "", -5, 2, "Classroom");
        Classroom room281 = new Classroom(281, 2, "", -4, 2, "Classroom");
        Classroom room267 = new Classroom(267, 2, "Mr. Lynch", -3, 2, "Classroom");
        Classroom room265 = new Classroom(265, 2, "Mr. Proctor", -2, 2, "Classroom");
        Classroom room263 = new Classroom(263, 2, "Ms. Velazquez", -1, 2, "Classroom");
        Classroom room272 = new Classroom(272, 2, "Mr. Gillicuddy", 1, 2, "Classroom");
        Classroom room274 = new Classroom(274, 2, "Mr. Sporer", 2, 2, "Classroom");
        Classroom room292 = new Classroom(292, 2, "", 4, 2, "Classroom");
        Classroom room294 = new Classroom(294, 2, "", 5, 2, "Classroom");
        Classroom room284 = new Classroom(284, 2, "", -5, 1, "Classroom");
        Classroom room282 = new Classroom(282, 2, "", -4, 1, "Classroom");
        Classroom room268 = new Classroom(268, 2, "", -3, 1, "Classroom");
        Classroom room264 = new Classroom(264, 2, "", -2, 1, "Teacher Planning");
        Classroom room273 = new Classroom(273, 2, "", 1, 1, "Classroom");
        Classroom room275 = new Classroom(275, 2, "", 2, 1, "Classroom");
        Classroom room277 = new Classroom(277, 2, "", 3, 1, "Classroom");
        Classroom room291 = new Classroom(291, 2, "", 4, 1, "Classroom");
        Classroom room293 = new Classroom(293, 2, "", 5, 1, "Classroom");
        Classroom exchange1 = new Classroom(210, 2, "Ms. Beam", 0, 0, "Exchange");
        Classroom exchange2 = new Classroom(210, 2, "Ms. Bean", 1, 0, "Exchange");
        Classroom exchange3 = new Classroom(210, 2, "Ms. Beam", 2, 0, "Exchange");
        Classroom exchange4 = new Classroom(210, 2, "Ms. Beam", 3, 0, "Exchange");
        Classroom biotechLab = new Classroom(224, 2, "Mr. Kuhn", -2, -1, "Biotech Lab");
        Classroom makerSpace = new Classroom(232, 2, "Ms. Beam", 1, -1, "Makerspace");
        Classroom gameDesign1 = new Classroom(236, 2, "Coach Heying", 2, -1, "Game Design Lab");
        Classroom gameDesign2 = new Classroom(236, 2, "Coach Heying", 3, -1, "Game Design Lab");
        Classroom networkingLab1 = new Classroom(252, 2, "Mr. Widmann", 4, -1, "Networking Lab");
        Classroom room223 = new Classroom(223, 2, "", -2, -2, "Classroom");
        Classroom room233 = new Classroom(233, 2, "Mr. Kuhn", 1, -2, "Classroom");
        Classroom room235 = new Classroom(235, 2, "", 2, -2, "Classroom");
        Classroom internetOfThings = new Classroom(251, 2, "Widmann", 3, -2, "Internet of Things");
        Classroom networkingLab2 = new Classroom(252, 2, "Widmann", 4, -2, "Networking Lab");
        Classroom healthITlab = new Classroom(242, 2, "Ms. Holmes", -3, -3, "Health IT Lab");
        Classroom surgTech1 = new Classroom(249, 2, "Ms. Dawes", -4, -4, "Surgical Tech Lab");
        Classroom room244 = new Classroom(244, 2, "Mr. Collins", -3, -4, "Classroom");
        Classroom room2531 = new Classroom(253, 2, "", 3, -4, "IT Classroom");
        Classroom cyberLab1 = new Classroom(258, 2, "Ms. Whitlock", 4, -4, "Cyber Lab");
        Classroom surgTech2 = new Classroom(249, 2, "Ms. Dawes", -4, -5, "Surgical Tech Lab");
        Classroom room246 = new Classroom(246, 2, "Dr. Gingrich", -3, -5, "Classroom");
        Classroom room2532 = new Classroom(253, 2, "", 3, -5, "IT Classroom");
        Classroom room2582 = new Classroom(258, 2, "Ms. Whitlock", 4, -5, "Cyber Lab");

        //3rd floor rooms
        Classroom room383 = new Classroom(383, 3, "", -4, 2, "Classroom");
        Classroom room381 = new Classroom(381, 3, "", -3, 2, "Classroom");
        Classroom room367 = new Classroom(367, 3, "Mr. Seals", -2, 2, "Physics Lab");
        Classroom room363 = new Classroom(363, 3, "Ms. Paxton", -1, 2, "Physics Lab");
        Classroom northstar1 = new Classroom(372, 3, "none", 1, 2, "Northstar");
        Classroom northstar2 = new Classroom(372, 3, "none", 2, 2, "Northstar");
        Classroom room392 = new Classroom(392, 3, "", 4, 2, "Classroom");
        Classroom room394 = new Classroom(394, 3, "", 5, 2, "Classroom");
        Classroom room384 = new Classroom(384, 3, "", -4, 1, "Classroom");
        Classroom room382 = new Classroom(382, 3, "", -3, 1, "Classroom");
        Classroom room364 = new Classroom(364, 3, "Mr. Jones", -2, 1, "Physics Lab");
        Classroom room362 = new Classroom(362, 3, "Ms. Nilson", -1, 1, "Classroom");
        Classroom room373 = new Classroom(373, 3, "Ms. Jones", 1, 1, "Classroom");
        Classroom room375 = new Classroom(375, 3, "Mr. Custar", 2, 1, "Classroom");
        Classroom room377 = new Classroom(377, 3, "Ms. Lundy", 3, 1, "Classroom");
        Classroom room391 = new Classroom(391, 3, "Ms. Willis", 4, 1, "Classroom");
        Classroom room393 = new Classroom(393, 3, "Dr. Gingrich", 5, 1, "Classroom");
        Classroom exchange31 = new Classroom(310, 3, "Ms. Beam", -1, 0, "Exchange");
        Classroom exchange32 = new Classroom(310, 3, "Ms. Beam", 0, 0, "Exchange");
        Classroom exchange33 = new Classroom(310, 3, "Ms. Beam", 1, 0, "Exchange");
        Classroom room324 = new Classroom(324, 3, "Mr. Clayton", -2, -1, "Classroom");
        Classroom room322 = new Classroom(322, 3, "Ms. Rosner", -1, -1, "Classroom");
        Classroom room332 = new Classroom(332, 3, "Ms. Callahan", 1, -1, "Classroom");
        Classroom room334 = new Classroom(334, 3, "Mr. Bongiorno", 2, -1, "Classroom");
        Classroom room345 = new Classroom(345, 3, "Mr. Marbry", -4, -2, "Chemistry Lab");
        Classroom room342 = new Classroom(342, 3, "Mr. Weigand", -3, -2, "Chemistry Lab");
        Classroom extendedLearning = new Classroom(301, 3, "Ms. Taylor", 0, -2, "Extended Learning");
        Classroom room331 = new Classroom(331, 3, "Mr. Brown", 1, -2, "Classroom");
        Classroom room333 = new Classroom(333, 3, "Mr. Pomerance", 2, -2, "Classroom");
        Classroom room351 = new Classroom(351, 3, "Ms. Taha", 3, -2, "Biology Lab");
        Classroom room354 = new Classroom(354, 3, "Ms. Taha", 4, -2, "Biology Lab");
        Classroom room349 = new Classroom(349, 3, "Mr. Calhoun", -4, -3, "Chemistry Lab");
        Classroom room346 = new Classroom(346, 3, "", -3, -3, "Chemistry Lab");
        Classroom room359 = new Classroom(359, 3, "Dr. Berkemeier", 3, -3, "Biology Lab");
        Classroom room356 = new Classroom(356, 3, "Dr. Berkemeier", 4, -3, "Biology Lab");

        //Arraylist of classrooms
        ArrayList<Classroom> rooms = new ArrayList<Classroom>();
        rooms.add(room1881);
        rooms.add(room1841);
        rooms.add(room1842);
        rooms.add(musicTech);
        rooms.add(room172);
        rooms.add(room174);
        rooms.add(visArtLab);
        rooms.add(room1882);
        rooms.add(room1883);
        rooms.add(room1843);
        rooms.add(room173);
        rooms.add(room191);
        rooms.add(launchpad1);
        rooms.add(launchpad2);
        rooms.add(launchpad3);
        rooms.add(launchpad4);
        rooms.add(hangar1);
        rooms.add(gamingPod);
        rooms.add(hangar2);
        rooms.add(hangar3);
        rooms.add(room1891);
        rooms.add(room1871);
        rooms.add(room183);
        rooms.add(room1811);
        rooms.add(room124);
        rooms.add(room122);
        rooms.add(room1892);
        rooms.add(room1872);
        rooms.add(room1812);
        rooms.add(room145);
        rooms.add(room123);
        rooms.add(room121);
        rooms.add(fitnessRoom);
        rooms.add(room1471);
        rooms.add(room144);
        rooms.add(fitnessRoom2);
        rooms.add(room1472);
        rooms.add(room146);
        rooms.add(fitnessRoom3);
        
        rooms.add(room283);
        rooms.add(room281);
        rooms.add(room267);
        rooms.add(room265);
        rooms.add(room263);
        rooms.add(room272);
        rooms.add(room274);
        rooms.add(room292);
        rooms.add(room294);
        rooms.add(room284);
        rooms.add(room282);
        rooms.add(room268);
        rooms.add(room264);
        rooms.add(room273);
        rooms.add(room275);
        rooms.add(room277);
        rooms.add(room291);
        rooms.add(room293);
        rooms.add(exchange1);
        rooms.add(exchange2);
        rooms.add(exchange3);
        rooms.add(exchange4);
        rooms.add(biotechLab);
        rooms.add(makerSpace);
        rooms.add(gameDesign1);
        rooms.add(gameDesign2);
        rooms.add(networkingLab1);
        rooms.add(room223);
        rooms.add(room233);
        rooms.add(room235);
        rooms.add(internetOfThings);
        rooms.add(networkingLab2);
        rooms.add(healthITlab);
        rooms.add(surgTech1);
        rooms.add(room244);
        rooms.add(room2531);
        rooms.add(cyberLab1);
        rooms.add(surgTech2);
        rooms.add(room246);
        rooms.add(room2532);
        rooms.add(room2582);
        
        rooms.add(room383);
        rooms.add(room381);
        rooms.add(room367);
        rooms.add(room363);
        rooms.add(northstar1);
        rooms.add(northstar2);
        rooms.add(room392);
        rooms.add(room394);
        rooms.add(room384);
        rooms.add(room382);
        rooms.add(room364);
        rooms.add(room362);
        rooms.add(room373);
        rooms.add(room375);
        rooms.add(room377);
        rooms.add(room391);
        rooms.add(room393);
        rooms.add(exchange31);
        rooms.add(exchange32);
        rooms.add(exchange33);
        rooms.add(room324);
        rooms.add(room322);
        rooms.add(room332);
        rooms.add(room334);
        rooms.add(room345);
        rooms.add(room342);
        rooms.add(extendedLearning);
        rooms.add(room331);
        rooms.add(room333);
        rooms.add(room351);
        rooms.add(room354);
        rooms.add(room349);
        rooms.add(room346);
        rooms.add(room359);
        rooms.add(room356);
       
        //Adding user
        chara user = new chara();
        int input = 1;
        Scanner console = new Scanner(System.in);
        int roomNumI;
        
        //Image Icons
        ImageIcon iconEng = new ImageIcon("Engineering.jpg.jpeg");
        ImageIcon iconPhysics = new ImageIcon("Physics.jpg.jpeg");
        ImageIcon iconExchange = new ImageIcon("exchange.jpg.jpeg");
        ImageIcon iconHangar = new ImageIcon("Hangar.jpg.jpeg");
        //Images
        Images enginnering = new Images(iconEng);
        Images physics = new Images(iconPhysics);
        Images exchange = new Images(iconExchange);
        Images hangar = new Images(iconHangar);

        //Main loop
        System.out.println("Welcome to the IA tour companion!");
        System.out.println("Input 0 at any time to exit the application\n");
        System.out.println("Input 1 to enter a room");
        do{
            System.out.println("Which room do you want to go to?");
            input = console.nextInt();
            roomNumI = input;
            for(Classroom c : rooms){
                if(c.getRoomNum() == input){
                    calcPOS(c, user);

                    System.out.println("Do you want to enter room " + c.getRoomNum() + "?: ");
                    input = console.nextInt();
                    if(input == 1){
                        System.out.println("Room " + c.getRoomNum() + " is the " + c.getDescription() + " room and is taught by: " + c.getTeacher());
                        
                        
                        if(roomNumI == 144 || roomNumI == 113){
                            hangar.start();
                            //Hangar interaction
                            System.out.print("Enter any number to exit: ");
                            input = console.nextInt();
                        }
                        else if(roomNumI == 188 || roomNumI ==184 || roomNumI == 189 || roomNumI == 187 || roomNumI == 181){
                            enginnering.start();
                            //Run Engineering Interaction
                            System.out.print("Enter any number to exit: ");
                            input = console.nextInt();
                        }
                        
                        else if(roomNumI == 210){
                            exchange.start();
                            //Exchange Interaction
                            System.out.print("Enter any number to exit: ");
                            input = console.nextInt();
                        }
                        else if (roomNumI == 367 || roomNumI == 363){
                            physics.start();
                            //Engineering Interaction
                            System.out.print("Enter any number to exit: ");
                            input = console.nextInt();
                        }   
                    }
                   hangar.quit();
                   enginnering.quit();
                   exchange.quit(); 
                   hangar.quit();
                }
            }
        }while(input != 0);
    }




    //calculating POS
    public static void calcPOS(Classroom room, chara user){

        //Setting Stairs
        stairs stair1 = new stairs("Stair One", -3, 2, 1, -6, 2, 2, -5, 2, 3);
        stairs stair2 = new stairs("Stair Two", 4, 2, 1, 6, 2, 2, 6, 2, 3);
        stairs stair3 = new stairs("Stair Three", -7, -4, 1, -3, -6, 2, -3, -4, 3);
        stairs stair4 = new stairs("Stair Four", 2, -5, 1, 3, -6, 2, 3, -4, 3);
        ArrayList<stairs> stairsList = new ArrayList<stairs>();
        stairsList.add(stair1);
        stairsList.add(stair2);
        stairsList.add(stair3);
        stairsList.add(stair4);

        //Getting User X,Y,Z
        int UserX = user.getXloc();
        int UserY = user.getYloc();
        int UserZ = user.getZloc();

        //Getting Room X,Y,Z
        int RoomX = room.getX();
        int RoomY = room.getY();
        int RoomZ = room.getFloor();

        //Checking if user is already in room
        if(UserX == RoomX && UserY == RoomY && UserZ == RoomZ){
            System.out.println("You are already in this room.");
        }
        
        //Calculation
        else{
            if(UserZ != RoomZ){
                int Stair1avg = (stair1.getXS(UserZ) - UserX) + (stair1.getYS(UserZ) - UserY);
                int Stair2avg = (stair2.getXS(UserZ) - UserX) + (stair2.getYS(UserZ) - UserY);
                int Stair3avg = (stair3.getXS(UserZ) - UserX) + (stair3.getYS(UserZ) - UserY);
                int Stair4avg = (stair4.getXS(UserZ) - UserX) + (stair3.getYS(UserZ) - UserY);
                stair1.setAvg(Stair1avg);
                stair2.setAvg(Stair2avg);
                stair3.setAvg(Stair3avg);
                stair4.setAvg(Stair4avg);
                int min = 100;

                for(stairs i : stairsList){
                    if(i.getAvg() < min){
                        min = i.getAvg();
                    }
                }
                for(stairs j : stairsList){
                    if(j.getAvg() == min){
                        int Xsloc = j.getXS(UserZ) - UserX;
                        int Ysloc = j.getYS(UserZ) - UserY;
                        int StairsUp = RoomZ - UserZ;

                        if(Xsloc < 0){
                            System.out.println("You have to move " + Math.abs(Xsloc) + " rooms left.");
                        }
                        else if(Xsloc > 0){
                            System.out.println("You have to move " + Math.abs(Xsloc) + " rooms right");
                        }

                        if(Ysloc < 0){
                            System.out.println("You hav to move " + Math.abs(Ysloc) + " rooms backward");
                        }
                        else if(Ysloc > 0){
                            System.out.println("You have to move " + Math.abs(Ysloc) + " rooms backward");
                        }

                        if(StairsUp < 0){
                            System.out.println("You have to move " + Math.abs(StairsUp) + " floors down to floor " + RoomZ);
                        }
                        else if(StairsUp > 0){
                            System.out.println("You have to move " + Math.abs(StairsUp) + " floors up to floor " + RoomZ);
                        }
                        user.setXloc(j.getXS(RoomZ));
                        user.setYloc(j.getYS(RoomZ));
                        user.setZloc(j.getZS(RoomZ));
                        UserX = user.getXloc();
                        UserY = user.getYloc();
                        UserZ = user.getZloc();

                        System.out.println("You are now at: " + user.getXloc() + ", " + user.getYloc() + ", " + user.getZloc());
                    }
                }
            }

            int Xloc = RoomX - UserX;
            int Yloc = RoomY - UserY;

            if(Xloc < 0){
                System.out.println("You have to move " + Math.abs(Xloc) + " rooms left");
            }
            else if(Xloc > 0){
                System.out.println("You have to move " + Math.abs(Xloc) + " rooms right");
            }

            if(Yloc < 0 ){
                System.out.println("You have to move " + Math.abs(Yloc) + " rooms backward");
            }
            else if(Yloc > 0){
                System.out.println("You have to move " + Math.abs(Yloc) + " rooms forward");
            }
            
            user.setXloc(RoomX);
            user.setYloc(RoomY);
            user.setZloc(RoomZ);
            System.out.println("You are now at: " + user.getXloc() + ", " + user.getYloc() + ", " + user.getZloc());

        }
    }
} 