// ------Conditionals Loops in JAVA------

import java.util.*;

public class Conditional{
    public static void main(String args[]){
       Scanner input=new Scanner(System.in);
    int ans=0;
    System.out.print("Enter the operator:");
    while(true){
        char op=input.next().trim().charAt(0);
        System.out.print("Enter the value of n1 and n2:");
        if(op=='/' || op=='*' || op=='+' || op=='-' || op=='%'){
           
               int n1=input.nextInt();
               int n2=input.nextInt();
               if(op=='/'){
                if(n2!=0){
                ans=n1/n2;
                }
               }
               if(op=='*'){
                ans=n1*n2;
               }
               if(op=='+'){
                ans=n1+n2;
               }
               if(op=='-'){
                ans=n1-n2;
               }
               if(op=='X' || op=='x'){
                break;
               }
        }
        System.out.println(ans);
    }
      
    }
}
