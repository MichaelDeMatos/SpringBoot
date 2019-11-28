package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;

/**
 * TopicoController
 */
@RestController
public class TopicoController {

    @RequestMapping("/topicos")
    List<TopicoDto> listaTopicos() {
      Topico topico = new Topico("Dúvida","Dúvida com Spring", new Curso("Spring", "Back-end"));

		return TopicoDto.converter(Arrays.asList(topico, topico, topico));

    }
    
}