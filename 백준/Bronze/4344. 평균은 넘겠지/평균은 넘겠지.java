
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr;
        int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			int childCnt = sc.nextInt();
			arr = new int[childCnt];
			double sum = 0;
            for(int j=0; j < childCnt; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double avg = sum / childCnt;
            double avgCnt  = 0;
            for(int k=0; k<childCnt; k++) {
            	if(arr[k] > avg) {
            		avgCnt++;
            	}
            }
            System.out.printf("%.3f%%\n", (avgCnt/childCnt)*100);
		}
		sc.close();
	}

}
