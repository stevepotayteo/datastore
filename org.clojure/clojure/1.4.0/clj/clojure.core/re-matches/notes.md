`(re-matches regex s)` is the same as `(re-find regex s)`, except that re-matches only returns a match result if the regex can be matched against the entire string.
`re-find` returns a match if the regex can be matched against any substring of the given string.

See also:
[re-find](./re-find),
[re-seq](./re-seq),
[re-pattern](./re-pattern),
[clojure.string/replace](../clojure.string/replace),
[clojure.string/replace-first](../clojure.string/replace-first),
[re-matcher](./re-matcher),
[re-groups](./re-groups)

See docs for function `subs`, section 'Memory use warning'.
