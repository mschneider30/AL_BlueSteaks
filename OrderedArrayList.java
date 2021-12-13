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
    int lo = 0;
    int avg = 0;
    int hi = this._data.size() - 1;

    while (lo <= hi) {
      avg = (lo + hi) / 2;
      
      if (newVal < _data.get(avg)) {
        hi = avg - 1;
      }

      else if (newVal == _data.get(avg)) {
        _data.add(avg, newVal);
        return true;
      }

      else {
        lo = avg + 1;
      }
    }
    _data.add(lo, newVal);
    return true;
  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 15; i++ ) {
      Franz.addLinear( (int)( 50 * Math.random() ) );
    }
    System.out.println( Franz );
    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ) {
      Franz.addBinary( (int)( 50 * Math.random() ) );
    }
    System.out.println( Franz );

  }//end main()
}
