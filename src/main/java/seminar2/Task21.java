
package seminar2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Task21 {
    public static void main(String[] args) {
        Ex5("D:\\Обучение програмированию\\Программа разработчик\\JAVA знакомство и как пользоваитс базовыми API\\project");
    }

    private static void Ex5(String path) {
        StringBuilder sb = new StringBuilder();
        for (String fileName : ConvertPathPathNmsArr(path)) {
            sb.append(fileName).append(System.lineSeparator());
        }
        try(PrintWriter pw = new PrintWriter("src/main/resources/lib/file.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static String[] ConvertPathPathNmsArr(String path) {
        File dir = new File(path);
        return dir.list();
    }
}
