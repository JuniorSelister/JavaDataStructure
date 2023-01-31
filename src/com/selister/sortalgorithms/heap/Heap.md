## Heaps

> A complete binary tree
> <br/> Must satisfy the heap property
> <br/> Max heap: Every parent is greater than or equal to its children
> <br/> Min heap: Every parent is less than or equal to its children

* A binary heap must be a complete tree
* Children are added at each level from left to right
* Usually implemented as arrays
* The maximum or minimum value will always be at the root of the tree - the advantage of using a heap
* Heapify: process of converting a binary tree into a heap - this often has to be done after an insertion or deletion
* No required ordering between siblings

### Heaps as Arrays

* We can store binary heaps as arrays
* We put the root at array[0]
* We then traverse each level from left to right, and so the left child of the root would go into array[1], its right child would to into array[2], etc.

### Insert into Heap

* Always add new items to the end of the array
* Then we have to fix the heap (heapify)
* We compare the new item against its parent
* If the item is greater than its parent, we swap it with its parent
* We then rinse and repeat

### Delete into Heap

* Must choose a replacement value
* It will take the rightmost value, so that the tree remains complete
* Then we must heapify the heap
* When replacement value is greater than parent, fix heap above. Otherwise, fix heap below
* Fix heap above - same as insert. Swap replacement value with parent
* Fix heap below - swap the replacement value with the larger of its two children
* Rinse and repeat in both cases until the replacement value is in its correct position
* It will only need to fix up or down, not both

## Complexity time for Heaps

* Get max or Min element - O(1)
* Remove Max or Min element - O(Log n)
* Insert an element - O(Log n)

