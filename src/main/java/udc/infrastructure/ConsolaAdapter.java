package udc.infrastructure;

import udc.application.AnalizarTextoUseCase;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConsolaAdapter {
    private final AnalizarTextoUseCase useCase = new AnalizarTextoUseCase();

    public void iniciar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un párrafo:");
        String texto = sc.nextLine();

        List<Map.Entry<String, Integer>> resultado = useCase.ejecutar(texto);

        System.out.println("\nTop 5 palabras más frecuentes:");

        for (int i = 0; i < Math.min(5, resultado.size()); i++) {
            System.out.println((i + 1) + ". " +
                    resultado.get(i).getKey() + " -> " +
                    resultado.get(i).getValue());
        }
    }
}
