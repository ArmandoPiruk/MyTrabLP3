package entidades;
import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name="tb_pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ped_id")
    private Long id;

    @Column(name="ped_nome")
    private int numero;

    @Column(name="ped_senha")
    private double total;

    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy="pedido", fetch= FetchType.LAZY)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Item> itens = new ArrayList<Item>();

    public Pedido() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}
