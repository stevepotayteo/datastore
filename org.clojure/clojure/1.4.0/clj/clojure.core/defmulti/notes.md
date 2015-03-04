From [clojure.org/multimethods](http://clojure.org/multimethods):

> A Clojure multimethod is a combination of a dispatching function,
> and one or more methods. When a multimethod is defined, using
> defmulti, a dispatching function must be supplied. This function
> will be applied to the arguments to the multimethod in order to
> produce a dispatching value. The multimethod will then try to find
> the method associated with the dispatching value or a value from
> which the dispatching value is derived. If one has been defined (via
> defmethod), it will then be called with the arguments and that will
> be the value of the multimethod call. If no method is associated
> with the dispatching value, the multimethod will look for a method
> associated with the default dispatching value (which defaults to
> :default [if not provided]), and will use that if present. Otherwise
> the call is an error.  The multimethod system exposes this API:
> [defmulti](../defmulti/) creates new multimethods,
> [defmethod](../defmethod/) creates and installs a new method of
> multimethod associated with a dispatch-value,
> [remove-method](../remove-method/) removes the method associated
> with a dispatch-value. [remove-all-methods](../remove-all-methods/)
> removes all methods associated all
> dispatch-values. [prefer-method](../prefer-method/) creates an
> ordering between methods when they would otherwise be ambiguous.
> Derivation is determined by a combination of either Java inheritance
> (for class values), or using Clojure's ad hoc hierarchy system. The
> hierarchy system supports derivation relationships between names
> (either symbols or keywords), and relationships between classes and
> names.
