package oop.abstracts.interfaces;
public class Main {
    public static void main(String[] args) {

        //Hastane hastane = new Hastane();
        //Java interface'den obje üretilmesine izin vermez.
        //Çünkü interface'in constructor'ı yoktur.

        Hasta hasta1 = new Hasta();
        hasta1.kaydet();    //Hasta başarıyla kaydedildi
        hasta1.sil();       //Hasta başarıyla silindi
        hasta1.guncelle();  //Hasta başarıyla güncellendi

        Doktor doktor1 = new Doktor();
        doktor1.kaydet();   //Doktor başarıyla kaydedildi
        doktor1.sil();      //Doktor başarıyla silindi
        doktor1.guncelle(); //Doktor başarıyla güncellendi


        //Interface içindeki variable'lar interface adı ile çağırılır.
        //Çünkü otomatik olarak static ve final'dır.
        System.out.println(OrnekInterface.name);
        System.out.println(OrnekInterface.yas);

    }
}
