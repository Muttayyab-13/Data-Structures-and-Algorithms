/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackusinglinkedlist;

import java.util.Stack;

/**
 *
 * @author My University
 */
public class StackUsingLinkedList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println(pow(5,3));
    }
    
    public static int factorial(int num)
    {
        
        Stack<Integer> st=new Stack<>();
        int f=1;
        while(num>=1)
        {
            st.push(num);
            num--;
        }
        
        while(!st.isEmpty())
        {
            f=f*st.pop();
        }
        return f;
    }
    
    
    public static int pow(int num ,int pow)
    {
        Stack<Integer> st1=new Stack<>();
        int result=1;
        
        st1.push(num);
        
        while(pow>=1)
        {
            result*=st1.peek();
            pow--;
        }
        
        
        return result;
    }
    
}
