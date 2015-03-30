;; Let's create new namespace, create new variable in it, then access it from another namespace

;; create the namespace and switch to it
user=> (in-ns 'first-namespace)
#<Namespace first-namespace>

;; create a variable and check it
first-namespace=> (def my-var "some value")
#'first-namespace/my-var
first-namespace=> my-var
"some value"

;; create another namespace and switch to this one
first-namespace=> (in-ns 'second-namespace)
#<Namespace second-namespace>

;; use variable from the other namespace here
second-namespace=> first-namespace/my-var
"some value"
