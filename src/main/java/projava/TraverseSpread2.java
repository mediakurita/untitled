package projava;

import java.util.ArrayDeque;
import java.util.Queue;

public class TraverseSpread2 {
    public static void main(String[] args) {
        int[][] map={
                {1,1,1,1,1,1,1},
                {1,0,1,0,0,0,1},
                {1,0,0,0,1,0,1},
                {1,0,1,0,2,0,1},
                {1,1,1,1,1,1,1}
        };
        traverse(map,1,1);
        char[] ch = {'.','*','G','o'};
        for(int row[]:map){
            for (int cell :row) {
                System.out.print(ch[cell]);
            }
            System.out.println();
        }

    }
    static boolean traverse(int[][] map, int curX, int curY){
        record  Position(int x,int y){};

        Queue<Position> stack = new ArrayDeque<>();
        stack.offer(new Position(curX,curY));
        for(Position p;(p=stack.poll())!=null;){
            switch (map[p.y()][p.x()]){
                case 0:break;
                case 2:return true;
                default:continue;
            }
            map[p.y()][p.x()] = 3;
            stack.offer(new Position(p.x() +1, p.y()));
            stack.offer(new Position(p.x()-1, p.y()));
            stack.offer(new Position(p.x(), p.y()+1));
            stack.offer(new Position(p.x(), p.y()-1));
        }
        return false;
    }
}
