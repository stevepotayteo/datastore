;; defmulti has defonce semantics, meaning that it will not be evaluated if
;; the specified multi has a non-nil binding already.

;; this example also demonstrates a defmulti with more than one argument

(defmulti speak identity)
;; => #'user/speak
(defmethod speak :cow [_] "MOO")
;; => #<MultiFn clojure.lang.MultiFn@2ac20952>
(speak :cow)
;; => "MOO"
(defmethod speak :cat [_] "PURR")
;; => #<MultiFn clojure.lang.MultiFn@2ac20952>
(speak :cat)
;; => "PURR"

;; what if we want the cat to be able to meow too?

(defmulti speak (fn [animal mood] animal))
;; => nil
(defmethod speak :cat [_ mood] (get {:happy "PURR" :hungry "MEOW"} mood))
;; => #<MultiFn clojure.lang.MultiFn@2ac20952>
(speak :cat :happy)
;; => ArityException Wrong number of args (2) passed to: core/identity  clojure.lang.AFn.throwArity (AFn.java:429)

;;; the original dispatch has not been replaced!

(def speak nil) ; destroy our defmulti explicitly
;; => #'user/speak
(defmulti speak (fn [animal mood] animal))
;; => #'user/speak
(defmethod speak :cat [_ mood] (get {:happy "PURR" :hungry "MEOW"} mood))
;; => #<MultiFn clojure.lang.MultiFn@66668e94>
(speak :cat :happy)
;; => "PURR"
(speak :cat :hungry)
;; => "MEOW"

;;; how about varargs, so our original cow can still work?

(def speak nil) ; destroy our defmulti explicitly
;;=> #'user/speak
(defmulti speak (fn [animal & args] animal))
;;=> #'user/speak
(defmethod speak :cat [_ mood] (get {:happy "PURR" :hungry "MEOW"} mood))
;;=> #<MultiFn clojure.lang.MultiFn@447536f2>
(speak :cat :hungry)
;;=> "MEOW"
(defmethod speak :cow [_] "MOO")
;; => #<MultiFn clojure.lang.MultiFn@447536f2>
(speak :cow)
;; => "MOO"
