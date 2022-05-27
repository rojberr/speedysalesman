# speedysalesman

This is my assignment for Computational Optimization course.  

Here you can find metaheuristik solutions for travelling salesman problem. 

![Photo by Andrea Piacquadio from Pexels](main-photo.jpeg)

# Usage

## a) Calculate the shortest way

With this simple API you can calculate the most efficient way to travel along all stated points.

To calculate the way send POST Http request similar to following template:
```
3
1 50432 40315
2 44370 88921
3 56016 53219
```
At this moment you can use:

- for greedy algorithm approach:
> /pathfinder 

- ... many more will follow ^^

## b) Generate input data

To generate sample input data to send send:

> POST /generate 2

To generate input data with 2 instance points:
```
[
    {
        "id": 56,
        "x": 67704,
        "y": 46398
    },
    {
        "id": 57,
        "x": 20678,
        "y": 24543
    }
]
```

## TODO:

- Make buttons on errors and index.html page work!
- ...

