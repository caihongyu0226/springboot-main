package cn.fjut.chy.config;

public class MaxMin {
    public static void BubbleSort(int array[]){
        int i,j;
        int len = array.length;
        int temp;
        for (i = 0 ;  i < len-1 ; i++){
            for (j = len - 1 ; j > i;j--){

                if (array[i] > array[j]){
                    temp = array[j];
                    array[j] = array[j];
                    array[i] = temp;

                }
            }
        }
    }
}
