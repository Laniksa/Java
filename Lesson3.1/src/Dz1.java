import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class Dz1<T> {



    public static void main(String[] args) {

        //Первая задача
        Integer [] arr1 = {1,2,3,4,5};
        String [] arr2 = {"Katya","Vasya","Petya","Vova"};


        System.out.println("\n Первая задача \n"+Arrays.asList(change(1, 3, arr1)));
        System.out.println(Arrays.asList(change(0,3,arr2)));

        //Вторая задача
        System.out.println("\n Вторая задача \n"+Arrays.asList(toList(arr2)));
        System.out.println(Arrays.asList(toList(arr1)));

        //Третья задача
        System.out.println("\n Третья задача \n");

        Orange orange = new Orange();
        Apple apple = new Apple();

        Box<Orange> boxOrange1 = new Box<>();
        Box<Orange> boxOrange2 = new Box<>();
        Box<Apple> boxApple1 = new Box<>();
        Box<Apple> boxApple2 = new Box<>();

        for(int i = 0; i < 5; i++){
            boxOrange1.add(new Orange());
        }
        for(int i = 0; i < 7; i++){
            boxOrange2.add(new Orange());
        }
        for(int i = 0; i < 3; i++){
            boxApple1.add(new Apple());
        }
        for(int i = 0; i < 8; i++){
            boxApple2.add(new Apple());
        }

        boxOrange1.info();
        boxOrange2.info();
        boxApple1.info();
        boxApple2.info();

        System.out.println("\n");

        float orangeWeigth1 = boxOrange1.getWeight();
        float orangeWeigth2 = boxOrange2.getWeight();
        float appleWeigth1 = boxApple1.getWeight();
        float appleWeigth2 = boxApple2.getWeight();

        System.out.println("Вес коробки 1 с апельсинами: " + orangeWeigth1);
        System.out.println("Вес коробки 2 с апельсинами: " + orangeWeigth2);
        System.out.println("Вес коробки 1 с яблоками: " + appleWeigth1);
        System.out.println("Вес коробки 2 с яблоками: " + appleWeigth2);

        System.out.println("\n");

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + boxOrange1.compare(boxApple1));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + boxOrange2.compare(boxApple2));

        System.out.println("\n");

        boxOrange1.moveAt(boxOrange2);// перемещаем все во 2 коробку
        boxApple1.moveAt(boxApple2);

        boxOrange1.info();
        boxOrange2.info();
        boxApple1.info();
        boxApple2.info();








    }
    private static <T>  T[] change(int el1, int el2, T[] arr){
        T a = arr[0];
        a=(arr[el1]);
        arr[el1]=(arr[el2]);
        arr[el2]=(a);
        return arr;
    }

    private static <T> ArrayList<T> toList(T[] arr){
        ArrayList<T> list= new ArrayList<>(Arrays.asList(arr));
        return list;
    }
}
