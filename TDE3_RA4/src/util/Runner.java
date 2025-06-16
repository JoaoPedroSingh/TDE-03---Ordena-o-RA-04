package util;

import sort.QuickSort;
import sort.GnomeSort;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Runner {
    public static void runAll() throws IOException {
        // ✅ Cria pasta 'results' se não existir
        File resultsDir = new File("results");
        if (!resultsDir.exists()) {
            resultsDir.mkdir();
        }

        FileWriter writer = new FileWriter("results/metrics.csv");
        writer.write("Algorithm,Size,Seed,Time(ms),Swaps,Iterations\n");

        int[] sizes = {1000, 10000, 100000, 500000, 1000000};

        for (int size : sizes) {
            for (int seed = 1; seed <= 5; seed++) {
                int[] original = DataGenerator.generate(size, seed);

                // Quick Sort
                int[] quickArray = original.clone();
                Metrics quickMetrics = new Metrics();
                long startQuick = System.nanoTime();
                QuickSort.sort(quickArray, quickMetrics);
                long endQuick = System.nanoTime();
                quickMetrics.timeNano = endQuick - startQuick;
                writer.write(String.format("QuickSort,%d,%d,%.2f,%d,%d\n",
                        size, seed, quickMetrics.timeNano / 1_000_000.0,
                        quickMetrics.swaps, quickMetrics.iterations));

                // Gnome Sort
                int[] gnomeArray = original.clone();
                Metrics gnomeMetrics = new Metrics();
                long startGnome = System.nanoTime();
                GnomeSort.sort(gnomeArray, gnomeMetrics);
                long endGnome = System.nanoTime();
                gnomeMetrics.timeNano = endGnome - startGnome;
                writer.write(String.format("GnomeSort,%d,%d,%.2f,%d,%d\n",
                        size, seed, gnomeMetrics.timeNano / 1_000_000.0,
                        gnomeMetrics.swaps, gnomeMetrics.iterations));
            }
        }

        writer.close();
    }
}
