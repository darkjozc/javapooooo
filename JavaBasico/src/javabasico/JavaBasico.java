package javabasico;



import java.util.Scanner;



public class JavaBasico {



 public void Principal (){

  System.out.println("bienbenido jsjsjs");

  System.out.println("operadores logicos ");

  System.out.println("tipos de datos ");

  System.out.println("estructuras de comtrol ");

  System.out.println("exepciones manejo de errores ");

  System.out.println("estructura de datos ");

   

   

  System.out.print("elija una opcion");

  Scanner sc = new Scanner(System.in);

  int data = sc.nextInt();

   

  switch (data) {

   case 1:

   OperadoresLogicos ol = new OperadoresLogicos();

   ol.operador();

   break;

     

   case 2:

    OperadoresLogicos la = new OperadoresLogicos();

    la.operaciones();

   break;

    

   case 3:

    OperadoresLogicos pa = new OperadoresLogicos();

    pa.detectarTipo();

   break;

    

   case 4:

    Excepciones ex = new Excepciones();

    ex.manejoError();

    break;

   case 5:

     EstructuraDatos ed = new EstructuraDatos();

     //

     ed.list();

      

    

    

  }



 }



 public static void main(String[] args) {



  Practica pra = new Practica();

  JavaBasico jb = new JavaBasico();

  jb.Principal();

  //pra.menu();

 }

}


///remover