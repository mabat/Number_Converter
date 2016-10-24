package converter;

public class Operation extends Conversion {

    Operation() {
        super();
    }

    public String octalSum(String a, String b) {

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        int carry = 0, sum = 0;
        int i = 1;
        while (x != 0 || y != 0) {

            if ((x % 10 + y % 10 + carry) <= 7) {
                sum += ((x % 10 + y % 10 + carry)) * i;
                carry = 0;
            } else {
                int help = (x % 10 + y % 10 + carry) - 8;
                carry = 1;
                sum += help * i;
            }
            i *= 10;
            x /= 10;
            y /= 10;
        }
        if (x == 0 && y == 0 && carry == 1) {
            sum += carry * i;
        }
        return Integer.toString(sum);
    }

    public String hexSum(String a, String b) {

        int x = 0;
        int y = 0;

        StringBuilder sum = new StringBuilder();

        int carry = 0; //prenosi ostatak
        int Alen = a.length() - 1; //dvi pomocne varijable o velicini niza te kako 
        int Blen = b.length() - 1;//iz nizova uzimamo vrijednosti na zadnjem mjestu tako ovo umanjujemo

        try {
            while (Alen >= 0 || Blen >= 0) {

                for (int i = 0; i < hex.length; ++i) {
                    if (Alen >= 0 && hex[i] == a.charAt(Alen)) { //usporedjujemo uvik zadnje slovo sa hex nizom da nadjemo vrijednost
                        x = i;
                        Alen--;
                    }
                    if (Blen >= 0 && hex[i] == b.charAt(Blen)) {
                        y = i;
                        Blen--;
                    }
                    if (x != 0 && y != 0) {
                        break;
                    }
                }

                if ((x + y + carry) <= 15) { //ako je suma hex
                    sum.insert(0, Character.toString(hex[x + y + carry]));
                    carry = 0;
                    x = y = 0;
                } else {
                    int help = (x + y + carry) - 16;
                    carry = 1;
                    sum.insert(0, Character.toString(hex[help]));
                    x = y = 0;
                }
            }
            if (carry == 1) {
                sum.insert(0, '1');
            }
        } catch (Exception e) {

        }
        return new String(sum);
    }

    public String decSum(String a, String b) {

        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);

        return Integer.toString(A + B);
    }

    public String binSum(String a, String b) {

        long A = Long.parseLong(a);
        long B = Long.parseLong(b);

        long C = 0l;
        long i = 1l;
        boolean carry = false;

        while (A > 0 || B > 0) {

            if ((A % 10 == 1 && B % 10 == 0 && carry == false) || (A % 10 == 0 && B % 10 == 1 && carry == false)) {
                C += 1 * i;
                carry = false;
            } else if ((A % 10 == 1 && B % 10 == 0 && carry == true) || (A % 10 == 0 && B % 10 == 1 && carry == true)) {
                C += 0 * i;
                carry = true;
            } else if (A % 10 == 1 && B % 10 == 1 && carry == true) {
                C += 1 * i;
                carry = true;
            } else if (A % 10 == 1 && B % 10 == 1 && carry == false) {
                C += 0 * i;
                carry = true;
            } else if (A % 10 == 0 && B % 10 == 0 && carry == true) {
                C += 1 * i;
                carry = false;
            } else if (A % 10 == 0 && B % 10 == 0 && carry == false) {
                C += 0 * i;
                carry = false;
            }
            i *= 10;
            A /= 10;
            B /= 10;
        }
        if (carry == true) {
            C += 1 * i;
        }
        return Long.toString(C);
    }
}
