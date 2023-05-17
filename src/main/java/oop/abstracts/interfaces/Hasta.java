package oop.abstracts.interfaces;

public class Hasta implements Hastane {
    @Override   //parent'taki method'u override ettik
    public void kaydet() {
        //Boş gelen method body'sini doldurduk.
        System.out.println("Hasta başarıyla kaydedildi");
    }

    @Override   //parent'taki method'u override ettik
    public void sil() {
        //Boş gelen method body'sini doldurduk.
        System.out.println("Hasta başarıyla silindi");
    }

    @Override   //parent'taki method'u override ettik
    public void guncelle() {
        //Boş gelen method body'sini doldurduk.
        System.out.println("Hasta başarıyla güncellendi");
    }
}
