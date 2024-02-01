package API_GB.Seminare_4.z1.SimplifyPath;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        System.out.println("simplifyPath() = " + simplifyPath("/home/"));
        System.out.println("simplifyPath() = " + simplifyPath("/../"));
        System.out.println("simplifyPath() = " + simplifyPath("/home//foo/"));
        System.out.println("simplifyPath() = " + simplifyPath("/c/d/i/leto/../../doc"));
    }

    public static String simplifyPath(String path) {
        Deque<String> list = new LinkedList<>();
        String[] arr = path.split("/");
        for (String elem : arr) {
            if (elem.equals("") || elem.equals(".")) {
                continue;
            } else if (elem.equals("..")) {
                if (!list.isEmpty()) {
                    list.pollLast();
                }
            } else {
                list.add(elem);
            }
        }
        return "/" + String.join("/", list);
    }
}
