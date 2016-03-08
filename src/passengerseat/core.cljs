(ns passengerseat.core
  (:require [goog.dom :as gdom]
            [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]
            [passengerseat.about :refer [about]]))

(def app-state (atom {:menu {:About  true
                             :Pics   false
                             :Tweets false
                             :Talks  false }}))

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

(defn header [children]
  (dom/section
    #js {:className "hero"}
    (dom/div
      #js {:className "hero-content"}
      (dom/div
        #js {:className "container"}
        children))))

(defn toggle-menu-item [item]
  (swap! app-state update-in [:menu item] not))

(defn menu-item [[item on]]
  (let [item-name (name item)]
    (if on
      (dom/a #js {:className "button is-success"
                  :onClick (partial toggle-menu-item item)}
             (dom/i #js {:className "fa fa-check"}) item-name)
      (dom/a #js {:className "button"
                  :onClick (partial toggle-menu-item item)}
             item-name))))

(defn menu [items]
  (apply dom/p nil (map menu-item items)))

(defui App
  Object
  (render [this]
          (dom/div nil
                   (header (menu (:menu (om/props this))))
                   (section (card (about))))))

(def reconciler (om/reconciler {:state app-state}))

(om/add-root! reconciler App (gdom/getElement "app"))
