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

    FacesContext facesContext = FacesContext.getCurrentInstance();
    ExternalContext externalContext = facesContext.getExternalContext();
    HttpSession session = ((HttpServletRequest) externalContext.getRequest()).getSession();

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
        session.setAttribute("clienteId", cliente.getId());
        //session.setAttribute("clienteNome", cliente.getNome());
        return "new";
    }

    public String getSesClienteNome(){
        return (String) session.getAttribute("clienteNome");
    }
    public String getSesClienteId(){
        //atribuido valor em: public String novo()
        //return (String) session.getAttribute("clienteId");
        return "Ver porque nao esta trazendo os dados";
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
