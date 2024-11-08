/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searching;

/**
 *
 * @author My University
 */
public class Searching
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        int [] array={1,2,35,4,0,18,16};
        
        //linearSearch(array, 4);
        
        //System.out.println( binarySearch(array, 7, 0, 4));
        
        //modifiedBubbleSort(array);
        
        //selectionSort(array);
       // insertionSort(array);
       
        quicksort(array, 0, array.length-1);
        
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        
    }
    
    
    public static void quicksort(int [] arr, int low ,int high)
    {
        if (low<high)
        {
            int mid=low+(high-low)/2;
            int pivot=arr[low];
            int i=low;
            int j=high;
            
            while(i<=j)
            {
                while( arr[i]<pivot)
                    i++;
                
                while ( arr[j]>pivot)
                    j--;
                                    
                    if(i<=j)
                    {
                        int t=arr[i];
                        arr[i]=arr[j];
                        arr[j]=t;
                        i++;
                        j--;
                    }
                
            }
  
                quicksort(arr, low, j);
                quicksort(arr, i, high);
        }
        
        }
    
        
        
    
    
    public static void mergeSort(int [] array,int low,int high)
    {
        if(low<high)
                {
                  int mid=low+(high-low)/2;
                    mergeSort(array, low, mid);
                    mergeSort(array, mid+1, high);
                    merge(array,low,mid,high);
                    
                }
       
       
    }
    
      public static void merge(int [] arr,int low,int mid ,int high)
        {
            int indx1,indx2,k;
            indx1=low;
            indx2=mid+1;
            k=0;
            
            int [] merged=new int[arr.length];
            
            while(indx1<=mid && indx2<=high)
            {
                if(arr[indx1]<arr[indx2])
                {
                  merged[k++]=arr[indx1++];
                }
                else
                {
                   merged[k++]=arr[indx2++];
                }
            }
            
            while(indx1<=mid)
            {
                merged[k++]=arr[indx1++];
            }
            
            while(indx2<=high)
            {
                merged[k++]=arr[indx2++];
            }
            
           for(int i=high;i>=low;i--)
           {
            arr[i]=merged[--k];
           }
        }
    
    public static void insertionSort(int [] arr)
    {
        int n=arr.length;
        
    for(int i=1;i<n;i++)
    {
        int key=arr[i];
        int j=i-1;
        
        while(j>=0 && key<arr[j])
        {
            arr[j+1]=arr[j];
            j--;
        }
        
        arr[j+1]=key;
        
    }
           
           
        
    }
    
    public static void simpleBubbleSort(int [] arr)
    {
        int n=arr.length;
        
        for(int i=0;i<n;i++)
        {
         for(int j=1;j<n;j++)
         {
           if(arr[j-1]>arr[j])  
           {
               
               int temp=arr[j-1];
                arr[j-1]=arr[j];
               arr[j]=temp;
           }
         }
            
            
        }
    }
    public static void selectionSort(int [] arr)
    {
        int n=arr.length;
        
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            if(i!=min)
            {
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            }
        }  
    }
    
    public static void modifiedBubbleSort(int []arr)
    {
        boolean flag=false;
        int n=arr.length;
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    flag=true;
                }
            }
            if(!flag)
                return;
        }
    }
    
    public static int binarySearch(int[] arr,int key,int lowIndex,int highIndex)
    {
        if(lowIndex<=highIndex)
        {
            int mid=lowIndex+(highIndex-lowIndex)/2;
            
            if(arr[mid]==key)
                return mid;
            
            else if(arr[mid]>key)
                    {
                        return binarySearch(arr, key, lowIndex, mid-1);
                    }
            else
            {
                return binarySearch(arr, key, mid+1, highIndex);
            }
        }
        
        return -1;
    }
    
    
      public  static int linearSearch(int [] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]==key)
        { 
            return i;
        }
 
    }
        
     return -1;
    } 
    
}
