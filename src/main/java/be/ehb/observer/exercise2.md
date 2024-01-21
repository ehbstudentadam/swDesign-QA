## Olympics
The IT systems for the Olympics are complex and represent a software architecture
challenge. Information about the events -such as the detailed scheduling, competitors
and results- is stored on a centralized system. This information has to be distributed to
various subsystems (views) and each system is used by a different category of people.

These different types of information have to be distributed: scheduling data, participant
profiles and results. At this moment the data has to be distributed to:  
the Judges Intranet, Press Intranet, Athlete Intranet and the Event Website. More
categories may be added at a later time. Each views has a different implementation but
their specific methods are not definied at this time. All devices will write the information
to the console when they receive updates.

The system must ensure consistency between different views and has to be efficient because
it will have to deal with a high load. The subsystems cannot continuously poll
the data source for content. The system should be event-based -when change, keep overall
consistency by propagation- and the datasource cannot push all the content to the
subsystems.