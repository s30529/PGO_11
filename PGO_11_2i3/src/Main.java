import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(1, "Miska"));
        items.add(new Item(2, "Talerz"));
        items.add(new Item(3, "Solniczka"));
        items.add(new Item(4, "Widelec"));
        items.add(new Item(5, "Noz"));
        for(int i=0;i<items.size();i++){
            items.get(i).show();
        }
        HashMap<Integer, String> itemsMap = new HashMap<>();
        for (Item item : items) {
            itemsMap.put(item.getId(), item.getName());
        }
        for (Map.Entry<Integer, String> entry : itemsMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        items.add(new Item(6, "Lyzka"));
        items.add(new Item(7, "Cukierniczka"));
        items.add(new Item(8, "Sloik"));
        items.add(new Item(9, "Tacka"));
        items.add(new Item(10, "Patelnia"));
        items.add(new Item(11, "Waza"));
        items.add(new Item(12, "Szczypce"));
        items.add(new Item(13, "Durszlak"));
        items.add(new Item(14, "Waga"));
        items.add(new Item(15, "Mikser"));
        List<Item> subList = items.subList(0, 5);
        HashSet<Item> itemsSet = new HashSet<>(subList);
        for (Item item : itemsSet) {
            System.out.println(item);
        }
    }
}

