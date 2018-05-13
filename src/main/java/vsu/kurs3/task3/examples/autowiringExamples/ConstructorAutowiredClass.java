package vsu.kurs3.task3.examples.autowiringExamples;

import vsu.kurs3.task3.examples.services.IPrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorAutowiredClass implements IActing {
    private IPrinterService printer;

    @Autowired
    public ConstructorAutowiredClass(IPrinterService printer){
        this.printer = printer;
    }

    public void ActDirect(){
        if(printer != null)
            printer.Print("ConstructorAutowired works fine, invoked ActDirect.");
        else
            System.out.println("ConstructorAutowired has problem, invoked ActDirect.");
    }

    @Override
    public void ActSided() {
        if(printer != null)
            printer.Print("ConstructorAutowired works fine, invoked ActSided.");
        else
            System.out.println("ConstructorAutowired has problem, invoked ActSided.");
    }
}
