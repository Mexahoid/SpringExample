package vsu.kurs3.task3.examples.autowiringExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vsu.kurs3.task3.examples.services.IPrinterService;

import java.util.List;

@Component
public class AutowireController {

    private final ConstructorAutowiredClass cac;

    private final MethodAutowiredClass mac;

    private final PropertyAutowiredClass pac;

    private final List<IActing> acs;

    private final IPrinterService printer;

    @Autowired
    public AutowireController(ConstructorAutowiredClass cac, MethodAutowiredClass mac, PropertyAutowiredClass pac, List<IActing> acs, IPrinterService printer){
        this.cac = cac;
        this.mac = mac;
        this.pac = pac;
        this.acs = acs;
        this.printer = printer;
    }

    public void Show(){
        printer.PrintUUID();
        printer.Print("Standard autowire showcase:");
        cac.ActDirect();
        mac.ActDirect();
        pac.ActDirect();

        printer.Print("List autowire showcase:");
        for(IActing i : acs){
            i.ActSided();
        }
    }
}
