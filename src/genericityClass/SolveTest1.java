/*
泛型类定义
 */
package genericityClass;

class Point2<T>{
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}

public class SolveTest1 {
    public static void main(String[] args) {
        Point2<String> point2 = new Point2<>();//Ctrl + Alt + V 自动补全
        point2.setX("东经十度");
        //point2.setY(20);//如果此时写错会直接报错，编译将无法通过，泛型——类型守门员
        point2.setY("北纬二十度");
        String x = point2.getX();
        String y = point2.getY();
    }
}
public class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i = 0; i <  m; i++){
            dp[i][0] = 1;
        }
        for(int j = 0; j < n; j++){
            dp[0][j] = 1;
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j -1];
            }
        }
        return dp[m -1][n - 1];
    }
}