import java.util.Arrays;


/**
 * 选择排序
 * 先排序
 *  保存每一次遍历的最小值   找到最小值 进行交换
 *  多个最小值 找到最小的哪一个
 *  稳定的  o(n²) o(1)
 * 2021/6/23
 */
public class SelectSort {

    private static int[]  selectionSort(int[] array){
        if(array.length<=1){
            return array;
        }
        //未排序区间开始排序

        for (int j=0;j< array.length;j++){
            int min = j;
            for (int i=j+1;i< array.length;i++){
                if(array[i]<array[min]){
                        min = i;
                }
            }
            int tmp = array[j];
            array[j] = array[min];
            array[min] = tmp;
        }
        return array;
    }

    public static void main(String args[]){
        int[] array =  selectionSort(new int[]{6,8,2,1,4,52,4,2});
        System.out.println(Arrays.toString(array));
    }
}
