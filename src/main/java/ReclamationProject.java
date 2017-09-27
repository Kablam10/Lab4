/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * This class will find the longest substring found in two different strings.
 * @author mpiunti2
 */
public class ReclamationProject {

    /**
     * Finds the longest substring found in two given strings.
     * @param first the first input string
     * @param second the second input string
     * @return the longest substring shared by both strings
     */

    public static String longestMatchingSubstring(final String first, final String second) {
        String first2 = first;
        String second2 = second;

        // set the strings to be in lexicographical order
        if (second2.length() > first2.length()) {
            String temp = first2; // set c to a
            first2 = second2;
            second2 = temp;
        }

        String match = "";

        // finds the longest match
        for (int i = 0; i < first2.length(); i++) {
            for (int j = first2.length() - i; j > 0; j--) {
                for (int k = 0; k < second2.length() - j; k++) {
                    if (first2.regionMatches(i, second2, k, j)
                        && j > match.length()) {
                        match = first2.substring(i, i + j);
                    }
                }
            }
        }
        return match;
    }
}
