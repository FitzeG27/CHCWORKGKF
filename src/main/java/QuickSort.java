import java.util.ArrayList;
public class QuickSort {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(1);
        nums.add(5);
        nums.add(2);

        System.out.println(quickSort(nums));
        
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> nums){
        return sort(nums, nums.size()-1, 0);
    }
    
    public static ArrayList<Integer> sort(ArrayList<Integer> nums, int high, int low){
        if (low < high){
            int pivot = nums.get(high);
            int j = low;
            int temp;
            
            for (int i = low; i<high;i++){
                if (nums.get(i) <= pivot){
                    temp = nums.get(j);
                    nums.set(j, nums.get(i));
                    nums.set(i, temp);
                    j++;
                }
            }

            temp = nums.get(j);
            nums.set(j, nums.get(high));
            nums.set(high, temp);

            sort(nums, j-1, low);
            sort(nums, high, j+1);
        }
        return nums;
    }
}
