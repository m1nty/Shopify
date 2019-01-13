/*
SEE README FIRST

 */
package marketplace;

/**
 *
 * @author 14167
 */
//NODE CLASS
public class Product {
    //applying LinkedList Data Structure. Products act as Nodes in the 
    //Market which is the LinkedList
    //instance fields of a product
    String title;
    double price; 
    int count;
    //Next Node
    Product next;
    
       

public Product(String title, double price,int count, Product next){
this.title = title;
this.price = price;
this.count = count;
this.next = next;
}




}

   
