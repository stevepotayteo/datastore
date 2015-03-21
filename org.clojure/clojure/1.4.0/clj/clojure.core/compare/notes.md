`compare` is the default comparator for sorting with `sort` and `sort-by`, for ordering the elements of a sorted-set, and for ordering the keys of a sorted-map.
See (topic Comparators).

As for all 3-way comparators, it takes two arguments x and y.
It returns an int that is negative if x should come before y, positive if x should come after y, or 0 if they are equal.

compare works for many types of values, ordering values as follows:

* numbers: increasing numeric order, returning 0 if two numbers are
  numerically equal by `==`, even if `=` returns false
* strings, symbols, keywords: lexicographic order (aka dictionary
  order) by their representation as sequences of UTF-16 code units.
  This is alphabetical order (case-sensitive) for strings restricted
  to the ASCII subset.
* vectors: shortest-to-longest, with lexicographic ordering among
  equal length vectors.
* All Java types implementing the Comparable interface such as
  characters, booleans, File, URI, and UUID are compared via their
  `.compareTo` methods.
* `nil`: can be compared to all values above, and is considered less
  than anything else.

`compare` throws an exception if given two values whose types are "too different", e.g.
it can compare Integers, Longs, and Doubles to each other, but not strings to keywords or keywords to symbols.
It cannot compare lists, sequences, sets, or maps.

Implementation detail: Clojure Refs can also be sorted using compare.
They are sorted in the order they were created.
