user=> (some #(= 5 %) [1 2 3 4 5])
true
user=> (some #(= 5 %) [6 7 8 9 10])
nil
