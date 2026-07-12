# kotoba-lang/physics

**SSoT for `kami.physics`** — collision layers + matrix as pure EDN (`.cljc`).

`kotoba.physics` is a thin facade. See ADR-2607102200 addendum 7.

## Test

```sh
clojure -M:test
```
# Unified physics contract

`kotoba.physics.contract` is the zero-dependency CLJC boundary shared by
Kami Engine, Network Isekai, realtime rigid-body backends and engineering CAE
backends. Immutable EDN scenes use SI units and distinguish `step` from
finite-case `solve`. Fidelity is one of `:realtime`, `:reduced-order` or
`:high-fidelity`; capability checks require an exact fidelity match.

Results carry explicit, scope-specific qualification. A completed solve never
implies experimental validation or design-signoff. Collision layers below
remain scene configuration, rather than a competing simulation engine.
