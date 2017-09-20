interface IGroceryList {
  boolean add(GroceryItem item);
  
  boolean remove(String name);
  
  boolean markAsBought(String name);
  
  int totalQuantity();
  
  boolean reduceQuantity(String itemName, int quantity);
  
  
  
  void display();
} 