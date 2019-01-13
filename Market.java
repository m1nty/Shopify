//*******************************************************************************
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketplace;

import java.util.Scanner;

/**
 *
 * @author 14167
 */
 //LINKEDLIST CLASS
public class Market {
    //Market repersents linkedlist which incoporates the products as nodes
    private Product head;
    private int size = 0;
    public Market(){
        //initializing head of LinkedList as dummy Node
        head = new Product(null, 0,0,null);
        Scanner x = new Scanner (System.in);
        System.out.println("How many products do you want to add?");
        size = x.nextInt();
        //Retrieve size of list through user input
        //size is used in loop ro create products to add to the LinkedList
        Product p = head;
        p = p.next;
        // p is moved to next list as reference
        //temporary variables to store user input for each Product Node are created
        
        String temptitle;
        double tempprice;
        int tempcount;
        
        for (int i = 0 ; i<size ; i++, p = p.next){
            System.out.println("Whats the name of the product?");
            temptitle = x.next();
            System.out.println("How much is this product?");
            tempprice = x.nextDouble();
            System.out.println("How many are their of this product");
            tempcount = x.nextInt();
            p = new Product (temptitle, tempprice, tempcount, null);
                     
            
        }
     
    }
       public void add(String title, float price, int count){
           Product p = head;
           p = p.next;
           //loop iterates to last product in the list to add a new one
           while(p.next!=null)
               p = p.next;
           Product newp = new Product(title, price, count, p.next);
               
       }
               
       public void getavail(){
          Product p = head;
          p = p.next;
          System.out.println("The products that are available are");
          for(int i =0 ; i<size ; i++, p = p.next){
              //if its in inventory it will print its available
              if (0<p.count)
                  System.out.println(p.title + " is available");
        
          }
          size++;
      
      }
     public void purchase(String x){
         Product p = head;
         p = p.next;
         //iterates through whole linked list. if product wanted matches 
         //it will be purchased and inventory goes down
         while(p.next!=null){
             if(p.title.equals(x))
                 p.count--;
             
             p = p.next;              
             
             
         }
         
         
     }
     
              
                
 }
    
