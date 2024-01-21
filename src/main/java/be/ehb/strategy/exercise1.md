## Strategy pattern: Ducks
Implement the class diagram of the duck program that we discussed during the lecture.

![alt text](https://github.com/ehbstudentadam/swDesign-QA/blob/master/src/main/resources/excersiceImages/strategy_ducks.png?raw=true "ducks class diagram")

Implement a print to the console in the display() methods, showing what kind of duck
we are working with. The quack() and fly() methods also implement an output to the
console explaining what kind of quack or fly you are using (quack, squeak, mutequack,
...).

Note that the correct behaviors are assigned in the constructor of duck subclasses. The
instance variables themselves are declared in the superclass duck.  
Provide the following in the main method:  
- Create a list (array, vector, arraylist, ... of your choice) of ducks (declared as
Duck) with effective instances of MallardDuck, RedHeadDuck, RubberDuck and
DecoyDuck.
- For your entire list of ducks you call successively (in a loop) swim(), perform-
Quack(), performFly().
- Change the quack and flybehavior for a number of ducks.

Finally, create a new kind of quackbehavior for the decoyduck. This will generate a
FakeQuack sound.  
Do you have to change the existing code to accomplish this?