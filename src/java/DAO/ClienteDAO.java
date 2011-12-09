package DAO;

import Util.HibernateUtil;
import entidades.Cliente;
import java.util.List;
import org.hibernate.Session;

public class ClienteDAO {
    public List<Cliente> get;

    public void salvar(Cliente cli){
        Session ses = HibernateUtil.getSession();
        ses.beginTransaction().begin();
        ses.saveOrUpdate(cli);
        ses.getTransaction().commit();
        ses.close();
    }
    public List<Cliente> getClientes(){
        Session ses = HibernateUtil.getSession();
        ses.beginTransaction().begin();
        List<Cliente> clientes = ses.createQuery("SELECT c FROM Cliente c").list();
        return clientes;

    }
    public Cliente getCliente(Long id){
        Session ses = HibernateUtil.getSession();
        ses.beginTransaction().begin();
        Cliente cliente = (Cliente) ses.get(Cliente.class, id);
        return cliente;

    }
    public void destroy(Cliente cli){
        Session ses = HibernateUtil.getSession();
        ses.beginTransaction().begin();
        ses.delete(cli);
        ses.getTransaction().commit();
        ses.close();
    }
    public void delete(Long id){
        Cliente cliente = this.getCliente(id);
        Session session = HibernateUtil.getSession();
        session.beginTransaction().begin();
        session.delete(cliente);
        session.getTransaction().commit();
        session.close();
    }
    public static void main(String[] args) {
        /*
         * Inclusao
        ClienteDAO cDAO = new ClienteDAO();
        Cliente cli = new Cliente();
        cli.setNome("Armando");
        cli.setEmail("piruk7@gmail.com");
        cDAO.salvar(cli);
         *
         */
        /*
         * Listar
        ClienteDAO cDAO = new ClienteDAO();
        List<Cliente> clientes = cDAO.getClientes();
        System.out.println(clientes.size());
         *
         */
        /*
         * Consulta_by_id
        ClienteDAO cDAO = new ClienteDAO();
        Cliente teste = cDAO.getCliente(1L);
        System.out.println(teste.getNome());
         *
         */
        /*
         * Deletar
        ClienteDAO cDAO = new ClienteDAO();
        Cliente teste = new Cliente();
        teste.setId(2L);
        System.out.println(teste.getNome());
        cDAO.destroy(teste);
        System.out.println("Ok");
        */

    }

}
