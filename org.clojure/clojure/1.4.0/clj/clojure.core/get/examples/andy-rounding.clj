;; Similar to contains?, `get` has some unusual cases where non-integer
;; numbers will be rounded off to integers without any errors.

user=> (get [:a :b :c] 1.7)
nil     ; on a vector, not found
user=> (get (int-array [5 6 7]) -0.99)
5       ; on a Java array, truncate to int, then index is found
