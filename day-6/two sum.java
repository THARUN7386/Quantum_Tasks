import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int Left=0;
        int Right=n-1;
        while(Left<Right){
            int res=arr[Left]+arr[Right];
            if(res==target){
                System.out.println((Left)+" "+(Right));
                return;
            }else if(res<target){
                Left++;
            }else{
                Right--;
            }
        }
    }
}