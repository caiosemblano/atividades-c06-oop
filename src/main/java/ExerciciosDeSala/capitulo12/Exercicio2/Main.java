package ExerciciosDeSala.capitulo12.Exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Alimento("Chocolate", 15));
        produtos.add(new Alimento("Arroz 5kg", 30));

        produtos.add(new Eletronico("Smartphone", 1500));
        produtos.add(new Eletronico("Fone Bluetooth", 250));

        produtos.add(new Vestuario("Camiseta", 80));
        produtos.add(new Vestuario("Calça Jeans", 120));

        System.out.println("=== LISTA ORIGINAL (DESORDENADA) ===");
        for (Produto p : produtos) {
            System.out.println(p);
        }
        System.out.println();

        Collections.sort(produtos);

        System.out.println("=== LISTA ORDENADA (DECRESCENTE POR PREÇO) ===");
        for (Produto p : produtos) {
            System.out.println(p);
        }
        System.out.println();

        Produto maiorPeloCompareTo = Collections.max(produtos);
        System.out.println("Collections.max(produtos) (Maior segundo compareTo / menor preço):");
        System.out.println("-> " + maiorPeloCompareTo);
        System.out.println();

        Produto menorPeloCompareTo = Collections.min(produtos);
        System.out.println("Collections.min(produtos) (Menor segundo compareTo / maior preço):");
        System.out.println("-> " + menorPeloCompareTo);
        System.out.println();

        Produto buscaAlvo = produtos.get(2);
        int indice = Collections.binarySearch(produtos, buscaAlvo);
        System.out.println("Collections.binarySearch(produtos, " + buscaAlvo.getNome() + "):");
        System.out.println("-> Encontrado no índice: " + indice);
        System.out.println();

        Produto naoExistente = new Alimento("Lasanha", 18);
        int indiceNaoExistente = Collections.binarySearch(produtos, naoExistente);
        System.out.println("Collections.binarySearch para item inexistente (" + naoExistente.getNome() + "):");
        System.out.println("-> Posição/Retorno: " + indiceNaoExistente);
        System.out.println();

        Collections.reverse(produtos);
        System.out.println("=== LISTA REVERTIDA (AGORA CRESCENTE POR PREÇO) ===");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
