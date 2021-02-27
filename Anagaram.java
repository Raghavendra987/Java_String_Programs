class Anagaram
{
public static void main(String arg[])
{
String st1="raghu";
String st2="aghru";
boolean rs=isAnagram1(st1,st2);
if(rs==true)
System.out.println(" Aangram ");
else
System.out.println(" not  Aangram ");

}
static boolean isAnagram1(String st1,String st2)
{
int count1[]=new int[26];
for(int i=0;i<st1.length();i++)
{
char ch=st1.charAt(i);
if(ch>='A' && ch<='Z')
count1[ch-65]++;
else if(ch>='a'&& ch<='z')
count1[ch-97]++;
}

int count2[]=new int[26];
for(int i=0;i<st2.length();i++)
{
char ch=st2.charAt(i);
if(ch>='A' && ch<='Z')
count2[ch-65]++;
else if(ch>='a'&& ch<='z')
count2[ch-97]++;
}

for(int j=0;j<26;j++)
{
if(count1 [j]!=count2 [j])
return false;
}
return true;
}
}