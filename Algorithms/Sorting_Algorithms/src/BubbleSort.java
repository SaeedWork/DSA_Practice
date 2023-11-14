import java.util.ArrayList;

public class BubbleSort {
    public void Int_BubbleSort_ArrayList(ArrayList<Integer> list){
        boolean flag = false;

        for (int i = 0; i < list.size(); i++){
            for(int j = 0; j<list.size()-1-i; j++){
                if (list.get(j) > list.get(j+1)) {
                    flag = true;
                    int swap = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, swap);
                }
            }
            if(flag == false){
                System.out.println("Already sorted");
                return;
            }
        }
    }

    public void Str_BubbleSort_ArrayList(ArrayList<String> list){
        boolean flag = false;

        for (int i = 0; i < list.size(); i++){
            for(int j = 0; j<list.size()-1-i; j++){
                if (list.get(j).compareTo(list.get(j+1)) > 0){
                    flag = true;
                    String swap = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, swap);
                }
            }
            if(flag == false){
                System.out.println("Already sorted");
                return;
            }
        }
    }

    public void Char_BubbleSort_Arraylist(ArrayList<Character> list){
        boolean flag = false;

        for (int i = 0; i < list.size(); i++){
            for(int j = 0; j<list.size()-1-i; j++){
                if (list.get(j) > list.get(j+1)){
                    flag = true;
                    char swap = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, swap);
                }
            }
            if(flag == false){
                System.out.println("Already sorted");
                return;
            }
        }
    }

}
