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



  //removes value at specified index
  public void remove(int index) {
    this._data.remove(index);
  }


  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    int c = 0;
    for(int i = 0;c==0 && i < this._data.size(); i++) {
      if (newVal <= this._data.get(i)) {
        this._data.add(i,newVal);
        c++;
      }
    }
    if (c == 0) {
      this._data.add(newVal);
    }
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public boolean addBinary(Integer newVal)
  {
    if (this._data.size() == 0) {
      this._data.add(newVal);
      return true;
    }
    int c = this._data.size() / 2;
  while ( c < this._data.size()) {
    int d= c + 1;
    if (newVal <= this._data.get(d) && newVal >=this._data.get(c)) {
      this._data.add(d, newVal);
      return true;
    } else if (newVal > this._data.get(d)) {
      c+=1;
      return true;
    } else {
      c-=1;
      return true;
    }
  }
  return false;
  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

  }//end main()



}
