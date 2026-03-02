package sanauwar;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int d =sc.nextInt();
            ArrayList<Integer>line = new ArrayList<>();
            for(int j=0;j<d;j++){
                line.add(sc.nextInt());
            }
            list.add(line);
        }
        int query = sc.nextInt();
        for(int i=0;i<query;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            try{
                System.out.println(list.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        sc.close();
            
    }
}

