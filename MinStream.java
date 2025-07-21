import java.util.Arrays;
public class MinStream{
public static void main(String args[]){
 int[] i={1,1,3,5,2,6,2,8,9,12};
 int minWithStream=Arrays.stream(i).min().getAsInt();
 System.out.println(minWithStream);
 }
 }