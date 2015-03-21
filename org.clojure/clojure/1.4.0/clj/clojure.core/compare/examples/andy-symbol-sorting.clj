;; Symbols are sorted by their representation as strings, sorting first
;; by their namespace name, and if they are in the same namespace, then
;; by their name.  If no namespace is included, those symbols will be
;; sorted before any symbol with a namespace.  Keywords are sorted
;; similarly to symbols.

user=> (def sset2 (sorted-set 'user/foo 'clojure.core/pprint 'bar
                              'clojure.core/apply 'user/zz))
#'user/sset2
user=> sset2
#{bar clojure.core/apply clojure.core/pprint user/foo user/zz}

user=> (def smap1 (sorted-map :map-key 10, :amp [3 2 1],
                              :blammo "kaboom"))
#'user/smap1
user=> smap1
{:amp [3 2 1], :blammo "kaboom", :map-key 10}
