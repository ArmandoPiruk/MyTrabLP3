/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entidades.Usuario;
import DAO.UsuarioDAO;

/**
 *
 * @author Armando
 */
@ManagedBean
@RequestScoped
public class LoginMB {
    private Usuario usuario;
    private String notice;
    private String sesUsuario;

    /** Creates a new instance of LoginMB */
    public LoginMB() {
        usuario = new Usuario();
    }

    public String getNotice(){
    FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpSession session = ((HttpServletRequest) externalContext.getRequest()).getSession();
        if(session.getAttribute("NOTICE") != null){
            this.notice = (String)session.getAttribute("NOTICE");
            session.setAttribute("NOTICE",null);
        }
        return this.notice;
   }
    public String getSesUsuario(){
    FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpSession session = ((HttpServletRequest) externalContext.getRequest()).getSession();
        if(session.getAttribute("USUARIO") != null){
            this.sesUsuario = (String)session.getAttribute("USUARIO");
        }
        return this.sesUsuario;
   }
    
    public boolean autenticar(Usuario user){
        boolean aut = false;
        if(new UsuarioDAO().consultar(user) > 0)
            aut = true;
        return aut;
    }

    public String logar(){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpSession session = ((HttpServletRequest) externalContext.getRequest()).getSession();
        //session.setAttribute("LOGADO", "SIM");
        //return "LOGADO";

        String status = "";
        if(this.autenticar(usuario)){
            session.setAttribute("LOGADO", "SIM");
            session.setAttribute("USUARIO", usuario.getLogin());
            status = "LOGADO";
        }
        return status;
    }

    /** Creates a new instance of Login */


    /** Creates a new instance of Login */
    public static String logoff() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpSession session = ((HttpServletRequest) externalContext.getRequest()).getSession();
        session.setAttribute("LOGADO", "NAO");
        return "LOGIN";
    }

    public String getUserStatus() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpSession session = ((HttpServletRequest) externalContext.getRequest()).getSession();
        if ((session.getAttribute("LOGADO") != null) && (session.getAttribute("LOGADO").equals("SIM"))) {
            return "USUARIO LOGADO ";
        } else {
            return "USUARIO NAO LOGADO ";
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
