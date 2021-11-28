package First_Java_Program;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n<=1){
            System.out.println("Neither prime nor Composite");
            return;
        }
        int c = 2;
        if(n == 4){
            System.out.println("Not Prime");
        }else{
            while(c*c<n){
                if(n % c ==0){
                    System.out.println("Not a Prime");
                    return;
                }
                c++;
            }
            if(c*c>n){
                System.out.println("Prime");
            }
        }

    }
}
