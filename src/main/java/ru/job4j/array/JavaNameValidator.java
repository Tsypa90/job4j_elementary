package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = !(name.isEmpty() || Character.isUpperCase(name.charAt(0)) || Character.isDigit(name.charAt(0)));
        if (rsl) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (!(isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code))) {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 95;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code <= 122 && code >= 97;
    }
}
