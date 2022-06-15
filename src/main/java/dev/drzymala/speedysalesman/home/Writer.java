package dev.drzymala.speedysalesman.home;

import lombok.AllArgsConstructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@AllArgsConstructor
public class Writer<T> {

    public void write(List<T> list) throws IOException {

        String output = list.size() + "\n"
                + list.toString()
                .replace(",\s", "")
                .replaceAll("[\\[\\]]", "");

        System.out.println("Generated and saved to output.txt: \n" + output);
        Path path = Paths.get("output.txt");
        Files.writeString(path, output);
    }
}
