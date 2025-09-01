package med.voll.api.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizarPaciente(
        @NotNull
        Long id,
        String nome,

        @Pattern(regexp = "\\d{11}")
        String telefone,
        DadosEndereco endereco
) {
}
