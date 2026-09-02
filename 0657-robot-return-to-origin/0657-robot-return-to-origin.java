class Solution {
    public boolean judgeCircle(String moves) {
        int cntud=0,cntlr=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U') cntud++;
            else if(moves.charAt(i)=='D') cntud--;
            else if(moves.charAt(i)=='L') cntlr++;
            else cntlr--;
        }
        return (cntud==0 && cntlr==0);
    }
}