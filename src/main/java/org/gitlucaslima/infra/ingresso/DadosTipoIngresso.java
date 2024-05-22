package org.gitlucaslima.infra.ingresso;

import org.gitlucaslima.domain.ingresso.Definicao;
import org.gitlucaslima.domain.ingresso.Setor;

public record DadosTipoIngresso(
        Integer codigo,
        Setor setor,
        Definicao definicao
) {
}
