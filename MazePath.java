import java.util.ArrayList;

public class MazePath {
    public static ArrayList<String> path(int currRow, int currCol, int endRow, int endCol) {
        // termination cases.....
        if (currRow == endRow && currCol == endCol) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // termination case 2:
        if (currCol > endCol || currRow > endRow) {
            ArrayList<String> str = new ArrayList<>();
            return str;
        }

        ArrayList<String> finalResult = new ArrayList<>();
        // for the horizontal moves ......
        ArrayList<String> hMove = path(currRow, currCol + 1, endRow, endCol);
        for (String s : hMove) {
            finalResult.add('H' + s);
        }

        // for the vertical move
        ArrayList<String> vMove = path(currRow + 1, currCol, endRow, endCol);
        for (String s : vMove) {
            finalResult.add('V' + s);
        }

        //for diagaonal moves.......
       ArrayList<String> dMove=path(currRow+1, currCol+1, endRow, endCol);
       for (String s : dMove) {
        finalResult.add('D'+s);
       }
        return finalResult;

    }

    public static void main(String[] args) {
        ArrayList<String> paths = path(0, 0, 2, 2);
        System.out.println(paths);
    }

}
