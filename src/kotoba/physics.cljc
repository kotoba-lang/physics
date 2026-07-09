(ns kotoba.physics
  "DEDUP NOTICE (2026-07-09, see CHANGELOG.md): this namespace used to carry its own copy of the
   layer/collision-matrix implementation. Diffing it against kotoba-lang/webgpu's internal
   `kami.physics` (normalizing the `kotoba.*`→`kami.*` namespace prefix) found the two were
   byte-identical — no bug-fix or feature divergence either direction, just a duplicate that
   could have silently drifted apart at any future edit (the same abandoned clj-wgsl Phase-4
   split-migration + independent 'restore' commits caused real drift for kotoba-lang/sprite-gpu,
   kotoba-lang/gpu, and kotoba-lang/webgl — this pair got lucky, but the risk was identical).

   `kami.physics` (kotoba-lang/webgpu) is now canonical, and this namespace is a thin re-export
   of it — same public API, always in sync, no more risk of silent drift. If you're vendoring
   this repo standalone, requiring `kotoba.physics` still works exactly as before; the
   implementation just lives one hop away now."
  (:require [kami.physics :as impl]))

(def default-layers "See kami.physics/default-layers." impl/default-layers)
(def collides? "See kami.physics/collides?." impl/collides?)
(def radius "See kami.physics/radius." impl/radius)
(def separate "See kami.physics/separate." impl/separate)
