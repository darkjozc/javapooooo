package javabasico;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import java.util.List;
import java.util.Map;



public class EstructuraDatos {

  public void array(){

    String apellido = "Mamani";

    Object[]datos={"daniel","juan","senati","pedro",23,true,3.12};

     

    //obtener la cantidad de datos

    int cantidad = datos.length;

    System.out.println("la cantidad de datos de mi array de datos es:"+cantidad);

    System.out.println(datos[0]);

     

    for(int i = 0;i <= cantidad -1;i++){

      System.out.println(datos[i]);

      if(datos[i] == "senati")

        System.out.println("se encontro la palabra"+datos[1]);

       

    //iterando usar est cont if ()si se encuentra la palabra "senati" print por consola se encontro la plabra: senati

    }

  }

   

public void list(){

  List<String> nombres = new ArrayList<>();

  nombres.add("Marco");

  nombres.add("Pablo");

  nombres.add("Pedro");

   

  List<String> nombresNuevos = new ArrayList<>();

  nombresNuevos.add("Diego");

  nombresNuevos.add("Maria");

  nombresNuevos.add("Ana");

   

  //addALL
    
  nombres.addAll(nombresNuevos);

  //Cantidad de datos

  int cantidad = nombres.size();

  System.out.println("Cantidad de datos: "+ cantidad);

  
  
  ///remover

 nombres.remove("Diego");  

 ///encontrar datos
 
 nombres.contains("Pablo");
 
 ///indice de datos 
 
 nombres.indexOf("Pablo");
 
 ///ordenar una lista
 Collections.sort(nombres);
 
 ///revertir una lista
  Collections.reverse(nombres);
 
 ///remplezar un datro
 nombres.set(1,"jose luis");
 
 
    System.out.println("---------------------------------------------------------------------");
 for(String item: nombres){
     System.out.println("el dato es_" + item);
 }
}

 public void map(){
    Map<String, Integer> edades = new HashMap<>();
    edades.put("Marta",50);
    
    
    for(String item : edades.keySet()){
        System.out.println("clave: "+ item);
    }
 }
}


 
 



 


