package top.brightzm.BlockSearchDemo;

public class BlockSearchDemo2 {

    public static void main(String[] args) {
        // 分块查找（完全无序）
        int[] arr = {27,22,30,40,36,
                13,19,16,20,
                7,10,
                43,50,48};

        // 分块
        BlockUpdate blockUpdate1 = new BlockUpdate(22,40,0,4);
        BlockUpdate blockUpdate2 = new BlockUpdate(13,20,4,8);
        BlockUpdate blockUpdate3 = new BlockUpdate(7,10,9,10);
        BlockUpdate blockUpdate4 = new BlockUpdate(43,50,11,13);


        BlockUpdate[] blockArr = {blockUpdate1,blockUpdate2,blockUpdate3,blockUpdate4};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(getIndex(arr, blockArr, arr[i]));
        }

        System.out.println(getIndex(arr, blockArr, 70));

    }




    public static int getIndex(int[] arr,BlockUpdate[] blockArr,int number){
        int BlockIndex = findBlockIndex(blockArr,number);
        if (BlockIndex <0){
            return -1;
        }
        BlockUpdate block = blockArr[BlockIndex];
        int startIndex = block.getStartIndex();
        int endIndex = block.getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static int findBlockIndex(BlockUpdate[] blockArr, int number){
        for (int i = 0; i < blockArr.length; i++) {
            if (blockArr[i].getMax()>= number&& blockArr[i].getMin()<=number){
                return i;
            }
        }
        return -1;
    }


}


class BlockUpdate{
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;

    public BlockUpdate() {
    }

    public BlockUpdate(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}