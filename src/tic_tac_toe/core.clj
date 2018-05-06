(ns tic-tac-toe.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn init-grid []
  (vec (repeat 9 nil)))

(defn make-move [grid]
  (assoc grid (rand-nth (range 10)) 1))
