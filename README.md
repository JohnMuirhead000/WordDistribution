# WordDistribution

Just created this to expiremnet with graphing and data reading and manipulation in java.  The program reads in a text file which I includ in a directory. 
This file is the firstchapter of Catcher in the Rye.  

The program reads in this data, and calculates and produses a graph of the frequency of each word in the chapter.  Due  to space
limitations, only every 1 out of 6 words appears on the graph at the bottom (thouguh every word does have a bar in the graph).  
To account for this, the program also prints out each word and its corresponding number of uses.

Step 1: It reads in and edits (removes puncuation and capitilaztion) the data
Step 2: Puts all the information into a hash table with the key (the word) and the value (# of uses). It sorts the values by size and puts them into a list. 
        This whole step is done with 2 functions from the Build class
Step 3: Usess javafx to build the bar chart with this data.
Step 4: It also prints each word and its corresponding distribution. 

To run the program, simply download it and run it.
I made it in IntelliJ. 
