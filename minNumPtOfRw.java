import java.util.*;
public class minNumPtOfRw {
    public static int platform( int[] arr, int[] dept){
        Arrays.sort(arr);
        Arrays.sort(dept);
           int n =arr.length;
        int plat=0 , cnt=0;
        int i =0, j=0;
        while(i< n && j< n){
            if(arr[i]<=dept[j]){
            plat++;
            i++;
            }
            else{
                plat--;
                j++;
            }
            plat=Math.max(plat, cnt);

        }
        return plat;

    }
    public static void main(String[] args) {
        int[] arr={900,945, 1100, 1500, 1900};
        int[] dept={920, 1130, 1800, 2000};
        int ans =platform(arr, dept);
        System.out.println(ans);
      

    }

    
}
