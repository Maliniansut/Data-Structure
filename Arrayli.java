import java.util.ArrayList;
public class Arrayli {
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList<>(); 

        list.add(23);
        list.add(45);
        list.add(34);
        list.add(44);
        list.add(69);

        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
