import java.util.*;

/**
 * Created by TAO on 2018/8/4.
 */
public class Exam04 {

    public static void main(String[] args){

        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        int start = 0,end = 100;
        for (int i=0;i<50;i++){
            list.add( r.nextInt(end-start+1)+start);
        }
        System.out.print("随机生成50个小于100的数,分别为:");
        for (int i=0;i<50;i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println();
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        List<Integer> l4 = new ArrayList<>();
        List<Integer> l5 = new ArrayList<>();
        List<Integer> l6 = new ArrayList<>();
        List<Integer> l7 = new ArrayList<>();
        List<Integer> l8 = new ArrayList<>();
        List<Integer> l9 = new ArrayList<>();
        List<Integer> l10 = new ArrayList<>();

        for (int i=0;i<50;i++){
            int sum = list.get(i)/10;
            switch (sum){
                case 1:
                    l1.add(list.get(i));
                    break;
                case 2:
                    l2.add(list.get(i));
                    break;
                case 3:
                    l3.add(list.get(i));
                    break;
                case 4:
                    l4.add(list.get(i));
                    break;
                case 5:
                    l5.add(list.get(i));
                    break;
                case 6:
                    l6.add(list.get(i));
                    break;
                case 7:
                    l7.add(list.get(i));
                    break;
                case 8:
                    l8.add(list.get(i));
                    break;
                case 9:
                    l9.add(list.get(i));
                    break;
                case 10:
                    l10.add(list.get(i));
                    break;
            }
        }

        if (!l1.isEmpty())
            map.put(1,l1);
        if (!l2.isEmpty())
            map.put(2,l2);
        if (!l3.isEmpty())
            map.put(3,l3);
        if (!l4.isEmpty())
            map.put(4,l4);
        if (!l5.isEmpty())
            map.put(5,l5);
        if (!l6.isEmpty())
            map.put(6,l6);
        if (!l7.isEmpty())
            map.put(7,l7);
        if (!l8.isEmpty())
            map.put(8,l8);
        if (!l9.isEmpty())
            map.put(9,l9);
        if (!l10.isEmpty())
            map.put(10,l10);

        System.out.print("Map中的数据为:");
        System.out.print("{");
        for(Map.Entry<Integer, List<Integer>> entry:map.entrySet()){
            System.out.print(entry.getKey()+"=>"+entry.getValue()+",");
        }
        System.out.print("}");


        sortList(l1);
        sortList(l2);
        sortList(l3);
        sortList(l4);
        sortList(l5);
        sortList(l6);
        sortList(l7);
        sortList(l8);
        sortList(l9);
        sortList(l10);

        if (!l1.isEmpty())
            map.put(1,l1);
        if (!l2.isEmpty())
            map.put(2,l2);
        if (!l3.isEmpty())
            map.put(3,l3);
        if (!l4.isEmpty())
            map.put(4,l4);
        if (!l5.isEmpty())
            map.put(5,l5);
        if (!l6.isEmpty())
            map.put(6,l6);
        if (!l7.isEmpty())
            map.put(7,l7);
        if (!l8.isEmpty())
            map.put(8,l8);
        if (!l9.isEmpty())
            map.put(9,l9);
        if (!l10.isEmpty())
            map.put(10,l10);

        System.out.println();
        System.out.print("排序后的Map为:");
        System.out.print("{");
        for(Map.Entry<Integer, List<Integer>> entry:map.entrySet()){
            System.out.print(entry.getKey()+"=>"+entry.getValue()+",");
        }
        System.out.print("}");
    }

    public static void sortList(List<Integer> list){
        Collections.sort(list, (lhs, rhs) -> {
            if ( lhs > rhs ) {
                return 1;
            } else {
                return -1;
            }
        });
    }
}
