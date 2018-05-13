package vsu.kurs3.task3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import vsu.kurs3.task3.examples.autowiringExamples.*;
import vsu.kurs3.task3.examples.scopeExamples.ScopeController;

@Component
public class ConsoleController implements CommandLineRunner {

    @Autowired
    private AutowireController ac;

    @Autowired
    private ScopeController sc;

    @Override
    public void run(String... args) throws Exception {
        ac.Show();
        sc.Show();
    }
}
