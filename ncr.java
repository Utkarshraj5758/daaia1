import java.util.Scanner;

public class ncr {
    public static int ncr(int n,int r){
        if (r==0 || r==n) return 1;
        return ncr(n-1,r-1)+ncr(n-1,r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int ans=ncr(n,r);
        System.out.println(ans);
 }
}
