class rot_box {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n = boxGrid.length;
        int m = boxGrid[0].length;
        char[][] ans = new char[m][n];
        for(int i =0;i<n;i++){
            for(int k = 0; k < m; k++){
                for(int j = 0;j<m-1;j++){
                    if(boxGrid[i][j]=='#' && boxGrid[i][j+1]=='.'){
                        char temp = '.';
                        boxGrid[i][j+1] = boxGrid[i][j];
                        boxGrid[i][j] = temp;
                    }
                }
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                ans[j][n-i-1] = boxGrid[i][j];
            }
        }
        return ans;
    }
}