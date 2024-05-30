package Nomor2;
public class tesbentuk {
public static void main(String[] args) {
    lingkaran l1  = new lingkaran(4, "biru");
    silinder s1 = new silinder(4, "hitam", 5);

    //Uji Luas Lingkaran
    l1.printInfo();

    //Uji Volume Silinder
    s1.printInfo();
}
}
