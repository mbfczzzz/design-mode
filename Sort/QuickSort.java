import java.util.*;


/**
 * 快速排序
 * 在数据中选择任意一个中间点
 * 将大于中间点放右边,小于放左边
 * 递归继续分区，直到分完
 * 6,8,2,1,4,52,4,2
 * 1 2 2 4 4 6 8  52
 */
public class QuickSort {
    private static int[]  qucikSort(int[] array,int start,int end){
        sort(array,start,end);
        return  array;
    }

    public static  void sort(int[] array,int start,int end){
        if(start>=end){
            return;
        }
        int pviot = partion(array,start,end);
        sort(array,start,pviot-1);
        sort(array,pviot+1,end);
    }
    //分区函数
    //单指针循环法
    private static int  partion(int[] array,int start,int end){
            int pviot = end;
            int  j = start;
            for (int i=start;i<=end;i++){
                    if(array[i]<array[pviot]){
                        if(i==j){
                            j++;
                        }
                        else {
                            int tmp = array[j];
                            array[j++] = array[i];
                            array[i] = tmp;
                        }
                    }
            }
            int tmp = array[j];
            array[j] = array[end];
            array[end] = tmp;
            return  j;
    }

    public static void main(String args[]){
        int[] testArray = new int[]{6,8,2,1,4,52,4,2};
        int[] array =  qucikSort(testArray,0,testArray.length-1);
//        System.out.println(Arrays.toString(array));
    }
}
