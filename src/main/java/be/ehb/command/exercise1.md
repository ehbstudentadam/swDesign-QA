## Command pattern
Suppose you are building a home automation system. There is a programmable remote
which can be used to turn on and off various items in your home like lights, stereo, AC
etc.

We need to keep in mind that turning on some devices like stereo comprises of many
steps like selecting the input, volume etc. Also we can reassign a button to do something
else.

So what we want to achieve is a design that provides loose coupling and remote control
should not have much information about a particular device.

Our remote control but be able to control the following devices:  
- Garage door
  - datamember
     - String location
  - methods
    - up()
    - down()
    - stop()
    - lightOn()
    - lightOff()
- Hot tub
  - datamembers
    - boolon on
    - int temperature
  - methods
    - on()
    - off()
    - bubblesOn()
    - bubblesOff()
    - jetsOn()
    - jetsOff()
    - heat()
    - cool()
    - setTemperature()
- Light
  - datamember
    - String location
  - methods
    - on()
    - off()
- Stereo
  - datamember
    - String location
    - int volume
  - methods
    - on()
    - off()
    - selectOpticalIn()
    - selectDVD()
    - selectRadio()
    - setVolume(int volume)

You need to execute the following commands to turn on the devices:  
- GarageDoor: lightOn(), up()
- Hottub: on(), heat(), bubblesOn()
- Light: on()
- Stereo: on(), selectOpticalIn(), setVolume(11)

You need to execute the following command to turn the devices off:  
- GarageDoor: down(), lightOff()
- Hottub: cool(), off()
- Light: off()
- Stereo: setVolume(0), off()

Implement an universal remote control with on and off buttons to control these devices
and many more.