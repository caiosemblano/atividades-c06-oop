package ExerciciosDeSala.capitulo12.Exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Double> nums = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            nums.add(Double.valueOf(random.nextDouble() * 10000D));
        }
        nums.sort(Collections.reverseOrder());

        for(Double n : nums) {
            System.out.println(n);
        }

    }
}
