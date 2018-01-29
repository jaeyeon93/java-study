import java.util.ArrayList;

public class IntoArrayList {
    public static void main (String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(new Integer(11));
        list.add(new Integer(22));
        list.add(new Integer(33));

        System.out.println("1차 참조");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        // remove data
        list.remove(0);
        System.out.println("2차 참조");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
