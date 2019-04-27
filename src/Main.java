import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Rimcalk rimcalk = new Rimcalk();

        System.out.println("Пожалуйста, введите первое римское число");
        String f = scan.next();
        int first = rimcalk.RometoArab(f);

        System.out.println("Answer number №1 "+ first);

        System.out.println("Пожалуйста, введите второе римское число");
        String sp = scan.next();
        int sec = rimcalk.RometoArab(sp);

        System.out.println("Answer number №2 "+ sec);

        System.out.println(" Пожалуйста, введите операцию +-*/");
        String opera = scan.next();

        System.out.println(" Вывожу ответ с результатом");
        int value = rimcalk.Acalc(opera, first, sec);

        String roman = rimcalk.Roman(value);

        System.out.println(" Вот ответ римскими цифрами ");
        System.out.println(roman);

    }
}
