package pl.sda.kurs.z14_17_03_2019.TicTakToe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsoleInputManager implements InputManager {

    Scanner scanner;

    Map<String, String> fieldMap;

    {
        fieldMap = new HashMap<>();
        fieldMap.put("1", "00");
        fieldMap.put("2", "01");
        fieldMap.put("3", "02");
        fieldMap.put("4", "10");
        fieldMap.put("5", "11");
        fieldMap.put("6", "12");
        fieldMap.put("7", "20");
        fieldMap.put("8", "21");
        fieldMap.put("9", "22");
    }

    public ConsoleInputManager() {
        scanner = new Scanner(System.in);
    }

    @Override
    public SingleNode getPlayerOneSign(OutputManager out) {
        out.printSelectSign();
        String sign = scanner.next();

        if (!sign.matches("[xoXO]") && sign.length() > 1)
            throw new IllegalArgumentException();

        return SingleNode.valueOf(sign);
    }

    @Override
    public String getField(OutputManager out) {
        String field = scanner.next();
        if (!field.matches("[1-9]") && field.length() > 1)
            throw new IllegalArgumentException();

        return fieldMap.get(field);
    }
}
