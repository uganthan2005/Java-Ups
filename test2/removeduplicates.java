import java.util.*;
public class removeduplicates {
    public static void main(String[] args){
        int[] arr={10, 20, 10, 30, 20, 40, 50, 30};
        Set<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println("Unique values:"+set);
        System.out.println("No of Unique values in array:"+set.size());
        if(set.contains(40)){
            System.out.println("40 is present in the array");
        }
        else{
            System.out.println("40 is not present in the array");
        }

    }
    
}
