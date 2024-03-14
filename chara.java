public class chara{
    
    //Char location 
    private int xloc;
    private int yloc;
    private int zloc;

    //Construtor 
    public chara(){ 
        xloc = 0;
        yloc = 0;
        zloc = 1;
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
    
    //Setters
    public void setXloc(int xloc){
        this.xloc = xloc;
    }
    public void setYloc(int yloc){
        this.yloc = yloc;
    }
    public void setZloc(int zloc){
        this.zloc = zloc;
    }
}
