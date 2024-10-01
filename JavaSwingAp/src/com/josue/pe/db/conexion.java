
package com.josue.pe.db;
import java.sql.Connection;
import java.sql.DriverManager;




public class conexion {
    private static Connection con = null;
    private static String usuario = "musica";
    private static String clave ="124764";    
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
    
    public static Connection getConnection(){
        try {
            //cargar el controlador jdbc
            Class.forName("oracle.jdbc.OracleDriver");
            
            //establecer la coneccion con la base de datos 
            con = DriverManager.getConnection(url,usuario,clave);
            con.setAutoCommit(false);
            System.out.println("josue..........");
            if(con != null){
                System.out.println("conexion Exitosa :");
            }else{
                System.out.println("Error: conexion Fallida");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return con;
    };
    
    public void closeConnection(){
        try {
            con.close();
            
        } catch (Exception e){
            System.out.println("Error  al cerrar la conexion: " +e.getMessage());
        }
    }
    
    public static void main(String [] args){
        conexion con = new conexion();
        conexion.getConnection();
        
    }
}


