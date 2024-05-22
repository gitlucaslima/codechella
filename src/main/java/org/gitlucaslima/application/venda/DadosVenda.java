package org.gitlucaslima.application.venda;

import org.gitlucaslima.infra.ingresso.DadosTipoIngresso;
import org.gitlucaslima.application.usuario.DadosUsuario;

import java.util.List;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}
