package entidades;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="tb_item")
public class Item {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="item_id")
    private Long id;

    @Column(name="item_qtd")
    private int qtd;

    @Column(name="item_total")
    private double total;

    @ManyToOne
    @JoinColumn(name="id_pedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name="id_produto")
    private Produto produto;

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
