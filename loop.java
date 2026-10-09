import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start =sc.nextInt();
        int end = sc.nextInt();
        if(start%2==0){
            while(start<=end){
                System.out.println(start);
                start+=2;
            }
        }else{
            start+=1;
            while(start<=end){
                System.out.println(start);
                start+=2;
            }
        }
        int i = 10;
        while (i>=0) {
            System.out.println(i);
            i--;
        }
        i=0;
        while (i<=50) {
            System.out.println(i);
            i+=2;
        }
        int j=0;
        do{
            System.out.println(j++);
        }while(j<=4);
        int s=0;
        j=0;
        do{
            j+=s;
            s+=1;
            System.out.println(j);
        }while(s<=10);
        s=1;
        j=1;
        do{
            s*=j;
            j+=1;   
            System.out.println(s);
        }while(j<=5);
        for (i=1; i<=10; i++) {
            System.out.println(i+" * 10 = "+i*10); 
        }
        sc.close();
    }
    
}
