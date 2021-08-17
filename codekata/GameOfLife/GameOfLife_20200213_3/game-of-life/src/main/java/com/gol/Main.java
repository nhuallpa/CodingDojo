package com.gol;

import static com.gol.AsciiEncoder.ENCODER;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

public class Main {
    public static void main(String[] argv) throws InterruptedException, IOException {
        String texto = FileUtils.readFileToString(new File(argv[0]), StandardCharsets.UTF_8);
        Universe universe = new Universe(ENCODER.decode(
                texto));
        while (true) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            universe.transicionar();
            System.out.println(AsciiEncoder.ENCODER.encode(universe.getCells()));
            Thread.sleep(30);
        }
    }
}
