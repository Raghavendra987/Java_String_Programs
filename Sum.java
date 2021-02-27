class Sum
{
public static void main(String arg[])
{
String st="loshik12is34a58goodboy";
int sum=0;
for(int i=0;i<st.length();i++)
{
char ch=st.charAt(i);
if(ch>='0' && ch<='9')
{
sum=sum+(ch-48);
}
}
System.out.println("Sum of digits present in the String "+sum);
}
}