
public class Demo {
	
	public static void main(String[] args){

        int nums[] = {1,3,5,7,9,11,13,15,17,19};
        int target= 11;

        System.out.println(" Linear Search ");
        int result1= linearSearch(nums,target);
       

      if(result1 !=-1) {
    	 
    	  System.out.println("element found at index value :" + result1);
      }
      else System.out.println("No element was found");
      
      System.out.println(" Binary Search ");
      int result2= BinarySearch(nums,target);
     

      if(result2 !=-1) {
    	  
    	  System.out.println("element found at index value :" + result2);
      }
      else System.out.println("No element was found");
            }
        
   public static int linearSearch(int[] nums, int target) {
            int steps=0;
         for(int i=0;i<nums.length;i++) {
        	 steps++;
        	 if(nums[i] == target) {
        		 System.out.println("No of steps  taken:" + steps);
        		 return i;
        	 }
         }
         System.out.println("No of steps  taken:" + steps);
        return -1;
            }
   
   public static int BinarySearch(int[] nums, int target) {
	  
	      int steps=0;
       
         int start =0;
         int end =nums.length-1;
         
         while(start<=end) {
        	  steps++;
        	 int mid=(start+end)/2;
        	 
        	 if(nums[mid]== target) { 
        		 System.out.println("No of steps  taken:" + steps);
        		 return mid;
        	 }
        	 else if(nums[mid]< target) {
        		 start=mid+1;
        	 }
        	 else 
        		 end=mid-1;

         }
         System.out.println("No of steps  taken:" + steps);
      return -1;
          }


}
