public class Metodos {
    public static int[][] matriz;  // Variable de instancia para almacenar la matriz
    public static void captura(int d) {
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

    public static void suma() {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        System.out.println("Suma de todos los elementos de la Matriz: ");
        System.out.println(suma);
    }

    public static void mayor() {
        int mayor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(mayor < matriz[i][j]){
                    mayor =  matriz[i][j];
                }
            }
        }
        System.out.print("Numero mayor de todos los elementos de la Matriz: ");
        System.out.println(mayor);
    }
}
