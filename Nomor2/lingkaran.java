package Nomor2;

public class lingkaran {
    private double radius;
    protected String warna;
    
    public lingkaran (double radius, String warna){
        this.radius=radius;
        this.warna=warna;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public double hitungLuas(){
        return 3.14*radius*radius;
    }

    public void printInfo(){
        System.out.println("Lingkaran "+warna+" luas : "+hitungLuas());
}
}
