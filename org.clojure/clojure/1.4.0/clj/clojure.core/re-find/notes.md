`(re-find regex str)` is a pure function that returns the results of the first match only.
See re-seq if you want a sequence of all matches.
(re-find matcher) mutates the matcher object.

See also:

- clj::clojure.core/re-seq
- clj::clojure.core/re-matches
- clj::clojure.core/re-pattern
- clj::clojure.string/replace
- clj::clojure.string/replace-first
- clj::clojure.core/re-matcher
- clj::clojure.core/re-groups

See docs for function subs, section 'Memory use warning'.
