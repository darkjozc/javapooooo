
package com.josue.pe.cnegocio;


import com.josue.pe.cdatosdao.TipoDocumentoDao;
import com.josue.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import com.josue.pe.db.conexion;
import java.sql.SQLException;
import javax.swing.JTable;


public class TipoDocumentoBO {
    public String mensaje;
    TipoDocumentoDao tdd = new TipoDocumentoDao();
    
public String agregarTipoDocumento (TipoDocumento tipoDocumento) throws SQLException{
        Connection c =  conexion.getConnection();
        
        try {
            mensaje = tdd.agregarTipoDocumento(c, tipoDocumento); 
            c.commit();
        } catch (Exception e) {
            c.rollback();
            
        } finally {
            c.close();
        }
        return mensaje;
    }
public String elimiarTipoDocumento (TipoDocumento tipoDocumento) throws SQLException{
        Connection c =  conexion.getConnection();
        
        try {
            mensaje = tdd.elimiarTipoDocumento(c, tipoDocumento); 
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }    
public String modificarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = conexion.getConnection();
        try {
            mensaje = tdd.modificarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }
public void listarTipoDocumento(JTable table) throws SQLException {
   
        Connection c =  conexion.getConnection();
        
        
        try {
            tdd.ListarTipoDocumento(c, table);
            
        } catch (Exception e) {
            System.err.println("Error: "+e.getMessage());
        } finally{
            c.close();
        }
      
        }
}


