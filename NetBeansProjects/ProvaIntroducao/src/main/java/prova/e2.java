/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;
import java.util.Scanner;
/**
 *
 * @author labinfo
 */
public class e2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        long salario = 1000;
        float por = (float) 0.015;
        float s2 = (float) (salario * 0.015);
        salario = (long) (salario + s2);
        for(int i = 1997; i < 2022; i++){
            salario = (long) (salario + s2);
            por = por * 2;
            s2 = salario * por;
        }
        System.out.println(salario);
    }
}
