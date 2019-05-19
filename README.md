# Bolzano
Calculates function roots via Bolzano's theorem (Scala file)

Bolzano's theorem: https://en.wikipedia.org/wiki/Intermediate_value_theorem

The 'bolzano' method takes as parameters the continuous function 'f' of which we want to find the root; 'a' and 'b', which are the interval bounds; and 'e', the error.

The method calls a local recursive 'iBolzano' method, which receives 'a' and 'b', and the values 'fa' and 'fb' of their functions in 'f'.
