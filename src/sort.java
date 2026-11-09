import java.sql.Array;
import java.util.Arrays;

public class sort {
    //冒泡排序
    void bubbleSort(int[] a){
        for(int i=0; i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){swap(a,j,j+1);
                }
            }
        }
    }


    //选择排序
    void selectionSort(int[] a){
        for(int i=0; i<a.length-1;i++){
            int min=i;
            for(int j=i+1; j<a.length;j++){
                if(a[j]<a[min]){min=j;}
            }
            swap(a,min,i);
        }
    }

    //插入排序
    void insertionSort(int[] a){
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]) swap(a,j,j-1);
            }
        }
    }

    //归并排序
    void mergeSort(int[] a){

        mergeSort(a,0,a.length-1);
    }

    private void mergeSort(int[] a,int left,int right){
        if(left>=right) return;
        int mid=(left+right)/2;
        mergeSort(a,left,mid);
        mergeSort(a,mid+1,right);
        merge(a,left,mid,right);
    }
    private static void merge(int[] a,int left,int mid,int right){
        int[] leftPart= Arrays.copyOfRange(a,left,mid+1);
        int[] rightPart = Arrays.copyOfRange(a,mid+1,right+1);
        int i=0;
        int j=0;
        int k=left;
        while(i<leftPart.length&&j< rightPart.length){
            if(leftPart[i]<=rightPart[j]){
                a[k]=leftPart[i];
                i++;
            }
            else{
                a[k]=rightPart[j];
                j++;
            }
            k++;
        }

        while(j<rightPart.length){
            a[k]=rightPart[j];
            k++;
            j++;
        }
        while(i<leftPart.length){
            a[k]=leftPart[i];
            k++;
            i++;
        }
    }


    //快速排序
    void quickSort(int[] a){
        quickSort(a,0,a.length-1);
    }


    private static void quickSort(int[] a, int left, int right){
        if(left>=right) return;
        int p=partition(a,left,right);
        quickSort(a,left,p-1);
        quickSort(a,p+1,right);
    }

    private static int partition(int[] a, int left, int right){

        int pivot = right;
        int boundary=left;
        for (int i = left; i <=right ; i++) {
            if(a[i]<pivot){
                swap(a,boundary,i);
                boundary++;
            }

        }
        swap(a,boundary,right);
        return boundary;
    }



    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
