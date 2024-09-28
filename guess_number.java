



import java.util.Scanner;
import java.util.random.*;




public class guess_number {
    public static void main(String[] args) {
        
      
        double n = Math.random();  // made because random is class. It always gives a double value,
        System.out.println(n*100); //if not multiply with 100 it give result in 0.9854,

        int x = (int)(Math.random() * 100);   // variabe argument is used here. to make result in integer. 
        //  System.out.println(x);   our random number is x.

        // traking input 5 times.
       
        Scanner sc = new Scanner(System.in);
        
        for(int i = 1 ; i <= 5 ; i++){
          int a = sc.nextInt();
          if (a<x){
            System.out.println("number is greater");
          }
          else if (a>x){
            System.out.println("number is lesser");
          }
          else if (a==x){
            System.out.println("well done");
            break;

          }


        }
        System.out.println("result is " + x);
        

    }
    
}
