package javaclasses;
import java.util.Scanner;
public class demo1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        int arr[] = new int[num];
        for(int i =1;i<=num;i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count == 8){
            System.out.println("The number is Sphenic number");
           for(int i=1;i<=count;i++){
            if(count%i == 0){
                System.out.println("prime");
                break;
            }else{
                System.out.println("not prime");
                break;
            }
           }
        }else{
            System.out.println("the number is not Sphenic number");
        }
    }
}
