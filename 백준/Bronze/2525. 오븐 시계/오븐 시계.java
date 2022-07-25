import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hrs = sc.nextInt();
        int min = sc.nextInt();
        int endMin = sc.nextInt();
        
        int total = (hrs * 60) + min + endMin;
        hrs = total/60;
        min = total%60;
        
        if(hrs >= 24) {
            hrs -= 24;
        }
        
        System.out.println(hrs + " " + min);
    }
}