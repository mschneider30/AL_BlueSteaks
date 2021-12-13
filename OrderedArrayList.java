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
  public Integer get(int index) {
    return this._data.get(index);
  }



  //removes value at specified index
  public Integer remove(int index) {
    return this._data.remove(index);
  }


  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    int c = 0;
    //continues iteration as long as newVal has not been added
    for(int i = 0; c==0 && i < this._data.size(); i++) {
      //if newVal less than or equal to value at index i, add at index i and set c to be 0 to break out of loop
      if (newVal <= this._data.get(i)) {
        this._data.add(i,newVal);
        c++;
      }
    }
    //accounts for case when ArrayList is of length 0
    if (c == 0) {
      this._data.add(newVal);
    }
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public boolean addBinary(Integer newVal)
  {
    //initializes subarray indices
    int lo = 0;
    int avg = 0;
    int hi = this._data.size() - 1;

    //slices subarray as long as the lower end is smaller than or equal to larger end
    while (lo <= hi) {
      //finds middle index
      avg = (lo + hi) / 2;
      
      //if newVal is less than value at median index, set higher end of subarray to be median index - 1
      if (newVal < _data.get(avg)) {
        hi = avg - 1;
      }

      //if newVal is equal to value at median index, add newVal at index and exit method
      else if (newVal == _data.get(avg)) {
        _data.add(avg, newVal);
        return true;
      }

      //if newVal is greater than value at median index, set lower end of subarray to be median index + 1
      else {
        lo = avg + 1;
      }
    }
    //accounts for case when ArrayList is of size 0
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
