package entidades;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id")
    private Long id;

    @Column(name="user_login")
    private String login;

    @Column(name="user_senha")
    private String senha;

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}