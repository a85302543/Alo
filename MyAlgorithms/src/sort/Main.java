package sort;
public class Main {
    private static int min = Integer.MAX_VALUE;// Ԥ��ı���������ı���
    private static Point pStart = new Point(0,0);// �������Ե����
    public static void main(String[] args) {
        Point[] points = new Point[4];
        points[0] = new Point(0,1);
        points[1] = new Point(0,2);
        points[2] = new Point(0,3);
        points[3] = new Point(0,4);
        DFSSolver(points,pStart,0,0);
        System.out.println(min);
    }

    /**
     * ȫ���еķ�ʽ������·����������һ��
     * ѭ������ÿ����㣬Ȼ���ѡ�����㿪ʼ����������ȱ������������¼sumֵ�����minС���滻��
     * �����βεķ�ʽ ά���������߼�ջ�ı�����start��sum��count
     * @param points ���п�ѡ��㼯
     * @param start �˴�ѡ������
     * @param sum ����ʱ���߹���·��
     * @param count ������¼�˴���ȱ����Ƿ����
     * @return
     */
    public static void DFSSolver(Point[] points, Point start, int sum, int count) {
        for (int i = 0; i < points.length; i++) {// �������ĸ�Ϊ���
            if(! points[i].passed){ // ����˵���ʹ������
                points[i].passed = true; // û�����޸�Ϊ���ʹ�
                count++;// ��¼�ڴ˴�ѡ�������ĺ��Ѿ��������ĸ�����
                sum+=start.showDistance(points[i]);// ���˴���㵽�����ľ�������
                if(count==points.length){// ���if���Ǿ�����̵�����·�ߵĳ���
                    sum+=points[i].showDistance(pStart);// ������㵽��������ľ�������
                    if(sum<min){
                        min = sum;
                    }
                    System.out.println("i="+i+"; sum="+sum+"; min="+min);
                }
                DFSSolver(points, points[i],sum,count);// �ݹ���ã�����Ѱ����һ��δ���ʹ��ĵ㣬��������ʹ��ˣ���ô��ִ�л��ˣ����˵���һ����Ѱ��δ���ʹ��ĵ�
                points[i].passed = false;// ����һ��
                sum-=start.showDistance(points[i]);// ���˼���·������
                count --;// ���˼�����ʹ��ĵ���
            }
        }
    }

	/**
     * ��ʾͼ�еĵ㼯
     */
    static class Point {
        int x;// ��ʾ���X���ֵ
        int y;// ��ʾ���Y���ֵ
        boolean passed = false;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

		/**
         * ��ʾ�˵���ָ����ľ���
         * @param anotherPoint
         * @return
         */
        public int showDistance(Point anotherPoint) {
            return Math.abs(x - anotherPoint.x) + Math.abs(y - anotherPoint.y);
        }
    }
}