(ns kotoba.physics
  "Facade re-exporting `kami.physics` (SSoT in this package, ADR-2607102200 addendum 7)."
  (:require [kami.physics :as impl]))

(def default-layers impl/default-layers)
(def collides?      impl/collides?)
(def radius         impl/radius)
(def separate       impl/separate)
