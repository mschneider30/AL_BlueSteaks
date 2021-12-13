import java.util.ArrayList;

public class OrderedArrayList {
  
  //instance variables
  private ArrayList<Integer> _data;
  
  //default constructor -- initializes new ArrayList that holds only int values
  public OrderedArrayList() {
    _data = new ArrayList<Integer>();
  }

  //Override default toString() method -- Returns string representation of ArrayList
  public String toString()
  {
    String outVal = "[";
    for (int r=0 ; r < _data.size(); r++ ) {
      if(!(r==_data.size()-1)) {
        outVal+=_data.get(r)+", ";
      } else {
        outVal+=_data.get(r);
      }
    }
    outVal+="]";
    return outVal;
  }

  //accessor method for private instance variable size
  public int size() {
    return this._data.size();
  }

  //method that returns value at specified index
  public int get(int index) {
    return this._data.get(index);
  }

  //method that checks whether the ArrayList is properly sorted
  public boolean testOrdered () {
    //iterates through ArrayList
    for (int r = 0; r < this._data.size()-1; r++) {
      //checks if value at current index is larger than value at next index -- returns false if true / continues iteration if false
      if (this._data.get(r) > this._data.get(r+1)) {
          return false;
        }
    }
    //returns true if iteration is complete
    return true;
  }

  //method that adds value 'a' into ArrayList
  public boolean add(int a) {
    //iterates through ArrayList
    for (int i = 0; i <= this._data.size();i++) {
      //adds value at specified index
      this._data.add(i, a);
      //checks if ArrayList is ordered
      if (this.testOrdered()) {
        //stop method
        return true;
      }
      else {
        //if not ordered, remove value at index and continue iteration
        this._data.remove(i);
      }
    }
    
    //accounts for case if ArrayList is empty
    if(this._data.size() == 0) {
      //add value at index 0, stop method
      this._data.add(0, a);
      return true;
    }
    //ensures that method is guaranteed to have boolean returnType
    return false;
  }

  //removes value at specified index
  public void remove(int index) {
    this._data.remove(index);
  }

  //replaces value at specified index with specified value
  public void set(int index, int input) {
    this.remove(index);
    this.add(input);
  }


  public static void main (String[] args) {
    OrderedArrayList tester = new OrderedArrayList();
    System.out.println(tester);

    tester.add((int)(Math.random()*100));
    tester.add((int)(Math.random()*100));
    tester.add((int)(Math.random()*100));
    tester.add((int)(Math.random()*100));
    tester.add((int)(Math.random()*100));

    System.out.println(tester);

    System.out.println("Size of Tester: " + tester.size());
    System.out.println("Third Item in List: " + tester.get(2));

    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    int e = 5;

    tester.set(0,c);
    tester.set(1,b);
    tester.set(2,e);
    tester.set(3,a);
    tester.set(4,d);

    System.out.println("Test of set method. It should replace all 5 numbers in tester with the numbers 1-5 sorted correctly: " + tester);

  }
}
