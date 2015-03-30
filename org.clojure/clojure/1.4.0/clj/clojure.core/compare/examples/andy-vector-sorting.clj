;; Vectors are sorted by their length first, from shortest to longest,
;; then lexicographically among equal-length vectors.

user=> (sort [[1 2] [1 -5] [10000] [4 -1 20] [3 2 5]])
([10000] [1 -5] [1 2] [3 2 5] [4 -1 20])
