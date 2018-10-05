public class Largest {

    public static void main(String[] args) {

        double n1 = -5.5, n2 = 1.6, n3 = 6.7;

        if( n2 >= n1 && n2 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n1 >= n2 && n1 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}