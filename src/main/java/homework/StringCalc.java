package homework;

public class StringCalc {
    public static int add(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        s = s.replaceAll("\n", ",");
        s = s.replaceAll("//", ",");
        s = s.replaceAll(";", ",");
        s = s.replaceAll("#", ",");
        String[] nums = s.split(",");
        int sum = 0;
        for (String num : nums) {
            if (Integer.parseInt(num.trim()) <= 1000) {
                sum += Integer.parseInt(num.trim());
            }
        }
        return sum;
    }
}
