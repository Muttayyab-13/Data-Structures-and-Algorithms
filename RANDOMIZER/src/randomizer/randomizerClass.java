/*
Group Number: 14

Muttayyab Abdurrehman---FA22-BSE-046

Umar Nawaz--------------SP22-BSE-171

Fahad zeb---------------SP22-BSE-023
 */
package randomizer;

import java.util.Random;

public class randomizerClass
{

    int[] myArray;
    int fill;

    public randomizerClass(int size)
    {
        myArray = new int[size];
        fill = -1;

        int fill = -1;
    }

    private boolean isFull()
    {
        if (fill >= myArray.length - 1)
        {
            return true;
        } 
        else
        {
            return false;
        }

    }

    private boolean isEmpty()
    {
        if (fill <= -1)
        {
            return true;
        } 
        else
        {
            return false;
        }

    }

    void input(int value)
    {

        if (value <= 0)
        {
            System.out.println("The value must be a positive integer");
            return;
        }
        if (isFull())
        {
            System.out.println("There is no space available, value cannot be inserted");
            return;
        }

        int index;
        for (int i = 0; i < myArray.length; i++)
        {
            Random randomNum = new Random();
            index = randomNum.nextInt(myArray.length);
            if (myArray[index] == 0)
            {
                myArray[index] = value;
                System.out.printf("Value has been inserted at index %d \n", index);
                fill++;
                return;
            }
        }
    }

    int output()
    {
        if (isEmpty())
        {
            System.out.println("There is nothing to remove, THANKYOU!!");
            return 0;
        }

        int index;
        for (int i = 0; i < myArray.length; i++)
        {
            Random randomNum = new Random();
            index = randomNum.nextInt(myArray.length);
            if (myArray[index] != 0)
            {
                int removedValue = myArray[index];
                myArray[index] = 0;

                System.out.println("The Value has been removed from index " + index);
                fill--;
                return removedValue;
            }
        }
        return 0;
    }

}
