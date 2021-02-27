import java.util.Scanner;
class Ntostring
{
static void nw(int n,String st)
{
String one[]= {" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen", "seventeen","eighteen","nineteen"};
String two[]= {" "," ","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred"};
if(n<20)
System.out.print(one[n]);
else
System.out.print(two[n/10]+one[n%10]);
if(n!=0)
System.out.print(st+" ");
}
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the number : ");
int n=sc.nextInt();
nw(n/10000000 ,"crore");
nw(n/100000%100,"lakhs");
nw(n/1000%100 ,"thousand");
nw(n/100%10 ,"hundred");
nw(n%100," ");
}
}

