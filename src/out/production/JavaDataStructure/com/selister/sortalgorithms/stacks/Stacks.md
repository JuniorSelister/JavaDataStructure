# Abstract data type
## LIFO - Last In, First Out

> Stacks method

```
push - adds items
pop - removes items
peek - get the top item
```
> Ideal backing data structure: linked list

## Time Complexity  
> O(1) for push, pop, and peek, when using a linked list.

> If you use an array, then push is O(n), because the array may have to be resized.

> If you know the maximum number of items that will ever be on the stack, an array can be a good choice.

> If memory is tight, an array might be a good choice.

> Linked list is ideal.