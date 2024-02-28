import java.util.ArrayList;

public class classObjects {
   private String name;
   private ArrayList<classObjects> subObjects;
   
   public classObjects(String name){
    this.name = name;
    this.subObjects = new ArrayList<classObjects>();
   }

   //Adders
   public void addSubObjects(classObjects subObject){
    subObjects.add(subObject);
   }

   //getters
   public String getName(){
    return name;
   }
   public ArrayList<classObjects> getSubObjects(){
    return subObjects;
   } 

}
