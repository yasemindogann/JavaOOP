package oop.encapsulation;

public class Person {

    //public String tcNo = "11122233344";
    //public String hesapNo = "TR00000000000000000";

    private String tcNo = "11122233344";
    private String hesapNo = "TR00000000000000000";

    //Getter - Setter

    public String getTcNo() {
        return tcNo;
    }

    //Setter method'lar silinirse field'ların değeri değiştirilemez.
    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    //Setter method'lar silinirse field'ların değeri değiştirilemez.
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }
}
