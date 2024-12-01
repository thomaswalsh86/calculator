package calculator;

import java.util.ArrayList;

public class convertor {
    public ArrayList<String> convert(String selected) {
        int prevPoint = -1;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < selected.length(); i++) {
            String sub = selected.substring(i, i + 1);
            if (matches(sub)) {
                String word = selected.substring(prevPoint + 1, i);
                arrayList.add(word);
                arrayList.add(sub);
                prevPoint = i;
            }
        }
        if (prevPoint < selected.length() - 1) {
            arrayList.add(selected.substring(prevPoint + 1));
        }
        return arrayList;
    }

    public boolean matches(String sub) {
        return sub.equals("+") || sub.equals("-") || sub.equals("x") || sub.equals("/");
    }

    public int math(ArrayList<String> arrayList) {
        Core core = new Core();
        int total = Integer.parseInt(arrayList.get(0));
        for (int i = 1; i < arrayList.size(); i += 2) {
            String operator = arrayList.get(i);
            int nextNumber = Integer.parseInt(arrayList.get(i + 1));
            switch (operator) {
                case "+":
                    total = core.add(total, nextNumber);
                    break;
                case "-":
                    total = core.subtract(total, nextNumber);
                    break;
                case "x":
                    total = core.multiply(total, nextNumber);
                    break;
                case "/":
                    total = core.divide(total, nextNumber);
                    break;
            }
        }
        return total;
    }
}
