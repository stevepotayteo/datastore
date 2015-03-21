You *SHOULD NOT* use `clojure.core/read` or `clojure.core/read-string` to read data from untrusted sources.
They were designed only for reading Clojure code and data from trusted sources (e.g.
files that you know you wrote yourself, and no one else has permission to modify them).

Instead, either:

1. Use another data serialization format such as JSON, XML, etc.
   and a library for reading them that you trust not to have vulnerabilities, or

2. If you want a serialization format that can be read safely and looks like Clojure data structures, use [edn](https://github.com/edn-format/edn).
   For Clojure 1.3 and later, the [tools.reader](http://github.com/clojure/tools.reader) contrib library provides an edn reader.
   There is also clojure.edn/read and clojure.edn/read-string provided in Clojure 1.5.
