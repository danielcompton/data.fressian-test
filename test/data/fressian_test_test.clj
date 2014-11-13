(ns data.fressian-test-test
  (:require [clojure.data.fressian :as fr]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [clojure.test.check.clojure-test :refer [defspec]]))

(defspec fressian-roundtrip 1000
         (prop/for-all [data gen/any]
                       (= data (fr/read (fr/write data)))))
