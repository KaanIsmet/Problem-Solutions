# 🚀 Coding Interview Solutions

A comprehensive collection of solutions to coding interview problems from LeetCode, HackerRank, and NeetCode. This repository serves as a personal study guide and reference for technical interviews.

## 🎯 Problem Categories

### Data Structures
- Arrays & Hashing
- Linked Lists
- Stacks & Queues
- Trees & Binary Search Trees
- Heaps & Priority Queues
- Graphs
- Tries

### Algorithms
- Two Pointers
- Sliding Window
- Binary Search
- Depth-First Search (DFS)
- Breadth-First Search (BFS)
- Dynamic Programming
- Backtracking
- Greedy Algorithms
- Sorting & Searching

## 📝 Solution Format

Each solution includes:

- **Problem Statement**: Link to original problem
- **Approach**: High-level strategy and intuition
- **Algorithm**: Step-by-step breakdown
- **Code**: Clean, commented implementation
- **Complexity Analysis**: Time and space complexity
- **Test Cases**: Example inputs and outputs

### Example Structure

```python
"""
Problem: Two Sum
Link: https://leetcode.com/problems/two-sum/
Difficulty: Easy

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

Approach:
- Use a hash map to store complements
- For each number, check if its complement exists in the map
- Return indices when complement is found

Time Complexity: O(n)
Space Complexity: O(n)
"""

def two_sum(nums, target):
    complement_map = {}
    
    for i, num in enumerate(nums):
        complement = target - num
        if complement in complement_map:
            return [complement_map[complement], i]
        complement_map[num] = i
    
    return []
```

## 🏷️ Naming Convention

Files are named using the following pattern:
- `problem-number_problem-name.extension`
- Example: `001_two-sum.py`, `153_find-minimum-in-rotated-sorted-array.cpp`

## 🔧 Languages Used

- **Python**
- **Java**
- **C++**

## 🎨 Code Style

- Clean, readable code with meaningful variable names
- Comprehensive comments explaining complex logic
- Consistent formatting and indentation
- Type hints where applicable (Python)
- Error handling for edge cases

## 🚦 Getting Started

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/coding-solutions.git
   cd coding-solutions
   ```

2. **Navigate to specific problems**:
   ```bash
   cd leetcode/medium/
   ```

3. **Run solutions**:
   ```bash
   python 001_two-sum.py
   ```

## 🔍 Search and Filter

Use GitHub's search functionality or grep to find specific problems:

```bash
# Search for problems by topic
grep -r "binary search" --include="*.py"

# Find problems by difficulty
find . -path "*/easy/*" -name "*.py"

# Search for specific data structures
grep -r "linked list" --include="*.md"
```

## 📚 Study Resources

- [LeetCode Patterns](https://leetcode.com/discuss/general-discussion/460599/blind-75-leetcode-questions)
- [NeetCode Roadmap](https://neetcode.io/roadmap)
- [Algorithm Visualization](https://visualgo.net/)
- [Big O Cheat Sheet](https://www.bigocheatsheet.com/)

## 🤝 Contributing

While this is primarily a personal learning repository, contributions are welcome:

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/new-solution`
3. Add your solution following the established format
4. Commit changes: `git commit -m "Add solution for Problem XYZ"`
5. Push to branch: `git push origin feature/new-solution`
6. Submit a pull request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🎯 Goals

- [ ] Complete NeetCode 150
- [ ] Solve 200+ LeetCode problems
- [ ] Master all major algorithm patterns
- [ ] Achieve consistent interview performance
- [ ] Build a comprehensive reference guide

## 📞 Contact

Feel free to reach out if you have questions or suggestions:
- GitHub: [@kaanismet](https://github.com/kaanismet)
- LinkedIn: [kaan-okul](https://linkedin.com/in/kaan-okul)

---

*"The only way to learn a new programming language is by writing programs in it."* - Dennis Ritchie
