;; An exception will be thrown if you call compare with different types (any
;; numeric types above can be compared to each other, but not to a non-numeric
;; type). An exception will also be thrown if you use compare on a list, set,
;; map, or any other type not mentioned above. You must implement your own
;; comparator if you wish to sort such values.  See [Comparators in
;; Clojure][Comparators] for examples of comparators that can do this.

user=> (sort [5 "a"])
ClassCastException java.lang.Long cannot be cast to java.lang.String  java.lang.String.compareTo (String.java:108)
user=> (sort [:foo 'bar])
ClassCastException clojure.lang.Keyword cannot be cast to clojure.lang.Symbol  clojure.lang.Symbol.compareTo (Symbol.java:106)

user=> (sort [#{1 2} {2 4}])
ClassCastException clojure.lang.PersistentArrayMap cannot be cast to java.lang.Comparable  clojure.lang.Util.compare (Util.java:153)
user=> (sort [{:a 1 :b 3} {:c -2 :d 4}])
ClassCastException clojure.lang.PersistentArrayMap cannot be cast to java.lang.Comparable  clojure.lang.Util.compare (Util.java:153)
