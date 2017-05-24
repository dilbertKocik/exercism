(ns rna-transcription
	(:require [clojure.string :as string]))

(defn isValidDna [possibleDna]
	(string/blank? (string/replace possibleDna #"[GCTA]" ""))
)

(defn to-rna [dna] ;; <- arglist goes here
  ;; your code goes here
  (cond
  	(not (isValidDna dna)) (throw (AssertionError.))
  	:else (string/replace (string/replace (string/replace (string/replace (string/replace dna "A" "U") "T" "A") "C" "H") "G" "C") "H" "G")
  )
)
