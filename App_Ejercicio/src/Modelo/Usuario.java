/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jhonny Londoño G
 */
public class Usuario {
    private String idUsuario;
    private String usuario;
    private String contraseña;
    private String nombre1;
    private String apellido1;
    private String telefono;
    private String correo;
    private double estarura;
    private double peso;
    private int edad;
    
    public Usuario(String idUsuario, String usuario, String contraseña, String nombre1, String apellido1, String telefono, String correo, double estarura, double peso, int edad) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre1 = nombre1;
        this.apellido1 = apellido1;
        this.telefono = telefono;
        this.correo = correo;
        this.estarura = estarura;
        this.peso = peso;
        this.edad = edad;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getEstarura() {
        return estarura;
    }

    public void setEstarura(double estarura) {
        this.estarura = estarura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nombre1=" + nombre1 + ", apellido1=" + apellido1 + ", telefono=" + telefono + ", correo=" + correo + ", estarura=" + estarura + ", peso=" + peso + ", edad=" + edad + '}';
    }
    
   public boolean insertarUsuario(String sql) {
          ConnectBD objCon = new ConnectBD();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        return true;
    
    }
    
    
}
