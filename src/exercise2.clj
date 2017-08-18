(ns exercise2)

(defn only-greater-than-five
  [x]
  (filter (fn [n](> n 5)) x)
)
