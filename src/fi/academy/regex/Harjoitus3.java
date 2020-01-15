package fi.academy.regex;

import java.io.*;

public class Harjoitus3 {

    public Harjoitus3() {

    }

    public static boolean isInteger(String ehdokas) {
        for (int i = 0; i < ehdokas.length(); i++)
            if (!Character.isDigit(ehdokas.charAt(i)))
                return false;

        return true;

    }
}
