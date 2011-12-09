package MBean;

import DAO.*;
import entidades.*;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@ManagedBean
@RequestScoped
public class PedidoMB {
    private Pedido pedido;
    private Cliente cliente = new Cliente();
    private List<Item> itens;
    private String comboBoxClientes;
    private List<Pedido> pedidos;

    private String getComboBoxClientes(){
        this.comboBoxClientes = "";
        ClienteDAO cDAO = new ClienteDAO();
        List<Cliente> clientes = cDAO.getClientes();
        return this.comboBoxClientes;
     }


    public PedidoMB() {
        pedido = new Pedido();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public String novo(){
        return "new";
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public List<Pedido> getPedidos() {
        PedidoDAO pDAO = new PedidoDAO();
        pedidos = pDAO.getPedidos();
        return pedidos;

    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public boolean getListaVazia(){
        boolean boo = false;
        if((getPedidos().size() == 0) || (pedidos == null))
            boo = true;
        return boo ;
    }

}
