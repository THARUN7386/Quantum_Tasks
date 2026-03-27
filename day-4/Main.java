import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> Set=new HashSet<>();
        HashSet<Integer> Dup=new HashSet<>();
        for(int a:arr) {
            if(Set.contains(a))
            Dup.add(a); 
            else 
            Set.add(a);
        }
        System.out.print(Dup);
    }
}