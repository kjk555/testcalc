package pl.coi.test;

import java.util.Scanner;

public class InputData  {

    public InputData(Scanner scanner) {
        this.scanner = scanner;
    }

    public InputData() {
        scanner = new Scanner(System.in);
    }

    Scanner scanner = null;

    public double getDouble(String messgae) {
        boolean ok = true;
        double val = 0;
        do {

            System.out.print(messgae);
            try {
                scanner = new Scanner(System.in);
                val = scanner.nextDouble();
            } catch (Exception e) {
                ok = false;
                System.out.println("Błędna liczba");
            }
        }
        while (!ok);
        return val;
    }

    public Main.Operation  getOperation() {
        boolean ok = true;
        int val = 0;
        do {

            System.out.println("Podaj operacje");
            System.out.println("1 - add");
            System.out.println("2 - sub");
            System.out.println("3  - multiply");
            System.out.println("4 - div");
            Scanner scanner = null;
            try {
                scanner = new Scanner(System.in);
                val = scanner.nextInt();
            } catch (Exception e) {
                ok = false;
                System.out.println("błędna operacja");
            }
            switch ( val ) {
                case 1:
                    return Main.Operation.ADD;
                case 2:
                    return Main.Operation.SUB;
                case 3:
                    return Main.Operation.MUX;
                case 4:
                    return Main.Operation.DIV;
                default:
                    System.out.println("błędna operacja");
                    ok = false;
                    break;
            }
        }
        while (!ok);
        return null;
    }
}
