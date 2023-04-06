class Solution {
    public int reverse(int x) {
        String str = String.valueOf(x);
        Stack<Character> digits = new Stack<Character>();
        StringBuilder y = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            digits.push(str.charAt(i));
        }
        int i = 0, j = 0;

        while (!digits.empty()) {
            char d = digits.pop();
            if (d == '0' && i == j) {
                j++;
                i++;
                continue;
            }
            i++;
            y.append(d);
        }

        String res = String.valueOf(y);
        int result;
        try {
            if (res.charAt(res.length() - 1) == '-') {
                result = -1 * Integer.parseInt(res.substring(0, res.length() - 1));
            } else {
                result = Integer.parseInt(res);
            }
        } catch (Exception e) {
            return 0;
        }
        return result;
    }
}
