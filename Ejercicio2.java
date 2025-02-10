
import java.util.Scanner;

public class Ejercicio2 {

    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("por favor ingrese la dimension de la matriz");
        n = sc.nextInt();
        Metodos.captura(n);
        Metodos.mayor();
        sc.close();
    }
}