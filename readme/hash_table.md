# Hashtables
<!-- Short summary or background information -->
Hashing is a technique that is used to uniquely identify a specific object from a group of similar objects. Some examples of how hashing is used in our lives include:

* In universities, each student is assigned a unique roll number that can be used to retrieve information about them.
* In libraries, each book is assigned a unique number that can be used to determine information about the book, such as its exact position in the library or the users it has been issued to etc.

In both these examples the students and books were hashed to a unique number.

Assume that you have an object and you want to assign a key to it to make searching easy. To store the key/value pair, you can use a simple array like a data structure where keys (integers) can be used directly as an index to store values. However, in cases where the keys are large and cannot be used directly as an index, you should use hashing.

In hashing, large keys are converted into small keys by using hash functions. The values are then stored in a data structure called hash table. The idea of hashing is to distribute entries (key/value pairs) uniformly across an array. Each element is assigned a key (converted key). By using that key you can access the element in O(1) time. Using the key, the algorithm (hash function) computes an index that suggests where an entry can be found or inserted.

Hashing is implemented in two steps:

1. An element is converted into an integer by using a hash function. This element can be used as an index to store the original element, which falls into the hash table.
2. The element is stored in the hash table where it can be quickly retrieved using hashed key.

hash = hashfunc(key)
index = hash % array_size

In this method, the hash is independent of the array size and it is then reduced to an index (a number between 0 and array_size − 1) by using the modulo operator (%).

source: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/tutorial/

## Challenge
<!-- Description of the challenge -->
### Features
Implement a Hashtable with the following capabilities:

1. A method/function named add that takes in both the key and value. This method should hash the key and add the key and value pair to the table.
2. A method/function named Find that takes in the key and returns the value from key/value pair.
3. A method/function named contains that takes in the key and returns if the key exists in the table already.
4. A method/function named GetHash that takes in a key and returns the index in the array the key is stored.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
The following have Big O of O(1):
Find
Contains
add

## API
<!-- Description of each method publicly available in each of your hashtable -->
1. A method named add that takes in both the key and value. This method should hashes the key and addes the key and value pair to the table.
2. A method named Find that takes in the key and returns the value from key/value pair.
3. A method named contains that takes in the key and returns if the key exists in the table already.
4. A method named GetHash that takes in a key and returns the index in the array the key is stored.
