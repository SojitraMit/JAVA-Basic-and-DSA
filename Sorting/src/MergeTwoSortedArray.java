import java.util.Scanner;

public class MergeTwoSortedArray {
    public static int[] sorting(int[] arr1,int[] arr2){
        int arr3[]=new int[arr1.length+arr2.length];

        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            if(arr1[i]>arr2[j]){
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        return arr3;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter total numbers for arr1 = ");
        int n1=s.nextInt();
        int arr1[]=new int[n1];
        System.out.print("Enter elements for arr1 = ");
        for(int i=0;i<n1;i++){
            arr1[i]=s.nextInt();
        }

        System.out.print("Enter total numbers for arr2 = ");
        int n2=s.nextInt();
        int arr2[]=new int[n2];
        System.out.print("Enter elements for arr2 = ");
        for(int i=0;i<n2;i++){
            arr2[i]=s.nextInt();
        }

        int ans[]=sorting(arr1,arr2);
        System.out.println("Sorted arr :");
        for(int j=0;j<ans.length;j++){
            System.out.print(ans[j]+" ");
        }
    }
}
