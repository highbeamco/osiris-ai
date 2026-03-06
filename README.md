# Osiris

## Setup

1. Install [Hermit](https://cashapp.github.io/hermit/usage/get-started/):

```sh
curl -fsSL https://github.com/cashapp/hermit/releases/download/stable/install.sh | /bin/bash
```

2. Activate Hermit in the repo root to get all development tools:

```sh
. ./bin/activate-hermit
```

This provides: Java 21, Gradle 9.2.1, Terraform 1.14.5 -- all at pinned versions.

3. Build:

```sh
./gradlew classes testClasses
```
