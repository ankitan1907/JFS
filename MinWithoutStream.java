import java.util.Arrays;
public class MinWithoutStream{
 public static void main(String args[]){
  int[]arr={1,1,3,5,2,6,2,8,9,12};
  int min=arr[0];
  for(int i=1;i<arr.length;i++){
   if(arr[i]<arr[0]){
    min=arr[0];
   }
  }
 System.out.println(min);
 }
}