# [Roman Numerals](https://en.wikipedia.org/wiki/Roman_numerals)

## Convert Roman Numerals to Arabic Numerals

Write a kata to convert a string of roman numerals to arabic number and vise versa.

```
 convertRoman("XXXV") = 35
 convertArabic(35) = "XXXV"
```

## Subtractive rules
Symbols are placed from left to right in order of value, starting with the largest. However, in a few specific cases,to avoid four characters being repeated in succession (such as IIII or XXXX), subtractive notation is often used as follows:

- I placed before V or X indicates one less, so four is IV (one less than five) and nine is IX (one less than ten)
- X placed before L or C indicates ten less, so forty is XL (ten less than fifty) and ninety is XC (ten less than a hundred)
- C placed before D or M indicates a hundred less, so four hundred is CD (a hundred less than five hundred) and nine hundred is CM (a hundred less than a thousand)

Double subtractive's are NOT allowed

```
 convertRoman("XIIX") = undefined //instead of 18
 convertRoman("XVIII") = 18
 convertArabic(18) = "XVIII"
```

### Roman numeric system
| Symbol | Value   |
|:------:|---------|
| I      |     1   |
| V      |     5   |
| X      |     10  |
| L      |     50  |
| C      |     100 |
| D      |     500 |
| M      |    1000 |

## Sample Tests

```
  convertRoman("X") => 10
  convertRoman("CXX") => 120
  convertRoman("MCMLXXXVI") => 1986
  convertRoman("MMXVI") => 2016
  convertArabic(980) => "CMLXXX"
  convertArabic(2016) => "MMXVI"
  convertArabic(121) => "CXXI"
```
