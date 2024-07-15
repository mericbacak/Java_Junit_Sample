package JavaExamples.BasicPrograms;

public class fibonacciExample1{
    public static void FibonacciWriter(int loop){
        int n1=0,n2=1,n3,i,count=loop;

        if(loop<=0){
            System.out.println("please enter greater than zero");
        }
        else {
            for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
            {
                System.out.print(n1+" "+n2);//printing 0 and 1
                n3=n1+n2;
                System.out.println("----");
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            }
        }
    }

}





