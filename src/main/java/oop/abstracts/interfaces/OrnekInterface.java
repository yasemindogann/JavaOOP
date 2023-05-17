package oop.abstracts.interfaces;

public interface OrnekInterface {

    //Interface içindeki field'lar otomatik olarak public, static ve final'dır.
    String name = "Yasemin";
    int yas = 12;

    //access modifier'ı default olarak "public"tir.
    //default olarak abstract'tır.
    //public abstract void deneme();
    void deneme1();

    default void deneme(){
        System.out.println("interface içinde tanımlanmış default metodu");
    }

}
