import java.lang.*;
import java.util.*;

import javax.annotation.processing.SupportedSourceVersion;
import javax.print.DocFlavor.STRING;
import javax.swing.text.StyleConstants;

class MyFirst {
  public static void main(String arg[]) {

    // **** input ****************************************************

    // System.out.println("Hello Word");
    // Scanner s = new Scanner(System.in);
    // System.out.println("Enter tor number");
    // String a = s.next(); /// read first word only
    // String a = s.nextLine(); /// read all word
    // System.out.println("a = " + a);
    // int n1,n2,n3;
    // n1 = s.nextInt();
    // n2 = s.nextInt();
    // n3 = n1 + n2;
    // System.out.println(n3);
    // javap java.util.Scanner < display all methods in utils
    // int a;
    // System.out.println("a = " + a);
    // s.close();

    // **** datatype ****************************************************

    // int x;
    // System.out.println(Integer.MIN_VALUE);
    // System.out.println(Integer.MAX_VALUE);
    // System.out.println(Byte.MAX_VALUE);

    // byte b;
    // System.out.println(b); /// error

    // byte b = 9;
    // System.out.println(b);
    // b =34;
    // System.out.println(b);

    // byte b =130;// error: incompatible types:
    // System.out.println(b);

    // byte b = 0xA; /// hexadecimal
    // System.out.println(b);

    // byte b = 0b1010; /// binary
    // System.out.println(b);

    // byte b = 10; /// decimal
    // System.out.println(b);

    // long l =3545313132165423; ///error: integer number too large
    // System.out.println(l);

    // long l =3545313132165423L;
    // System.out.println(l);

    // float f = 12.34; /// bydault 12.36 is double literal;
    // // double d = 12.36;
    // System.out.println(f);
    // // System.out.println(d);

    // float f = 12.34f;
    // System.out.println(f);

    // long l = 999_999_999; /// 999,999,999 increase the redibilty
    // System.out.println(l);

    // int x = -5; /// tow's complement
    // String s = Integer.toBinaryString(x);
    // System.out.println(s);;
    // System.out.println(Integer.toBinaryString(x));

    // **** Arithamtic ****************************************************

    // int a = 45;
    // long l = 45;
    // int t = (int)l + a;
    // System.out.println(t);

    // int a =14,b=5;
    // float a1 =(float) a/b;
    // System.out.println(a1);

    // byte a = 4,c =5;
    // short s =9;
    // int d = a + s;
    // System.out.println(d);

    // float a = 678.78f;

    // double d = 89;
    // double v = a * d;
    // System.out.println(v);

    // float a =12;
    // float r =90;
    // double p = r + a;
    // System.out.println(p);
    // float a,b,c;
    // System.out.println("Enter the value of a,b,c");
    // Scanner sc = new Scanner(System.in);
    // a = sc.nextFloat();
    // b = sc.nextFloat();
    // c = sc.nextFloat();
    // float s = (a+b+c) / 2f;
    // float a1 = s*(s-a)*(s-b)*(s-c);
    // double a2 = Math.sqrt(a1);
    // // c = 0.5f*a*b; /// correct ans
    // // c = 1/2*a*b; /// = 0
    // System.out.println("area = " + a2);

    // int a = 9,b;
    // b = ++a;
    // System.out.print(b+a);
    // System.out.println(3 + 6 +"obj " );
    // System.out.println("obj "+ 3 +6);
    // System.out.println("obj "+( 3 +6));
    // System.out.println("sum of "+10+" and " + 20 + " is " + ( 10 +20));
    // System.out.println("sum of "+10+" and " + 20 + " is " + 10 +20);

    /// printing in java *************************************************

    // System.out.printf("hello\n");
    // System.out.printf("hello\n");

    // int x = 10;
    // float y = 12.34f;
    // char z = 'A';
    // System.out.printf("Hello %d %f %c nubwer\n", x, y, z);

    // ? how do i conver the decoimal number in hex or oct
    // int x = 12;
    // System.out.printf("hexadecimal of 12 is %o",x);

    // int x = 10;
    // float y = 6.34f;
    // char z = 'A';
    // String str = "Java Program";
    // System.out.printf("Hello %s nubwer\n", str);

    // int x = 10;
    // float y = 6.34f;
    // char z = 'A';
    // String str = "Java Program";
    // System.out.printf(+x+y+"Hello nubwer"+ str);

    // int a =10,n=-2;
    // float f = 4.54f;
    // System.out.printf("%5d\n",a);;
    // System.out.printf("%05d\n",a);;
    // System.out.printf("%(05d\n",a);;
    // System.out.printf("%+5d\n",a);;
    // System.out.printf("%5d\n",n);;
    // System.out.printf("%6.3f\n",f);;

    // String str ="Java";
    // System.out.printf("%12s\n",str);
    // System.out.printf("%-12s ,\n",str);

    // // String *******************************************************

    // char c[] = { 'a', 's', 'f', 'a', 's', 'f' };
    // String str1 = new String(c);
    // System.out.println(str1);
    // String str = "hava";
    // String str2 = str;
    // System.out.println(str2 == str);

    // String str1 = new String("Java");
    // String str2 = "Java";
    // // // str1 = str2;
    // System.out.println(str2 == str1);

    // String str = "Java"; // C in pool Java
    // int len = str.length();
    // String str3 = "java";
    // String str1 = str.toLowerCase(); // C in heap java
    // System.out.println(len); /// 4
    // System.out.println(str1); /// java
    // System.out.println(str3 == str1); /// f
    // str = str.toLowerCase();
    // System.out.println(str == str1);

    // String s1 = "java";
    // String s2 = "java";
    // // System.out.println(s1 == s2);

    // for (int i = 0; i < s2.length(); i++) {

    // System.out.print(s2.charAt(i));
    // }

    // matches in string

    // String s= "s";
    // String s1 = "ee";
    // System.err.println(s1.matches("."));
    // System.out.println(s.matches("."));

    // String str1 = "C";
    // System.out.println(str1.matches("[dhf]")); ///
    // System.out.println(str1.matches("[dhf][pl]")); // Exactly first from firs=t
    // from block and second from second
    // System.out.println(str1.matches("[A-Z]")); // from A to Z
    // System.out.println(str1.matches("C|c")); // weither from two
    // System.out.println(str1.matches("C")); // exact same

    // String s ="q",s1 ="d2",s3= "3",s4 ="49";
    // System.out.println(s.matches("\\w"));
    // System.out.println(s1.matches("\\w"));
    // System.out.println(s3.matches("\\d"));;
    // System.out.println(s4.matches("\\d"));;

    // String p = "dhiraj@gmail.com";
    // int i = p.indexOf("@");
    // String username = p.substring(0,i);
    // String domain =p.substring(i,p.length());
    // System.out.println(username + " " + domain);

    // weather given number is binary or noy

    // int a = 110101;
    // String s = a+"";
    // System.out.println(s);
    // System.out.println(s.matches("[01]*"));

    // weather given number is hexadecimal or noy

    // int a = 12345676;
    // String s = a+"ZAAA";
    // System.out.println(s);
    // System.out.println(s.matches("[0-9A-F]*"));

    // weather given input is date or noy
    // String s = "01/02/0009";
    // System.out.println(s.matches("[0-3][0-9]/[0-1][0-9]/[0-9][0-9][0-9][0-9]"));
 

      
  }
};
