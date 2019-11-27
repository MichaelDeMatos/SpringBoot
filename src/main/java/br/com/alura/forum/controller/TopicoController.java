package br.com.alura.forum.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;

/**
 * TopicoController
 */
@RestController
public class TopicoController {

    @RequestMapping("/topicos")
    List<TopicoDto> listaTopicos() {
		return null;

    }
    
}