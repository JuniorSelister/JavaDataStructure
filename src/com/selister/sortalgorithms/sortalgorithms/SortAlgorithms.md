# Sort Algorithms details

## Bubble Sort

```
    Bubble sort is stable, this mean that in case duplicate values,
    the sorting of them it will be respect in the first
    order appearing. 
```

> [4, 8, 1, 3, 5, 1] -> initial array
> 
> [1, 4, 8] -> sorting values...
> 
> The index 2, that represents the value number 1, it will come first and
> <br/> the last index represented by the value 1, will come next.
> <br/>
> [1, 1, 3, 4, 5, 8] -> sorted
> <br/> So, we never will have in a stable sorting, the next duplicate value,
> <br/> coming first, it will respect the order appearing.
 
### Time complexity for Bubble Sort
> Best case is O(N)
> <br/>Worst case is O(N^2)
 
### Space complexity for Bubble Sort
> Bubble sort don't need any additional space to sort the array, so it's O(1).
 
## Insertion Sort 

```
    Insertion sort is stable in-place sorting algorithm
```

### Time complexity for Insertion Sort

> Best case is O(n)
> <br/> Average case is O(n^2)
> <br/> Worst case is O(n^2)
 
### Space complexity for Insertion Sort

> The space complexity is O(1).

## Merge Sort

```
    Merge sort uses a "divide and conquers" paradigm;
    It's a recursive sorting algorithm;
    Merge sort is T(n) - 2T(n/2) + 0(n).
```

### Time complexity for Merge Sort

> Best case is O(n * logn)
> <br/> Average case is O(n * logn)
> <br/> Worst case is O(n * logn)
 
### Space complexity for Merge Sort

> The space complexity is O(n).
 
## Quick Sort

```
    Quick sort is not a stable algorithm;
    Quick sort is faster than merge sort.
```

### Time complexity for Quick Sort

> Best case is O(nlogn)
> <br/> Worst case is O(n^2)
 
### Space complexity for Quick Sort 

> The complexity is calculated on the basis of space used by the
> <br/> recursion stack. In the worst case, the space complexity
> <br/> of quick sort is O(n), because in the worst case, n recursive
> <br/> calls are made. And the average space complexity of a quick sort
> <br/> algorithm is equal to O(logn).
 
## Selection Sort 
 
```
    The sole idea of seelction sort is to divide the array into 
    the sorted and unsorted parts and then perform some comparisons
    to sort the array. We find the minimum or maximum element in an
    unsorted array and then put it in its correct position in a sorted array.
```

### Time complexity for Selection Sort

> Best case is O(n^2)
> <br/> Worst case is O(1)

## Counting Sort

```
    Counting sort is a stable sorting
```

### Time Complexity for Counting Sort

> Best case is O(N + 0) = O(N)
> <br/> Average case is O(N + N) = O(2*N)
> <br/> Worst case is O(N + CN) ~ O(C * N)

### Space Complexity for Counting Sort

> The space complexity for Counting Sort it's largely depends
> <br/> on the value of K, and is equivalent to O(K).

## Radix Sort

```
    Radix Sort is a non-comparative sorting algorithm, that is
    used to sorts the data in lexicographical (dictionary) order.
    
    It uses Counting Sort as a subroutine, to sort an array of integer
    digit by digit and array of strings character by character.
    
    Also, Radix Sort is a stable sorting algortithm.
```

### Time Complexity for Radix Sort

> Best case is O(n)
> <br/> Average case is O(n * K)
> <br/> Worst case is O(n * K)

### Space Complexity for Radix Sort

> The space complexity is O(n + b)
> <br/> Where b is the base of elements in the original array.

## Shell Sort

```
    It's used to replacement of insertion sort;
    Used for calling the stack overhead
    Used for sorting medium to a large-size arrays of the dataset
    Used for reducing the number of operations performed
```

### Time Complexity for Shell Sort

> Best case is Ω(nlog(n))
> <br/> Worst case is O(n <sup> 2 </sup>)

### Space Complexity for Shell Sort

> The space complexity is O(1)