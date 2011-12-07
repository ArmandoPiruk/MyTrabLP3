package DAO;

import Util.HibernateUtil;
import entidades.Produto;
import java.util.*;
import org.hibernate.Session;

public class ProdutoDAO {
    Session ses = HibernateUtil.getSession();

    public void salvar(Produto prod){
        ses.beginTransaction().begin();
        ses.saveOrUpdate(prod);
        ses.getTransaction().commit();
        ses.close();
    }
    
    public List<Produto> getProdutos(){
        ses.beginTransaction().begin();
        List<Produto> produtos = ses.createQuery("SELECT p FROM Produto p").list();
        return produtos;
    }

    public Produto getProduto(Long id){
        ses.beginTransaction().begin();
        Produto prod;
        return null;
    }

    public void excluir(Produto prod){
        Produto pdt = new Produto();
        pdt.setId(prod.getId());
        ses.beginTransaction().begin();
        ses.delete(pdt);
        ses.getTransaction().commit();
        ses.close();
    }

}
