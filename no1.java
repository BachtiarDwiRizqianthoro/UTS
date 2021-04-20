package uts2;
public class no1 {
    public static void main(String[] args) {
        int[] data = {3,10,4,2,8,13};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+ " ");
        }
        for (int i=1; i<data.length; i++){
            int key = data [i];
            int j = i-1;
            while((j>=0)&&(data[j]>key)){
                data[j+1]= data[j];
                j--;
            }
            System.out.println("\nsorted by Bachtiar:");
            System.out.println("=== Insertion Sort ===");
            for (int i=0; i<data.length; i++){
                
                
            }
            
        }
        
    }
    
}
