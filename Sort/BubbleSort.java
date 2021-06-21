import java.util.Arrays;

/**
 * 2021/6/22
 */
public class BubbleSort {

            public static <T> T  bubbleSort2(T array){
                if(array instanceof  int[]){
                    return (T) bubbleSort((int[]) array);
                }
                return (T) bubbleSort((String[]) array);
            }


            private static int[]  bubbleSort(int[] array){
                  if(array.length<=1){
                      return array;
                  }

                  for(int i=0;i< array.length;i++){
                      for(int j=i+1;j<array.length;j++){
                          if(array[i]>array[j]){
                              int tmp;
                              tmp = array[j];
                              array[j] = array[i];
                              array[i] = tmp;
                          }
                      }
                  }
                  return  array;
              }

            private static String[]  bubbleSort(String[] array){
                if(array.length<=1){
                    return array;
                }

                for(int i=0;i< array.length;i++){
                    for(int j=i+1;j<array.length;j++){
                        if(array[i].compareTo(array[j])>0){
                            String tmp;
                            tmp = array[j];
                            array[j] = array[i];
                            array[i] = tmp;
                        }
                    }
                }
                return  array;
            }

            public static void main(String args[]){
                    int[] array =  bubbleSort2(new int[]{1,4,52,4,2});
                    System.out.println(Arrays.toString(array));
            }
}