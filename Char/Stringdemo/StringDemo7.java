package Char.Stringdemo;

public class StringDemo7 {
    public static void main(String [] args) {
        int[] arr={1,2,3};

        String str=arrToString(arr);
        System.out.println(str);

    }
        //我要干嘛  --遍历数组并把数组拼接成一个字符串
        //我干这件事情需要什么才能完成  --数组
        //我干完了是否需要把结果返回调用处  --返回一个拼接之后的字符串
        public static String arrToString(int[] arr){
            if(arr==null){
                return "";
            }

            if(arr.length==0){
                return "[]";
            }

            String result="[";
            //当代码执行到这表示什么？
            //表示数组不上null，也不是长度为0
            for(int i=0;i<arr.length;i++) {
                if (i == arr.length - 1) {
                    result = result + arr[i];
                } else {
                    result = result + arr[i] + ",";
                }

            }
            result=result+"]";
            return result;
        }


}
