package oop.encapsulation;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person();
        //setter method olduğu için variable'ı değiştirebildim.
        person.setHesapNo("TR111111111111");
        System.out.println(person.getHesapNo());    //TR111111111111

        System.out.println(person.getTcNo());       //11122233344

    }
}
