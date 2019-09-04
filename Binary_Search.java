class Binary
{
 public static void main(String... S)
 {
    int a=10;
	Convert_Binary ob =new Convert_Binary();
	ob.convert(a);
   }
 }
 
class Convert_Binary
{
  public void convert(int num)
  {
  if(num>0){
    // num=num%2;
	 convert(num/2);
     System.out.print(num%2);
	 }
   }
  }
