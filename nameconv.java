import java.util.Scanner;
import java.lang.*;

class nameconv
{
  public static void main(String[] args) {
    System.out.println("Enter the name\n");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    String edit = name.toLowerCase();
    int con[] = new int[100];
    int ptr;
    int tmp;
    int i;
    System.out.println("The entered name is "+name);

    ptr = 0;

    for(i=0;i<name.length();i++)
    {
      char ch = edit.charAt(i);
      tmp=(int)ch;
      tmp=tmp-96;
      if((tmp>=10)&&(tmp<=26))
      {

        con[ptr] = tmp/10;
        con[ptr+1] = tmp%10;
        ptr+=2;
      }
      else if (tmp<10) {
        con[ptr] = tmp;
        ptr++;
      }

    }

    System.out.println("The numeric array is being printed\n");

    for(i=0;i<ptr;i++)
    System.out.println(" "+con[i]);
  }
}
