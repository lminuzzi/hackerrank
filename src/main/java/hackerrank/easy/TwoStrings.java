package hackerrank.easy;

public class TwoStrings {
    public static final String YES = "YES";
    public static final String NO = "NO";

    public String twoStrings(String s1, String s2) {
        boolean anyMatch = s2.chars().distinct()
                .anyMatch(p -> s1.chars().distinct().anyMatch(k -> k == p));
        if(anyMatch) {
            return YES;
        }
        return NO;
    }
}
