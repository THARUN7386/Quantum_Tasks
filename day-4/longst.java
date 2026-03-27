import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        int left=0,right=0,max=0;
        for(int i=0;i<s.length();i++) {
            while (set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            right=i-left+1;
            if(right>max){
                max=right;
            }
        }
        System.out.println(max);
    }
}