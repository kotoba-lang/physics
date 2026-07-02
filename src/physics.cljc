(ns physics
  "KAMI Physics Solvers path-reservation metadata. Restored from the
  legacy kami-engine/kami-physics-solvers Rust crate (deleted in
  kotoba-lang/kami-engine PR #82 'Remove Rust workspace from
  kami-engine') as part of the clj-wgsl migration (ADR-2607010930,
  com-junkawasaki/root).

  The original crate was an 18-line **R1.0 path-reservation stub** per
  ADR-2605261800 §D10.4 — a *contingent fallback*, activated only if
  the Genesis WebGPU viability gate fails at R1.1 (rigid) or R1.8
  (MPM/SPH/FEM/PBD), requiring Council Lv6+ ≥3 attestation to activate
  (§D10.2). It contained ONLY const metadata declaring the reservation
  and the 5 target solver names — no solver implementation exists (the
  active physics backend is `kami-genesis`, an external system out of
  scope for this migration). This namespace is therefore a 1:1
  transcription of that metadata, not a physics engine.

  Zero-dep portable CLJC.")

(def adr "ADR-2605261800")
(def phase "R1.0-path-reservation")
(def kami-name "kami-physics-solvers")
(def status "contingent-fallback-pending-viability-gate")
(def triggered-by "Genesis WebGPU gate fail (R1.1 rigid OR R1.8 MPM/SPH/FEM/PBD)")
(def nv-compat-targets ["isaacsim.core.api" "PhysX"])
(def solvers ["rigid" "mpm" "sph" "fem" "pbd"])
