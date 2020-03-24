
package u05e06;

import java.util.Scanner;

public class U05E06 {

    public static void main(String args[]) {
        Scanner entrada=new Scanner(System.in);
        int num1, num2, num3, mayor;
        String st="primer"; 
        String nd="segundo";
        String rd="tercer";
        num1=entradaNumero(st);
        num2=entradaNumero(nd);
        num3=entradaNumero(rd);
        mayor=mayorDeTres(num1, num2, num3);
        System.out.print("El numero mayor es: "+mayor);
    }
    static int entradaNumero(String a){
        int x;
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese el "+a+" numero: ");
        x=entrada.nextInt();
        return(x);
    }
    static int mayorDeTres(int a, int b, int c){
        int z=0;
        if (a>b){
            if(a>c){
                z=a;
            }
        }else if (b>c){
            z=b;
        }else
            z=c;
        return(z);
    }
}
