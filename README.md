tgobbler
========

A Java Application that spawns loads of threads. Written to work out how many threads we can use in a Cloud Foundry Linux Container.


Build
-----

Build the app

    $ mvn clean package
    
    
Run
---

Run the app and see how many threads it got to:

    $ cf push tgobbler -p target/tgobbler-1.0.jar --no-route
    $ cf logs tgobbler --recent
    
    
