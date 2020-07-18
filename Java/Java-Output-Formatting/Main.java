import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int count=0;
            System.out.println("================================");
            for(int i=0;i<3;i++){
                count = 0;
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                char[] arr = s1.toCharArray();
                for(int j=0; j<arr.length; j++){
                        System.out.print(arr[j]);
                        count++;
                }
                for(int j=count; j<15; j++){
                    System.out.print(" ");
                }
                for(int k=Integer.toString(x).toCharArray().length; k<3; k++){
                    System.out.print("0");
                }
                System.out.print(x);
                // if(Integer.toString(x).toCharArray().length == 3){
                    
                //     System.out.print(x);
                // }
                // else if(Integer.toString(x).toCharArray().length == 2){
                //     System.out.print("0"+x);
                // }
                // else if(Integer.toString(x).toCharArray().length == 1){
                //     System.out.print("00"+x);
                // }
                System.out.println();
            }
            System.out.println("================================");

    }
}
