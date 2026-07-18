import java.util.*;

public class trapped_rain_water {

    public static int trappedwater(int height[]){

        int n=height.length;
        int watertrapped=0;
        //calculate left max boundary(auxilary array)

int leftmax[]= new int[n];
leftmax[0]=height[0];
for(int i=1;i<n;i++){
    leftmax[i]=Math.max(leftmax[i-1],height[i]);
}


        //calculate left max boundary(auxilary array)
int rightmax[]= new int[n];
rightmax[n-1]=height[n-1];
for(int i=n-2;i>=0;i--){
    rightmax[i]=Math.max(rightmax[i+1],height[i]);
}
        //loop

        for(int i=0;i<n;i++){
            //waterlevel = min(left max, right max)
            int waterlevel=Math.min(leftmax[i],rightmax[i]);

             //trapped water = (waterlevel - height)*width
             // here width is 1

            watertrapped+=waterlevel-height[i];


        }
        
       

return watertrapped;
    }




    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        int tw =trappedwater(height);

        System.out.println("trapped water is "+tw);

    }
    
}
