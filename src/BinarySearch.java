import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BinarySearch {

    public int orderAgnositc(int [] arr,int target){
        int start=0;
        int end=arr.length-1;

        boolean checkAscending= arr[start] < arr[end];

        while(start<=end){

            int mid=start + (end-start) /2;
            if(checkAscending){
                if(target < arr[mid]){
                    end=mid -1;
                }else if(target > arr[mid]){
                    start=mid+1;
                }else{
                   return arr[mid];
                }
            }else{
                if(target > arr[mid]){
                    end=mid -1;
                }else if(target < arr[mid]){
                    start=mid+1;
                }else{
                   return arr[mid];
                }
            }
        }
        return -1;
    }
}