package br.com.alura.codechella.Domain.Evento;

import br.com.alura.codechella.Domain.ingresso.TipoIngresso;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Evento {
    private UUID uuid;
    private Long id;
    private Categoria categoria;

    private String descricao;
    private Endereco endereco;
    private LocalDateTime data;
    private List<TipoIngresso> tipoIngressos = new ArrayList<>();

    public Evento(Long id, Categoria categoria, String descricao, Endereco endereco, LocalDateTime data, List<TipoIngresso> tipoIngressos) {
        this.id = id;
        this.categoria = categoria;
        this.descricao = descricao;
        this.endereco = endereco;
        this.data = data;
        this.tipoIngressos = tipoIngressos;
        gerarIdentificadorUnico();
    }

    private void gerarIdentificadorUnico() {
        this.uuid = UUID.randomUUID();
    }

    public void incluiNovoTipoIngressoAoEvento (TipoIngresso tipoIngresso){
        this.tipoIngressos.add(tipoIngresso);
    }
      }

    public static class Builder {
        private Evento evento;

        public Builder() {
            evento = new Evento();
        }

        public Builder comCategoria(Categoria categoria) {
            evento.categoria = categoria;
            return this;
        }

        public Builder comDescricao(String descricao) {
            evento.descricao = descricao;
            return this;
        }

        public Builder comEndereco(String cep, Integer numero, String complemento) {
            Endereco endereco = new Endereco(cep, numero, complemento);
            evento.endereco = endereco;
            return this;
        }

        public Builder comData(LocalDateTime data) {
            evento.data = data;
            return this;
        }

        public Evento build() {
            evento.gerarIdentificadorUnico();
            return evento;
        }
    }

    public Long getId() {
        return id;
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
