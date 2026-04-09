package udc.domain;

import java.util.HashMap;
import java.util.Map;

public class TextoAnalizador {
    public Map<String, Integer> analizar(String texto) {

        texto = texto.toLowerCase().replaceAll("[^a-záéíóúñ ]", "");
        String[] palabras = texto.split("\\s+");

        Map<String, Integer> contador = new HashMap<>();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
            }
        }

        return contador;
    }
}
