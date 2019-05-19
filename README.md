# Bolzano

Calculates function roots via Bolzano's theorem (Scala file)

Bolzano's theorem: https://en.wikipedia.org/wiki/Intermediate_value_theorem

The 'bolzano' method takes as parameters the continuous function 'f' of which we want to find the root; 'a' and 'b', which are the interval bounds; and 'e', the error.

The method calls a local recursive 'iBolzano' method, which receives 'a' and 'b', and the values 'fa' and 'fb' of their functions in 'f'.

Both methods return a 2-tuple: a Boolean saying if there's a root, and, if it's true, a Double says the value. If the Boolean is false, the Double returns a non-significant value.

NOTE: If 'f' has more than one root in [a, b], 'bolzano' just returns one of them.

Community's contributions are welcome!!
