package oop.abstracts;

public abstract class ZorunluDersler {

    //Zorunlu ders
    //abstract method(body'siz method)
    public abstract void matematik();

    //Zorunlu ders
    //abstract method(body'siz method)
    public abstract void turkce();

    //Seçmeli ders
    //concrete method(body'li method)
    public void resim(){
        System.out.println("Resim seçmeli derstir.");
    }

}
