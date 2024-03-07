import java.util.*;
public class prob1{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        int k=0;
        while(t-->0){
            String s=sc.next();
            if(s.charAt(1)=='+'){
                k++;
            }
            else if(s.charAt(1)=='-'){
                k--;
            }
        }
        System.out.println(k);



    }
}






        