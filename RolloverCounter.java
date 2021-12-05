/*
* Write the code for the RolloverCounter class below
* 
* In this RolloverCounter.java file you will implement a RolloverCounter class that should include:
1) A private variable to store the current count.
2) Another private variable to store the maximum value this counter can count up to.
3) A constructor with a single integer parameter used to set the maximum counter value.  The count should be set to 0.
4) An increment() method that increases the count value by 1, but sets it back to 0 if the count goes above the maximum. no parameters, returns nothing
5) A decrement() method that decreases the count value by 1, but sets it to the maximum value if it goes below 0. no parameters, returns nothing
6) A getCount() method that returns an integer of the current count value.  no parameters.
7) A reset() method that sets the count value back to 0.  no parameters, returns nothing.

Notes:
+ This class is meant to be like the values on a car's odometer readout that tick upwards through
the digits 0 to 9 and then roll back to 0. In this case, the maximum can be any positive number.
+ The count should always be a number between 0 and the maximum value that was set when the counter was created.
*/

public class RolloverCounter {
  //TODO: Write the code for the class here.
 
  //private variables
private int currentCount;
private int maximumValue;
  
  //constructor
    public RolloverCounter(int maxVal) {
        this.currentCount = 0;
        this.maximumValue = maxVal;
    }

  //methods
    public int getCount() {
        return this.currentCount;
    }
    public void setCount(int Count) {
        this.currentCount = Count;
    }
    public void reset() {
        this.currentCount = 0;
    }
    public void increment() {
        this.currentCount++;
        if (currentCount > maximumValue) {
            currentCount = 0;
        }
    }
    public void decrement() {
        this.currentCount--;
        if (currentCount < 0) {
            currentCount = maximumValue;
        }
    }
}

