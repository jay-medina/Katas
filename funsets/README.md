# Fun Sets

## Description
We will work with sets of integers.

As an example to motivate our representation, how would you represent the set of all negative integers? You cannot list them all… one way would be so say: if you give me an integer, I can tell you whether it’s in the set or not: for 3, I say ‘no’; for -1, I say yes.

Mathematically, we call the function which takes an integer as argument and which returns a boolean indicating whether the given integer belongs to a set, the characteristic function of the set. For example, we can characterize the set of negative integers by the characteristic function

```
 type Set = (x: Int) => Boolean
```

Using this representation, we define a function that tests for the presence of a value in a set:

```
  def contains(s: Set, elem: Int): Boolean = s(elem)
```

## Start

0) Define the contains method.  Contains method accepts a set and an element indicates if the element is in the set.

```JavaScript
 var allNumbersLessThan10 = x => x < 10;
 
 contains(allNumbersLessThan10, 5); // return true
 contains(allNumbersLessThan10, 10); //returns false
```

## Functions

1) Define a function which creates a singleton set from one integer value: the set represents the set of the one given element. Its signature is as follows:

```
  def singletonSet(elem: Int): Set
```

Now that we have a way to create singleton sets, we want to define a function that allow us to build bigger sets from smaller ones.

2) Define the functions `union`, `intersect`, and `diff`, which takes two sets, and return, respectively, their union, intersection and differences. `diff(s, t)` returns a set which contains all the elements of the set `s` that are not in the set `t`. These functions have the following signatures:

```
def union(s: Set, t: Set): Set
def intersect(s: Set, t: Set): Set
def diff(s: Set, t: Set): Set
```

3) Define the function filter which selects only the elements of a set that are accepted by a given predicate p. The filtered elements are returned as a new set. The signature of filter is as follows:

```
  def filter(s: Set, p: Int => Boolean): Set
```

## Extra: Queries on Sets

In this part, we are interested in functions used to make requests on elements of a set. The first function tests whether a given predicate is true for all elements of the set. This `forall` function has the following signature:

```
  def forall(s: Set, p: Int => Boolean): Boolean
```

Note that there is no direct way to find which elements are in a set. `contains` only allows to know whether a given element is included. Thus, if we wish to do something to all elements of a set, then we have to iterate over all integers, testing each time whether it is included in the set, and if so, to do something with it. Here, we consider that an integer x has the property `-1000 <= x <= 1000` in order to limit the search space.

Implement `forall` using linear recursion.


## Test Cases

```
 var s1 = singletonSet(1)
 var s2 = singletonSet(2)
 var s3 = singletonSet(3)
 var s4 = singletonSet(4)
 var s5 = singletonSet(5)
 val u1_3 = union(s1,s3)

 contains(s1, 1) // true
 contains(s1, 4) // false

 contains(u1_3, 1) // true
 contains(u1_3, 3) // true
 contains(u1_3, 5) // false


 var one = union(union(s1,s2), s3)
 var two = union(union(s1,s3), s4)
 var result = intersect(one,two)

 contains(result, 1) // true
 contains(result, 3) // true
 contains(result,2) // false
 contains(result,4) //false


 var one = union(union(union(s1,s2), s3), s4)
 var two = union(union(s3,s4), s5)
 var result = diff(one,two)

 contains(result, 1) //true
 contains(result, 2) // true
 contains(result,3)  // false
 contains(result,4) // false
 contains(result,5) // false
```
