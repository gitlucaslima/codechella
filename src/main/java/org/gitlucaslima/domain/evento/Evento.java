package org.gitlucaslima.domain.evento;

import org.gitlucaslima.infra.evento.Endereco;
import org.gitlucaslima.domain.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private Categoria categoria;
    private String descricao;
    private Endereco endereco;
    private LocalDateTime data;
    private List<TipoIngresso> tipoIngressos= new ArrayList<>();

    public void incluiNovoTipoDeIngressoAoEvento(TipoIngresso tipoUngresso) {
        this.tipoIngressos.add(tipoUngresso);
    }

    public void aumentaNumeroDeIngressosporTipo(){
        //implements
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public LocalDateTime getData() {
        return data;
    }

    public List<TipoIngresso> getTipoIngressos() {
        return tipoIngressos;
    }
}
