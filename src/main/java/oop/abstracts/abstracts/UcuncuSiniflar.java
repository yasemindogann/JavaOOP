package oop.abstracts;

public class UcuncuSiniflar extends ZorunluDersler{
    @Override
    public void matematik() {
        System.out.println("Üçüncü sınıflar için zorunlu matematik dersi.");
    }

    @Override
    public void turkce() {
        System.out.println("Üçüncü sınıflar için zorunlu turkce dersi.");
    }

    public void beden(){
        System.out.println("Üçüncü sınıflar için seçmeli beden dersi");
    }
}
