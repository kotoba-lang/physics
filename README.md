# kotoba-lang/physics

Zero-dep portable `.cljc` — restored from the legacy `kami-engine/kami-physics-solvers`
Rust crate (deleted in kotoba-lang/kami-engine PR #82 "Remove Rust workspace from
kami-engine") as part of the **clj-wgsl migration** (ADR-2607010930, `com-junkawasaki/root`).

## What this is

The original crate was an **18-line R1.0 path-reservation stub** per ADR-2605261800 §D10.4
— a *contingent fallback* physics engine, activated only if the Genesis WebGPU viability
gate fails at R1.1 (rigid) or R1.8 (MPM/SPH/FEM/PBD), requiring Council Lv6+ ≥3 attestation
to activate (§D10.2). It contained ONLY const metadata declaring the reservation and the 5
target solver names (`rigid`/`mpm`/`sph`/`fem`/`pbd`) — no solver implementation exists. The
active physics backend is `kami-genesis`, an external system out of scope for this
migration.

This repo is a 1:1 transcription of that reservation metadata, not a physics engine. (Note:
this is distinct from `kotoba-lang/physics-2d`, the completed restoration of the separate,
fully-implemented `kami-physics-2d` crate.)

## Status

Restored — 2 tests / 5 assertions, 0 failures.

## Develop

```bash
clojure -M:test
```
