package general.static_key;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostAppearent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử");
        int n = scanner.nextInt();
        int num,max=0;
        Map<Integer, Integer> mostAppearenceNum = new HashMap<>();
        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            if(mostAppearenceNum.containsKey(num)){
                mostAppearenceNum.put(num,mostAppearenceNum.get(num)+1);
            }else{
                mostAppearenceNum.put(num,1);
            }
            max = Math.max(max,mostAppearenceNum.get(num));
        }
        System.out.println("Các phần tử xuất hiện nhiều nhất ("+max+" lần) là: ");
        for(Map.Entry<Integer,Integer> entry : mostAppearenceNum.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
