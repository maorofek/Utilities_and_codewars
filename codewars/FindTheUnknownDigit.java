public class FindTheUnknownDigit {


    public static void main(String[] args) {
        System.out.println(solveExpression("1+1=?"));//2
        System.out.println(solveExpression("123*45?=5?088"));//6
        System.out.println(solveExpression("-5?*-1=5?"));//0
        System.out.println(solveExpression("19--45=5?"));//-1
        System.out.println(solveExpression("??*??=302?"));//5
        System.out.println(solveExpression("?*11=??"));//2
        System.out.println(solveExpression("??*1=??"));//2
        System.out.println(solveExpression("??+??=??"));//-1

    }

    //TODO
    public static int solveExpression(final String expression) {
        int missingDigit = -1;

        //Write code to determine the missing digit or unknown rune
        //Expression will always be in the form
        //(number)[opperator](number)=(number)
        //Unknown digit will not be the same as any other digits used in expression

        return missingDigit;
    }
}