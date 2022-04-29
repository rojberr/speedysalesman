package dev.drzymala.speedysalesman.presenter.application;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Writer<T> {

    public void write(List<T> list) {

        String output = list.size() + "\n"
                + list.toString()
                .replace(",\s", "")
                .replaceAll("[\\[\\]]", "");


        System.out.println(output);
    }
}
