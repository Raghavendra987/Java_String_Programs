class Pangram
{
public static void main(String arg[])
{
String a="asdfghjklqwertyuiopzxcvbnm";
boolean rs=isPangram(a);
if(rs==true)
System.out.println(" pangram ");
else
System.out.println(" not  pangram ");

}
static boolean isPangram(String a)
{
if(a.length()<26)
{
return false;
}
int count[]=new int[26];
for(int i=0;i<a.length();i++)
{
char ch=a.charAt(i);
if(ch>='A' && ch<='Z')
count[ch-65]++;
else if(ch>='a'&& ch<='z')
count[ch-97]++;
}
for(int i=0;i<26;i++)
{
if (count[i]==0)
return false;
}
return true;
}
}