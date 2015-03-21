;; Also similar to contains?, 'get' indices are truncated to 32-bit ints,
;; so some large integers that are out of index bounds for a vector,
;; string, or array can be truncated to 32-bit ints that are in range
;; after removing their most significant bits.

user=> (def long-truncates-to-int-0 (bit-shift-left 1 33))
user=> (get "abc" long-truncates-to-int-0)
\a
user=> (get [:a :b :c] long-truncates-to-int-0)
:a
