
package com.josue.pe.ctest;

import com.josue.pe.cmodelo.TipoDocumento;
import com.josue.pe.cnegocio.TipoDocumentoBO;
import java.sql.SQLException;
import java.text.ParseException;



public class Test {
    TipoDocumentoBO tdbo = new  TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    
    public  void insertar() throws SQLException, ParseException{
       
        td.setNomnbre("Nacional de Identidad");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("N");
      
        
    
        tdbo.agregarTipoDocumento(td);
    }
    
    public  void eliminar() throws SQLException, ParseException{
        td.setIdTipoDocumento(1);
        tdbo.elimiarTipoDocumento(td);
    }
    
    public  void modificar() throws SQLException, ParseException{
        td.setNomnbre("Diego");
        td.setEstado("2");
        td.setOrden(2);
        td.setSigla("D");
        td.setIdTipoDocumento(21);
        
        
        tdbo.modificarTipoDocumento(td);
    }
    
    public static void main(String[] args) throws SQLException, ParseException {
        Test t = new  Test();
        t.insertar();
        //t.eliminar();
        //t.modificar();
    }
}