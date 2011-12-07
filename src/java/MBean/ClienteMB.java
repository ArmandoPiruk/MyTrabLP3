/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MBean;

import entidades.Cliente;
import DAO.ClienteDAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Armando
 */
@ManagedBean
@RequestScoped
public class ClienteMB {
    private Cliente cliente;// = new Cliente();
    private List<Cliente> clientes;
    ClienteDAO cDAO = new ClienteDAO();

    /** Creates a new instance of ClienteMB */
    public ClienteMB() {
        cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        ClienteDAO cDAO = new ClienteDAO();
        clientes = cDAO.getClientes();
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String salvar(){
        cDAO.salvar(cliente);
        cliente = new Cliente(); //Para resetar os valores
        return "index";
    }
    
    public String destroy(){
        Cliente deletar = new Cliente(); // << Gambi
        deletar.setId(cliente.getId()); // << continuando a POG
        cDAO.destroy(deletar); // << Favor implemetar um destroy pelo ID rsrs

        cliente = new Cliente(); //Para resetar os valores
        return "index";
    }



}
