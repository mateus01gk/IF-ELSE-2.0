import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
    System.out.println("vamos fazer um programa que identifique um numero inteiro");
    System.out.println("");
    System.out.println("e esse programa irá classificar ele como impar ou como par");
    System.out.println("");
    System.out.println("digite o numerador");
    Double numerador = sc.nextDouble();
    System.out.println("digite o denominador");
    Double denominador = sc.nextDouble();
Double resto = numerador % denominador;

    if(resto ==0){
      System.out.println("o numero é par");
    }
    if(resto>1){
      System.out.println("o numero é impar");
    }
 
     







    sc.close();
  }

  
}