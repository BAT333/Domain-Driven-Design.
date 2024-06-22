package br.com.alura.codechella.aplicacao.venda.modal;

import br.com.alura.codechella.infra.ingresso.modal.DadosTipoIngresso;
import br.com.alura.codechella.aplicacao.usuario.modal.DadosUsuario;

import java.util.List;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}
