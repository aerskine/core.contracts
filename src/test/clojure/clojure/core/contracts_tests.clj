(ns clojure.core.contracts-tests
  (:use [clojure.core.contracts :only (contract)])
  (:use [clojure.test :only [deftest is]]))

(defn fail [] (is nil))

(deftest contracts
  (fail))