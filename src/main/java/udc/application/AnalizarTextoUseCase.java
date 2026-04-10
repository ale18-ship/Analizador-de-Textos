package udc.application;

import udc.domain.TextoAnalizador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AnalizarTextoUseCase {
    private final TextoAnalizador analizador = new TextoAnalizador();

    public List<Map.Entry<String, Integer>> ejecutar(String texto) {

            Map<String, Integer> resultado = analizador.analizar(texto);

            List<Map.Entry<String, Integer>> lista = new ArrayList<>(resultado.entrySet());

            // Ordenar de mayor a menor
            lista.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            return lista;
        }
}
