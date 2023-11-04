# Flight-Operation-App
# Lexicographically Smallest Path Finder

This Java project is a flight operations manager tool for organizing flights between N cities in a country. The tool calculates the lexicographically smallest path that minimizes the travel time from one city (X) to another city (Y), taking into account airport state changes and flight durations.

## Introduction

As a flight operations manager, you need to efficiently plan flight routes between N cities using M undirected flight routes. Each city has an airport that alternates between loading and running states every T minutes. The travel time through any flight route is C minutes. Your goal is to find the lexicographically smallest path that minimizes the total travel time from city X to city Y.

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

In the input, the first line contains four space-separated integers: N (number of cities), M (number of flight connections), T (airport state change time), and C (travel time between cities).

Next, M lines contain two space-separated integers each: U and V, indicating bidirectional roads between cities U and V.

Finally, the last line contains two space-separated integers: X (starting city) and Y (destination city).

## Output Format

The output includes the following:

1. The number of cities (K) you need to go through to reach city Y from city X.

2. K space-separated integers denoting the path that minimizes the total travel time.

3. The total time (in minutes) for the path from city X to city Y.

The program will also display multiple paths (if available) and their respective total travel times.
