//shortcuts-sout and psvm
// public class Main{
//     public static void main(String args[]){
//         System.out.println("jai shree krishna");
//     }
// }
// ------Conditionals Loops in JAVA------

import java.util.*;

public class Conditional{
    public static void main(String args[]){
       Scanner input=new Scanner(System.in);
    //    System.out.print("enter the value of a, b and c=");
    //    int n=input.nextInt();
    //    int b=input.nextInt();
    //    int c=input.nextInt();
    //    System.out.print("Largest Number is =");
    //    int max=a;
    //    if(b>max){
    //     max=b;
    //    }
    //    if(c>max){
    //     max=c;
    //    }
    //    System.out.println(max);
    // int max=Math.max(c, Math.max(a, b));      class for find the maximum number
    // System.out.println(max);
    // int rem;
    // int count=0;
    // while(n>0){
    //     rem=n%10;
    //     if(rem==3){             //Counting occurence of the number
    //         count++;
    //     }
    //   n=n/10;
    // }
    // System.out.println(count);
    //take input from the user till user does not press X or x
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