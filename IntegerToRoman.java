public class IntegerToRoman {
    
    public static String intToRoman(int num) {
        // Define Roman numeral symbols and their values
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        StringBuilder romanString = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                romanString.append(romanSymbols[i]);
                num -= values[i];
            }
        }
        
        return romanString.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));  // Output: MCMXCIV
    }
}
