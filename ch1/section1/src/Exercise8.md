a. `System.out.println('b');`
 - Converts the character to single letter string.
    

Note that `char` is 16 bits  and `int` is 32 bits in Java.

b. `System.out.println('b' + 'c');`
  -  Casts the `char` bit pattern into `int` and sum the numbers. 
  -  `b` = 1100010
  -  `c` = 1100011
  -  `b+c` = 11000101 = 197

c. `System.out.println((char) ('a' + 4))`;
  - Casts `a` bit pattern to int and adds 4.
  - Convert it back to `char`.
  - `e` is the result.