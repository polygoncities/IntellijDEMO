package Practice;

public class CodingBat {
    public String frontTimes(String str, int n) {
        if (str.length() <= 0)
            return "";

        String cut = "";
        String result = "";

        if (str.length() < 3)
            cut = str;
        else
            cut = str.substring(0, 3);

        for (int i = 0; i < n; i++) {
            result = cut + result;
        }
        return result;
    }

}
