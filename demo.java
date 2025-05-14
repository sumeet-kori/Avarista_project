package javaclasses;
import java.util.Scanner;
public class demo{
    // static int adder(int... a){
    //     int sum=0;
    //     for(int i=0;i<a.length;i++){
    //         sum+=a[i];
    //     }
    //     return sum;
    // }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println(adder(1,2,3,4,5,6,7,8));
        
    //    for(int i = 0;i<=4;i++){
    //     for(int j=0;j<=4;j++){
    //         // System.out.print("* ");
    //         if(i ==0 || i == 4){
    //             System.out.print("* ");
    //         }
    //         else{
    //             if(j == 0 || j == 4){
    //                 System.out.print("* ");
    //             }
    //             else{
    //                 System.out.print("  ");
    //             }
    //         }
            
    //     }
    //     System.out.println();
    //    }
        int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}
}