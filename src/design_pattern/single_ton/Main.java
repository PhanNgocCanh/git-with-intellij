package design_pattern.single_ton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        billPughSingleton.initData();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(15);
        list.add(20);
        list.add(1);
        list.stream().map(n -> n + 1).forEach((n) -> {
            System.out.println(n);
        });
        System.out.println("Phần tử lớn nhất: " + list.stream().min(Integer::compare).get());
        list.stream().skip(1).limit(3).forEach(System.out::println);
        Stream.iterate(1L, n -> n + 1).limit(5)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        List<String> giangvien = new ArrayList<>();
        List<String> sinhvien = new ArrayList<>();
        giangvien.add("A");giangvien.add("B");giangvien.add("C");
        sinhvien.add("A");sinhvien.add("B");sinhvien.add("C");sinhvien.add("D");
        sinhvien.add("E");sinhvien.add("F");sinhvien.add("G");
        sinhvien.add("H");sinhvien.add("I");sinhvien.add("J");sinhvien.add("K");
        sinhvien.add("L");sinhvien.add("M");sinhvien.add("N");
        int indexGV = 0;
        for(String sv :sinhvien){
            if(indexGV == giangvien.size()) indexGV = 0;
            System.out.println("SV: "+sv+" -- GVHD: "+giangvien.get(indexGV));
            indexGV++;
        }
    }
}
