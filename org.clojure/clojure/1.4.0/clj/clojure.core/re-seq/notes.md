`(re-seq regex s)` is the same as `(re-find regex s)`, except that `re-seq` returns a sequence of all matches, not only the first match.
It returns nil if there were no matches.
Capture groups are handled the same way as for `re-find`.

See also:

- clj::clojure.core/re-find
- clj::clojure.core/re-matches
- clj::clojure.core/re-pattern
- clj::clojure.string/replace
- clj::clojure.string/replace-first
- clj::clojure.core/re-matcher
- clj::clojure.core/re-groups

See docs for function subs, section 'Memory use warning'.
