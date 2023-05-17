package question;
public class Q01 {
    public static void main(String[] args) {

        System.out.println(result());

    }
    
    public static double result(){

        double sum1 = 0.0;
        double sum2 = 0.0;

        for (int i = 300; i < 501; i++) {
            sum1+=i;
        }

        for (int i = 1; i < 101; i++) {
            sum2+=i;
        }

        return sum1/sum2;
    }
    
}

