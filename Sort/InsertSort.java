import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2021/6/23
 * 插入排序
 * 插入排序，向前移，
 * 保存最新的未排值
 * 时间复杂度： o(n²)
 * 空间复杂度： o(1)
 * 稳定性： 稳定的
 */
public class InsertSort {

    private static int[]  insertSort(int[] array){
        if(array.length<=1){
            return array;
        }
        //未排序区间开始排序
        for (int j=1;j< array.length;j++){
            int i = j-1;
            int tmp = array[j];
                for (;i>=0;i--){
                    if(tmp<array[i]){
                        array[i+1] = array[i];
                    }
                    else {
                        break;
                    }
                }
                array[i+1] = tmp;
        }
        return array;
    }

    public static void main(String args[]){
        int[] array =  insertSort(new int[]{1,4,52,4,2});
        System.out.println(Arrays.toString(array));
    }
}
