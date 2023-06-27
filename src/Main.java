import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Задание

        // Дано:
        String str = "dsf sdfasd asdfadfd asdfasd asdfasdf ";

        // Результат:
        // d -> 5
        // s -> 7
        // a -> 1

        Map<Character, Integer> charsCount = new HashMap<>();

        for (int i=0; i<str.length(); i++) {
            Character ch = Character.toUpperCase(str.charAt(i));
            if(ch.equals(' ')) continue;



            if(charsCount.containsKey(ch)) {
                Integer count = charsCount.get(ch);
                count++;
                charsCount.put(ch, count);
            } else {
                charsCount.put(ch, 1);
            }
        }

        System.out.println(charsCount);

        // ==========================================

        String text = "sdfsdf sdfsdfsd sdfsdfs sdfsdfsdf sdfsdf";
        String[] words = text.split(" ");
        System.out.println("words = " + Arrays.toString(words));


        // ==========================================
        Map<String, UserProfile> users = new HashMap<>();
        users.put("sergei", new UserProfile("Sergei", "sergei@mail.com"));
        users.put("viktor", new UserProfile("Viktor", "viktor@mail.com"));
        System.out.println(users);

        users.put("sergei", new UserProfile("Alexei", "alexei@mail.com"));
        System.out.println(users);

        users.remove("viktor");

        if(users.containsKey("viktor")) {
            UserProfile viktor = users.get("viktor");
            viktor.lastVisitTime = LocalDate.now();
            System.out.println(viktor);
        } else {
            users.put("viktor", new UserProfile("Viktor", "viktor@mail.com"));

        }

        Set<String> keys = users.keySet();
        Iterator<String> keysIt = keys.iterator();
        while(keysIt.hasNext()) {
            String key = keysIt.next();
            UserProfile profile = users.get(key);
            System.out.println(key + " -> " + profile + " -(hash)-> " + profile.hashCode());
        }

        Collection<UserProfile> values = users.values();
        values.forEach(System.out::println);


    }
}