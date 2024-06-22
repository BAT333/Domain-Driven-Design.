package br.com.alura.codechella.aplicacao.evento.model;

import br.com.alura.codechella.Domain.Evento.Categoria;
import br.com.alura.codechella.infra.ingresso.modal.DadosCadastroTipoIngresso;
import br.com.alura.codechella.infra.evento.modal.DadosEndereco;

import java.time.LocalDateTime;
import java.util.List;

public record DadosEvento(
        Long id,
        Categoria categoria,
        String descricao,
        DadosEndereco endereco,
        LocalDateTime data,
        List<DadosCadastroTipoIngresso> tipoIngressos
) {
}
