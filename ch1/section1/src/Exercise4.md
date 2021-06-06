
- `if (a > b) then c = 0;` 
  * illegal syntax
- `if a > b { c = 0; }`
  * missing brackets
- `if (a > b) c = 0;`
  * valid expression
- `if (a > b) c = 0 else b = 0;`
    * Missing semicolon