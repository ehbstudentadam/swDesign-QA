## Combat & Conquer game
When developing a combat & conquer game you get a whole number of classes from a
previous project team to work with. The following classes are provided (you have to
write them yourself for for this exercise though):  
- Class Farmer
  - Datamember
    - int speed
    - int power
  - Methods
    - gettingDressed()
    - undress()
    - takeStick()
    - beatWithStick()
- Class Rabbit
  - Datamembers
    - int numberOfTeeth
    - float strength
  - Methods
    - jump()
    - sniffle()
    - bite()
- Class Snake
  - Datamembers
    - int strengthOfPoison
    - float length
  - Methods
    - coilUp()
    - strike()
    - stab()

Implement these classes. You can use a System.out.print() in your methods so you see
in the console what is happening. Look at the example output below.  
While making your game you notice that you would actually like to provide a "fight()"
method for all characters so you can link this action to a button on your controller.

Depending on the character, this comes down to the following actions:
- Farmer: gettingDressed(), takeStick(), beatWithStick()
- Rabbit: jump(), bite()
- Snake: coilUp(), strike(), stab()

Modify your program (NOT by modifying the existing code, just by adding code) so that
a fight() method can be linked to the game controller for each character. Something else
the game requires, is the possibility to select a number of characters and let them start
fighting at the same time.

When you are ready, you must create a list with which you can let all the characters
fight at the same time by going through the list one by one. Your program should create
the following output:  
Farmer is getting Dressed. Farmer takes stick. Farmer beats with stick. Rabbit jumps.
Rabbit bites. Snake coils up. Snake strikes. Snake stabs.