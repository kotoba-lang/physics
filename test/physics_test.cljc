(ns physics-test
  "Restoration-fidelity test for the kami-physics-solvers path-reservation
  stub (kami-engine/kami-physics-solvers/src/lib.rs, deleted PR #82).
  The original had no #[test]s (it's pure const metadata)."
  (:require [clojure.test :refer [deftest is testing]]
            [physics]))

(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? (the-ns 'physics)))))

(deftest reservation-metadata
  (is (= "ADR-2605261800" physics/adr))
  (is (= "kami-physics-solvers" physics/kami-name))
  (is (= ["rigid" "mpm" "sph" "fem" "pbd"] physics/solvers))
  (is (= ["isaacsim.core.api" "PhysX"] physics/nv-compat-targets)))
