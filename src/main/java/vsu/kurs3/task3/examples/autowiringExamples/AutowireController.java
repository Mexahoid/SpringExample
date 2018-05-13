package vsu.kurs3.task3.examples.autowiringExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vsu.kurs3.task3.services.IPrinterService;

import java.util.List;

@Component
public class AutowireController {

    @Autowired
    private ConstructorAutowiredClass cac;

    @Autowired
    private MethodAutowiredClass mac;

    @Autowired
    private PropertyAutowiredClass pac;

    @Autowired
    private List<IActing> acs;

    @Autowired
    private IPrinterService printer;

    public AutowireController(){}

    public void Show(){
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
