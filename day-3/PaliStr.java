import java.util.Scanner;
public class PaliStr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        String strrev=str.replace(" ","").toLowerCase();
        System.out.println(strrev);
        for(int i=strrev.length()-1;i>=0;i--){
            char ch=strrev.charAt(i);
            rev=rev+ch;
           
        }
        System.out.println(rev);
         if(strrev.equals(rev)){
             System.out.println("True");
         }else{
             System.out.println("False");
         }
    }
}