import java.util.EmptyStackException;
import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
     while(true){
         try{
             check();
             break;
         }catch (RuntimeException e){
             System.out.println(e.getMessage());
         }
     }
    }
    public static void check(){
        Scanner sc = new Scanner(System.in);
         String a = sc.nextLine();
        for (int i = a.length()-1; i >=0; i--) {
            System.out.print(a.charAt(i));
        }
        if(a.trim().isEmpty()){
            throw new RuntimeException("ko dc de trong");
        }

    }
}
