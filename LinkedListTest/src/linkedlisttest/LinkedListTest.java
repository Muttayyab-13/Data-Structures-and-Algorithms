/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlisttest;

/**
 *
 * @author My University
 * 
 *
 */
public class LinkedListTest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        link_List one=new link_List();
        one.insertAtEnd(45);
        one.insertAtEnd(50);
        one.insertAtEnd(55);
        one.insertAtStart(1000);
        one.transverse();
        
    }
    
}
