package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import br.com.alura.forum.model.Topico;

public class TopicoDto {
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    TopicoDto(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }

    public Long getId() {
        return id;
    }


    public String getTitulo() {
        return titulo;
    }


    public String getMensagem() {
        return mensagem;
    }


    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }


}
