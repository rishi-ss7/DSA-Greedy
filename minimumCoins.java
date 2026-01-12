import java.util.*;
class minimumCoins {
    // creating a function
    public static List<Integer> minCoin(int v ){
        List<Integer> ans=new ArrayList<>();
        int[] coin={1,2,5,10,20,50,100};
        int n =coin.length;
        for(int i =n-1;i>=0 ;i--){
            while(v>=coin[i]){
                v-=coin[i];
                ans.add(coin[i]);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        List<Integer> cnt=minCoin(v);
        System.out.println(cnt);
    }
}