package vsu.kurs3.task3.examples.autowiringExamples;

import vsu.kurs3.task3.services.IPrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyAutowiredClass implements IActing {
    @Autowired
    private IPrinterService printer;

    public void ActDirect(){
        if(printer != null)
            printer.Print("PropertyAutowired works fine, invoked ActDirect.");
        else
            System.out.println("PropertyAutowired has problem, invoked ActDirect.");
    }

    @Override
    public void ActSided() {
        if(printer != null)
            printer.Print("PropertyAutowired works fine, invoked ActSided.");
        else
            System.out.println("PropertyAutowired has problem, invoked ActSided.");
    }
}
