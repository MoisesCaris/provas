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
public class e1 {
    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
        int[] n = new int[6];
      System.out.println("Escolha 5 numeros:");
      for(int i = 0; i < 5; i++){
          n[i] = ler.nextInt();
      }
      int maior = 0;
      for(int j = 0; j < 5; j++){
          if(maior < n[j]){
              maior = n[j];
          }
      }
      int menor = 999999999;
      for(int h = 5; h > 1; h--){
          if(menor > n[h]){
              menor = n[h];
          }
      }
        System.out.println("O maior numero foi:"+maior+"\n"+"O menor numero foi de:"+menor);
    }
}
