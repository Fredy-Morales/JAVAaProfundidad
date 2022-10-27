package Curso.src;

import java.util.Scanner;

public class CalculadorAreas {
    /* 1. Realiza un programa capaz de calcular el área de un Cuadrado,
    Círculo, Rectángulo y Triángulo.     */

    public static void main(String[] args) {
       // calcular área del cuadrado
        System.out.println("Area de un Cuadrado: A = Lado a la 2");
        int lado; // creamos la variable
        int areaCuadrado;
        Scanner leer = new Scanner(System.in); // Creamos la clase leer, tipo Scanner
        System.out.println("ingrese lado 1 del cuadrado"); // Pedimos ingresar el numero
        lado = leer.nextInt(); // lo leemos y asignamos a la variable lado1
        System.out.println("lado1 = " + lado);
        areaCuadrado = lado*lado;
        System.out.println("el area de Cuadrado es = " + areaCuadrado);

        // Area de un circulo
        System.out.println("Calacular area de un circulo: A = pi * radio a la 2");
        final double pi = 3.14;
        int radio;
        double areaCirculo;

        Scanner leer1 = new Scanner(System.in);
        System.out.println("<digite el radio del circulo");
        radio = leer1.nextInt();
        System.out.println("radio " + radio);
        areaCirculo = pi*radio;
        System.out.println("areaCirculo = " + areaCirculo);


      // Area de un rectangulo: Area = Base * Alto
        System.out.println("Area de un rectangulo: Area = Base * Alto" );
        int areaRectangulo;
        int base ;
        int alto;
        Scanner leerBase = new Scanner(System.in);
        System.out.println("digita la base del rectangulo");
        base = leerBase.nextInt();
        System.out.println("digita el alto del rectangulo");
        Scanner leerAlto = new Scanner(System.in);
        alto = leerAlto.nextInt();
        areaRectangulo = base * alto;
        System.out.println("area = " + base + "*" + alto);
        System.out.println("areaRectangulo = " + areaRectangulo);

        // Area de un triangulo
        System.out.println("Area de un triangulo: Area = Base * Alto / 2" );
        int areaTriangulo;
        int baseT ;
        int altoT;
        Scanner leerBaseT = new Scanner(System.in);
        System.out.println("digita la base del triangulo");
        baseT = leerBaseT.nextInt();
        System.out.println("digita el alto del rectangulo");
        Scanner leerAltoT = new Scanner(System.in);
        altoT = leerAltoT.nextInt();
        areaTriangulo = baseT * altoT /2;
        System.out.println("area = " + baseT + "*" + altoT + "/2");
        System.out.println("areaTriangulo = " + areaTriangulo);
         }
    }
