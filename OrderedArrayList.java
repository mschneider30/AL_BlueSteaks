import java.util.ArrayList;
public class OrderedArrayList {
  private ArrayList<Integer> _data;
  public OrderedArrayList (){
    _data = new ArrayList<Integer>();
  }

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

  public int size() {
    return this._data.size();
  }

  public int get(int index) {
    return this._data.get(index);
  }



  public boolean testOrdered () {
  for (int r = 0; r < this._data.size()-1;r++) {
    if (this._data.get(r) > this._data.get(r+1)) {
        return false;
      }
    }
return true;
}

  public boolean add(int a) {
    for (int i = 0; i <= this._data.size();i++) {
      this._data.add(i, a);
      if (this.testOrdered()) {
        return true;

      }else{
        this._data.remove(i);
      }
    }
    if(this._data.size() == 0) {
      this._data.add(0, a);
      return true;
    }
    return false;
  }

  public void remove(int index) {
    this._data.remove(index);
  }

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

    System.out.println("Test of set method. It should replace all 5 numbers in tester with the numbers 1-5 sorted correctly: " +tester);

  }
}
