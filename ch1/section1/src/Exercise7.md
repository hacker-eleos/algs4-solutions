a.
```java
double t = 9.0;
while (Math.abs(t - 9.0/t) > .001)
t = (9.0/t + t) / 2.0;
StdOut.printf("%.5f\n", t);
```
It calculates square root of 9.0 using Newton-Raphson method.

b.
```java
int sum = 0;
for (int i = 1; i < 1000; i++)
for (int j = 0; j < i; j++)
sum++;
StdOut.println(sum);
```
It calculates <sup>n</sup>C<sub>2</sub> for `n=1000`

c.
```java
int sum = 0;
for (int i = 1; i < 1000; i *= 2)
for (int j = 0; j < N; j++)
sum++;
StdOut.println(sum);
```
It prints ceiling of `lg(1000)` multiplied by N.