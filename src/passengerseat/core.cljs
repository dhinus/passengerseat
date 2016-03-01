(ns passengerseat.core
  (:require [goog.dom :as gdom]
            [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]
            [passengerseat.about :refer [about]]))

(defn section [children]
  (dom/section
    #js {:className "section"}
    (dom/div
      #js {:className "container"}
      (dom/div
        #js {:className "columns"}
        children))))

(defn card [children]
  (dom/div
    #js {:className "column"}
    (dom/div
      #js {:className "card" :style #js {:margin "0 auto"}}
        children)))

(defn app [] (section (card (about))))

(js/ReactDOM.render (app) (gdom/getElement "app"))
