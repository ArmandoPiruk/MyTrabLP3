package DAO;

import Util.HibernateUtil;
import entidades.Pedido;
import java.util.*;
import org.hibernate.Session;

public class PedidoDAO {
    Session ses = HibernateUtil.getSession();

    public void salvar(Pedido ped){
        ses.beginTransaction().begin();
        ses.saveOrUpdate(ped);
        ses.getTransaction().commit();
        ses.close();
    }

    public List<Pedido> getPedidos(){
        ses.beginTransaction().begin();
        List<Pedido> produtos = ses.createQuery("SELECT p FROM Pedido p").list();
        return produtos;
    }

    public Pedido getPedido(Long id){
        ses.beginTransaction().begin();
        Pedido prod;
        return null;
    }

    public void excluir(Pedido pd){
        Pedido ped = new Pedido();
        ped.setId(pd.getId());
        ses.beginTransaction().begin();
        ses.delete(ped);
        ses.getTransaction().commit();
        ses.close();
    }

}
