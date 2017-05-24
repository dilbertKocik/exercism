(ns word-count
	(:require [clojure.string :as string]))

(defn removeNonLetters [phrase]
	(string/replace (string/replace phrase #"[^a-zA-Z0-9 ]*" "") #"[ ]+" " "))

(defn word-count [phrase] ;; <- arglist goes here
  ;; your code goes here
  (frequencies (string/split (string/lower-case (removeNonLetters phrase)) #" "))
)