/*
// A simple array-backed HashTable
// @author Juan Jose Lopez Delgado
// 29-09-13
*/
public class HashTable{ 
  public int tsize = 20;
  public Object[][] table;
  public int size;
  
  public HashTable() {
    table = new Object[tsize][tsize];
    size = 0;
  }
  
  public HashTable(int in) {
    table = new Object[in][in];
    size = 0;
    tsize = in;
  }
  
  public int hash(Object h) {
    int result = 30;
    String buffer = h.toString().toLowerCase();
    
    for (int i = 0; i < buffer.length(); i++) { result += (int)buffer.charAt(i); }
    
    return (result % tsize);
  }
  
  private int findHash(int hash, Object c) {
    if(table[hash] != null) {
      for (int i = 0; i < tsize; i++) {
        if (table[hash][i] != null) {
          if (c.equals(table[hash][i])) { return i; }
        }
      } return -1;
    } return -1;
  }
  
  public boolean contains(Object c) {
    int hash = hash(c);
    if(table[hash] != null) {
      for (int i = 0; i < tsize; i++) {
        if (table[hash][i] != null) {
          if (c.equals(table[hash][i])) { return true; }
        }
      } return false;
    } return false;
  }
  
  public void add(Object in) {
    int hash = hash(in);
    int pos = 0;
    if (!contains(in)) {
      if (table[hash] != null) {
        for (int i = 0; i < tsize; i++) {
          if (table[hash][i] == null) { pos = i; break; }
        }
        table[hash][pos] = in;
      } else {
        table[hash][0] = in;
      }
      size++;
    } else { System.out.println("Object already exists"); }
  }
  
  public void remove(Object in) {
    int hash= hash(in);
    if (!contains(in)) { System.out.println("Could not find object"); }
    else {
      int pos = findHash(hash, in);
      table[hash][pos] = null;
      size--;
      int i = 1;
      while(table[hash][pos+i] !=null) {
        table[hash][pos+i-1] = table[hash][pos+i];
        table[hash][pos+i] = null;
        i++;
      }
    }
  }
  
  public int getNumElements() {
    return size;
  }
}