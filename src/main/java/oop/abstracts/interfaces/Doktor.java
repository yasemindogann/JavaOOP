package oop.abstracts.interfaces;

public class Doktor implements Hastane {
    @Override
    public void kaydet() {
        System.out.println("Doktor başarıyla kaydedildi");
    }

    @Override
    public void sil() {
        System.out.println("Doktor başarıyla silindi");
    }

    @Override
    public void guncelle() {
        System.out.println("Doktor başarıyla güncellendi");
    }
}
