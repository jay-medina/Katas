# Rational Numbers

Write a kata to represent Rational Numbers.

## Output

Rationals when displayed to the console, should be fully factored. Couple things to keep in mind.  How do we represent the value 0? Should we optimize on output and leave the numbers unfactored internally?

If zero is in the denominator, throw an error on construction.  Allow rational numbers should be immutable.

```
Rational(4,8).toString() // should be 1/2

r1 = Rational(1,0) // throws an error
r2 = Rational(0,2) // should be 0
r3 = Rational(1, 4) // should be 1/4
```

## Basic Arithmetic
We should allow basic arithmetic on Rational numbers.
- Please implement add, subtract, negation, multiplication.
- Please implement less than, greater than, equal methods.

Remember numbers should be immutable.

```
1/2 + 1/2 = 1
1/4 + 1/4 = 1/2
2/8 - 1/4 = 0

r1 = Rational(1,2)

print r1 -> should be 1/2
print r1.add(r1) -> should be 1
print r1 -> should still be 1/2
print r1.negate -> should be -1/2

```