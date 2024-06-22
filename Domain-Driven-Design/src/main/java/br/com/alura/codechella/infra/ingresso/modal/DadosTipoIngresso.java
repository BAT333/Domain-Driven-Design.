package br.com.alura.codechella.infra.ingresso.modal;

import br.com.alura.codechella.Domain.ingresso.Definicao;
import br.com.alura.codechella.Domain.ingresso.Setor;

public record DadosTipoIngresso(
        Integer codigo,
        Setor setor,
        Definicao definicao
) {
}
