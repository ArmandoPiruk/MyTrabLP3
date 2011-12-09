package entidades;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="tb_cliente")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="cli_id")
    private Long id;

    @Column(name="cli_nome")
    private String nome;

    @Column(name="cli_email")
    private String email;

    @OneToMany(mappedBy="cliente", fetch= FetchType.LAZY)
    List<Pedido> pedidos =  new ArrayList<Pedido>();

    public Cliente() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return nome ;
    }
    
}
