package oop.inheritance;

public class KusMain {
    public static void main(String[] args) {

        Tavuk tavuk = new Tavuk();
        tavuk.beslenme();


    }
}

/*
        //Parent class kendi method'larını kullanabilir ama çocuklarının method'larını ve variable'larını kullanamaz.
        Kus kus = new Kus();
        kus.tugRengi = "Renkli";
        System.out.println(kus.tugRengi);          //Renkli
        kus.yumurtaSayisi = 2;
        System.out.println(kus.yumurtaSayisi);     //2
        kus.beslenme();                            //Bütün kuşlar beslenir.
        //kus.yuzebilirMi();                       //Hata


        //Child class hem kendi hem de parent'ının method'larını ve variable'larını kullanabilir.
        Papagan papagan = new Papagan();
        papagan.beslenme();                        //Bütün kuşlar beslenir.

        Ordek ordek = new Ordek();
        ordek.yuzebilirMi();                       //Ördekler yüzebilir.
        ordek.tugRengi = "Beyaz";                  //Değer ataması yaptık.
        System.out.println(ordek.tugRengi);        //Beyaz

        Tavuk tavuk = new Tavuk();
        tavuk.beslenme();                          //Bütün kuşlar beslenir.
        tavuk.evcilMi();                           //Tavuklar evcildir.
        tavuk.yumurtaSayisi = 1;                   //Değer ataması yaptık.
        System.out.println(tavuk.yumurtaSayisi);   //1
        tavuk.tugRengi = "Gri";                    //Değer ataması yaptık.
        System.out.println(tavuk.tugRengi);        //Gri


    }
}
*/