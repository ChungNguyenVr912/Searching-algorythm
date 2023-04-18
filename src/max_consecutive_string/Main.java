package max_consecutive_string;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();

        do {
            System.out.print("Nhập chuỗi: ");
            String string = input.nextLine();
            if (string.equals("exit")){
                System.exit(69);
            }
            LinkedList<Character> max = getMaxString(list, string);
            for (Character ch : max) {
                System.out.print(ch);
            }
            System.out.println();
        }while (true);
    }

    private static LinkedList<Character> getMaxString(LinkedList<Character> list, String string) {
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() >= 1 && string.charAt(i) <= list.getLast()) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        return max;
    }
}
