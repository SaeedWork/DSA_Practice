import java.util.ArrayList;

public class SelectionSort {
    public void Int_SelectionSort_Arraylist(ArrayList<Integer> list){
        boolean flag = false;
        int min = list.get(0);
        int minLocation = 0;

        for (int i = 0; i < list.size(); i++){
            min = list.get(i);
            minLocation = i;
            for(int j = i + 1; j<list.size(); j++){
                if (list.get(j) < min) {
                    min = list.get(j);
                    minLocation = j;
                }
            }
            if (minLocation != i) {
                flag = true;
                int swap = list.get(i);
                list.set(i, list.get(minLocation));
                list.set(minLocation, swap);
            }
        }
        if(flag == false){
            System.out.println("Already sorted");
            return;
        }
    }

    public void Str_SelectionSort_Arraylist(ArrayList<String> list){
        boolean flag = false;
        String min = list.get(0);
        int minLocation = 0;

        for (int i = 0; i < list.size(); i++){
            min = list.get(i);
            minLocation = i;
            for(int j = i + 1; j<list.size(); j++){
                if (list.get(j).compareTo(min) < 0) {
                    min = list.get(j);
                    minLocation = j;
                }
            }
            if (minLocation != i) {
                flag = true;
                String swap = list.get(i);
                list.set(i, list.get(minLocation));
                list.set(minLocation, swap);
            }
        }
        if(flag == false){
            System.out.println("Already sorted");
            return;
        }
    }

    public void Char_SelectionSort_Arraylist(ArrayList<Character> list){
        boolean flag = false;
        char min = list.get(0);
        int minLocation = 0;

        for (int i = 0; i < list.size(); i++){
            min = list.get(i);
            minLocation = i;
            for(int j = i + 1; j<list.size(); j++){
                if (list.get(j) < min) {
                    min = list.get(j);
                    minLocation = j;
                }
            }
            if (minLocation != i) {
                flag = true;
                char swap = list.get(i);
                list.set(i, list.get(minLocation));
                list.set(minLocation, swap);
            }
        }
        if(flag == false){
            System.out.println("Already sorted");
            return;
        }
    }

}
