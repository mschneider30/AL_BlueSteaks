import java.util.ArrayList;
public class ALTester {

public static boolean testOrdered (ArrayList foo) {
for (int r = 0; r < foo.size();r++) {
if (foo.get(r) > foo.get(r+1)) {
return false;
}}
return true;
}
public static void main (String[] args) {

ArrayList<Integer> fooo = new ArrayList<Integer>(23);
for (int i = 0;i < 23; i ++) {
fooo.add(i,(int)(Math.random()*100));
}

ArrayList<Integer> foooo = new ArrayList(23);
for (int i = 0;i < 23; i ++) {
foooo.add(i,i);
}

System.out.println("Should be fals" + testOrdered(fooo));
System.out.println("Should be tru" + testOrdered(foooo));

}
}
