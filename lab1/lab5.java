import java.util.HashSet;
import java.util.Set;

class lab5 {
    public static void main(String[] args) {

        String first = "bubble";
        String second = "beautiful";
       
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<first.length(); i++) {
            for(int j = 0; j < second.length(); j++) {
                if(first.charAt(i) == second.charAt(j)){
                    set.add(first.charAt(i));
                }
            }
        }
        StringBuilder letters_in_string = new StringBuilder();
        for (Character c : set) {
            letters_in_string.append(c);
        }
        System.out.println("Similar ones is " + letters_in_string);
    }
}
