package junit;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Util {

//    public static boolean isNumber(String a) {
//        try {
//            int num = Integer.parseInt(a);
//            return true;
//        } catch (NumberFormatException e) {
//            return false;
//        }
//    }

//    public static boolean isPostalCode(String b){
//        if (b == null) {
//            return false;
//        }
//
//        Pattern pattern = Pattern.compile("\\d{3}-\\d{4}|\\d{7}");
//        Matcher matcher = pattern.matcher(b);
//
//        return matcher.matches();
//    }

//    public static boolean isSmallAlphabet(String d) {
//        if (d == null || d.isEmpty()) {
//            return false;
//        }
//
//        for (int i = 0; i < d.length(); i++) {
//            char c = d.charAt(i);
//            if (!Character.isLowerCase(c)) {
//                return false;
//            }
//        }
//        return true;
//    }

//    public static boolean isTriangle(int e,int f,int g) {
//        if (e <= 0 || f <= 0 || g <= 0) {
//            return false;
//        }
//        if (e > Integer.MAX_VALUE - f || g > Integer.MAX_VALUE - g || e + f <= g) {
//            return false;
//        }
//        return true;
//    }
    public static int isSquareNumber(int h) {
        if (h < 0 || h > 100000) {
            return -1;
        }
        var i = (int) Math.sqrt(h);
        if (i * i != h) {
            return -1;
        }
        return i;
    }
}
