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
public class e3 {
    public static void main(String[] args) {    
    Scanner ler = new Scanner (System.in);
    float peso;
    int tempo = 0;
        System.out.println("Qual o peso do material:");
        peso = ler.nextFloat();
        while(peso > 0.5){
        peso = (float) (peso - 0.5);
        tempo++;
    }
        System.out.println("Levou:"+tempo+" Segundos para o elemento atingir 0,5 gramas");
    }
}
