class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
     int count=0;
     int n=colors.length;
     int l=0;
     int limit=n+k-1;
     while(l<n)
     {
        int r=l+1;
        while(r<limit && colors[(r-1)%n] != colors[r%n])
        {
            r++;
        }
        if((r-l)>=k)
        {
            count+=(r-l)-k+1;
        }
        l=r;
     }
     return count;
    }
}