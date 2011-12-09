package MBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import entidades.Cliente;
import DAO.ClienteDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.SelectItem;

@ManagedBean
@RequestScoped
public class ClienteMB {
    private Cliente cliente;// = new Cliente();
    ClienteDAO cDAO = new ClienteDAO();
    private List<Cliente> clientes = cDAO.getClientes();

    private String hello;

    
    public ArrayList<SelectItem> getOptions(){
        ArrayList<SelectItem> options = new ArrayList<SelectItem>();

        for(int i = 0 ; i < clientes.size(); i++){
            options.add(new SelectItem(clientes.get(i).getId(),clientes.get(i).getNome()));
        }
        return options;
    }
    /*
    private SelectItem[] familyNames = {
    new SelectItem((Integer) 1,"Operations"),
    new SelectItem((Integer) 2, "Special"),
    new SelectItem((Integer) 3, "Support")
    };
     *
     */

    public String getHello() {
        hello = "<em>";
        if(cliente.getId() != null)
            hello += "Editar ";
        else
            hello += "Novo ";
        hello += "</em>";
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

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
