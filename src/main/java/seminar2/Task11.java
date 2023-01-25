//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.(Способ-1)
package seminar2;

public class Task11 {
    public static void main(String[] args) {
        int n = 15;
        String c1 = "q";
        String c2 = "W";

        String line = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                line += c1;
            } else {
                line += c2;
            }
        }
        System.out.println(line);
    }
}
