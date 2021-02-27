class Words
{
public static void main(String arg[])
{
String st=" loshik is a good boy ";
char ch[]=st.toCharArray();
int wc=0;
for(int i=0;i<ch.length;i++)
{
if(i==0&&ch[i]!=' ' ||ch[i]!=' ' && ch[i-1]==' ')
wc++;
}
System.out.println(" number of words "+wc);
}
}