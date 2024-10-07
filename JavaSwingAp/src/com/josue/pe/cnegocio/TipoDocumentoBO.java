
package com.josue.pe.cnegocio;

import com.josue.pe.cdatosdao.TipoDocumentoDao;
import com.josue.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import com.josue.pe.db.conexion;
import java.sql.SQLException;

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
    
}
