# Loyalty Points Code-Smells

This repository is having the solution for the below gist

* https://gist.github.com/Jaymohan1/d9305b412534513c5e7e8693a81b6348

# Pure Function:

Output of the function completely depends on the input paramaters.

# Side Effect Function:

Output of the function not completely depends on the input paramaters but also with some state variable value(s) outside its local environment.

# Code Smells:

Code smells are not bugs or errors. Instead, these are absolute violations of the fundamentals of developing software that decrease the quality of code.

# Data clsss smell:

Data classes can be considered a code smell, when they are over abused and logic concerned to those classes are treated in separate classes when could be done in the same class. A data class is basically a class the contain only getters and setters (sometimes).

Remedies: Move Behaviour close to the data to make the class consistent and remove data class smell

# Duplicated code

Duplicated Code the most pervasive and pungent smell in software. There is obvious or blatant duplication such as copy and paste.There are subtle or non-obvious duplications.Such as parallel inheritance hierarchies. Same code structure in more then one place

Remedies: Extract Method, Pull Up Field.

# Lazy class smell:

A lazy class is one that doesn’t really do much, or performs only a few trivial operations. 

Remedies: Lazy classes should be removed.


