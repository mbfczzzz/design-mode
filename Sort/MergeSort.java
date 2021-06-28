import java.util.Arrays;

/**
 * 递归返回条件
 * 递归
 * 合并
 */
public class MergeSort {
    private static int[]  mergeSort(int[] array,int start,int end){
             mergeSortInternal(array,start,end);
            return array;
    }

//    6,8,2,1,4,52,4,2
//
//    6 8 2 1 4 52 4 2
//    6 8 2 1 4 52 4 2
//    6 8 2 1 4 52 4 2
//    6 8 2 1   4  2
    private static void  mergeSortInternal(int[] array,int start,int end){
        //递归返回条件
        if(start>=end){
            return ;
        }
        //取中点，二分
        int mid = (start+(end-1))/2;
        //递归
         mergeSortInternal(array,start,mid);
         mergeSortInternal(array,mid+1,end);
        //合并
        // start = 4  end = 4
        // 6 8  start = 1  mid = 1 newStart = 2 end = 2
        int[] newArray = new int[end-start+1];
//            4
        int newStart = mid+1;
//        3 4  start = 1 end = 4 mid = 2 newStart = 3
//        3
        int n=0;
        int start1 = start;
//        3
        while(start1<=mid  && newStart<=end){
//            2 1
            if(array[start1-1]<array[newStart-1]){
                newArray[n] = array[start1-1];
                n++;
                start1++;
            }
            else {
                newArray[n] = array[newStart-1];
                n++;//3
                newStart++;//5
            }
        }
//        6
        if(start1<=mid){
            for (int i=start1-1;i<mid;i++){
                newArray[n] = array[i];
                n++;
            }
        }
        if(newStart<=end){
            for (int i=newStart-1;i<end;i++){
                newArray[n] = array[i];
                n++;
            }
        }
//        1 2 3 4    1  2   4


        //6 8  1 2
        for (int i=0;i<end-start+1;i++){
            array[start-1+i] = newArray[i];
        }
        System.out.println(Arrays.toString(array));
//        6 8
//        2 1
    }



    public static void main(String args[]){
        int[] testArray = new int[]{6,8,2,1,4,52,4,2};
        int[] array =  mergeSort(testArray,1,testArray.length);
//        System.out.println(Arrays.toString(array));
    }

}
