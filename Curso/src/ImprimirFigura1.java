package Curso.src;
/*Imprimir las figuras:
1.
**********
**********
**********
**********
2.
*
**
***
****
*****
3.
     *
    **
   ***
  ****
 *****

 */
public class ImprimirFigura1 {
    public static void main(String[] args) {
        //FIGURA 1
        System.out.println("figura 1");
        for (int i = 0; i <= 4; i++) {
            System.out.println("************");
        }
        //FIGURA 2
        System.out.println("\n");
        System.out.println("Figura 2");
        for (int i = 0; i <= 5; i++) {
            if (i == 1) {
                System.out.println("*");
            } else {
                if (i == 2) {
                    System.out.println("**");
                } else {
                    if (i == 3) {
                        System.out.println("***");
                    } else {
                        if (i == 4) {
                            System.out.println("****");
                        } else {
                            if (i == 5) {
                                System.out.println("*****");
                            }
                        }
                    }
                }
            }
        }
        //FIGURA 3
        System.out.println("\n");
        System.out.println("Figura 3");
        for (int i = 0; i <= 5; i++) {
            if (i == 1) {
                System.out.println("    *");}
            else if (i == 2) {
                    System.out.println("   **");}
                 else if (i == 3) {
                        System.out.println("  ***");}
                    else if (i == 4) {
                            System.out.println(" ****");}
                         else if (i == 5) {
                                System.out.println("*****");}
        }
    }
}