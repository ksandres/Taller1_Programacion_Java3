import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
Scanner y = new Scanner(System.in);
int[] num = new int[4];
for (int i=0;i<4;i++){
    System.out.print("ingrese los numeros"+ (i+1) + ":");
    num[i]=y.nextInt();
}
    Arrays.sort(num);
        System.out.println("los numero ordenados de menor a mayor: ");
        for (int ord : num ) {
            System.out.println(ord);
         }



    }
}