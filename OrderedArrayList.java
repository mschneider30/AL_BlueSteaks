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
      System.out.println(this);
      this._data.add(i, a);
      System.out.println(this);
      if (this.testOrdered()) {
        return true;

      }else{
        this._data.remove(i);
        System.out.println(this);
      }
    }
    if(this._data.size() == 0) {
      this._data.add(0, a);
      return true;
    }
    return false;
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
    System.out.println(tester.testOrdered());
  }
}
