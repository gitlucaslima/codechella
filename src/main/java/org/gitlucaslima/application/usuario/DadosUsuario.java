package org.gitlucaslima.application.usuario;

import java.time.LocalDate;

public record DadosUsuario(
        Long id,
        String cpf,
        String nome,
        LocalDate nascimento,
        String email
) {
}
