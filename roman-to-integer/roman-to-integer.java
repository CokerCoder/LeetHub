class Solution {
    public int romanToInt(String s) {
        int num = 0;
        Map<Character, Integer> roman = new HashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        num += roman.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            num += roman.get(ch);
            if ((ch == 'V' || ch == 'X') && s.charAt(i - 1) == 'I')
                num -= 2;
            if ((ch == 'L' || ch == 'C') && s.charAt(i - 1) == 'X')
                num -= 20;
            if ((ch == 'D' || ch == 'M') && s.charAt(i - 1) == 'C')
                num -= 200;
        }

        return num;
    }
}