# kotoba-lang/physics

Kotoba runtime package for `kotoba.physics`.

## Status: thin re-export (2026-07-09)

`src/kotoba/physics.cljc` no longer carries its own implementation. It re-exports
[`kami.physics`](https://github.com/kotoba-lang/webgpu/blob/main/src/kami/physics.cljc)
from `kotoba-lang/webgpu`, which is the copy `kotoba-lang/host` (the one real consumer of this
namespace) now depends on directly. Diffing the two copies (normalizing `kotoba.*` → `kami.*`)
found them byte-identical — no bug fix or feature either side was missing — but the same
abandoned clj-wgsl Phase-4 split-migration that caused real drift for `kotoba-lang/sprite-gpu`/
`kotoba-lang/gpu`/`kotoba-lang/webgl` put this pair at identical risk, so it's consolidated the
same way rather than left as a duplicate that could silently diverge later. See CHANGELOG.md for
the full writeup.

Requiring `kotoba.physics` still works exactly as before — same public API, same behaviour — it
just delegates to the canonical implementation one hop away instead of carrying a copy that can
drift again.

## Test

```sh
clojure -M:test
```
