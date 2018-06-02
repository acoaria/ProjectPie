import java.io.*;

class fileio
{
  public static void main(String[] args) throws IOException {
    BufferedReader file;
    String line;

    file = new BufferedReader(new FileReader("pimillion.txt"));
    line = file.readLine();

    int arr[] = new int[1000000];
    /*int tmp[4] = {0,0,0,0};
    int co = 0;
    int a = 0, b = 0, c = 0, d = 0;
    */

    for(int i=0 ; i<arr.length ; i++)
    {
      char ch = line.charAt(i);
      arr[i] = Character.getNumericValue(ch);
      //int tmp = i;

      System.out.println(i+" = "+arr[i]+"\n");

      /*a = tmp[0];
      b = tmp[1];
      c = tmp[2];
      d = tmp[3];
      */

      //System.out.println(arr[a+b+c+d]+" ");

      //tmp[co]++;
      /*if(tmp[co]>29999)
      {
        co++;
      }*/
    }


    /*while(line!=null)
    {
      System.out.println(line);
      line = file.readLine();
    }*/
  }
}
