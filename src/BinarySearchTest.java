import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void orderAgnositc() {
        BinarySearch bs=new BinarySearch();
        int [] arrRev={90,88,55,35,22,11};
        int [] arr={11,22,45,45,45,55,60,90};
        int [] arrO={11,22,45,45,45,55,60,90,100,120,140,150,180,200};

        int [] pos= {2,4};
        int [] peak={2,4,5,6,4,2,1};
        char [] arrL={'b','c','f','e'};
        //testing that if BinarySearch Tests For Reverse
        assertThat(bs.orderAgnositc(arrRev,55), is(55));
        assertThat(bs.orderAgnositc(arr,45), is(45));

        //so ceiling of a number means that number that is greater or equal to the target element
        assertThat(bs.ceilingNumber(arr,56), is(60));
        //so ceiling of a number means that number that is less then or equal to the target element
        assertThat(bs.floorNumber(arr,49), is(49));
        assertThat(bs.letterNextToTarget(arrL,'a'), is('b'));
        assertThat(bs.firstPosLastPos(arr,45), is(pos));
        assertThat(bs.bsInfiniteArray(arrO,45), is(45));
        assertThat(bs.bsInfiniteArray(arrO,45), is(45));





    }
}