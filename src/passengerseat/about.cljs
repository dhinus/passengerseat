(ns passengerseat.about
  (:require [goog.dom :as gdom]
            [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]))

(def bio
  "Hi. I'm Francesco. I was born in Milan, Italy in 1980.
  I work as a Senior Web Developer at
  <a href='http://bbcnewslabs.co.uk'>BBC News Labs</a>
  in London. I also
  <a href='http://instagram.com/francesconegri'>take pictures</a>,
  <a href='http://biosmusic.com/'>write songs</a>, speak about
  software, listen to bands you haven't heard about,
  <a href='http://www.indieforbunnies.com/author/dhinus/'>write for
  a music webzine</a>, lose too much time on the interwebs and buy
  vinyl records without owning a record player.")

(defn about []
  [(dom/figure #js {:className "card-image is-4x3"}
               (dom/img #js {:src "/img/fra_2015_hamburg_600px.jpg"}))
  (dom/div #js {:className "card-content"}
           [(dom/p #js {:className "title is-5"} "Francesco Negri")
            (dom/p #js {:className "subtitle is-6"} "@dhinus")
            (dom/div #js {:className "content"
                          :dangerouslySetInnerHTML #js {:__html bio }})])])
