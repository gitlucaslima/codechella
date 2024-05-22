package org.gitlucaslima.application.venda;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.gitlucaslima.application.ingresso.DadosCadastroIngresso;

import java.util.List;

public record DadosCadastroVenda(
        @NotNull(message = "O id do usuário é obrigatório!")
        Long usuario_id,
        @NotNull(message = "Os dados do ingresso devem ser informados")
        @Valid
        List<DadosCadastroIngresso> ingressos

) {

}
