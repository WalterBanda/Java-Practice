package practice;

public class CodingBat {
    public static void main(String[] args) {
        String test = "hello";
        System.out.println( " The backAround String is : " + backAround(test));
        System.out.println(" It is : " + or35(60));
        System.out.println( " The front22 String is : " + front22(test) );
        System.out.println( " The notString String is : " + notString(test) );
        System.out.println(" MissingChar : " + missingChar(test , 2));
        System.out.println(" Max is : " + intMax(-7,-2,-5));
        System.out.println(" Nearest to 10 is : " + close10(-1,-1));
        System.out.println(" In3050 value : " + in3050(30,41));

    }

    public static String backAround(String str) {
        if (str.length()!= 0) {
            System.out.println(" The length is : " + str.length() + "\n The last char is : " + str.charAt(str.length() - 1));
            return str.charAt(str.length() -1) + str + str.charAt(str.length() -1);
        }

        return str;
    }

    public static boolean or35(int n) {
        boolean check = false;
        if (((n%3) == 0) || ((n%5) == 0)) {
            check = true;
        }
        return check;
    }

    public static String front22(String str) {
        // First figure the number of chars to take
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }
    public static String notString(String str) {
        if (!str.startsWith("not")) {
            str = "not " + str;
        }
        return str;
    }
    public static String missingChar(String str, int n) {
        String front,back;
        if ( str.length() > n && str.length() != 0) {
            front= str.substring(0,n);back= str.substring(n+1);
        } else {
            front=str;back="";
        }

        return front + back;
    }
    public static int intMax(int a, int b, int c) {
        int max;
        if (a>b && a>c) max = a;
        else if (b>a && b>c) max = b;
        else max = c;
        return max;
    }
    public static int close10(int a, int b) {
        int close=3;
        if (Math.abs((10 - a)) < Math.abs((10 - b))) close = a;
        else if (Math.abs((10 - a)) > Math.abs((10 - b))) close = b;
        else if (Math.abs((10 - a)) == Math.abs((10 - b))) close = 0;
        return close;
    }
    static public boolean in3050(int a, int b) {
        boolean integrity = false;
        boolean check1 = (a>=30 && a <=40) && (b>= 30 && b <= 40);
        boolean check2 = (a>=40 && a <=50) && (b >= 40 && b <= 50);

        boolean val1 = a>=30 && a <=50;
        boolean val2 = b >= 30 && a <= 50;
        if ((val1 == val2) && (((check1) || (check2)) )) integrity = true;
        System.out.println(
                " Check1: " +check1 +
                "\n Check2: " + check2 +
                "\nval1: " + val1 +
                "\nval2: " + val2);
        return integrity;
    }
}
