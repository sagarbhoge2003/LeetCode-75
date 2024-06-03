//605. Can Place Flowers
//https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75
class Problem02 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int count=0;
       for(int i=0;i<flowerbed.length;i++)
       {
         if(flowerbed[i] == 0 )
            {
                boolean emptyLeftplot=(i==0) || (flowerbed[i-1]==0);
                boolean emptyRightplot=(i==flowerbed.length - 1) || (flowerbed[i+1]==0);


                    if(emptyLeftplot && emptyRightplot)
                    {
                        flowerbed[i]=1;
                        count++;
                        if(count>=n)
                        {
                              return true;
                        }
                    }
            }
        }

        return count >= n;
        
    }
}