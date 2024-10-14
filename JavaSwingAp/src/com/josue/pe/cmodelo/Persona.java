
package com.josue.pe.cmodelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Persona {
    
    private int  persona;
    private String nombre;
    private String apellido;
    private String documento;
    private String telefono;
    private String genero;
    private Date fechaNacimiento;
    private String correo;
      private Date fechaActualizada;

  ///  public Persona(int persona, String nombre, String apellido, String documento, String telefono, String genero, Date fechaNacimiento, String correo) {
     ///   this.persona = persona;
        ///this.nombre = nombre;
        ///this.apellido = apellido;
        ///this.documento = documento;
        ///this.telefono = telefono;
        //*this.genero = genero;
        ///this.fechaNacimiento = fechaNacimiento;
        //this.correo = correo;
   /// }

    public String getFechaActualizada() {
        SimpleDateFormat dt = new SimpleDateFormat ("dd-MM-yyyy");
       return dt.format(fechaActualizada);
    }

    public void setFechaActualizada(String fechaActualizada) throws ParseException {
        SimpleDateFormat dt = new SimpleDateFormat ("dd-MM-yyyy");

        this.fechaActualizada = dt.parse(fechaActualizada);
    }

   
  
    
      
      
    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
