## The Observer Pattern: push or pull
### Push model
The Subject sends detailed information about the change to the Observers as arguments
to the update method. A superset of information including everything any Observer
might need is transferred.

### Pull model
The Subject sends nothing but the most minimal notification, and Observers ask for
details explicitly using a getState() or similar method.  
Potential problems will arise in asynchronous / concurrent environments if the Subject’s
state changes again between the original announcement and the time the Observer issues
its query.

## Weatherstation
Implement the class diagram of the weatherstation program that we discussed during the
lecture.

We have to implement a program for a weatherstation. The weatherstation offers three
measurement values: temperature, humidity and pressure. We need to implement the
classes for three devices that use the weather data: a tablet, a smartphone and a smart
thermostat. These devices must be updated each time the weatherstation has new measurements.

All devices have a different implementation but their specific methods are not definied
at this time. All devices will write the measurements to the console when they receive
updates.

The system must be expandable - other developers can create new custom devices and
users can add or remove as many devices as they want to the application.