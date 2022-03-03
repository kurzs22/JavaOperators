public class Main {

    public static void main(String[] args) {
        System.out.println("## Assignment Operator");
        System.out.println("");
        System.out.println("int i = 7;");
        int i = 7;
        System.out.println("Is result 7?");

        System.out.println("");
        System.out.println("## Mathematical operators");
        System.out.println("");
        System.out.println("i = 1 + 2;");
        i = 1 + 2;
        System.out.println("Is result 3?");

        System.out.println("");
        System.out.println("i = 7 - 3;");
        i = 7 - 3;
        System.out.println("Is result 4?");

        System.out.println("");
        System.out.println("i = 3 * 4;");
        i = 3 * 4;
        System.out.println("Is result 12?");

        System.out.println("");
        System.out.println("i = 9 / 3;");
        i = 9 / 3;
        System.out.println("Is result 3?");

        System.out.println("");
        System.out.println("i = 7 % 3;");
        i = 7 % 3;
        System.out.println("Is result 1?");

        System.out.println("");
        System.out.println("i = 10 + 7 % 3;");
        i = 10 + 7 % 3;
        System.out.println("Is result 2?");

        System.out.println("");
        System.out.println("i = 7; i++;");
        i = 7; i++;
        System.out.println("Is result 8?");

        System.out.println("");
        System.out.println("i = 9; i--;");
        i = 9; i--;
        System.out.println("Is result 8?");

        System.out.println("");
        System.out.println("i = 10 + 7 % 3;");
        i = 10 + 7 % 3;
        System.out.println("Is result 2?");


        System.out.println("");
        System.out.println("## Relational operators");
        System.out.println("");
        System.out.println("boolean b; i = 1; int j = 2; b = i == j;");
        boolean b; i = 1; int j = 2; b = i == j;
        System.out.println("Is result false?");

        System.out.println("");
        System.out.println("b = i < j;");
        b = i < j;
        System.out.println("Is result true?");

        System.out.println("");
        System.out.println("b = i <= j;");
        b = i <= j;
        System.out.println("Is result true?");

        System.out.println("");
        System.out.println("b = i > j;");
        b = i > j;
        System.out.println("Is result false?");

        System.out.println("");
        System.out.println("b = i >= j;");
        b = i >= j;
        System.out.println("Is result false?");

        System.out.println("");
        System.out.println("b = i < j || i == j;");
        b = i < j || i == j;
        System.out.println("Is result false?");

        System.out.println("");
        System.out.println("b = i < j && i == j;");
        b = i < j && i == j;
        System.out.println("Is result false?");

        System.out.println("");
        System.out.println("String s = (i < j) ? 'i < j' : 'i >= j';");
        String s = (i < j) ? "i < j" : "i >= j";
        System.out.println("Is result 'i >= j'?");

        System.out.println("");
        System.out.println("## Parentheses");
        System.out.println("");
        System.out.println("i = (10 + 7) % 3;");
        i = (10 + 7) % 3;
        System.out.println("Is result 2?");

        System.out.println("");
        System.out.println("i = 10 + (7 % 3);");
        i = 10 + (7 % 3);
        System.out.println("Is result 2?");

    }
}