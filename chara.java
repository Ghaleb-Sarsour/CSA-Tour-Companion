public class chara{
    
    //Char location 
    private int xloc;
    private int yloc;
    private int zloc;

    //Construtor 
    public chara(){ 
        xloc = 0;
        yloc = 0;
        zloc = 0;
        
    }

    public chara(int xloc, int yloc, int zloc){
        this.xloc = xloc;
        this.yloc = yloc;
    }

    //Getters 
    public int getXloc(){
        return xloc;
    }
    public int getYloc(){
        return yloc;
    }
    public int getZloc(){
        return zloc;
    }
    
    
}
