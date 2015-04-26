It is a common mistake to think of the English meaning of the word
'contains', and believe that therefore contains? will tell you whether
a vector or array contains a value.  See 'some' if that is what you
want.

contains? is good for checking whether a map has a mapping for a key,
or a set contains an element.  It can be easier to use correctly than
'get', especially if you wish to allow a key, value, or set element to
be nil.

See also:

- clj::clojure.core/some
- clj::clojure.core/get
