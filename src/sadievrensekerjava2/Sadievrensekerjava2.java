package sadievrensekerjava2;

public class Sadievrensekerjava2 {


    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("merhaba Furkan");
        insan veli;
        calisan ali = new calisan();
        ali.boy = 180;
        ali.kilo = 80;
        ali.yas =22;
        
        System.out.println("Ali'nin yasi: "+ ali.yas + "   Ali'nin boyu: " + ali.boy + "   Ali'nin kilosu: "+ali.kilo);
        
       
        //veli.boy = 170;
        //veli.kilo = 70;
        //veli.yas = 23;
        
        //System.out.println("Veli'nin yasi: "+ veli.yas + "   Veli'nin boyu: " + veli.boy + "   Veli'nin kilosu: "+veli.kilo);
        
        ali.yemek();
        //veli.yemek();
        
        System.out.println("Ali'nin yasi: "+ ali.yas + "   Ali'nin boyu: " + ali.boy + "   Ali'nin kilosu: "+ali.kilo);
        //System.out.println("Veli'nin yasi: "+ veli.yas + "   Veli'nin boyu: " + veli.boy + "   Veli'nin kilosu: "+veli.kilo);
    
        ali.maas = 100;
        ali.zam (20);

        System.out.println("Ali'nin maasi: "+ali.maas);
        
        ali.zam(30);
        System.out.println("Ali'nin maasi: "+ali.maas);
    }
}
