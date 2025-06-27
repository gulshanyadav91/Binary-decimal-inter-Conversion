import java.util.Scanner;

public class decimalBinary {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int decimal=sc.nextInt();

        String binary="";
        int rem;
        while (decimal>0) {
            rem=decimal%2;
            binary=binary + rem;
            decimal=decimal/2;
        }

        System.out.println("Your answer in the binary is :  " + binary);
    


    }

}
