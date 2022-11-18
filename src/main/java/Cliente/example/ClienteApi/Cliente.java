package Cliente.example.ClienteApi;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "O nome é obrigatório!")
    private String nomeCompleto;
    private String profissao;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> endereco;

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Cliente(Long id, String nome, List<Endereco> enderecoList) {
        this.id = id;
        this.nomeCompleto = nome;
        this.endereco = enderecoList;
        this.profissao = profissao;
    }

    public String getNome() {
        return nomeCompleto;
    }

    public void setNome(String nome) {
        this.nomeCompleto = nome;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }
}
