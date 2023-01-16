# Abstract data type

> Doesn't dictate how the data is organized

> Dictates the operations you can perform

> Concrete data structure is usually a concrete class

> Abstract data type is usually an interface
 
Worst case for add an object in ArrayList, it's O(n).

## Linked List

> [Jane] -> [John] -> [Mary] -> [Mike] -> null

- Each item in the list is called a node.
- The first item in the list is the **head** of the list.

### Insert
1. Create a new node "Bill"
2. Assign "Jane" to the next field
3. Assign head to "Bill"
4. It will be O(1) time complexity

### Delete
1. Assign "Bill" to a temporary variable "removedNode"
2. Assign "head" to "Jane"
3. Return "removedNode"
4. It will be O(1) time complexity

## Double Linked List

> null <- [Jane] <-> [John] <-> [Mary] <-> [Mike] -> null

- Each item in the list has next and previous fields.
- The list has a head and tail.

### Insert at head
1. Create a new node "Bill"
2. Assign "Jane" to Bill's the next field
3. Assign whatever Jane is pointing to as previous to Bill's previous field
4. Assign "Bill" to Jane's previous field
5. Assign head to "Bill"
6. O(1) time complexity

> null <- [Bill] <-> [Jane] <-> [John] <-> [Mary] <-> [Mike] -> null

### Insert at tail
1. Create a new node "Bill"
2. Assign tail's next field to Bill's next field
3. Assign tail to Bill's previous field
4. Assign tail's next field to "Bill"
5. Assign tail to "Bill"
6. O(1) time complexity

> null <- [Jane] <-> [John] <-> [Mary] <-> [Mike] <-> [Bill] -> null

### Delete from head
1. Assign "Jane" to "removedNode"
2. Assign John's previous field to Jane's previous field
3. Assign head to Jane's next field
4. Return "removedNode" from the method
5. O(1) time complexity

> null <- [John] <-> [Mary] <-> [Mike] <-> [Bill] -> null

### Delete from tail
1. Assign "Bill" to "removedNode"
2. Assign Mike's next field to Bill's next field
3. Assign tail to Bill's previous field
4. Return "removedNode" from the method
5. O(1) time complexity

> null <- [Jane] <-> [John] <-> [Mary] <-> [Mike] -> null

### To insert a node A between nodes B and C
- Assign A's next field to B's next field
- Assign A's previous field to C's previous field
- Assign B's next field to A
- Assign C's previous field to A
- O(1) time complexity, BUT, we have to find the insertion point first, so this is actually O(n)

### To remove node A from between B and C
- Assign A to "removeNode"
- Assign C's previous field to A's previous field
- Assign B's next field to A's next field
- Return A from the method
- O(1) time complexity, BUT, we have to find A first, so this is actually O(n)