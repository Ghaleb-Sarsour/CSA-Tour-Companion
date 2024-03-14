public class stairs {
    private int x1;
    private int y1;
    private int z1;

    private int x2;
    private int y2;
    private int z2;

    private int x3;
    private int y3;
    private int z3;
    private String stairName;

    private int avg;
    
    public stairs(String stairName, int x1, int y1, int z1, int x2, int y2, int z2, int x3, int y3, int z3){
        this.stairName = stairName;
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
        this.x3 = x3;
        this.y3 = y3;
        this.z3 = z3;
    }

    public String getStairName(){
        return stairName;
    }

    public int getXS(int i){
        if (i == 1){
            return x1;
        }
        else if (i == 2){
            return x2;
        }
        else{
            return x3;
        }
    }

    public int getYS(int i){
        if (i == 1){
            return y1;
        }
        else if(i == 2){
            return y2;
        }
        else{
            return y3;
        }
    }

    public int getZS(int i){
        if (i == 1){
            return z1;
        }
        else if (i == 2){
            return z2;
        }
        else{
            return z3;
        }
    }

    public void setAvg(int avg){
        this.avg = avg;
    }

    public int getAvg(){
        return avg;
    }
}



