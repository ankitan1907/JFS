public class DistinctWithoutStreams{
 public static void main(String args[]){
  int[] arr={1,1,3,5,2,6,2,8,9,12};
  int[] distinct=new int[arr.length];
  int count=0;
  for(int i=0;i<arr.length;i++){
    boolean isDuplicate=false;
   for(int j=0;j<count;j++){
    if(arr[i]==distinct[j]){
     isDuplicate=true;
     break;
    }
   }
  if(!isDuplicate){
   distinct[count]=arr[i];
    count++;
   }
  }
        for (int i = 0; i < count; i++) {
            System.out.print(distinct[i] + " ");
  } 
 }
}