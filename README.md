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

* **Integer get(int index)**
  * Returns the value at index `index` of ArrayList
  
* **void addLinear(Integer newVal)**
  * Sets a variable `c` to 0 to signal that `newVal` has not been added yet.
  * Iterates through ArrayList as long as `c` is not 1 (i.e. `newVal` has not been added yet)
  * If `newVal` is less than value at index, add `newVal` at that index and increment c to 1 to signal that `newVal` has been added.
  * If the addition has still not been performed after the iteration, it means that there are no values in ArrayList and it will add `newVal` at index 0.
  
* **boolean addBinary(Integer newVal)**
  * Initializes three variables that indicate the lower, median, and upper indices of subarray of original ArrayList.
  * Slices subarray as long as lower end is smaller than or equal to larger end
  * Median is updated to reflect the average of the lower and upper indices
  * If `newVal` is smaller than value at median index, set higher end of subarray to be median - 1.
  * If `newVal` is equal to value at median index, add `newVal` at median index and exit method.
  * Otherwise (i.e. if `newVal` is greater than value at median index), set lower end of subarray to be median + 1.
  * If size of ArrayList is 0, that means the upper index during initialization takes the value of -1. This means that the while loop will be ignored and it will immediately add `newVal` at index 0 and then exit the method. 

* **Integer remove(int index)**
  * Calls ArrayList method `remove()`