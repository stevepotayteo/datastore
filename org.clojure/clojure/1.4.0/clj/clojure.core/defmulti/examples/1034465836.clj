;; using multiple functions of the input and a derived key for dispatch,
;; with the :hierarchy key to specify a custom first-class dispatch hierarchy

(def account-types
  (-> (make-hierarchy)
      (derive :Checking :Account)
      (derive :Savings :Account)))

(defmulti service-charge (juxt :account-level :tag) :hierarchy #'account-types)

(defmethod service-charge [:Basic :Checking]  [_] 25)
(defmethod service-charge [:Basic :Savings]   [_] 10)
(defmethod service-charge [:Premium :Account] [_] 0)

(service-charge {:account-level :Basic, :tag :Savings, :balance 1000.01M})
;; => 10
(service-charge {:account-level :Premium, :tag :Savings, :balance 1000.01M})
;; => 0
