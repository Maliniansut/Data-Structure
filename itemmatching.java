import java.util.ArrayList;
import java.util.List;

public class itemmatching {

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone", "blue", "pixel"));
        items.add(List.of("computer", "silver", "lenovo"));
        items.add(List.of("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        int matchingCount = countMatches(items, ruleKey, ruleValue);
        System.out.println("Number of items matching the rule: " + matchingCount);
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        
        for (List<String> item : items) {
            String type = item.get(0);
            String color = item.get(1);
            String name = item.get(2);

            if ((ruleKey.equals("type") && ruleValue.equals(type)) ||
                (ruleKey.equals("color") && ruleValue.equals(color)) ||
                (ruleKey.equals("name") && ruleValue.equals(name))) {
                count++;
            }
        }
        
        return count;
    }
}
