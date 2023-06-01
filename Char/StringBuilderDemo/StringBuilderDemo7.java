package Char.StringBuilderDemo;

public class StringBuilderDemo7 {
    public static void main(String[] args){
        int [] arr={1,2,3};
        System.out.println(arrToString(arr));

        String str=arrToString2(arr);
        System.out.println(str);
        //调用方法把数组变成字符串
    }

    public static String arrToString2(int arr[]){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }
            else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //把数组转换成字符串
    public static String arrToString(int arr[]){
        String result="";
        if(arr.length==0){
            result="";
        }
        if(arr==null){
            result="";
        }
        for(int i=0;i<arr.length;i++){
            result=result+arr[i];
        }
        return result;
    }
}
