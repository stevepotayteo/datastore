
user=> (nth ["a" "b" "c" "d"] 0)             
"a"
user=> (nth ["a" "b" "c" "d"] 1)             
"b"
user=> (nth [] 0 "nothing found")
"nothing found"
user=> (nth [0 1 2] 77 1337)
1337
