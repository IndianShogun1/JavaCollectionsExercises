import java.util.*;

public class Ques6 {
    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 4, 2, 5, 5, 5, 3, 4, 4};

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], new ArrayList(Arrays.asList(map.get(arr[i]).get(0), map.get(arr[i]).get(1) + 1)));
            } else {
                map.put(arr[i], new ArrayList(Arrays.asList(i, 1)));
            }
        }

        Set set = map.entrySet();
        List<Map.Entry> list = new ArrayList(set);

        Collections.sort(list, new Comparator<Map.Entry>() {

            public int compare(Map.Entry e1, Map.Entry e2) {

                List list1 = (ArrayList) e1.getValue();
                List list2 = (ArrayList) e2.getValue();
                int freq1 = (int) list1.get(1);
                int freq2 = (int) list2.get(1);

                if(freq1 == freq2) {
                    int index1 = (int) list1.get(0);
                    int index2 = (int) list2.get(0);
                    if(index1 < index2) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if(freq1 < freq2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        Iterator listIterator = list.iterator();
        System.out.println("Elements in decreasing order of frequency:");
        while(listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            int key = (int) entry.getKey();
            System.out.print(key + " ");
        }

    }
}
