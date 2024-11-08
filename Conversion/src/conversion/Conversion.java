/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion;

import java.util.Stack;

/**
 *
 * @author My University
 */
public class Conversion
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here

        System.out.println(prefix("423*"));
        

    }

    public static double prefix(String exp)
{
    Stack<Double> st=new Stack<>();
    
    String[] exp11=exp.split("");

    for(int i=0;i<exp11.length;i++)
    {
        String cha=exp11[i];
        
        if(Character.isDigit(cha.charAt(0)))
        {
            st.push(Double.parseDouble(cha));
        }
        else
        {
            double op1=st.pop();
            double op2=st.pop();
            
            switch(cha.charAt(0))
            {
                case '+':
                    st.push(op1+op2);
                    break;
                    
                case '-':
                   st.push(op1-op2);
                    break; 
            }
        }
    }
    
    double result=st.pop();
    
    return result;
}
    
   
        
        
        
        
        
        
        
        
        
        
        
    }
    
    /*
    public static String intToPre(String exp)
    {
        Stack<Character> st=new Stack<>();
        String convertedExp="";
        for(int i=exp.length()-1;i>=0;i--)
        {
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                convertedExp+=ch;
            }
            else
            {
             switch(ch)
             {
                 case ')':
                     st.push(ch);
                     break;
                     
                 case '(' :
                     while(st.peek()!=')')
                     {
                         
                         convertedExp+=st.pop();
                     }
                   st.pop();
                   break;
                   
                   default:
                       while(precedence(st.peek())>precedence(ch))
                       {
                        convertedExp+=st.pop();
                       }
                       st.push(ch);
                 
             }
                
            }
            
        }
        String ans="";
        for(int i=convertedExp.length()-1;i>=0;i--)
        {
            ans+=convertedExp.charAt(i);
        }
        return ans;
    }
*/

    public static int precedence(char ch)
    {
        switch (ch)
        {

            case '^':
                return 4;
            case '/':
            case '*':
                return 3;

            case '-':
            case '+':
                return 2;

            default:
                return 1;
        }
    }
}


/*
    public static String int2Post(String exp)
    {
        Stack<Character> st = new Stack<>();
        String convertedExp = "";
        for (int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch))
            {
                convertedExp += ch;
            } else
            {
                switch (ch)
                {
                    case '(':
                        st.push(ch);
                        break;
                    case ')':
                        while (st.peek() != '(')
                        {
                            convertedExp += st.pop();
                        }
                        st.pop();
                        break;

                    default:
                        while (precedence(st.peek()) > precedence(ch))
                        {
                            convertedExp += st.pop();
                        }
                        st.push(ch);                
                }
            }

        }
        String ans="";
        for (int i = convertedExp.length()-1; i >= 0; i--)
        {
            ans+=convertedExp.charAt(i);
        }
        return ans;
    }*/

