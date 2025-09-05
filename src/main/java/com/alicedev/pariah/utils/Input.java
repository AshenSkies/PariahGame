package com.alicedev.pariah.utils;

import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Scanner;

public class Input {

    /// @param message An optional String to be passed as a query.
    /// @param scanner An open Scanner.
    /// @return String Text given by the user.
    public static String inputString(@Nullable String message, Scanner scanner) {
        if (message != null) System.out.print(message);
        String res;
        do {
            res = scanner.nextLine();
            res = res.strip();
        } while (res.isBlank());
        return res;
    }

    /// @param message An optional String to be passed as a query.
    /// @param scanner An open Scanner.
    /// @return MenuOption Option chosen by the user.
    public static MenuOption inputOption(@Nullable String message, List<MenuOption> options, Scanner scanner) {
        if (message != null) System.out.println(message);

        int counter = 1;
        for (MenuOption opt : options) {
            System.out.println(counter + ". " + opt.getDescription());
            counter++;
        }

        int opt;
        do {
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            opt = scanner.nextInt();
        }while (opt <= 0 || opt > options.size());
        return options.get(opt-1);
    }
}
