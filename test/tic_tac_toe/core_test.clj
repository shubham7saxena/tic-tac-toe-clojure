(ns tic-tac-toe.core-test
  (:require [clojure.test :refer :all]
            [tic-tac-toe.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest test-grid-initialization
  (def expected-grid [nil nil nil nil nil nil nil nil nil])
  (is (= expected-grid (init-grid))))
