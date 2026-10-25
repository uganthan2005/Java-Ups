import java.util.*;
public class wordfrequency {
    public static void main(String[] args){
        String str="java is easy and java is powerful";
        Map<String,Integer> freqMap=new HashMap<>();
        String[] words=str.toLowerCase().trim().split("\\s+");
        for(String word:words){
            freqMap.put(word,freqMap.getOrDefault(word,0)+1);
        }
        System.out.println("Word Frequency:");
        for(Map.Entry<String,Integer> entry:freqMap.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        String mostFrequentWord=null;
        int maxFrequency=0;
        for(Map.Entry<String,Integer> entry:freqMap.entrySet()){
            if(entry.getValue()>maxFrequency){
                maxFrequency=entry.getValue();
                mostFrequentWord=entry.getKey();
            }
        }
        System.out.println("Most Frequent Word:"+mostFrequentWord);
        System.out.println("Frequency of Most Frequent Word:"+maxFrequency);
    }

    
}
