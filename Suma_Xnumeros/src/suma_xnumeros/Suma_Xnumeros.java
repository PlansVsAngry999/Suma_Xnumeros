package suma_xnumeros;

/**
 * Programa que solicita un número, el cual sera el numero de veces que se le sumaran numeros naturales.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
import java.util.Scanner;
public class Suma_Xnumeros {
    public static void main(String[] args) {       
        Scanner sn=new Scanner(System.in);
        int cont = 0, suma = 0, x;
        System.out.println("Ingrese un numero positivo: ");
        x=sn.nextInt();
        //Ciclo while; termina hasta que el contador sea igual a el numero ingresado por el usuario.
        while(cont<=x){
            suma=suma+cont;
            cont=cont+1;}
        System.out.println("La suma es: "+suma);       
    }
}