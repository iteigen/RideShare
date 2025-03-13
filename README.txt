Ian Teigen RideShare Project

For my RideShare Project, I had 3 main components: A Person, A Car, and A Road. My file includes a Station,
But I didnt use the station in my Road. (Its in the constructor but none of the methods use it)

One choice I made was to make every car end at position 1 or 32 instead of making it random, which increased the number
of passengers that made it to their destination.

One thing I struggled with was at the end, when I was testing my code, I would often end up with the total of completed and waiting
passengers at 48 or 49, and I spent a couple hours trying to figure where my mistake was, whether it was in the car, or road, and I
noticed that cars would sometimes have one or two passengers in the car at the end. I eventually realized that it was caused by a Car
starting at position 32 or 1, their direction set to the same direction as a passenger who also started at 32/1, and their destination
also at 32/1, causing the car to pickup the passenger and then not move at all since it was already at their destination. This feature
is still in the code since I didn't think there was anything wrong with it. 

At the end, my tester runs both situations (40 and 20 cars) 100 times. With 20 cars 35.55 passengers made it to their destination and
14.14 did not make it to their destination.
With 40 cars 43.91 made it to their destination and 5.55 did not make it to their destination. The difference between 50 and completed
+ waiting is the average number of passengers that were still in the car at the end.
