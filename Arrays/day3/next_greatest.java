package Arrays.day3;

class next_greatest {
    public int nextGreaterElement(int n) {
        long m=n;
        int[] count = new int[10];
        int prevRem=-1;
        int curRem=-1;
        while(m>0){
            curRem=(int)m%10;
            m=m/10;
            count[curRem]++;
            if(prevRem>curRem){
                int num = curRem+1;
                while(count[num]==0) num++;
                count[num]--;
                m=m*10+num;

                for(int i=0; i<10;i++){
                    while(count[i]>0)
                    {
                        m=m*10+i;
                        count[i]--;
                    }
                }
                return m> Integer.MAX_VALUE ? -1:(int)m;

            }
            prevRem=curRem;
        }
        return -1;
    }
}