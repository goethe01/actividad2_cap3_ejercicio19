package com.mycompany.cap3_ejer19;
import java.util.Scanner;
public class Cap3_ejer19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado, perimetro;
        float base, altura, area;
        
        System.out.println("dame el valor de un lado del triangulo: ");
        lado = entrada.nextInt();
        
        perimetro = lado * 3;
        base = lado/2;
        altura = (float)(Math.pow(lado,2))- (float) Math.pow(base,2);
        altura = (float)Math.sqrt(altura);
        area = (lado*altura)/2;
        
        System.out.println("datos del triangulo equilatero:");
        System.out.println("perimetro: "+perimetro +"\n"+"altura: "+altura + "\n" + "area: "+area);
    }
}
