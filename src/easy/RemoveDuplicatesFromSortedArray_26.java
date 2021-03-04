package easy;

public class RemoveDuplicatesFromSortedArray_26 {

    //TODO. use in-place algorithm
    //In-place 알고리즘이란 원소들의 개수에 비해서 충분히 무시할 만한 저장 공간만을 더 사용하는 정렬 알고리즘
    //새로운 Array 생성 금지, 기존 Input Array 만 수정하여 풀기
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1) {
            return nums.length;
        }

        int headIndex = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[headIndex] != nums[i]) {
                nums[headIndex+1] = nums[i];
                headIndex += 1;
            }
        }

        return headIndex+1;
    }
}
