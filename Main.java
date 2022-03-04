public class Main {

    public static void print(String expression, Object supposedResult, Object realResult) {
        String supposed = String.valueOf(supposedResult);
        String real = String.valueOf(realResult);

        System.out.println("\n" + expression);
        System.out.println("Is result " + supposed + "?");

        // Uncomment this to see real result
        // if (!supposedResult.equals(realResult))
        //     System.out.println("No! It is " + real);
    }

    public static void main(String[] args) {
        System.out.println("## Assignment Operator");

        int i = 7;
        print("int i = 7;", 7, i);

        System.out.println("\n## Mathematical operators");

        i = 1 + 2;
        print("i = 1 + 2;", 3, i);

        i = 7 - 3;
        print("i = 7 - 3;", 4, i);

        i = 3 * 4;
        print("i = 3 * 4;", 12, i);

        i = 9 / 3;
        print("i = 9 / 3;", 3, i);

        i = 7 % 3;
        print("i = 7 % 3;", 1, i);

        i = 10 + 7 % 3;
        print("i = 10 + 7 % 3;", 2, i);

        i = 7; i++;
        print("i = 7; i++;", 8, i);

        i = 9; i--;
        print("i = 9; i--;", 8, i);

        i = 10 + 7 % 3;
        print("i = 10 + 7 % 3;", 2, i);


        System.out.println("\n## Relational operators");

        boolean b; i = 1; int j = 2; b = i == j;
        print("boolean b; i = 1; int j = 2; b = i == j;", false, b);

        b = i < j;
        print("b = i < j;", true, b);

        b = i <= j;
        print("b = i <= j;", true, b);

        b = i > j;
        print("b = i > j;", false, b);

        b = i >= j;
        print("b = i >= j;", false, b);

        b = i < j || i == j;
        print("b = i < j || i == j;", false, b);

        b = i < j && i == j;
        print("b = i < j && i == j;", false, b);

        String s = (i < j) ? "i < j" : "i >= j";
        print("String s = (i < j) ? 'i < j' : 'i >= j';", "i >= j", s);

        System.out.println("\n## Parentheses");

        i = (10 + 7) % 3;
        print("i = (10 + 7) % 3;", 2, i);

        i = 10 + (7 % 3);
        print("i = 10 + (7 % 3);", 2, i);

    }
}