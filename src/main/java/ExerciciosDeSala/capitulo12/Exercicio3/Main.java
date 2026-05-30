package ExerciciosDeSala.capitulo12.Exercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        long inicio0 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            array.add(i * 100);
        }
        long fim0 = System.currentTimeMillis();
        System.out.println("tempo gasto para Cem Mil inserts no Array: " + (fim0 - inicio0) + "ms");

        long inicio1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            hashSet.add(i * 100);
        }
        long fim1 = System.currentTimeMillis();
        System.out.println("tempo gasto para Cem Mil inserts no HashSet: " + (fim1 - inicio1) + "ms");

        long inicio2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            hashMap.put(i, (i * 100));
        }
        long fim2 = System.currentTimeMillis();
        System.out.println("tempo gasto para Cem Mil inserts no HashMap: " + (fim2 - inicio2) + "ms");

        long inicioBusca0 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            array.contains(i * 100);
        }
        long fimBusca0 = System.currentTimeMillis();
        System.out.println("tempo gasto para Cem Mil buscas no Array: " + (fimBusca0 - inicioBusca0) + "ms");

        long inicioBusca1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            hashSet.contains(i * 100);
        }
        long fimBusca1 = System.currentTimeMillis();
        System.out.println("tempo gasto para Cem Mil buscas no HashSet: " + (fimBusca1 - inicioBusca1) + "ms");

        long inicioBusca2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            hashMap.containsKey(i);
        }
        long fimBusca2 = System.currentTimeMillis();
        System.out.println("tempo gasto para Cem Mil buscas no HashMap: " + (fimBusca2 - inicioBusca2) + "ms");
    }
}
