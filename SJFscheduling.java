import java.lang.reflect.Array;
import java.util.*;
// for non primtion and arrival time is =0;
// W(i)=W(i-1) +Bt(i-1);  my own formula;
// w= waitingtime , t= totaltime
public class SJFscheduling {
    public static int calculate(int[] job){
        Arrays.sort(job);
        float w=0;
        int t=0;
        int n =job.length;
        for(int i =0; i< n ; i++){
            w+=t;
            t+=job[i];
        }
            return (int) (w/n);

    }

    public static void main(String[] args) {
        int job[]={3, 4, 5, 6, 7, 8, 9};
        int res= calculate(job);
        System.out.println(res);
    }
    
}
