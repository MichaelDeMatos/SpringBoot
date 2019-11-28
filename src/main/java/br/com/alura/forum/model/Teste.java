package br.com.alura.forum.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Teste
 */
public class Teste {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Benjamin", "Michael", "Natalia");
        list.stream().filter(s -> s.length() > 7).collect(Collectors.toList());
        // .map(String::length)
        list.sort(Comparator.comparingInt(String::length));
        list.forEach(System.out::println);
        
    }
    
}