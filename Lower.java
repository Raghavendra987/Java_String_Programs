class Lower
{
public static void main(String arg[])
{
String st="LOSHIK";
char ch[]=st.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(ch[i]>='A' && ch[i]<='Z')
{
ch[i]=(char) (ch[i]+32);
}
}
st=new String(ch);
System.out.println(ch);
}
}