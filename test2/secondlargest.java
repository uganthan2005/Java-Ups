public class secondlargest {
    public static void main(String[] args){
        int[] arr={12,45,23,67,34,89,90};
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                secondlargest=largest;
                largest=num;
            }
            else if(num>secondlargest && num!=largest){
                secondlargest=num;
            }
        }
        if(secondlargest==Integer.MIN_VALUE){
            System.out.println("There is no second largest element in the array.");
        }
        else{
            System.out.println("The second largest element is:" + secondlargest);
        }
    }
    
}
