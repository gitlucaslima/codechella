package org.gitlucaslima.infra.evento;

import jakarta.persistence.Embeddable;
import org.gitlucaslima.application.evento.DadosEndereco;

@Embeddable
public class Endereco {
    private String cep;
    private Integer numero;
    private String complemento;

    public Endereco() {}

    public Endereco(DadosEndereco dados) {
        this.cep = dados.cep();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
