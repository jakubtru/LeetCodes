class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!list.contains(s.charAt(i))) {
                list.add(s.charAt(i));
                System.out.println(list.size() + " X " + maxLength + " " + list.toString());
            } else {
                System.out.println(list.size() + " " + maxLength + " " + list.toString());
                if (list.size() > maxLength) {
                    maxLength = list.size();
                }

                //list.removeRange(0,list.indexOf(s.charAt(i)+1));
                int n = list.indexOf(s.charAt(i));
                //System.out.println("n: " + n);
                for (int j = 0; j <= n; j++) {
                    list.remove(0);
                }
                list.add(s.charAt(i));
                //System.out.println("deleted " + list.size() + " " + maxLength + " " + list.toString());

            }
        }
        if (list.size() > maxLength) {
            maxLength = list.size();
        }
        return maxLength;
    }
}
