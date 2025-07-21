import java.util.Arrays;
public class DistinctValuesStreams{
 public static void main(String args[]){
 int[] i={1,1,3,5,2,6,2,8,9,12};
 int[] distinctWithStreams=Arrays.stream(i).distinct().toArray();
 System.out.println(distinctWithStreams.length);
 }
}