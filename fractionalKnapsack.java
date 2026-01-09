import java.util.*;
public class fractionalKnapsack {
    static class itemComparator implements Comparator<Item>{
        public  int compare(Item a, Item b){
            double r1=(double) a.val / (double) a.wgt;
            double r2=(double) b.val/ (double) b.wgt;
            return Double.compare(r2,r1);
        }
    }
    public static double fk (int W, Item[] arr, int n ){
        Arrays.sort(arr, new itemComparator());
            int curr_w=0;
            double value=0;
            for(int i =0;i< n;i++){
                if(curr_w +arr[i].wgt<=W){
                    curr_w+=arr[i].wgt;
                    value+=arr[i].val;
                }
                else{
                    int remain =W-curr_w;
                    value+=((double) arr[i].val/(double) arr[i].wgt) *remain;
                    break;
                }
        }
        return value;
    }
    static class Item{
        int val;
        int wgt;
        Item(int val, int wgt){
            this.val=val;
            this.wgt=wgt;
        }
    }
    public static void main(String[] args) {
        int n =4, W=90;
        Item[] arr ={new Item (100,20), new Item (60,10), new Item (100, 50), new Item (200, 50)};
         double ans=fk(W, arr, n);
         System.out.println(ans);
    }
}



