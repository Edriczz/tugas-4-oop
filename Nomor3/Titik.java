package Nomor3;

public class Titik {
    private int x;
    private int y;
    
    public Titik(){
        x=0;
        y=0;
    }
    public Titik(int x1, int y1){
        x=x1;
        y=y1;
    }
    public void titikGeser(int p){
        x=x+p;
        y=y+p;
    }
    public void infoKuadran(){
        if(x>0 && y>0){
            System.out.println("kuadran 1");
        } else if(x<0 && y>0){
            System.out.println("kuadran 2");
        } else if(x<0 && y<0){
            System.out.println("kuadran 3");
        } else if(x>0 && y<0){
            System.out.println("kuadran 4");
        } else if (x == 0) {
            System.out.println("The point is on the Y-axis");
        } else if (y == 0) {
            System.out.println("The point is on the X-axis");
        }
        else{
            System.out.println("The point is on the center O (0,0)");
            }
        }
    
    public double jarak(Titik p1){
        int dx = p1.x - this.x;
        int dy = p1.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public void skala(Titik p1){
        double scale = 0.5; //di skala kan sebeser 1/2 dari titik 2
        this.x = (int) ((this.x - p1.x) * scale + p1.x);
        this.y = (int) ((this.y - p1.y) * scale + p1.y);
    }
    public void printInfo(){
        System.out.println("titik x saat ini : "+x);
        System.out.println("titik y saat ini : "+y);
    }
}
