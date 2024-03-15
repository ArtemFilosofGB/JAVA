package Exception.hw02.Task04;

class Expr {
    public static String expr(char a) throws Exception {
// Введите свое решение ниже
        if(a==' ') {
            throw new Exception("Empty string has been input.");
        }
        else return "Your input was - "+a;
    }
}