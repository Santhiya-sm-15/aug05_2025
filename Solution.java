class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        boolean[] avail=new boolean[n];
        int cnt=0;
        for(int x:fruits)
        {
            boolean flag=false;
            for(int i=0;i<n;i++)
            {
                if(baskets[i]>=x && !avail[i])
                {
                    avail[i]=true;
                    flag=true;
                    break;
                }
            }
            if(!flag)
                cnt++;
        }
        return cnt;
    }
}