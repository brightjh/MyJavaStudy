package top.brightzm.BlockSearchDemo;

public class BlockSearchDemo1 {
    public static void main(String[] args) {
        // 分块查找

        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        // 1. 将数据进行分块
        Block block1 = new Block(21, 0, 5);
        Block block2 = new Block(45, 6, 11);
        Block block3 = new Block(73, 12, 17);

        Block[] blocks = {block1, block2, block3};

        // 要查找索引的数据
        int number = 88;


        int index = getIndex(arr, blocks, number);
        System.out.println(index);

    }

    // 获取索引
    public static int getIndex(int[] arr, Block[] blocks, int number) {
        // 判断元素在数组中是否存在
        int blockIndex = findBlockIndex(blocks, number);
        if (blockIndex == -1) {
            return -1;
        }
        // 获取块在数组中的起始索引和结束索引
        Block block = blocks[blockIndex];
        int startIndex = block.getStartIndex();
        int endIndex = block.getEndIndex();

        // 获取元素在数组中的索引（基础查找）
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    // 获取块组索引
    public static int findBlockIndex(Block[] blocks, int number) {
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].getMax() > number) {
                return i;
            }
        }
        return -1;
    }


}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;


    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
