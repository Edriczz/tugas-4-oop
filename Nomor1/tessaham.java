package Nomor1;
public class tessaham {
public static void main(String[] args) {
    saham x = new saham("HKN", "Harta Ku");
        x.setpriorClosingprice(34.50);
        x.setcurrentPrice(34.35);;
        System.out.println("persentase perubahan harga = "+x.getChangePercent()+" %");
}
}
