`get` works for several types of arg 'map', not only maps:

* maps, including records and Java objects implementing java.util.Map
* sets, but not Java objects implementing java.util.Set
* vectors, where the key is the index of the element to get
* strings and Java arrays, where again the key is the index
* nil, for which get always returns not-found or nil

If you want a simpler way to determine whether a key is in a map or an element is in a set, without having to know a not-found value that is guaranteed not to be a return value for a key/element in the collection, use [`contains?`](./contains%3F).

The only conditions in which `get` will throw an exception is indirectly, e.g.
because you called it on a sorted set or map, and the comparator function throws an exception when comparing two values.
It will not even throw an exception if you use an out-of-bounds index for a vector or array.

See also:
[contains?](./contains%3F),
[get-in](./get-in),
[find](./find)
