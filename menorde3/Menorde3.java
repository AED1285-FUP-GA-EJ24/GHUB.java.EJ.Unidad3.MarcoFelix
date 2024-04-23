package menorde3;


import java.util.Scanner;
public class Menorde3 {
    public void menorde3(){
        //declaracion del objeto Scanner
        Scanner entrada = new Scanner(System.in);
        //variable de entrada
        int num;
        System.out.print("Proporciona un numero entero:");
        num=entrada.nextInt();
        switch (num) {
            case 0:
            case 1:
            case 2:
                System.out.println("Menor que 3");       
                break;
            case 3:
                System.out.println("igual a 3");   
            default:
                System.out.println("Mayor que 3");   
                break;
        }
        entrada.close();
    }
}
