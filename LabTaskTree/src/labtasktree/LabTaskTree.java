/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labtasktree;

/**
 *
 * @author My University
 */
public class LabTaskTree
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
         AVLTree bt = new AVLTree();
        bt.insert(10);
        bt.insert(20);
        bt.insert(30);
        bt.insert(40);
        bt.insert(60);
        bt.insert(70);
        bt.insert(80);
        bt.insert(90);
        

        System.out.println("Preorder traversal of the given tree:");
        bt.preOrder();
        
    }
    
}