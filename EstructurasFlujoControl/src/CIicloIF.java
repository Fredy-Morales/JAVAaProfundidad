import java.util.Scanner;

class CicloIf {
    public static void main(String[] args) {
        int edad;
        System.out.println("ingrese su edad");
        Scanner leerEdad = new Scanner(System.in);
        edad = leerEdad.nextInt();
        System.out.println("edad = " + edad);
        if (edad >= 18) {
            System.out.println("Usted es Mayor de edad ");}
        else{
            System.out.println("Usted es menor de edad ");

        }
    }
}