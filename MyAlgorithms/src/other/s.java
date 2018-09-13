package other;

public class s {
	static class Point {
        int x, y;

        public Point(int i, int i1) {
            x = i;
            y = i1;
        }
    }

    public static void main(String[] args) {
        start = new Point(0, 0);
        points = new Point[]{new Point(2, 2), new Point(2, 8),
                new Point(4, 4), new Point(7, 2)};
        System.out.println(minPath());
    }

    private static int min = Integer.MAX_VALUE; //全局最小路径，初始为无穷大
    private static Point start; //起点
    private static Point[] points; //所有的顶点数组

    /**
     * 计算最短路径的算法，深搜，回溯等
     * @return 返回全局最小路径数值
     */
    private static int minPath() {
        boolean[] b = new boolean[points.length];
        int path = 0;
        for (int i=0; i<points.length; i++) {
            path += getDis(start, points[i]);
            dfs(i, path, b, 1, points.length);
        }
        return min;
    }

    /**
     * 深搜主算法
     * @param index 当前顶点的序号
     * @param path 所有距离累加值
     * @param b 标记数组，true则在当前路径上
     * @param level 深搜深度
     * @param length 总深度
     */
    private static void dfs(int index, int path, boolean[] b, int level, int length) {
        if (level == length) {
            path += getDis(start, points[index]);
            if (path < min) min = path;
            return;
        }
        b[index] = true;
        for (int i=0; i<points.length; i++) {
            if (!b[i]) {
                path += getDis(points[index], points[i]);
                dfs (i, path, b, level+1, length);
            }
        }
        b[index] = false;
    }

    /**
     * 由两个点获取期间的距离算法
     * @param start
     * @param point
     * @return
     */
    private static int getDis(Point start, Point point) {
        return Math.abs(start.x-point.x) + Math.abs(start.y-point.y);
    }
}
