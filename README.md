# CMSC 115 Week 3 Project - PaintCalculator

You will implement methods in the **PaintCalculator** class to compute the gallons
of paint needed to cover the ceiling and walls of a rectangular room.
The room dimensions are given as length, width, and height.

<img src="/common/images/room.png" alt=prism width=150>

The structure chart below shows the call graph of the methods you will implement.

<img src="/common/images/paintcalculator_main_call_graph.png" alt="PaintCalculator call graph"  >

You will use a bottom up approach, i.e. start by implementing
the methods on the bottom of the call graph.

- Task 1: `ceilingArea` method
- Task 2: `wallArea` method
- Task 3: `roomArea` method
- Task 4: `gallonsPaint` method
- Task 5: `main` method I/O

## Task 1 - `ceilingArea` method

<img src="/common/images/room.png" alt=prism width=150>

Run `PaintCalculator` and view the output. The `ceilingArea` method
should return the area of the ceiling (face C).
However, the method simply returns 0.0.

| Test Cases             | Expected | Actual| Status|
|------------------------|----------|----|---|
| ceilingArea(12.0, 15.0) | 180.0    |0.0| Fail|
| ceilingArea(7.5, 11.5) | 86.25    |0.0| Fail|

- Fix the `ceilingArea` method to calculate the ceiling area using the `length` and `width` parameters.
- Run `PaintCalculator` and confirm the output matches the expected result.
- Run `Task1Test` to confirm the Junit tests pass. 

## Task 2 - `wallArea` method

<img src="/common/images/room.png" alt=prism width=150>

A room has four walls that need to be painted:
- The front wall (face A) and back wall (not shown) each have an area of `length x height`.
- The right wall (face B) and left wall (not shown) each have an area of `width x height`.

| Test Cases                | Expected | 
|---------------------------|----------| 
| wallArea(12.0, 15.0, 10.0)  | 540.0    | 
| wallArea(7.5, 11.5, 8.25) | 313.5    |

- Add a new method named `wallArea` to compute the total area of the four walls given the room length, width, and height.
  Use the Javadoc comment as a guideline for parameter and return types.
- Edit `main` to print the result of calling `wallArea` for each test case listed.
- Run `PaintCalculator` and confirm the output matches the expected result.
- Run `Task2Test` to confirm the Junit tests pass.

## Task 3 - `roomArea` method

Assume the ceiling and walls will be painted the same color.

<img src="/common/images/roomarea_call_graph.png" alt="roomArea method calls ceilingArea and wallArea methods" >

<br>

| Test Cases                | Expected Result | Expected Calls                                       |
|---------------------------|--------|------------------------------------------------------|
| roomArea(12.0, 15.0, 10.0)  | 720.0  | ceilingArea(12.0, 15.0) <br>wallArea(12.0, 15.0, 10.0) |
| roomArea(7.5, 11.5, 8.25) | 399.75 | ceilingArea(7.5, 11.5) <br>wallArea(7.5, 11.5, 8.25) |

- Add a new method named `roomArea` to compute the combined area of the ceiling and four walls.
  The `roomArea` method should directly call the `ceilingArea` and `wallArea` methods.
    <div class="hint">
    Algorithm:<br>
    (1) Call the <code>ceilingArea</code> method and store the result in a local variable<br>
    (2) Call the <code>wallArea</code> method and store the result in a local variable<br>
    (3) Return the sum of the two local variables<br>
    You can also just return the sum of the two method calls directly without using
    local variables, but local variables can make debugging easier.
    </div>
- Edit `main` to print the result of calling `roomArea` for each test case listed.
- Run `PaintCalculator` and confirm the output matches the expected result.
- Run `Task3Test` to confirm the Junit tests pass.

## Task 4 - `gallonsPaint` method

Assume a gallon of paint covers 350 square feet and that the store
only sells paint by the gallon (i.e. no 1/2 gallons available for purchase).

<img src="/common/images/gallonsPaint_call_graph.png" alt="gallonsPaint method calls roomArea method" >

<br>

| Test Cases                     | Expected Result | Expected Call              |
|--------------------------------|-----------------|----------------------------|
| gallonsPaint(12.0, 15.0, 10.0) | 3               | roomArea(12.0, 15.0, 10.0) |
| gallonsPaint(7.5, 11.5, 8.25)  | 2               | roomArea(7.5, 11.5, 8.25)  |

- Add a new method named `gallonsPaint` to calculate the gallons of paint
  required to paint the ceiling and four walls. The method
  should return the number of gallons **rounded up** to the nearest integer.
  The `gallonsPaint` method should directly call the `roomArea` method to get the square footage of space to paint,
  then calculate the number of gallons needed to cover that area.
    <div class="hint">
    Algorithm:<br>
    (1) Call <code>roomArea</code> method to get the square footage as a double<br>
    (2) Divide the square footage by 350.0 to get the number of gallons as a double<br>
    (3) Call <code>Math.ceil</code> to round the number of gallons up to the nearest double value equivalent to an integer<br>
    (4) Cast the double value returned from <code>Math.ceil</code> as an int<br>
    (5) Return the number of gallons as an int

  Feel free to introduce one or more local variables to store intermediate values during the calculation.
    </div>
- Edit `main` to print the result of calling `roomArea` for each test case listed.
- Run `PaintCalculator` and confirm the output matches the expected result.
- Run `Task4Test` to confirm the Junit tests pass.

## Task 5 - `main` method I/O

<img src="/common/images/paintcalculator_main_call_graph.png" alt="main calls gallonsPaint"  >

<br>

  <table>
  <caption>I/O Test Cases</caption>
  <tr>
  <th>#1</th>
  <td>
  Enter length, width and height:
  <i>12.0 15.0 10.0</i><br>
  Buy 3 gallons of paint.
  </td>
  </tr>
  <tr>
  <th>#2</th>
  <td>
  Enter length, width and height:
  <i>7.5 11.5 8.25</i><br>
  Buy 2 gallons of paint.
  </td>
  </tr>
  </table>

- Update the `main` method:
    - Prompt for and read in the room length, width, and height.
    - Call the `gallonsPaint` method with the input values and print the result as shown.
- Run `PaintCalculator` and confirm the output matches the expected result.
- Run `Task5Test` to confirm the Junit tests pass. 




