package oop.polimorphism.methodoverloading;

public class MethodOver {
    public static void main(String[] args) {

        //toplama(3,4)              --> İki argument ta int olduğu için 1 numaralı method'u seçecek
        //toplama(3, 4.6, 2)        --> argument'lar sırayla int, double, int olduğu için 6 numaralı method'u seçecek
        //toplama(5.7, 11.4, 8.5)   --> argument'lar sırayla double, double, double olduğu için uygun method bulamadı,
        //hata verecek.

        System.out.println(toplama(3, 4));           //7
        System.out.println(toplama(3, 4.0));         //7.0
        System.out.println(toplama(3.0, 4));         //7.0
        System.out.println(toplama(3.2, 4.0));       //7.2
        System.out.println(toplama(3, 4, 7));     //14
        System.out.println(toplama(3, 4.6, 2));   //9.6

    }

    //toplama(int a, int b)          --> Her birinin method signature'ı farklı oldu.
    //toplama(int a, int b, int c)   --> Her birinin method signature'ı farklı oldu.
    //toplama(double a, int b)       --> Her birinin method signature'ı farklı oldu.

    //1
    public static int toplama(int a, int b){
        return a+b;
    }

    //2
    public static int toplama(int a, int b, int c){
        return a+b+c;
    }

    //3
    public static double toplama(double a, int b){
        return a+b;
    }

    //4
    public static double toplama(double a, double b){
        return a+b;
    }

    //5
    public static double toplama(int a, double b){
        return a+b;
    }

    //6
    public static double toplama(int a, double b, int c){
        return a+b+c;
    }

}
