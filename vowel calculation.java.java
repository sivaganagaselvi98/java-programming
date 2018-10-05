import java.util.Scanner;
class vowel {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the letter");
   char ch='a';
   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
   System.out.println("the letter is vowel");
   else
   System.out.println("the letter is consonant");
   }
}