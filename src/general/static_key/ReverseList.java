package general.static_key;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static <T> void Reverse(List<T> list) {
        if (list.size() == 0 || list == null)
            return;
        T value = list.remove(0);
        Reverse(list);
        list.add(value);
    }
    public static Integer Sum(List<Integer> list){
        int sum = 0;
        for(Integer i : list){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(10);
        //Reverse(list);
        int sum = 0;
        Collections.reverse(list);
        int total = Sum(list);
        list.stream().forEach(ele->{
            System.out.println(ele);

        });
        int rd = (int)(Math.random()*list.size());
        list.remove(rd);
        System.out.println("Phần tử vừa bị xoá là : "+(total-Sum(list)));
    }
}
