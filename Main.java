import com.sun.source.tree.Tree;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!" + args[2] + args[3]);

        List<String> aList = new ArrayList<>();
        for (int i =0; i < args.length; i++) {
        aList.add(args[i]);
        }

        System.out.println(aList);
        Collections.shuffle(aList, new Random());
        System.out.println(aList);

        Set<String> hSet = new HashSet<>();
        hSet.add("OOP");
        hSet.add("GG");
        hSet.add("EZ");
        hSet.add("F");
        hSet.add("not");
        hSet.add("drop");
        hSet.remove("GG");
        System.out.println(hSet);

        Set<String> tSet = new TreeSet<>();
        tSet.add("OOP");
        tSet.add("GG");
        tSet.add("EZ");
        tSet.add("F");
        tSet.add("not");
        tSet.add("drop");
        tSet.add("ZZZ");
        tSet.add("123");
        tSet.add("กขค");
        System.out.println(tSet);

        Stack<String> stacko = new Stack<>();
        stacko.push("a");
        stacko.push("b");
        stacko.push("c");
        System.out.println(stacko);
        System.out.println(stacko.pop());
        System.out.println(stacko);
        stacko.pop();
        System.out.println(stacko);

        Map <String, Color> favoriteColors = new TreeMap<>();
        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.BLUE);
        favoriteColors.put("Robert", Color.BLACK);
        favoriteColors.put("Mark", Color.WHITE);
        favoriteColors.put("Pedro", Color.YELLOW);
        favoriteColors.put("Cole", Color.BLUE);
        Set<String> keySet = favoriteColors.keySet();
        for (String key : keySet){
            Color value = favoriteColors.get(key);
            System.out.println(key + " : " + value);
        }

        System.out.println("");

        Map <String, Color> favoriteColors2 = new HashMap<>();
        favoriteColors2.put("Juliet", Color.BLUE);
        favoriteColors2.put("Romeo", Color.GREEN);
        favoriteColors2.put("Adam", Color.RED);
        favoriteColors2.put("Eve", Color.BLUE);
        favoriteColors2.put("Robert", Color.BLACK);
        favoriteColors2.put("Mark", Color.WHITE);
        favoriteColors2.put("Pedro", Color.YELLOW);
        favoriteColors2.put("Cole", Color.BLUE);
        Set<String> keySet2 = favoriteColors2.keySet();
        for (String key : keySet2){
            Color value = favoriteColors2.get(key);
            System.out.println(key + " : " + value);
        }
        }
    }
