import java.io.*;

class fileio
{
  public static void main(String[] args) throws IOException {
    BufferedReader file;
    String line;

    file = new BufferedReader(new FileReader("pimillion.txt"));
    line = file.readLine();

    int arr[] = new int[1000000];

    for(int i=0 ; i<arr.length ; i++)
    {
      char ch = line.charAt(i);
      arr[i] = Character.getNumericValue(ch);

      System.out.println(i+" = "+arr[i]+"\n");
  }
}
