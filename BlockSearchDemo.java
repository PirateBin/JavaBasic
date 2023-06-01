package Algorithm.search;

public class BlockSearchDemo {
    public static void main(String[] args) {

        /*
            分块查找
            核心思想：
                    块内无序，块间有序
            实现步骤：
                    1.先创建数组blockArr存放每一块对象的信息
                    2.先查找blockArr确定要找的数据属于哪一块
                    3.再单独遍历这一块数据即可

         */

        //分块
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        //创建三个块对象
        Block b1=new Block(21,0,5);
        Block b2=new Block(45,6,11);
        Block b3=new Block(73,12,18);

        //定义数组管理三个块对象（索引表）
        Block[] blockArr={b1,b2,b3};


        //定义number值
        int number=45;

        //调用一个方法，传递索引表，数组，要查找的元素
        int Index=getIndex(blockArr,arr,number);
        System.out.println(Index);



    }

    //利用分块查找的原理，查询number的索引
    public static int getIndex(Block[] blockArr,int[] arr,int number){
        //找到number在blockArr中哪一块，定义一个方法getBlock()
        int blockIndex=getBlock(blockArr,number);

        //如果blockIndex=-1 ，表示number不在块中，则返回-1
        if(blockIndex==-1){
            return -1;
        }

        //开始查找blockArr中于number相同的数
        //获取这一块的开始索引和结束索引
        for(int i=blockArr[blockIndex].getStartIndex();i<blockArr[blockIndex].getEndIndex();i++){
            if(number==arr[i]){
                return i;
            }

        }
        return -1;

    }

    //查寻number在哪一个块
    public static int getBlock(Block[] blockArr,int number){
        /*
        Block b1=new Block(21,0,5);     ---0
        Block b2=new Block(45,6,11);    ---1
        Block b3=new Block(73,12,18);   ---2
         */

        //从0索引开始遍历blockArr，如果number小于max，表示number是在这一块当中
        for(int i=0;i<blockArr.length;i++){
                if(number<=blockArr[i].getMax()){
                return i;
            }
        }
        //循环结束没找到返回-1
        return -1;
    }


}



    //创建块类Javabean
    class Block{
        private int max; //最大值
        private int startIndex;  //起始索引
        private int endIndex;   //结束索引

        public Block(){
        }

        public Block(int max,int startIndex,int endIndex){
            this.max=max;
            this.startIndex=startIndex;
            this.endIndex=endIndex;
        }

        public int getMax() {
            return max;
        }

        public int getStartIndex() {
            return startIndex;
        }

        public int getEndIndex() {
            return endIndex;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public void setStartIndex(int startIndex) {
            this.startIndex = startIndex;
        }

        public void setEndIndex(int endIndex) {
            this.endIndex = endIndex;
        }
    }


