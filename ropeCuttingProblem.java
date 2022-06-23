public class ropeCuttingProblem {
    private static int ropePieces(int ropeSize, int a, int b, int c) {

        if(ropeSize==0){
            return 0;
        }
        if(ropeSize<0){
            return -1;
        }

        int aCut=ropePieces(ropeSize-a, a, b, c);
        int bCut=ropePieces(ropeSize-b, a, b, c);
        int cCut=ropePieces(ropeSize-c, a, b, c);
        int max=(int)Math.max(aCut, bCut);
        max=(int)Math.max(max, cCut);
        if(max==-1){
            return -1;
        }
        return max+1;
    }
    public static void main(String[] args) {
        int res=ropePieces(23,12,11,9);
        System.out.println(res);
    }

   
}
