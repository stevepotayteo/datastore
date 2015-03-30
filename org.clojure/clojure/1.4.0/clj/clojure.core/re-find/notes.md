`(re-find regex str)` is a pure function that returns the results of the first match only.
See re-seq if you want a sequence of all matches.
(re-find matcher) mutates the matcher object.

See also:
[re-seq](./re-seq),
[re-matches](./re-matches),
[re-pattern](./re-pattern),
[clojure.string/replace](../clojure.string/replace),
[clojure.string/replace-first](../clojure.string/replace-first),
[re-matcher](./re-matcher),
[re-groups](./re-groups)

See docs for function subs, section 'Memory use warning'.
