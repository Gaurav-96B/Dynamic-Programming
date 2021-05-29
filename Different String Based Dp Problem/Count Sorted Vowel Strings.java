class Solution {
    int count = 0;
    public int countVowelStrings(int n) {
        backTrack(n, 0);
        return count;
    }
    private void backTrack(int n, int indexToStart){
        if(n == 0)
        {
            count++;
            return;
        }
        for(int i = indexToStart; i < 5; i++){
            backTrack(n - 1, i);
        }
    }
}
