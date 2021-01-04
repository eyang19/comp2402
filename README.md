# comp2402
java data-structures

ASSIGNMENT 1: 

Part0 > [5 marks] Read the input one line at a time until you have read all lines. Now output these lines in the opposite order from which they were read.

Part1 > [5 marks] Read the input one line at a time and output the current line if and only if it is larger than any other line read so far. (Here, smaller is with respect to the usual order on Strings, as defined by String.compareTo().

Part2 > [5 marks] Read the input one line at a time and output only the last 5000 lines in the order they appear. If there are fewer than 5000 lines, output them all. For full marks, your code should be fast and should never store more than 5001 lines.

Part3 > [5 marks] Read the input one line at a time and output the current line if and only if it is different from every previous line.

Part4 > [5 marks] Read the input one line at a time. When you are done, output all the lines in reverse sorted order (so that "zebra" will appear before "apple").

Part5 > [5 marks] For this question, you may assume that every input line is distinct. Read the entire input input one line at time. If the input has n<4001 lines then don't output anything. Otherwise, output the line ℓ that has exactly 4000 lines smaller than ℓ. (Again, greater than and less than are with respect to the ordering defined by String.compareTo().) For full marks, you should do this without ever storing more than 4001 lines.

Part6 > [5 marks] The input is broken into chunks of consecutive lines, where each pair of consecutive chunks is separated by a line containing "----snip----". Read the entire input and break it into chunks C1,…,Ck. Then output the chunks in reverse order Ck,…,C1 but preserving the order of the lines within each chunk.

Part7 > [5 marks] For this question, you are going to make a permutation array. Read the entire input file. You may assume that each input line is distinct. If the file has n lines, treat them as if they are numbered 0,…,n−1. Now output a permutation π0,…,πn−1 of {0,…,n−1} so that π0 is the number of the smallest line, π1 is the number of the second smallest line, ... , and πn−1 is the number of the largest line. (Again, smaller and larger refer to the natural ordering on strings). Your output should consist of n lines, where line i contains (the string representation of) πi, for each i∈{0,…,n−1}.

Part8 > [5 marks] Read the input one line at a time and output the current line if and only if it is not a prefix of some previous line. For example, if the some line is "zoodles" and some subsequent line is "zoo", then the line containing "zoo" should not be output.

Part9 > [5 marks] For this problem you may assume that every input line is distinct. Your output should begin with the largest line ℓ0 in the input. Next should be the largest line ℓ1 that appears after ℓ0 in the input. In general, line ℓi of your output should be the largest line that appears after ℓi−1 in the input. (Hint: You can do this very efficiently and easily with an ArrayList. Think about your solution before you start coding.)





ASSIGNMENT 2:

MinStack > [5 marks] A MinStack supports three main operations: the standard Stack operations push(x) and pop() and the non-standard min() operation which returns the minimum value stored on the stack. The zip file gives an implementation SlowMinStack that implements these operations so that push(x) and pop() each run in O(1) time, but min() runs in Θ(n) time.
           For this question, you should complete the implementation of FastMinStack that implements all three operations in O(1) time per operation. As part of your implementation, you may use any of the classes in the Java Collections Framework and you may use any of the source code provided with the Java version of the textbook. 
           Don't forget to also implement the size() and iterator()* methods. Think carefully about your solution before you start coding. Here are two hints: (i) don't use any kind of SortedSet or SortedMap, These all require Ω(logn) time per operation; (ii) take a look at the sample solution for Part 10 of Assignment 1. Really understanding this solution will help you design your data structure.

FastMinStack > [5 marks] A MinDeque supports five operations: The standard Deque operations addFirst(x), removeFirst(), addLast(x), and removeLast() and the non-standard min() operation that returns the minimum value stored in the Deque. Again, the zip file provides an implementation SlowMinDeque that supports each of the first four operation in O(1) time per operation but requires Ω(n) time for the min() operation.
               For this question, you should complete the implementation of FastMinDeque that implements all five operations in O(1) (amortized) time per operation. As part of your implementation, you may use any of the classes in the Java Collections Framework and you may use any of the source code provided with the Java version of the textbook. Don't forget to also implement the size() and iterator()* methods. 
               Think carefully about your solution before you start coding. Here are two hints: (i) don't use any kind of SortedSet or SortedMap, These all require Ω(logn) time per operation; (ii) consider using one of the techniques we've seen in class for implementing the Deque interface.
