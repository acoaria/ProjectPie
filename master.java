import java.util.Scanner;
import java.io.*;
import java.lang.*;

class master {
public static void main(String[] args) throws IOException {
  BufferedReader fileio;
  fileio = new BufferedReader(new FileReader("pimillion.txt"));
  String line = fileio.readLine();
  int arr[] = new int[1000000];
  int tmp = 0;
  int i = 0;
  int j = 0;
  int con[] = new int[1000];

  for(i=0 ; i<arr.length ; i++)
  {
    char ch = line.charAt(i);
    arr[i] = Character.getNumericValue(ch);
  }



  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the name");
  String name = scan.nextLine().toLowerCase();



  System.out.println("The entered name is "+name);

  int ptr = 0;

  for(i=0;i<name.length();i++)
  {
    char ch = name.charAt(i);
    tmp = (int)ch;
    tmp = tmp-96;
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

  int counter = 0;

  for(i=0;i<=(arr.length-con.length);i++)
  {
    counter = 0;
    if(arr[i]==con[counter])
    {
      counter++;
      for(j=i+1;j<(i+con.length);j++)
      {
        if(arr[j]==con[counter])
        counter++;
      }
    }

    if(counter==con.length)
    {
      System.out.println("The array is present in the position "+i);
      break;
    }


  if(counter!=con.length)
  {
    System.out.println("The array is not present in the position " + i);
  }

}



}
}
