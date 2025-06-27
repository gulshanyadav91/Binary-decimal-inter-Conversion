import java.util.Scanner;

public class binaryDecimall {

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int binary=sc.nextInt();
        int decimal=0;
        int ld; //last digit 
        int pow=0;
        while(binary>0){
            ld=binary%10;
            decimal=decimal + ld*((int)Math.pow(2, pow));

            binary=binary/10;
            pow++;


        }

        System.out.println("Your answer is : " + decimal);

        sc.close();

    }
    
}