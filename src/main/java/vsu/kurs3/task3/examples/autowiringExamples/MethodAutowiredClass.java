package vsu.kurs3.task3.examples.autowiringExamples;

import vsu.kurs3.task3.services.IPrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MethodAutowiredClass implements IActing {
    private IPrinterService printer;

    @Autowired
    public void Method(IPrinterService printer){
        this.printer = printer;
    }

    public void ActDirect() {
        if(printer != null)
            printer.Print("MethodAutowired works fine, invoked ActDirect.");
        else
            System.out.println("MethodAutowired has problem, invoked ActDirect.");
    }

    @Override
    public void ActSided() {
        if(printer != null)
            printer.Print("MethodAutowired works fine, invoked ActSided.");
        else
            System.out.println("MethodAutowired has problem, invoked ActSided.");
    }
}
