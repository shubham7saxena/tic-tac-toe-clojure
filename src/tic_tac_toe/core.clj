(ns tic-tac-toe.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(def winning-combination '([0 1 2] [0 3 6] [0 4 8] [1 4 7] [2 5 8] [2 4 6] [3 4 5] [6 7 8]))

(def not-nil? (complement nil?))

(defn init-grid []
  (vec (repeat 9 nil)))

(defn make-move [grid]
  (assoc grid (rand-nth (range 10)) 1))

(defn- vector-equality-on-indices [coll indices]
  (let [val (vec (for [x indices] (nth coll x)))]
    (and (every? not-nil? val) (apply = val))))

(defn victory-check [grid]
  (loop [wc winning-combination result false]
    (if (or (= true result) (= 0 (count wc))) (true? result)
        (recur (rest wc) (vector-equality-on-indices grid (first wc))))))

