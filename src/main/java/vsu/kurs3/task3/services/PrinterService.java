package vsu.kurs3.task3.services;

import org.springframework.stereotype.Service;

@Service("printerService")
public class PrinterService implements IPrinterService {
    public void Print(String message) {
        System.out.println(message);
    }
}
