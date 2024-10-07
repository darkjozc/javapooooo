
package com.josue.pe.ctest;

import com.josue.pe.cmodelo.TipoDocumento;
import com.josue.pe.cnegocio.TipoDocumentoBO;
import java.sql.SQLException;


public class Test {
    TipoDocumentoBO tdbo = new TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    
public void insertar() throws SQLException{
    td.setNomnbre("sadsadsadsadsada ");
    td.setEstado("1");
    td.setOrden(1);
    td.setSigla("DNI");
    
    tdbo.agregarTipoDocumento(td);
}
    public static void main(String[] args) throws SQLException {
        Test tst = new Test();
        tst.insertar();
        
    }
    
}
