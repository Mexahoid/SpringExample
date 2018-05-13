package vsu.kurs3.task3.examples.services;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("printerService")
public class PrinterService implements IPrinterService {
    private UUID id;
    public PrinterService(){
        System.out.println("PrinterService bean created.");
        id = UUID.randomUUID();
    }

    public void Print(String message) {
        System.out.println(message);
    }

    public void PrintUUID() {
        System.out.println("PrinterService UUID: " + id);
    }
}
