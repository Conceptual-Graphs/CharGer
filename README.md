# CharGer
Conceptual Graph Editor by [Harry Delugach](https://www.uah.edu/science/departments/computer-science/faculty-staff//harry-delugach)

CharGer is a conceptual graph editor and environment developed by [Harry Delugach](https://www.uah.edu/science/departments/computer-science/faculty-staff//harry-delugach) between 1998 and 2020. Updated by [Mahpara Saleem](https://www.mahaztechenterprise.com/) since 2026.

---

## Overview

CharGer is a desktop Java Swing application for creating, editing, and analysing **Conceptual Graphs (CGs)** — a formal knowledge-representation system based on John F. Sowa's work.

### Key features

- **Visual graph editor** — draw and edit conceptual graphs with concepts, relations, actors, co-referent links, and nested contexts via a point-and-click interface
- **CGX file format** — save and load graphs as `.cgx` (CharGer XML) files
- **CGIF support** — import and export graphs in the standard Conceptual Graph Interchange Format (CGIF 2007)
- **CG to FCA** — export binary relation tuples from a graph to Formal Concept Analysis (FCA) `.cxt` context files, based on the Andrews & Polovina method
- **Knowledge base** — built-in type hierarchy and relation-matching engine with pluggable matching strategies
- **WordNet integration** — optional glossary look-up and type-label definitions via WordNet
- **Actor plugins** — executable actors (clock, counter, pulse, stock quote, etc.) that can animate and drive graph values at runtime
- **Graph layout tools** — manual, simple, and spring-based automatic layout algorithms
- **Export** — vector graphics export (SVG/PDF via VectorGraphics2D)

### Project structure

| Package | Purpose |
|---|---|
| `charger` | Core editor, main window, graph I/O, preferences |
| `charger.obj` | Graph object model (concepts, relations, actors, edges) |
| `cgif` | CGIF parser and writer |
| `cgfca` | CG → FCA analysis and export |
| `kb` | Knowledge base, type hierarchy, tuple matching |
| `chargerlib` | Shared UI utilities and window management |
| `actorplugin` | Built-in actor plugin implementations |

---

## Requirements

- Java 8 or later
- Maven 3.6 or later

---

## Build

Clone the repository and run:

```bash
mvn package
```

This produces a self-contained fat JAR at:

```
target/CharGer-1.0-SNAPSHOT-jar-with-dependencies.jar
```

---

## Run

```bash
java -jar target/CharGer-1.0-SNAPSHOT-jar-with-dependencies.jar
```

---

## Run from IntelliJ IDEA

1. Open the project root folder in IntelliJ IDEA.
2. IntelliJ will auto-detect the `pom.xml` and import the Maven project.
3. Navigate to `src/main/java/com/conceptualgraph/charger/CharGer.java`.
4. Right-click the file and select **Run 'CharGer.main()'**.
