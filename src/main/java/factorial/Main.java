package factorial;

public class Main {

    public static int fact(int i) {
        System.out.println(i + " итерация вход");
        if (i == 0) {
            System.out.println(i + " итерация выход");
            return 1;
        }
        int result = fact(i - 1) * i;
        System.out.println(i + " итерация выход");
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}


