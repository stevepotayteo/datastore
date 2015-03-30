`(re-seq regex s)` is the same as `(re-find regex s)`, except that `re-seq` returns a sequence of all matches, not only the first match.
It returns nil if there were no matches.
Capture groups are handled the same way as for `re-find`.

See also:
[re-find](./re-find),
[re-matches](./re-matches),
[re-pattern](./re-pattern),
[clojure.string/replace](../clojure.string/replace),
[clojure.string/replace-first](../clojure.string/replace-first),
[re-matcher](./re-matcher),
[re-groups](./re-groups),

See docs for function subs, section 'Memory use warning'.
