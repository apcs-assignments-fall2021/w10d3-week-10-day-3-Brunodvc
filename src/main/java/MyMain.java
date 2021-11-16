import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            String word = list.get(i);
            if(word.charAt(0) == 'A' || word.charAt(0) == 'a'){
                count ++;
            }
        }
        return count;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        ArrayList<String> newlist = new ArrayList<String>();
        for(int i = 0; i < list.size(); i++){
            String word = list.get(i);
            word+="!";
            newlist.add(word);
        }
        return newlist;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int i = 0; i < Math.min(list1.size(), list2.size()); i++){
            for(int x = 0; x < Math.min(list1.size(), list2.size()); x++){
                if(list1.get(i) == list2.get(x)) {
                    return true;
                }
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 != 0){
                count ++;
            }
        }
        return count;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            newlist.add(arr[i]);
        }
        return newlist;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        //adding both arraylists together and making a new arraylist
        list1.addAll(list2);

        int n = list1.size();
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(list1.get(j-1) > list1.get(j)){
                    //swap elements


                    temp = list1.get(j-1);
                    list1.set(j-1,list1.get(j));
                    list1.set(j,temp);
                }

            }
        }

        return list1;
    }



    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
