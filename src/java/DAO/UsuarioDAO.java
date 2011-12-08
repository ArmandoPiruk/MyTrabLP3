/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.HibernateUtil;
import entidades.Produto;
import entidades.Usuario;
import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Armando
 */
public class UsuarioDAO {
    Session ses = HibernateUtil.getSession();

    public Long consultar(Usuario user){
        ses.beginTransaction().begin();
        String query = "SELECT COUNT(*) FROM Usuario u WHERE u.login = :login AND u.senha = :senha";
        Query sql = ses.createQuery(query);
        sql.setParameter("login", user.getLogin());
        sql.setParameter("senha", user.getSenha());
        //ses.close();
        return (Long)sql.list().get(0);
    }

    public void destroy(Usuario user){
        ses.beginTransaction().begin();
        ses.delete(user);
        ses.getTransaction().commit();
        ses.close();
    }

    public void delete(Long id){
        Usuario user = this.getUsuario(id);
        Session session = HibernateUtil.getSession();
        session.beginTransaction().begin();
        session.delete(user);
        session.getTransaction().commit();
        session.close();
    }

    public Usuario getUsuario(Long id){
        ses.beginTransaction().begin();
        Usuario cliente = (Usuario) ses.get(Usuario.class, id);
        return cliente;

    }

    public void salvar(Usuario user){
        ses.beginTransaction().begin();
        ses.saveOrUpdate(user);
        ses.getTransaction().commit();
        //ses.close();
    }
    public List<Usuario> getClientes(){
        ses.beginTransaction().begin();
        List<Usuario> clientes = ses.createQuery("SELECT u FROM Usuario u").list();
        return clientes;
    }

}
