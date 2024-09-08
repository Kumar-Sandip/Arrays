package Arrays.TrappedRainWater;

public class UsingHelperArray {
    public static int  TrappedRainwarer(int [] hight){
        // calculate left max boundary - Arra
        int n = hight.length;
        int[] leftmax = new int [n];
        leftmax[0] = hight[0];
        for (int i = 1; i <n ; i++) {
            leftmax[i] = Math.max(hight[i], leftmax[i-1]);

        }

        // calculate Right max boundary - Array
int rightamx[] = new int[n];
        rightamx[n-1] = hight[n-1];
        for (int i =n- 2; i >=0 ; i--) {
        rightamx[i] = Math.max(hight[i], rightamx[i+1]);

        }
int trappedwater = 0 ;
        // Then taking a loop
        for (int i = 0; i < n; i++) {
            //Waterlevel= Min(Left max boundary ,Right max boundary)
            int waterlevel = Math.min(leftmax[i],rightamx[i]);
            // trapped water = Waterlevel  = hight[i]......
            trappedwater += waterlevel - hight[i];

        }
        return trappedwater;

    }


    public static void main(String[] args) {
        int [] hight = {4,2,0,6,3,2,5};
        System.out.println(TrappedRainwarer(hight));
    }
}