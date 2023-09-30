package exceptions.semthree.hw.view;

import exceptions.semthree.hw.control.Control;
import exceptions.semthree.hw.control.VersionControl;

import java.util.Scanner;

public class VersionView implements View {
    private final Control control;

    public VersionView() {
        this.control = new VersionControl();
    }

    @Override
    public void start() {
        Scanner in = new Scanner(System.in).useDelimiter("\r?\n");
        while (true) {
            System.out.println("""
                    Введите данные в произвольном порядке, разделенные пробелом:
                    <ФИО дд.мм.гггг 0123456789 f|m>
                    введите [exit] для выхода""");
            String input = in.next();
            if (input.equalsIgnoreCase("exit")) System.exit(0);
            this.control.execute(input);
        }
    }
}