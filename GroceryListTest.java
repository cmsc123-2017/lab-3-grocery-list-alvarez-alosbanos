import junit.framework.TestCase;

public class GroceryListTest extends TestCase {
  GroceryListArray list = new GroceryListArray();
   GroceryItem a = new GroceryItem("Onions", 1);
   GroceryItem b = new GroceryItem("Salt", 2);
   GroceryItem c = new GroceryItem("Sugar", 3);
   GroceryItem d = new GroceryItem("Butter", 4);
   GroceryItem e = new GroceryItem("Cheese", 5);
   GroceryItem f = new GroceryItem("Ice Cream", 6);
   GroceryItem g = new GroceryItem("Cereals", 7);
   GroceryItem h = new GroceryItem("Noodles", 8);
   GroceryItem j = new GroceryItem("Ramyeon", 9);
   GroceryItem k = new GroceryItem("Chocolate", 10);
   GroceryItem l = new GroceryItem("Tomatoes", 11);
   GroceryItem i = new GroceryItem("Mayo", 12);
   
  public void testLessThanTenItems() {

   assertTrue(list.add(a));
   assertTrue(list.add(b)); 
   assertTrue(list.add(c));
   assertTrue(list.add(d));
   assertTrue(list.add(e));
   assertTrue(list.add(f));
   assertTrue(list.add(g));
   assertTrue(list.add(h));   
  }

  public void testMoreThanMax(){
   assertTrue(list.add(a));
   assertTrue(list.add(b));
   assertTrue(list.add(c));
   assertTrue(list.add(d));
   assertTrue(list.add(e));
   assertTrue(list.add(f));
   assertTrue(list.add(g));
   assertTrue(list.add(h));
   assertTrue(list.add(i));
   assertTrue(list.add(j));
   assertTrue(list.add(k));
  }

  public void testIndexOf(){
   list.add(a);
   list.add(b);
   list.add(c);
   list.add(d);
   list.add(e);
   list.add(f);
   list.add(g);
   list.add(h);
   list.add(i);
   list.add(j);
   list.add(k);
   list.add(l);

   assertEquals(list.indexOf(a.name), 0);
   assertEquals(list.indexOf(b.name), 1);
   assertEquals(list.indexOf(c.name), 2);
   assertEquals(list.indexOf(d.name), 3);
   assertEquals(list.indexOf(e.name), 4);
  }

  public void testMArkAsBought(){
   list.add(a);
   list.add(b);
   list.add(c);
   list.add(d);
   list.add(e);
   list.add(f);
   list.add(g);
   list.add(h);
   list.add(i);
   list.add(j);
   
   assertTrue(list.markAsBought("Butter"));
   assertTrue(list.markAsBought("Ice Cream"));
   assertFalse(list.markAsBought("Chocobutternut"));
  }

  public void testDisplay(){

  }

  public void testRemoveFirstItem(){
   list.add(a);
   list.add(b);
   list.add(c);
   list.add(d);
   list.add(e);
   assertTrue(list.remove(a.name));
  }

  public void testRemoveMid(){
   list.add(a);
   list.add(b);
   list.add(c);
   list.add(d);
   list.add(e);
   assertTrue(list.remove(c.name));
  }

  public void testRemoveLast(){
   list.add(a);
   list.add(b);
   list.add(c);
   list.add(d);
   list.add(e);
   assertTrue(list.remove(e.name));

  }
  
  public void testTotalQuantity(){
	list.add(a);
	list.add(b);
	list.add(c);
	list.add(d);
	list.add(e);
	assertEquals(list.totalQuantity(), 15);
	  
  }
  	
  public void testReduceQuantity(){
	  list.add(a);
	  list.add(b);
	  list.add(c);
	  list.add(d);
	  list.add(e);
	  list.add(i);
	  //assertEquals(list.reduceQuantity("Onion", 1),0);
	  //assertEquals(list.reduceQuantity("Cheese", 3),2);
	  //assertEquals(list.reduceQuantity("Mayo", 9),3);
	  assertTrue(list.reduceQuantity("Cheese", 5));
	  assertFalse(list.reduceQuantity("Mayo", 9));
	 
  }
  
  
}
