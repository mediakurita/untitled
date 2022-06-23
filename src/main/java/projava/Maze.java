package projava;

import java.io.IOException;

public class Maze {
    public static void main(String[] args) throws IOException {
        record Position(int x,int y){};
        int[][] map={
                {1,1,1,1,1,1},
                {1,0,1,0,0,1},
                {1,0,0,0,1,1},
                {1,0,1,0,0,1},
                {1,1,1,1,1,1}
        };

        var current = new Position(1, map.length-2);
        var goal = new Position(map[0].length-2,1);

        int i = 0;

        for(;;){
            for (int y = 0; y < map.length; y++) {
                for (int x = 0; x < map[y].length; x++) {
                    if (x== current.x() && y== current.y()){
                        if(i == 0) {
                            System.out.print("o");
                        } else{
                            System.out.print("O");
                        }
                    }else if (x== goal.x() && y== goal.y()){
                        System.out.print("G");
                    } else if (map[y][x]==1) {
                        System.out.print("*");
                    } else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }

            if(current.equals(goal)){
                System.out.println("goal");
                break;
            }

            int ch = '\n';
            while(ch == '\n') ch = System.in.read();

            var next = switch (ch){
                case 'a'-> new Position(current.x()-1, current.y());
                case 'w'-> new Position(current.x(), current.y()-1);
                case 'd'-> new Position(current.x()+1, current.y());
                case 's'-> new Position(current.x(), current.y()+1);
                default -> current;
            };

            if(map[next.y()][next.x()]==0){
                current = next;
                i = (++i)%2;
            }
            while (ch!='\n') ch = System.in.read();
        }
    }
}
