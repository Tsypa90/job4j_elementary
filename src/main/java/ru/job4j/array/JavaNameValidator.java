package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = true;
        if (name.isEmpty()) {
            rsl = false;
        } else if (Character.isUpperCase(name.charAt(0))) {
            rsl = false;
        } else if (Character.isDigit(name.charAt(0))) {
            rsl = false;
        } else {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (!isSpecialSymbol(code)) {
                    if (!isUpperLatinLetter(code)) {
                        if (!isLowerLatinLetter(code)) {
                            rsl = false;
                            break;
                        }
                    }
                }
            }
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 || code <= 95;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code <= 122 || code >= 97;
    }
}
