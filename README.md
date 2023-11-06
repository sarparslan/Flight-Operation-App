# Flight-Operation-App
# Lexicographically Smallest Path Finder

This Java project is a flight operations manager tool for organizing flights between N cities in a country. The tool calculates the lexicographically smallest path that minimizes the travel time from one city (X) to another city (Y), taking into account airport state changes and flight durations.

## Introduction

Welcome to the Flight Operations Manager repository! This project is designed to help flight operations managers efficiently organize flight routes between cities. The goal is to find the lexicographically smallest path that minimizes the time required to travel from one city to another.

# Problem Statement

You are a flight operations manager in a flight company, and you have N cities and M undirected flight routes that need to be organized in the country. 

Each city has an airport, and each airport can work as a layover. 

The airports can switch between two states: loading and running. In the loading state, luggage is loaded onto the planes, while in the running state, planes leave the airport for the next city. 

All airports switch their states from loading to running and vice versa every T minutes. Initially, all airports are in the running state.

The time taken to travel through any flight route is C minutes. Your task is to find the lexicographically smallest path that will take the minimum amount of time (in minutes) required to move from city X to city Y.
## Features

- Calculation of the lexicographically smallest path.
- Optimization of travel time by considering airport state changes.
- Support for multiple paths with their respective travel times.
- Clear and extensible Java codebase.

## Getting Started

1. Clone this repository to your local machine.

2. Compile and run the Java program using your preferred Java development environment.

3. Follow the prompts to input the necessary parameters and calculate the lexicographically smallest path and total travel time.

## Usage

To use the Lexicographically Smallest Path Finder, follow these steps:

1. Run the Java program.

2. Provide input parameters such as the number of cities (N), number of flight connections (M), airport state change time (T), travel time between cities (C), flight routes, starting city (X), and destination city (Y).

3. The program will calculate and display the lexicographically smallest path, the total travel time, and all available paths.

## Input Format

In the first line it is given that we have 5 cities and 5 bidirectional roads between them.

For this case, time required the airports to change their state is 3 minutes and travel through any flight route is 5 minutes. 

<img width="596" alt="Screenshot 2023-11-06 at 20 29 17" src="https://github.com/sarparslan/Flight-Operation-App/assets/96438389/3656f470-1a5d-4792-bd87-9c0629a66c6b">



The next lines gives the connections between the cities and the last line gives
which city is the starting point and which city is the end point for this case.

## Output Format

In the output, the first line print an integer K, denoting the number of city you need to go
through to reach city Y from the city X. 

In next line, print K space separated integers denoting the
path which will take the minimum amount of time (in minutes) required by to move from city X
to city Y.

In the last line, print the total time through the path from city X to city Y. There can be
multiple paths. Program prints the lexicographically smallest one and then the total time for each path at the
end.

<img width="596" alt="Screenshot 2023-11-06 at 20 29 31" src="https://github.com/sarparslan/Flight-Operation-App/assets/96438389/08c1998b-5785-4bb7-aaf2-e8700e9c3071">
