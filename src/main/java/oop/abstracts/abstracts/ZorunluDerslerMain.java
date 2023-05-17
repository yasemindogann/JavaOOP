package oop.abstracts.abstracts;

public class ZorunluDerslerMain {
    public static void main(String[] args) {

        //ZorunluDersler dersler = new ZorunluDersler();
        //abstract class'tan obje üretemem. abstract class'ın constructor'ı vardır ama içinde
        //body'siz methodlar olduğu için yarım class sayılır.Bu yüzden Java abstract class'tan obje üretmesine izin vermez.


        BirinciSiniflar birinci = new BirinciSiniflar();
        birinci.matematik();    //parent'ının zorunlu methodu
        birinci.turkce();       //parent'ının zorunlu methodu
        birinci.muzik();        //kendi methodu
        birinci.resim();        //parent'ının seçmeli methodu (kullanmak zorunda değil)

        IkinciSiniflar ikinci = new IkinciSiniflar();
        ikinci.matematik();    //parent'ının zorunlu methodu
        ikinci.turkce();       //parent'ının zorunlu methodu
        ikinci.resim();        //parent'ının seçmeli methodu (kullanmak zorunda değil)

        UcuncuSiniflar ucuncu = new UcuncuSiniflar();
        ucuncu.matematik();    //parent'ının zorunlu methodu
        ucuncu.turkce();       //parent'ının zorunlu methodu
        ucuncu.resim();        //parent'ının seçmeli methodu (kullanmak zorunda değil)
        ucuncu.beden();        //kendi methodu

    }
}
