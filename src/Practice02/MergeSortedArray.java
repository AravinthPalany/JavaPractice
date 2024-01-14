package Practice02;

public class MergeSortedArray {
    /*
    Note: This is written in logic of merging two sorted arrays.
     */
    public static void main(String[] args) {
        int a1[]={1,2,3,0,0,0,0};//we are adding zero to create space for merging the second array
        int a2[]={4,6,8,9};
        int m=3;
        int n=4;
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && a1[i]>a2[j]){
                a1[k]=a1[i];
                k--;
                i--;
            }
            else{
                a1[k]=a2[j];
                k--;
                j--;
            }
        }
        for(int l=0;l<m+n;l++){
            System.out.print(a1[l]+" ");
        }
    }
}
