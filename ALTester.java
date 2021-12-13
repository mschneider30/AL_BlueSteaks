import java.util.ArrayList;

public class ALTester {

  //checks whether ArrayList is sorted
  public static boolean testOrdered (ArrayList<Integer> foo) {
    for (int r = 0; r < foo.size()-1; r++) {
      if (foo.get(r) > foo.get(r+1)) {
        return false;
      }
    }
    return true;
  }
  
  public static void main (String[] args) {

    ArrayList<Integer> fooo = new ArrayList<Integer>();
    for (int i = 0;i < 23; i ++) {
      fooo.add(i,(int)(Math.random()*100));
    }

    ArrayList<Integer> foooo = new ArrayList<Integer>();
    for (int i = 0;i < 23; i ++) {
      foooo.add(i,i);
    }

    System.out.println("Should be false: " + testOrdered(fooo));
    System.out.println("Should be true: " + testOrdered(foooo));

  }
}
