package vsu.kurs3.task3.examples.scopeExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vsu.kurs3.task3.examples.services.IPrinterService;

@Component
public class ScopeController {

    private final IPrinterService printer;

    final
    PrototypeElement p1;
    final
    PrototypeElement p2;

    final
    SingletonElement s1;

    final
    SingletonElement s2;

    @Autowired
    public ScopeController(IPrinterService printer, PrototypeElement p1, PrototypeElement p2, SingletonElement s1, SingletonElement s2) {
        this.printer = printer;
        this.p1 = p1;
        this.p2 = p2;
        this.s1 = s1;
        this.s2 = s2;
    }

    public void Show(){
        printer.Print("Prototype 1");
        p1.showUUID();
        p1.showValue();
        printer.Print("Prototype 2");
        p2.showUUID();
        p2.showValue();

        printer.Print("Prototype 1 change value");
        p1.setValue("AeroCock sas 700W");
        p1.showValue();
        p2.showValue();


        printer.Print("Singleton 1");
        s1.showUUID();
        s1.showValue();
        printer.Print("Prototype 2");
        s2.showUUID();
        s2.showValue();

        printer.Print("Prototype 1 change value");
        s1.setValue("AeroCock sas 1488W");
        s1.showValue();
        s2.showValue();

    }

}
