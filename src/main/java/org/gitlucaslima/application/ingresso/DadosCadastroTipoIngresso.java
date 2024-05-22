package org.gitlucaslima.application.ingresso;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.gitlucaslima.domain.ingresso.Definicao;
import org.gitlucaslima.domain.ingresso.Setor;

public record DadosCadastroTipoIngresso(
        @NotNull(message = "O setor do ingresso é obrigatório!")
        Setor setor,
        @NotNull(message = "A definição do tipo de ingresso é obrigatória!")
        Definicao definicao,
        @NotNull
        Double valor,
        @Positive
        int totalDisponivel

) {
}
