/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshop;

/**
 *
 * @author manish
 */
class user {
    int price,quantity;
    String name,author;
    user(String n,String a,int q,int p){
      name=n;
      author=a;
      quantity=q;
      price=p;
    }
    public String getName(){
        return name;
    }
     public String getAuthor(){
        return author;
    }
     public int getQuantity(){
         return quantity;
     }
          public int getPrice(){
         return price;
     }
}
