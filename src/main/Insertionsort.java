package main;

import java.util.Scanner;

public class Insertionsort {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arreglo[], nElementos, pos, val;

        System.out.print("Digite el numero de elementos");
        nElementos = entrada.nextInt();

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //Metodo insertionsort inicia
        for (int i = 0; i < nElementos; i++) {
            pos = i;
            val = arreglo[i];

            while ((pos > 0) && (arreglo[pos - 1] > val)) {
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            arreglo[pos] = val;
        }
        //Metodo insertionsort finaliza2

        System.out.println("Orden de menor a mayor");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");
        
        System.out.println("Orden de mayor a menor");
        for (int i = (nElementos - 1); i >= 0; i--) {
        System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");
        
        

    }
}
