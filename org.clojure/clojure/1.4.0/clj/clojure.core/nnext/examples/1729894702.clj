user=> (nnext '(1 2 3))
(3)


user=> (nnext [])
nil 


user=> (nnext ['(a b c) '(b a c) '(c b a) '(a c b)])
((c b a) (a c b)) 


user=> (nnext {:a 1, :b 2, :c 3, :d 4})
([:c 3] [:d 4]) 


user=> (nnext #{:a :b :c})
(:c)

