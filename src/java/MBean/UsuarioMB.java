package MBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.*;
import entidades.Usuario;
import DAO.UsuarioDAO;

@ManagedBean
@RequestScoped
public class UsuarioMB {
    private Usuario usuario = new Usuario();
    private List<Usuario> usuarios;
    UsuarioDAO uDAO = new UsuarioDAO();

    public UsuarioMB() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        usuarios = uDAO.getClientes();
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String salvar(){
        uDAO.salvar(usuario);
        usuario = new Usuario(); //Para resetar os valores
        return "index";
    }

    public String destroy(){
        Usuario deletar = usuario;
        //deletar.setId(usuario.getId());
        uDAO.destroy(deletar);
        usuario = new Usuario();
        return "index";
    }

}
