package converter;

import java.util.ArrayList;
import java.util.List;

public class Conversion {

    protected final char[] hex;
    private final String[] binForOctal;
    private final String[] binForHex;

    Conversion() {
        this.hex = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        this.binForOctal = new String[]{"000", "001", "010", "011", "100", "101", "110", "111"};
        this.binForHex = new String[]{"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    }

    public String decToOct(int d) {

        int octal = 0;
        int i = 1;
        while (d > 0) {
            octal = octal + (d % 8 * i);
            d /= 8;
            i *= 10;
        }
        return Integer.toString(octal);
    }

    public String decToHex(int d) {

        List<Integer> tempHex = new ArrayList<>();
        String h = "";
        while (d > 0) {
            tempHex.add(d % 16);
            d /= 16;
        }
        for (int i = tempHex.size() - 1; i >= 0; --i) 
            h += hex[tempHex.get(i)];
        return h;
    }

    public String decToBin(int d) {

        long binary = 0l;
        long i = 1l;

        while (d > 0) {
            binary = binary + (d % 2 * i);
            d /= 2;
            i *= 10;
        }
        return Long.toString(binary);
    }

    public String octToDec(int oc) {

        int d = 0;
        int power = 0; //potencija koja ide od kraja i uvecava se za jedan svaki put
        while (oc > 0) {
            d += (oc % 10) * Math.pow(8, power);
            power++;
            oc = oc / 10;
        }
        return Integer.toString(d);
    }

    public String octToHex(int oc) {

        StringBuilder binary = new StringBuilder();
        String h = "";
        while (oc > 0) {
            binary.insert(0, binForOctal[oc % 10]); //spaja tri bitne brojeve npr 3 2 7 ->  011+010+111, zapisano je naopako 111010110
            oc /= 10;
        }
        //provjeravamo visak nula na pocetku, ako u visku ima jedinica onda moramo nadodati onoliko nula da imamo par od 4, inace ih brisemo
        if (binary.length() % 4 == 1 && binary.charAt(0) == '1') { 
            binary.insert(0, "000");
        } else if (binary.length() % 4 == 2 && (binary.charAt(0) == '1' || binary.charAt(1) == '1')) {
            binary.insert(0, "00");
        } else if (binary.length() % 4 == 3 && (binary.charAt(0) == '1' || binary.charAt(1) == '1' || binary.charAt(2) == '1')) {
            binary.insert(0, "0");
        } else {
            int del = binary.length() % 4; //da izbrise onoliko nula koliko se ne uklapa
            while (del > 0) { //izbrisi nulu ako je na pocetku
                binary.deleteCharAt(0);
                del--;
            }
        }

        for (int i = 0; i < binary.length(); i += 4) {
            for (int j = 0; j < binForHex.length; ++j) {
                if (binary.substring(i, i + 4).equals(binForHex[j])) {
                    h += hex[j];
                    continue;
                }
            }
        }
        return h;
    }

    public String octToBin(int d) {

        StringBuilder binary = new StringBuilder();
        List<Integer> tempOct = new ArrayList<>();
        while (d > 0) {
            tempOct.add(d % 10); //dodaje u niz dekadske vrijednosti
            d /= 10;
        }

        for (int i = tempOct.size() - 1; i >= 0; --i) 
            binary.append(binForOctal[(tempOct.get(i))]); //iscitavamo iz niza dekadske vrijednosti koje odgovaraju binarnom zapisu u binForOctal

        while (binary.charAt(0) == '0') { //izbrisi nulu ako je na pocetku
            binary.deleteCharAt(0);
        }
        return new String(binary);
    }

    public String hexToDec(String h) {

        int d = 0;
        int power = 0;
        int index = 0;

        for (int i = h.length() - 1; i >= 0; --i) {
            for (int j = 0; j < hex.length; ++j) {
                if (h.charAt(i) == hex[j]) {
                    index = j;
                    continue;
                }
            }
            d += index * Math.pow(16, power);
            power++;
        }
        return Integer.toString(d);
    }

    public String hexToBin(String h) {

        StringBuilder binary = new StringBuilder();
        int index = 0;

        for (int i = h.length() - 1; i >= 0; --i) {
            for (int j = 0; j < hex.length; ++j) {
                if (h.charAt(i) == hex[j]) {
                    index = j;
                    continue;
                }
            }
            binary.insert(0, binForHex[index]);
        }
        return new String(binary);
    }

    public String binToDec(String b) {

        long bin = Long.parseLong(b);
        int power = 0;
        int binary = 0;
        
        while (bin != 0) {
            if (bin % 10 == 1) 
                binary += Math.pow(2, power);
            bin/=10;
            power++;

        }
        return Integer.toString(binary);
    }
}
