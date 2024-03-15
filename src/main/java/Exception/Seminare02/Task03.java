//package Exception.Seminare02;
//
//import java.awt.*;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Task03 {
//    public class Task3 {
//        private static final List<String> strings = List.of
//                ("Анна=4", "Елена=5", "Марина=6", "Полина=?", "Владимир=?", "Константин=?", "Иван=4");
////для проверки, заменить какое-то из значений на null
//
//        public static void main(String[] args) {
//            String path = "task3.txt";
//            writeToFile(path, strings);
//            System.out.println(readFromFile(path));
//            rewrite(path);
//        }
//
//        public static void writeToFile(String path, List<String> args) {
//            FileWriter fw = null;
//            try {
//                fw = new FileWriter(path);
//                for (String arg : args) {
//                    fw.write(arg + '\n');
//                }
//                fw.flush();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            } finally {
//                try {
//                    fw.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//
//        public static Map<String, Integer> readFromFile(String path) {
//            Map<String, Integer> map = new HashMap<>();
//            BufferedReader br = null;
//            String line;
//            try {
//                br =  new BufferedReader(new FileReader(path));
//                while ((line = br.readLine()) != null) {
//// Map.Entry<String, Integer> entry = getEntry(line);
//// map.put(entry.getKey(), entry.getValue());
//
//                    String[] strings = line.split("=");
//                    String key = strings[0];
//                    int value;
//                    if (strings[1].equals("?")) {
//                        value = key.length();
//                    } else {
//                        try {
//                            value = Integer.parseInt(strings[1]);
//                        } catch (NumberFormatException e) {
//                            throw new NumberFormatException("Non-valid data");
//                        }
//                    }
//
//                    map.put(key, value);
//                }
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            } finally {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            return map;
//        }
//
//        public static void rewrite(String path) {
//            Map<String, Integer> map = readFromFile(path);
//            List<String> data = new ArrayList<>();
//
//            for (Map.Entry<String, Integer> entry : map.entrySet()) {
//                data.add(entry.toString());
//            }
//
//            writeToFile(path, data);
//        }
//
//        public static Map.Entry<String, Integer> getEntry(String string) {
//            String[] data = string.split("=");
//            String key = data[0];
//            Integer value;
//
//            if (isNumber(data[1])) {
//                value = Integer.parseInt(data[1]);
//            } else if (data[1].equals("?")) {
//                value = key.length();
//            } else {
//                throw new NumberFormatException("Non-valid data");
//            }
//
//            return new Map.Entry<>() {
//                @Override
//                public String getKey() {
//                    return key;
//                }
//
//                @Override
//                public Integer getValue() {
//                    return value;
//                }
//
//                @Override
//                public Integer setValue(Integer value) {
//                    return null;
//                }
//            };
//        }
//
//        private static boolean isNumber(String str) {
//            try {
//                Double.parseDouble(str);
//                return true;
//            } catch (NumberFormatException e) {
//                return false;
//            }
//        }
//    }
//}
