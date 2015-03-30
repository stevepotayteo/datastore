user=> (def x (promise))
#'user/x
;; Trying to deref at this point will make your repl wait forever


user=> (deliver x 100)
#<core$promise$reify__5534@4369a50b: 100>

;; the promise has been delivered, deref x will return immediately
user=> @x
100
