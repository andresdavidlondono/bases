/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Usuario;


/**
 *
 * @author Jhonny Londoño G
 */
public class ControlUsuario {
    public boolean insertarUsuario(Usuario obje) {
        String sql="Insert into cuenta(idUsuario, Usuario, Contraseña, Nombre1, Apellido1, Telefono, Correo, Estatura, Peso, Edad)"+
                "value('"+obje.getIdUsuario()+"', '"+obje.getUsuario()+"', '"+obje.getContraseña()+"', '"+obje.getNombre1()+"', '"+
                obje.getApellido1()+"', '"+obje.getTelefono()+"', '"+obje.getCorreo()+"', '"+obje.getEstarura()+"','"+obje.getPeso()+"','"+obje.getEdad()+"')";
        
        boolean f=false;
        f=obje.insertarUsuario(sql);
        
       
        return f;
    }

    public Usuario buscarUsuario(String BuscarPor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
