# <p align="center">AL_BlueSteaks

## <p align="center">TNPG: Blue Steaks: Max Schneider, Faiyaz Rafee, David Deng

---

## ALTester

* Iterates through the ArrayList and checks whether the value at the current index is larger than the value at the following index. 
* If so, the ArrayList is NOT ordered and will return false. 
* If not, it will continue iterating.
* When the index preceding the last index passes this check, this means that the entire ArrayList is sorted and it will return true.

---

## OrderedArrayList

* **String toString()**
  * Returns string representation of OrderedArrayList in [] format
  * Commas separate values

* **int size()**
  * Accessor method for the instance variable `_size` of class ArrayList

* **int get(int index)**
  * Returns the value at index `index` of ArrayList

* **boolean testOrdered()**
  * Iterates through the OrderedArrayList and checks whether the value at the current index is larger than the value at the following index. 
  * If so, the OrderedArrayList is NOT ordered and will return false. 
  * If not, it will continue iterating.
  * When the index preceding the last index passes this check, this means that the entire OrderedArrayList is sorted and it will return true.
  
* **boolean add(int a)**
  * Iterates through OrderedArrayList and adds value `a` at index using ArrayList method `add()`.
  * Checks if resulting OrderedArrayList is ordered by calling method `testOrdered()`
  * If so, return true and exit method.
  * If not, undo addition and continue iteration.
  * If size of ArrayList is 0, adds value `a` at index 0 and exits method.
  
* **void remove(int index)**
  * Calls ArrayList method `remove()`
  
* **void set(int index, int input)**
  * Replaces value at index `index` using `remove()` method and adds value `input` at that index using `add()` method
