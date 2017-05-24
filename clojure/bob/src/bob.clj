(ns bob
	(:require [clojure.string :as string]))

(defn isQuestion [possibleQuestion]
	(string/ends-with? possibleQuestion "?")
)

(defn isUppercase? [s]
	(and
  	(= s (string/upper-case s))
  	(not (= s (string/lower-case s)))
  )
)

(defn isYelling [possibleYell]
	(isUppercase? possibleYell)
)

(defn response-for ;; <- arglist goes here
  ;; your code goes here\
  ([request]
  	(cond
  		(string/blank? request)
  			"Fine. Be that way!"
  		(isYelling request)
  			"Whoa, chill out!"
  		(isQuestion request)
				"Sure."
			:else "Whatever."))
)
