package Exception.Seminare01.Homework01.Task01_03;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int[] c = new int[a.length];
        if (a.length!=b.length) {
            return new int[]{0};
        }
        else {
            for (int i = 0; i < a.length; i++) {
                try{

                    c[i]= a[i]/b[i];
                }catch (ArithmeticException e){
                    System.out.println("Деление на ноль невозможно");
                }
            }
        }

        return c;
    }
}
