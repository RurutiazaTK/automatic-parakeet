package Day5;

public class Example10 {
    public static void main(String[] args) {
        int []arr=new int[7];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        arr[3]=1;
        System.out.println("第"+1+"月有"+arr[1]+"对兔子");
        System.out.println("第"+2+"月有"+arr[1]+"对兔子");
        System.out.println("第"+3+"月有"+arr[1]+"对兔子");
        System.out.println("第"+4+"月有"+arr[1]+"对兔子");
        for(int i=4;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-4];
            System.out.println("第"+(i+1)+"月有"+arr[i]+"对兔子");
        }
    }

}
