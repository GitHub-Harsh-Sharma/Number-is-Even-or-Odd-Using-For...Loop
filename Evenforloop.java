import java.io.*;
class Evenforloop
{
    public static void main(String args[])throws IOException
    {
        int num1,num2,i;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter the starting no: ");
        num1=Integer.parseInt(br.readLine());
        System.out.print("Enter the end no: ");
        num2=Integer.parseInt(br.readLine());
        for(i=num1;i<=num2;i++)
            if(i%2==0)
            System.out.println(i+":is even");
    }    
}


