## Hash Table

### Abstract data type

```
   Provide access to data using keys
   Key doesn't have to be an integer
   Consist of key/value pairs - data types don't have to match
   Optimized for retrieval (when you know the key)
   Associative array is one type of hash table 
```

### Hashing

> Maps keys of any data type to an integer
> <br/> Hash function maps keys to int
> <br/> In Java, hash function is Object.hashCode()
> <br/> Collision occurs when more than one value has the same hashed value

### Load Factor

> Tells us how full a hash table is
> <br/> Load factor = # of items / capacity = size / capacity
> <br/> Load factor is used to decide when to resize the array backing the hash table
> <br/> Don't want load factor too low (lots of empty space)
> <br/> Don't want load factor too high (will increase the likelihood of collisions)
> <br/> Can play a role in determining the time complexity for retrieval

### Add to a Hash Table backed by an array

1. Provide a key/value pair
2. Use a hash function to hash the key to an int value
3. Store the value at the hashed key value - this is the index into the array

