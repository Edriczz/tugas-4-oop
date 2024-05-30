package Nomor1;
public class saham {
    private String simbol;
    private String nama;
    private double priorClosingprice;
    private double currentPrice;

    public saham (String simbol,String nama){
        this.simbol=simbol;
        this.nama=nama;
    }
    public double getChangePercent(){
        return ((currentPrice-priorClosingprice)/priorClosingprice)*100;
    }
    public void setsimbol(String simbol){
        this.simbol=simbol;
    }
    public String getsimbol(){
        return simbol;   
    }
    public void setnama(String nama){
        this.nama=nama;   
    }
    public String getnama(){
        return nama;
    }
    public void setpriorClosingprice(double priorClosingprice){
        this.priorClosingprice=priorClosingprice;
    }
    public double getpriorClosingprice(){
        return priorClosingprice;
    }
    public void setcurrentPrice(double setcurrentPrice){
        this.currentPrice=currentPrice;
    }
    public double getcurrentprice(){
        return currentPrice;
    }


}
