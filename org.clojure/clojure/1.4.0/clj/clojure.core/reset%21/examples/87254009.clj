user=> (def x (atom 10))
#'user/x

user=> @x
10

user=> (reset! x 20)
20

user=> @x
20
