
package com.josue.pe.cdatosdao;

import com.josue.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class TipoDocumentoDao {
    private String mensaje;
    
    //primer metodo - INSERTAR TIPO DOCUMENTOS A LA DB
    
    public String agregarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql ="INSERT INTO TIPO_DOCUMENTO(NOMBRE, SIGLA, ESTADO, ORDEN)" + "VALUES(?,?,?,?)";
        
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNomnbre());
            ps.setString(2, tipoDocumento.getSigla());
            ps.setString(3, tipoDocumento.getEstado());
            ps.setInt(4, tipoDocumento.getOrden());
            ps.execute();
            ps.close();
            mensaje ="El tipo documento fue creado corectamente";
    } catch (Exception e){
            mensaje ="Alto perro!!! error al crear tipo documento. " + e.getMessage();
            System.out.println(e.getMessage());

    }
        return mensaje;
                   
    }
    //segundo metodo - modificiar tipo documento.
    
}
