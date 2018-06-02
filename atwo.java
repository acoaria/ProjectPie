class atwo
{
  public static void main(String[] args) {
    int a[] = {1,2,3,4,5,6,7,8,9};
    int b[] = {7,8,9};
    int i,j,counter;

    counter = 0;

    for(i=0;i<=(a.length-b.length);i++)
    {
      counter = 0;
      if(a[i]==b[counter])
      {
        counter++;
        for(j=i+1;j<(i+b.length);j++)
        {
          if(a[j]==b[counter])
          counter++;
        }
      }

      if(counter==b.length)
      {
        System.out.println("The array is present in the position "+i);
        break;
      }


    if(counter!=b.length)
    {
      System.out.println("The array is not present in the position " + i);
    }

  }

  }
}
