//Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
// Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например,
// add - egg изоморфны)буква может не меняться, а остаться такой же. (Например, note - code)
//        Пример 1:
//        Input: s = "foo", t = "bar"
//        Output: false
//        Пример 2:
//        Input: s = "paper", t = "title"
//        Output: true

package seminar5;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        String str1="foo";
        String str2="bar";
        System.out.println (IsIsomorphism (str1, str2));
    }
    private static boolean IsIsomorphism(String str1, String str2) {
        str1 = str1.replace (" ","");
        str2 = str2.replace (" ","");
        if (str1.length () != str2.length ()) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase ();

        HashMap<Character, Character> map=new HashMap<> ();
        for (int i=0; i < str1.length (); i++) {
            if (map.containsKey (str1.charAt (i))) {
                if (!map.get (str1.charAt (i)).equals (str2.charAt (i))) {
                    return false;
                }
            } else {
                map.putIfAbsent (str1.charAt (i), str2.charAt (i));
            }
        }
        return true;
    }
}

