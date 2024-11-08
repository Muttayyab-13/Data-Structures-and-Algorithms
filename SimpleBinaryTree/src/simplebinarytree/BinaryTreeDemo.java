/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplebinarytree;

/**
 *
 * @author My University
 */

    public class BinaryTreeDemo 
{

    public static void main(String[] args) 
    {
        BinaryTree<Character> bt = new BinaryTree<>();
        bt.insertRoot('A');         //Level 0
        bt.insertLeft('B','A');     //Level 1
        bt.insertRight('C','A');    //Level 1
        bt.insertLeft('D','B');     //Level 2
        bt.insertLeft('E','C');     //Level 2
        bt.insertRight('F','C');    //Level 2
        bt.insertLeft('G','D');     //Level 3
        bt.insertRight('H','D');    //Level 3
        bt.insertLeft('I','E');     //Level 3
        
        bt.postOrder(bt.root);
    }
  
}
