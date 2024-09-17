import java.util.Scanner;

public class KT15p4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Xau x = new Xau();
        String st = in.nextLine();
        System.out.println(x.isCodeValid(st));
        st = in.nextLine();
        System.out.println(x.isBillCode(st));
    }
}

class Xau {
    public Xau() {
    }

    public boolean isCodeValid(String tmp) {
        if (tmp.charAt(0) != 'b' && tmp.charAt(0) != 'B') return false;

        try {
            String tmp1;
            if (tmp.length() > 3) {
                tmp1 = String.valueOf(tmp.charAt(1)) + String.valueOf(tmp.charAt(2));
            } else return false;
            int k = Integer.parseInt(tmp1);
        } catch (NumberFormatException e) {
            return false;
        }

        try {
            String tmp2 = String.valueOf(tmp.charAt(3)) + String.valueOf(tmp.charAt(4));
            tmp2 = tmp2.toLowerCase();
            if (!tmp2.equals("dc") && !tmp2.equals("at") && !tmp2.equals("cn")) return false;
        } catch (Exception e) {
            return false;
        }
        try {
            String tmp3 = String.valueOf(tmp.charAt(5)) + String.valueOf(tmp.charAt(6)) + String.valueOf((tmp.charAt(7)));
            int k = Integer.parseInt(tmp3);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean isBillCode(String tmp) {
        try {
            if (tmp.charAt(0) != 'N' && tmp.charAt(0) != 'n' && tmp.charAt(0) != 'x' && tmp.charAt(0) != 'X')
                return false;
            String tmp1 = String.valueOf(tmp.charAt(1)) + String.valueOf(tmp.charAt(2)) + String.valueOf((tmp.charAt(3)));
            try {
                int k = Integer.parseInt(tmp1);
            } catch (NumberFormatException e) {
                return false;
            }

            String tmp2 = String.valueOf(tmp.charAt(4)) + String.valueOf(tmp.charAt(5)) + String.valueOf((tmp.charAt(6))) + String.valueOf(tmp.charAt(7));
            if (!tmp2.equals("PTIT") && !tmp2.equals("ptit")) return false;

            String tmp3 = String.valueOf(tmp.charAt(8)) + String.valueOf(tmp.charAt(9));
            try {
                int k = Integer.parseInt(tmp3);
            } catch (NumberFormatException e) {
                return false;
            }
            String tmp4 = String.valueOf(tmp.charAt(8)) + String.valueOf(tmp.charAt(9)) + String.valueOf((tmp.charAt(10))) + String.valueOf(tmp.charAt(11));
            try {
                int k = Integer.parseInt(tmp4);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }


    }
}
