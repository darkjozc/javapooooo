package javabasico;



import java.util.Scanner;



public class Excepciones {

  public void manejoError(){

    Scanner sc = new Scanner(System.in);

     

    try{

      System.out.print("Ingresar un numero: ");

      int num = sc.nextInt();

    }catch(Exception e){ //capturar

      System.out.println("Ocurrio un error: "+ e.getMessage());

    }finally{//finalizar

      System.out.println("Este bloque se ejecuta siempre");

      sc.close();

    }

  }

}