package com.josue.pe.cdatosdao;

import com.josue.pe.cmodelo.TipoDocumento;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

   
public class TipoDocumentoDao {
    private String mensaje;
    
    //primer metodo - INSERTAR TIPO DOCUMENTOS A LA DB
    
    public String agregarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql ="INSERT INTO TIPODOCUMENTO(NOMBRE, SIGLA, ESTADO, ORDEN)" + "VALUES(?,?,?,?)";
        
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
    
    //para eliminar
    public String elimiarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "DELETE FROM TIPODOCUMENTO WHERE ID_TIPODOCUMENTO = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, tipoDocumento.getIdTipoDocumento());
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue eliminado corectamente";
        } catch (Exception e) {
            mensaje = "Alto! error al eliminar tipo documento. " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }
    ////modificiar
    public String modificarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "UPDATE TIPODOCUMENTO "
                + " SET NOMBRE=?, SIGLA=?, ESTADO=?, ORDEN=? "
                + " WHERE ID_TIPODOCUMENTO=?";
        try {
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNomnbre());
            ps.setString(2, tipoDocumento.getSigla());
            ps.setString(3, tipoDocumento.getEstado());
            ps.setInt(4, tipoDocumento.getOrden());
            ps.setInt(5, tipoDocumento.getIdTipoDocumento());
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue actualizado corectamente";
        } catch (Exception e) {
            mensaje = "Alto! error al actualizar tipo documento. " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }
    ////cuarto metodo - Lista Tipo Documento
    public void ListarTipoDocumento(Connection conn, JTable table){
        DefaultTableModel model;
        Statement statement = null;
        ResultSet resultSet = null;
        
        String [] columnas = {"ID", "NOMBRE", "SIGLA", "ESTADO", "ORDEN"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "SELECT * FROM TIPODOCUMENTO";
        String [] datosTP = new String[5];
        
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                TipoDocumento td = new TipoDocumento();
                td.setIdTipoDocumento(resultSet.getInt("ID_TIPODOCUMENTO"));
                td.setNomnbre(resultSet.getString("NOMBRE"));
                td.setOrden(resultSet.getInt("ORDEN"));
                td.setSigla(resultSet.getString("SIGLA"));
                td.setEstado(resultSet.getString("ESTADO"));
                
                datosTP[0] = td.getIdTipoDocumento()+"";
                datosTP[1] = td.getNomnbre()+"";
                datosTP[2] = td.getOrden()+"";
                datosTP[3] = td.getSigla()+"";
                datosTP[4] = td.getEstado()+"";
                
                model.addRow(datosTP);
            }
            table.setModel(model);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Erro:" +e.getMessage());
            System.err.println(e.getMessage());
        }
        
    }
    
}







 