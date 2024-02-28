import java.util.ArrayList;

public class classroom {
   private int number;
   private String name;
   private int x;
   private int y;
   private int z;
   private String teacher;
   private String descript;
   private ArrayList<classObjects> objects; 


    public classroom(int number, int x, int y, int z, String teacher, String name, String descript){
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = z;
        this.teacher = teacher;
        this.name = name;
        this.descript = descript;
        this.objects = new ArrayList<classObjects>();
}

    //Getters
    public int getNumber(){
        return number;
    }
    public int getXloc(){
        return x;
    }
    public int getYloc(){
        return y;
    }
    public int getZloc(){
        return z;
    }
    public String getTeacher(){
        return teacher;
    }
    public String getDescript(){
        return descript;
    }
    public String getName(){
        return name;
    }
    public ArrayList<classObjects> getObjects(){
        return objects;
    }

    //adders
   public void addObject(classObjects object){
        objects.add(object);
   } 

}
