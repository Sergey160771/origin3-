//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.(Способ-2)

package seminar2;

public class Task12 {
    public static void main(String[] args) {
        int n =10;
        char c1 = 'q';
        char c2 = 'W';
        StringBuilder new_line = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                new_line.append(c1);
            } else {
                new_line.append(c2);
            }
        }
        System.out.println(new_line);
    }
}
