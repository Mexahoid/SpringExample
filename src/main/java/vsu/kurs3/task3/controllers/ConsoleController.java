package vsu.kurs3.task3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import vsu.kurs3.task3.examples.autowiringExamples.*;

import java.util.List;

@Component
public class ConsoleController implements CommandLineRunner {

    @Autowired
    private AutowireController ac;

    @Override
    public void run(String... args) throws Exception {
        ac.Show();
    }
}
