package Cliente.example.ClienteApi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
    @Id
   private String nome;
   private Long id;
   private String profissao;
   private String rua;
   private Integer cep;
   private Integer numero;

    public Cliente(String nome, Long id, String profissao, String rua, Integer cep, Integer numero) {
        this.nome = nome;
        this.id = id;
        this.profissao = profissao;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
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

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
