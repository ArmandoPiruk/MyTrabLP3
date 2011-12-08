/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MBean;

import entidades.Usuario;
import DAO.UsuarioDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Armando
 */
@ManagedBean
@RequestScoped
public class LoginMB {
    private Usuario usuario;

    /** Creates a new instance of LoginMB */
    public LoginMB() {
        usuario = new Usuario();
    }

    public boolean autenticar(Usuario user){
        boolean aut = false;
        if(new UsuarioDAO().consultar(user) > 0)
            aut = true;
        return aut;
    }

    public String logar(){
        String status = "";
        if(this.autenticar(usuario))
            status = "LOGADO";
        return status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
