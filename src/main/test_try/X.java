import java.util.*;

class Test {
    public void X() {
        String[] names = {"Alice","Bob","Bob"};
        int[] heights = {155,185,150};

        Map<Integer, String> map = new HashMap<Integer, String>();

        for(int i = 0; i < heights.length; i++){
            map.put(heights[i], names[i]);
        }


        List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());

        Collections.sort(list, new MyComparator());

        for(Map.Entry<Integer, String> l: list) {
            System.out.println(l.getValue() + " " + l.getKey());
        }


    }

    public static void main(String[] args) {
        Test t = new Test();
        t.X();
    }
}

class MyComparator implements Comparator<Map.Entry> {
    public int compare(Map.Entry o1, Map.Entry o2){
        return (Integer)o2.getKey() - (Integer)o1.getKey();
    }
}