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

}
