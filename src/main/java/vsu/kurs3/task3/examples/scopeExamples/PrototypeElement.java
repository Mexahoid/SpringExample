package vsu.kurs3.task3.examples.scopeExamples;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("prototype")
public class PrototypeElement {

    private UUID uuid;

    private String value;

    private PrototypeElement(){
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
