import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> arr;

    public Box() {// при создании бокса создается новый эрэй лист
        arr = new ArrayList<T>();
    }

    public List<T> getArr() {
        return arr;
    }

    void add(T obj) {
        arr.add(obj);
    }
    void moveAt(Box<T> box) {// перемещение в одну коробку(из 1 во 2)
        box.getArr().addAll(arr);
        arr.clear();
    }

    void info() {
        if (arr.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке находятся " + arr.get(0).toString() + " в количестве: " + arr.size());
        }
    }

    float getWeight() {
        if (arr.isEmpty()) {
            return 0;
        } else {
            return arr.size() * arr.get(0).getWeigh();
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

}
