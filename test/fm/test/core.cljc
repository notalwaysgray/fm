(comment

  (require
   '[fm.core :as fm
     :refer [defconse defnonse defmerge defiso
             conse nonse iso]])

  (fm/defn f1
    ^{:fm/doc     "variadic increment-sum"
      :fm/args    [int? int? & int?]
      :fm/ret     int?
      :fm/rel     (fn [{args :args ret :ret}]
                    (> ret (apply + args)))
      :fm/handler prn}
    ([a] (inc a))
    ([a b] (inc (+ a b)))
    ([a b & cs] (inc (apply + a b cs))))

  (fm/defn f2
    ([a b & cs :as %]
     )
    )

  ;;;
  )
