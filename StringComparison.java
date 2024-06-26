public class StringComparison {
    public static void main(String[] args) {
        String a="Malini";
        String b="Malini";

        // Method 1:Comparator
        System.out.println(a==b);

        String name1 = new String("Maliniansu");
        String name2 = new String("Maliniansu");
        
        //false: as values would ne created inside heap but outside string pool
        //name1 and name2 would refer to different objects irrespective of having same values
        System.out.println(name1 == name2);

        //Checking through method 
        //doesnot care about where reference variables are pointing to ,it just cares about the values
        System.out.println(name1.equals(name2));
    }
}
