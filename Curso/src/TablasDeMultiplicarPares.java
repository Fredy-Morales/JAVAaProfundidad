package Curso.src;

public class TablasDeMultiplicarPares {
    public static void main(String[] args) {
        /*1. Realiza un programa que imprima las tablas de multiplicar del 1 al 20,
debe existir un espacio entre una y otra para identificarlas.
2. modificar el programa que solo imprima las tablas de multiplicar de los numeros pares.*/
        int tabla = 0;
        for (int j=0; j<=10; j++){
            System.out.println("\n"+"Tabla del "+ j+"\n");
                for (int i = 0; i <= 20; i++){
                    if (i%2!=0){
                        continue;}
                    System.out.println(j + "*" + i + "= " + (j * i));
            }
        }
    }
}
