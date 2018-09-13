import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class XC_3 {
/**
 * 遍历最短路径长度
 *
题目描述：
暴风降临的龙母丹妮莉丝·坦格利安要骑着她的龙以最快的速度游历各国，她的谋士们纷纷献策规划路线。
作为她的谋士之一和仰慕者的你，决定冒险穿越到21世纪借助计算机来寻求最优路线。
请设计一段程序，读取各国两两之间的距离，距离以邻接矩阵表示，并计算出遍历各国的最短路径长度。
输入
第一行：国家数量，假设为n
后续n行是国家间距离的邻接矩阵表示
输出
遍历各国的最短路径长度
样例输入
4
0,1,2,3
1,0,4,5
2,4,0,2
3,5,2,0
样例输出
5
思路: 组合 --> 最小值
TC: O(n!)
SC: O(n)
 */
public static void main(String[] args) {
Scanner in = new Scanner(System.in 

);
Pattern pattern = Pattern.compile("[,]");
// 获取国家数
int lines = in.nextInt();
int [][] arr = new int [lines][lines];
// 缓冲输入--Key
in.nextLine();
for(int i = 0; i < lines; i++){
int k = 0;
String s = in.nextLine();
String [] str = pattern.split(s);
int len = str.length;
for(int j = 0; j < len; j++){
arr[i][k++] = Integer.parseInt(str[j]);
}
}
/*for(int i = 0; i < arr.length; i++){
for(int j = 0; j < arr.length; j++){
System.out.print(arr[i][j] + " ");
}
System.out.println(" ");
}*/
        List<Integer> s = new ArrayList<Integer>();  
        List<Integer> rs = new ArrayList<Integer>();
        for(int i = 0; i < lines; i++)
            s.add(i);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> li = new ArrayList<Integer>();
        li = pl(s, rs, arr, list);
        System.out.println("");
        for(Integer c : li){
            System.out.print(c + " ");
        }
        System.out.println("");
        System.out.println("最短路径:" + Collections.min(li));
}
private static ArrayList<Integer> pl(List<Integer> s,List<Integer> rs, int [][] arr, ArrayList<Integer> list){
     int cost = 0;
             // 递归出口
         if(s.size() == 1)
         {  
             rs.add(s.get(0));  
//             System.out.println(rs.toString());
             for(int i = 0; i < rs.size()-1; i++){
                 cost += arr[rs.get(i)][rs.get(i+1)];
             }
             if(!list.contains(cost)){
                 list.add(cost);
             }
             System.out.print(cost + " ");
             rs.remove(rs.size()-1);  
         }else{
             for(int i = 0; i < s.size(); i++){
              rs.add(s.get(i));   
                 List<Integer> tmp = new ArrayList<Integer>();  
                 for(Integer a:s)
                    tmp.add(a);
                 tmp.remove(i);
                 pl(tmp, rs, arr, list);
                 rs.remove(rs.size()-1);      
             }  
         }
return list;      
    }
}
