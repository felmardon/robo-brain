# RoboBrain

## Overview

**RoboBrain** is an artificial intelligence engine designed to serve as the "brain" for robotic and game-playing systems. It provides a modular, extensible framework for implementing advanced decision-making algorithms that can be integrated into other projects.

## Purpose

This project implements core AI algorithms that make intelligent decisions in adversarial and game-tree scenarios. By acting as an artificial brain, RoboBrain can be connected to other projects—such as robotics platforms, game engines, or autonomous systems—to provide:

- **Strategic Decision-Making**: Minimax and Alpha-Beta Pruning algorithms for optimal move selection
- **Modular Architecture**: Clean separation of concerns with pluggable algorithm implementations
- **Extensibility**: Easy to integrate into larger systems and enhance with additional algorithms

## Features

### Implemented Algorithms

1. **Minimax Algorithm**: Classic game-tree search algorithm that evaluates all possible moves and selects the optimal one by considering both maximizing and minimizing players.

2. **Alpha-Beta Pruning**: An optimized variant of the Minimax algorithm that eliminates branches that cannot affect the final decision, significantly improving performance.

3. **Random Selection**: A baseline algorithm for random decision-making, useful for comparison and stochastic exploration.

## Project Structure

```
robo-brain/
├── src/
│   ├── main/java/
│   │   ├── algo/                 # Core algorithm implementations
│   │   │   ├── AlphaBetaPruning.java
│   │   │   ├── Minimax.java
│   │   │   └── Random.java
│   │   ├── common/               # Common utilities and data structures
│   │   │   └── TreeNode.java     # Generic game tree node
│   │   └── model/map/            # Domain models
│   │       └── Board.java        # Game board representation
│   └── test/java/
│       └── algo/                 # Unit tests for algorithms
├── pom.xml                       # Maven configuration
├── .classpath, .project          # Eclipse configuration
└── .gitignore                    # Git ignore rules
```

## Getting Started

### Prerequisites

- Java 25 or higher
- Maven 3.6+
- Git

### Building the Project

```bash
# Clone the repository
git clone <repository-url>
cd robo-brain

# Build with Maven
mvn clean install

# Run tests
mvn test

# Package the project
mvn package
```

### Using in IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Maven should automatically configure the project
3. Run tests using the IDE's test runner

### Using in Eclipse

1. Import the project as an "Existing Maven Project"
2. Eclipse will automatically detect the `.project` and `.classpath` files
3. Right-click on the project and select "Maven > Update Project"

## Integration Example

To use RoboBrain as the decision-making engine in your project:

```java
import algo.Minimax;
import common.TreeNode;
import model.map.Board;

// Create your game tree
TreeNode<Board> gameTree = buildGameTree();

// Get the best move using Minimax
int bestEvaluation = Minimax.minimax(0, maxDepth, true, gameTree);
```

## Testing

Comprehensive unit tests are included for all algorithms:

```bash
mvn test
```

Tests cover:
- Basic algorithm functionality
- Edge cases (empty children, single nodes)
- Correctness of evaluations
- Base case behaviors

## Contributing

To extend RoboBrain with new algorithms:

1. Create a new class in the `algo` package
2. Implement your algorithm following the existing patterns
3. Add comprehensive unit tests
4. Update this README with your contribution

## License

See the LICENSE file for licensing information.

## Future Enhancements

- Monte Carlo Tree Search (MCTS)
- Neural Network-based evaluation
- Parallel tree search
- Performance optimizations for large game trees
- Integration with external game engines

