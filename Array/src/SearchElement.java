import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter cases = ");
        int t=s.nextInt();

        for(int i=1;i<=t;i++){
            System.out.print("Enter total numbers = ");
            int n=s.nextInt();
            System.out.print("Enter elements = ");
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=s.nextInt();
            }
            System.out.print("Enter searching element = ");
            int x=s.nextInt();
            boolean find=false;
            int idx=-1;
            for(int k=0;k<n;k++){
                if(arr[k]==x){
                    find=true;
                    idx=k;
                    break;
                }
            }
            if(find){
                System.out.println("index = "+idx);
            }
            else{
                System.out.println("index = "+idx);
            }
        }
    }
}
