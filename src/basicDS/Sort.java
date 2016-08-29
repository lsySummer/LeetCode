package basicDS;

public class Sort {
//直接插入排序
	public void insertSort(){
		  int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
	        System.out.println("排序之前：");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i]+" ");
	        }
	        //直接插入排序
	        for (int i = 1; i < a.length; i++) {
	            //待插入元素
	            int temp = a[i];
	            int j;
	            for (j = i-1; j>=0; j--) {
	                //将大于temp的往后移动一位
	                if(a[j]>temp){
	                    a[j+1] = a[j];
	                }else{
	                    break;
	                }
	            }
	            a[j+1] = temp;
	        }
	        System.out.println();
	        System.out.println("排序之后：");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i]+" ");
	        }
	    }
	
	//二分法排序
	public void binarySort(){
	    int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //二分插入排序
        sort(a);
        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    private static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int left = 0;
            int right = i-1;
            int mid = 0;
            while(left<=right){
                mid = (left+right)/2;
                if(temp<a[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            for (int j = i-1; j >= left; j--) {
                a[j+1] = a[j];
            }
            if(left != i){
                a[left] = temp;
            }
        }
	}
    
    //选择排序
    public void selectSort(){
    	  int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
          System.out.println("排序之前：");
          for (int i = 0; i < a.length; i++) {
              System.out.print(a[i]+" ");
          }
          //简单的选择排序
          for (int i = 0; i < a.length; i++) {
              int min = a[i];
              int n=i; //最小数的索引
              for(int j=i+1;j<a.length;j++){
                  if(a[j]<min){  //找出最小的数
                      min = a[j];
                      n = j;
                  }
              }
              a[n] = a[i];
              a[i] = min;
              
          }
          System.out.println();
          System.out.println("排序之后：");
          for (int i = 0; i < a.length; i++) {
              System.out.print(a[i]+" ");
          }
    }
	
	public static void main(String[] args){
		Sort s = new Sort();
//		s.insertSort();
		s.binarySort();
	}
}

