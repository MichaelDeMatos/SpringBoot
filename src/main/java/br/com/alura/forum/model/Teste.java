package br.com.alura.forum.model;

import java.util.Arrays;
import java.util.List;

/**
 * Teste
 */
public class Teste {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Michael", "Natalia", "Benjamin");
        list.stream()
        .filter(s -> s.length() > 7)
        .forEach(System.out::println);
    }
    
}