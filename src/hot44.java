import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class hot44 {
    private  static  final int[][] DIRS= {{-1,0},{1,0},{0,-1},{0,1}};
    public int orangesRotting(int[][] grid) {

        int fresh =0;
        int m= grid.length;
        int n= grid[0].length;
        Queue<int[]> queue= new ArrayDeque<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]==2) {
                    queue.offer(new int[]{i,j});
                } else if (grid[i][j]==1) {
                    fresh++;
                }
            }
        }

        int minutes=0;
        while(fresh>0&&!queue.isEmpty()){
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] cur= queue.poll();
                for (int[] d : DIRS) {
                    int x= cur[0]+d[0];
                    int y= cur[1]+d[1];
                    if(x>=0&&x<m&&y>=0&&y<n&&grid[x][y]==1){
                        grid[x][y]=2;
                        fresh--;
                        queue.offer(new int[]{x,y});
                    }
                }
            }
            minutes++;
        }
        return fresh!=0 ? -1: minutes;
    }
}
