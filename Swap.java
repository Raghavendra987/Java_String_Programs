class Swap
{
public static void main(String arg[])
{
int f=0;
String st="loshik is a good boy";
char ch[]=st.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
{
f=i;
}
if(i==ch.length-1 && ch[i]!=' '||ch[i]!=' ' && ch[i+1]==' ')
{
char t=ch[f];
ch[f]=ch[i];
ch[i]=t;
}
}
st=new String(ch);
System.out.println(ch);
}
}
