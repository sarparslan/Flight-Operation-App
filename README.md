# Flight-Operation-App
You are a flight operations manager in a flight company and there are N cities and M
undirected flight routes you need to organize in the country. Each city has an airport and each
airport can work as layover. The airport will be in two states, loading and running. In loading state,
luggage is loaded into the planes. In the running state, planes will leave the airport for the next
city. All the airports will switch their states from loading to running and vice versa after every T
minutes. At an airport, if its state is loading, you have to wait for it to switch its state to running.
At the beginning, all the airports are in running state. The time taken to travel through any flight
route is C minutes. Find the lexicographically smallest path which will take the minimum amount
of time (in minutes) required to move from city X to city Y.
In the input, the first line contains 4 space separated integers, N, M, T and C. N denotes the
number of cities we have, M denotes the number of connections between the N cities, T denotes
the time required by airports to change their states and C denotes that the time for travelling one
city to another. Next M lines contains two space separated integers each, U and V denoting that
there is a bidirectional road between city U and city V. Next line contains two space separated
integers, X the city we start to travel and Y the city we want to reach at the end.

In the first line it is given that we have 5 cities and 5 bidirectional roads between them. For
this case, time required the airports to change their state is 3 minutes and travel through any flight
route is 5 minutes. The next lines gives the connections between the cities and the last line gives
which city is the starting point and which city is the end point for this case.

In the output, the first line print an integer K, denoting the number of city you need to go
through to reach city Y from the city X. In next line, print K space separated integers denoting the
path which will take the minimum amount of time (in minutes) required by to move from city X
to city Y. In the last line, print the total time through the path from city X to city Y. There can be
multiple paths. Print the lexicographically smallest one and then the total time for each path at the
end.
