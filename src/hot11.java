import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class hot11 {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> res=new ArrayList<>();
        for(int[] cur:intervals){
            if(res.isEmpty()||res.get(res.size()-1)[1]>cur[0]){
                res.add(new int[]{cur[0],cur[1]});

            } else{
                int[]last=res.get(res.size()-1);
                last[1]=Math.max(last[1],cur[1]);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}
