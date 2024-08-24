package Strings;

public class String_Palindrome {

    // ========== For Palindrom function======================
    public static boolean palindrom(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("Not linfrom");
                return false;
            }
        }
        return true;
    }

    // ======================Get Shoerest PAth======================
    public static float getShortPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'n') {
                y++;
            } else if (str.charAt(i) == 's') {
                y--;
            } else if (str.charAt(i) == 'w') {
                x--;
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    // =================for uppercase================
    public static String toUpperCasse(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // =================String Comprassion================
    public static String StringCompression(String strCom) {
        StringBuilder newStr = new StringBuilder("");
    
        for (int i = 0; i < strCom.length(); i++) {
            int count = 1;  // Change Integer to int for simplicity
            while (i < strCom.length() - 1 && strCom.charAt(i) == strCom.charAt(i + 1)) {
                count++; 
                i++;
            }
            newStr.append(strCom.charAt(i));
            if (count > 1) {
                newStr.append(count);  // Corrected the way to append count
            }
        }
        return newStr.toString();
    }
        public static void main(String args[]) {
        // System.out.println(getShortPath(str));

        // ===================For given set of string print the largest
        // string===============

        // String Fruits[] = {"apple","appae","aaaaanana"};
        // String largest = Fruits[0];
        // for (int i = 1; i < Fruits.length; i++) {
        // if (largest.compareTo(Fruits[i])<0) {
        // largest = Fruits[i];
        // }
        // }
        // System.out.println("Largest : "+ largest);

        // ===================END the largest string======

        // =================for uppercase================
        // String str = "hi, i am abhimanyu jangid";
        // System.err.println(toUpperCasse(str));

        // =================for Comprasion================
        String strCom = "asssssssssssfffffffffffsfffrrrhhfffgbc";
        System.err.println(StringCompression(strCom));
    }
}
