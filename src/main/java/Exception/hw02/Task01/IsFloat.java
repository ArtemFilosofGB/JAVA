package Exception.hw02.Task01;

class IsFloat {
    public static float isFloat(String input) {
// Введите свое решение ниже
        float f=Float.NaN;
        try {
            f=Float.parseFloat(input);
        }catch(Exception e){
            System.out.println("Your input is not a float number. Please, try again");
        }
    return f;
    }
}
