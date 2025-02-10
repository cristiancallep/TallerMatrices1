
import java.util.Scanner;

public class Ejercicio1 {

    public int[][] matriz;  // Variable de instancia para almacenar la matriz

    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("por favor ingrese la dimension de la matriz");
        n = sc.nextInt();
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.captura(n);
        ejercicio1.suma();
        sc.close();
    }
    public void captura(int d) {
        matriz = new int[d][d];
        System.out.println("Matriz creada: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);
                System.out.print(" - " + matriz[i][j]);
            }
            System.out.println();
        }
    }

    public void suma() {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        System.out.println("Suma de todos los elementos de la Matriz: ");
        System.out.println(suma);
    }




}