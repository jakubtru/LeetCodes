class Solution {
    public int compress(char[] chars) {
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            char x = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == x) {
                count++;
                i++;
            }
            i--;
            if (count == 1) {
                chars[k] = x;
                k += 1;
            } else {
                chars[k] = x;
                String counter = String.valueOf(count);
                for (int j = 0; j < counter.length(); j++) {
                    chars[k + j + 1] = counter.charAt(j);
                }
                k += counter.length() + 1;
            }
        }
        return k;
    }
}
