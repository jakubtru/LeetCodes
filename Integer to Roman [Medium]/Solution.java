class Solution {
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        int tys = num / 1000;
        int set = (num / 100) % 10;
        int dec = (num % 100) / 10;
        int jed = num % 10;
        if (tys != 0) {
            s.append("M".repeat(Math.max(0, tys)));
        }
        if (set != 0) {
            if (set == 9) {
                s.append("CM");
            } else if (set < 9 && set > 4) {
                s.append("D");
                s.append("C".repeat(set - 5));
            } else if (set == 4) {
                s.append("CD");
            } else {
                s.append("C".repeat(Math.max(0, set)));
            }
        }
        if (dec != 0) {
            if (dec == 9) {
                s.append("XC");
            } else if (dec < 9 && dec > 4) {
                s.append("L");
                s.append("X".repeat(dec - 5));
            } else if (dec == 4) {
                s.append("XL");
            } else {
                s.append("X".repeat(Math.max(0, dec)));
            }
        }
        if (jed != 0) {
            if (jed == 9) {
                s.append("IX");
            } else if (jed < 9 && jed > 4) {
                s.append("V");
                s.append("I".repeat(jed - 5));
            } else if (jed == 4) {
                s.append("IV");
            } else {
                s.append("I".repeat(Math.max(0, jed)));
            }
        }
        return s.toString();
    }
}
