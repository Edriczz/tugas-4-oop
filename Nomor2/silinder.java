package Nomor2;

public class silinder extends lingkaran {
    private double tinggi;

    public silinder(double radius, String warna, double tinggi) {
        super(radius, warna);
        this.tinggi=tinggi;
    }

    public void setTinggi(double t){
        t=tinggi;
    }

    public double getTinggi(){
        return tinggi;
    }

    public double hitungVolume(){
        return super.hitungLuas()*tinggi;
    }

    public void printInfo(){
        System.out.println("Lingkaran "+warna+" volume = "+hitungVolume());
    }
}
