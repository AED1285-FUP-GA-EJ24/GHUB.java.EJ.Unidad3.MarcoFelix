package ine;

import java.util.Scanner;

public class Ine {
    public void determinarSiIne(){
        //definir un objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //definir variable de salida
        String resultado;
        //definir variable de entrada
        int anioActaul,anioNacimiento;
        //definir variable de auxiliar
        int anios;

        System.out.print("Propmociona año actual");
        anioActual = teclado.nextInt();
        System.out.print("Propmociona año de Nacimiento");
        anioNacimiento = teclado.nextInt();

        anios = anioActaul - anioNacimiento;

        if(anios>=18)
            resultado = "Usted puede tramitar su INE";
        else
            resultado = "Usted NO PUEDE tramitar su INE";

    }

}