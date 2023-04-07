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

    public int ceilingNumber(int [] arr,int target){
        int start=0;
        int end=arr.length -1;

        while(start <=end){
            int mid= start +(end -start)/2;
            if(target < arr[mid]){
                end=mid-1;
            }else if(target > arr[mid]){
                start=mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];
    }
    public int floorNumber(int [] arr,int target){
        int start=0;
        int end=arr.length -1;
        if(target <= arr[arr.length-1]){
            return target;
        }
        while(start <=end){
            int mid= start +(end -start)/2;
            if(target < arr[mid]){
                end=mid-1;
            }else if(target > arr[mid]){
                start=mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[end];
    }
    public char letterNextToTarget(char [] arr, char target){
        int start=0;
        int end=arr.length-1;

        while(start <=end){
            int mid=start + (end-start)/2;
            if(target < arr[mid]){
                end=mid -1;
            }else if(target > arr[mid]){
                start=mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[start % arr.length];

    }
    public int [] firstPosLastPos(int [] arr,int target){
        int [] pos={-1,-1};
        int start=searchPos(arr,target,true);
        int end= searchPos(arr,target,false);
        pos[0]=start;
        pos[1]=end;
        return pos;

    }
    static int searchPos(int [] arr,int target,boolean startingPos){
        int start=0;
        int end=arr.length -1;
        int ans=-1;

        while(start <= end){
            int mid=start + (end-start)/2;
            if (target < arr[mid]){
                end=mid-1;
            }else if(target > arr[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(startingPos){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
   public int bsInfiniteArray(int [] arr, int target){
        int start=0;
        int end=1;
        while(target > arr[end]){
            int newStart=end +1;
            end= end + (end - start + 1)* 2;
            start=newStart;
        }
        return bsInSearch(arr,target,start,end);
   }
   static int bsInSearch(int [] arr,int target,int start,int end){
        while(start <= end){
            int mid=start + (end - start) /2;
            if( target < arr[mid]){
                end= mid -1;
            }else if ( target > arr[mid]){
                start=mid + 1;
            }else{
                return arr[mid];
            }

        }
        return -1;
   }
   public int peakElement(int [] arr){
        int start=0;
        int end=arr.length -1;

        while(start <=end){
            int mid=start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end=mid;
            }else if(arr[mid] M)
        }
   }

}