package Exception.Seminare01.Homework01.Task01_02;

class Answer {
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int[] c = new int[a.length];
        if (a.length!=b.length) {
            return new int[]{0};
        }
        else {
            for (int i = 0; i < a.length; i++) {
                c[i]= a[i]-b[i];
            }
        }
        
        return c;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
