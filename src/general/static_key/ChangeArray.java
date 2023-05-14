package general.static_key;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(4);list.add(5);list.add(6);
        int pos,value;
        while(true){
            System.out.println("Nhập vị trí bạn muốn thêm vào(Nhập -1 đề thoát):");
            System.out.println("Vị trí nhập từ 0 đến "+list.size());
            pos = sc.nextInt();
            if(pos==-1||pos>list.size()+1) break;
            System.out.println("Nhập giá trị bạn muốn thêm:");
            value = sc.nextInt();
            list.add(pos,value);
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
