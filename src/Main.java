import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //TwoSum
        int [] array1 = {0,1,2,3,4,5};
        int target = 9;
        System.out.println(Arrays.toString(TwoSum(array1, target)));




    }

    public static int[] TwoSum(int[] array1, int target){
        //Brute Force
        for (int i = 0; i < array1.length; i++){
            for (int j = i + 1; j < array1.length; j++){
                if (array1[j] == target - array1[i]){
                    return new int []  { i , j };
                }
            }
        }
        return null;
    }









    
}
