import java.util.Arrays;
public class DistinctWithStreams{
 public static void main(String args[]){
  int[] arr={1,1,3,5,2,6,2,8,9,12};
   int[] distinctWithStreams=Arrays.stream(arr).distinct().toArray();
   System.out.println(Arrays.toString(distinctWithStreams));
 }
}