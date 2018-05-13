package vsu.kurs3.task3.examples.scopeExamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("singleton")
public class SingletonElement {

    private UUID uuid;

    private String value;

    private SingletonElement(){
        uuid = UUID.randomUUID();
    }

    public void showUUID() {
        System.out.println("ScopeElement UUID: " + uuid);
    }

    public void showValue() {
        System.out.println("ScopeElement Value: " + value);
    }

    public void setValue(String value) {
        this.value = value;
    }
}
