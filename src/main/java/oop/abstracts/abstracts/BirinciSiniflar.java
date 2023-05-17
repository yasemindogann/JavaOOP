package oop.abstracts;

public class BirinciSiniflar extends ZorunluDersler{
    @Override
    public void matematik() {
        //Method body'sini kendimize göre özelleştirdik.
        System.out.println("Birinci sınıflar için zorunlu matematik dersi.");
    }

    @Override
    public void turkce() {
        //Method body'sini kendimize göre özelleştirdik.
        System.out.println("Birinci sınıflar için zorunlu turkce dersi.");
    }

    public void muzik(){
        System.out.println("Birinci sınıflar için seçmeli müzik dersi");
    }

    //Parent'ının method'u ama kullanmak zorunda değil çünkü concrete method.
    @Override
    public void resim() {
        //super.resim();  //Bu şekilde bırakırsam parent'ının body'sini yazar.Yani çıktı "Resim seçmeli derstir." olur.
        System.out.println("Birinci sınıflar için seçmeli resim dersi"); //Kendime göre içeriği özelleştirdim
    }
}
