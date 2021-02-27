class Uppercase
{
public static void main(String arg[])
{
String st="qwert";
char ch[]=st.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(ch[i]>='a' && ch[i]<='z')
{
ch[i]=(char) (ch[i]-32);
}
}
st=new String(ch);
System.out.println(ch);
}
}
