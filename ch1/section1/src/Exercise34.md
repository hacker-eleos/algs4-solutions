*Filtering.*

Which of the following require saving all the values from standard input (in an array, say), and which could be
implemented as a filter using only a fixed number of variables and arrays of fixed size (not dependent on N)? For each,
the input comes from standard input and consists of N real numbers between 0 and 1.

* Print the maximum and minimum numbers.
    - Can be done with storing only one variable, as we stream through the input.
* Print the median of the numbers.
    - Requires saving all the values from standard input in an array.
* Print the k<sup>th</sup> smallest value, for k less than 100.
    - Requires saving all the values from standard input in an array.
* Print the sum of the squares of the numbers.
    - Can be implemented as filter using only one variable.
* Print the average of the N numbers.
    - Can be implemented as filter with just one variable which updates the value as we stream the input values.
* Print the percentage of numbers greater than the average.
    - Requires saving all the values from the input into an array.
* Print the N numbers in increasing order.
    - Requires saving all the input in an array.
* Print the N numbers in random order
    - Requires saving all the numbers in an array.