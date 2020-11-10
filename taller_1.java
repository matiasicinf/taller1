import java.util.Random;
import java.util.Scanner;

public class taller_1 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Random rnum= new Random();
        int largo,productos=0;
        largo= rnum.nextInt(19)+1;
        int arreglo[] = new int [largo];

        llenarA(arreglo);
        cantidadP(arreglo,productos);
        verArreglo(arreglo);

    }

    static void llenarA(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 500+ i*150;
        }
    }
    static void cantidadP(int[] arreglo, int productos){
        Random rnum = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            productos= rnum.nextInt(15);
            arreglo[i]= arreglo[i]*productos;
        }
    }


    static void verArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {

            System.out.print("[" + arreglo[i] + "]");
        }

    }

}
