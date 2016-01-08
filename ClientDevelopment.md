Client Backlog

  * PGC01 maintain the launch permit of installed applications
    * ~~PGC0101 get the list of installed applications~~
    * PGC0102 let users to decide which applications are prohibited to constrained users
    * PGC0103 save the list of prohibited applications, identified by their activity name and package name
    * PGC0104 get the list of admitted applications to constrained users
    * PGC0105 create the launch rule by specifying the name, some of admitted applications, and the time period
    * PGC0106 edit the existed launch rules for admitted applications

  * PGC02 communicate with the server
    * PGC0201 define the communication protocol, including data and signature
    * PGC0202 perform HTTP GET requests to pull data from the server, with the help of PGC0702
    * PGC0203 perform HTTP POST requests to push data to the server
    * PGC0204 add signature to HTTP requests for the purpose of security and version control

  * PGC03 user preferences
    * PGC0301 identify input pattern password
    * PGC0302 allow administrator users to change their pattern password
    * PGC0303 implement a tutorial for new user, including how to maintain launch permit, and set pattern password
    * PGC0304 change the running mode of Parent Guard

  * PGC04 lock the application being launched
    * PGC0401 check whether the application being launched is prohibited
    * PGC0402 lock the application being launched
    * PGC0403 show a prompted alert dialog when the application is prohibited
    * PGC0404 identify applications with the capability of killing or stopping Parent Guard
    * PGC0405 always lock those applications with the capability of killing or stopping Parent Guard

  * PGC05 periodically detect the launching event of applications
    * ~~PGC0501 start a service when the phone is booted~~
    * ~~PGC0502 periodically read the system log~~
    * ~~PGC0503 capture the launching event, with the help of PGC0701~~
    * ~~PGC0504 notify the locker module to handle it~~

  * PGC06 retrieve the content of installed applications
    * ~~PGC0601 create a global instance of PackageManager class~~
    * PGC0602 retrieve the content of installed applications
    * ~~PGC0603 retrieve the content of the application according to its activity name and package name~~
    * PGC0604 check whether the given application is dangerous and can kill or stop Parent Guard

  * PGC07 provide methods to support all the other modules
    * ~~PGC0701 parse the activity name and package name of the application being launched from captured system log~~
    * PGC0702 data convert between HTTP responses and the list of admitted applications

  * PGC08 user interface design and implementation
    * PGC0801 maintain all icons
    * PGC0802 switch all activities in a global tab activity
    * PGC0803 the user interface design of preferences
    * PGC0804 the user interface design of security
    * PGC0805 the user interface design of recommendation
    * PGC0806 the user interface design of application restriction