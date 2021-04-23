# CHECKPOINT 1

**Hints**

* Try to solve the problems from memorizing what you learned first.
* If you get stuck, skip to the next step!
* Regardless of whether you finish, remember to commit everything and push

## I. Downloading and initializing of the project

### 1. Local repo
 
Retrieve the contents of this repository locally. **Download a copy of the repository, don't Fork!**
 
In your local repository, create a branch using the following format: the city of your course in lowercase, your first name and surname without accents or spaces, separate everything with dashes, and write your surname in uppercase. Example: **Eloise Durant**, would create a branch called **lyon-eloise-DURANT**.
 
**Work on this branch for the rest of the checkpoint!**
 
> Tip: commit and push your changes locally after each exercise, to avoid unpleasant surprises

### 2. gitignore

Find and modify the *.gitignore* file from the project root, so that all files with the extension `.class` are ignored.

## II. Java / algorithms

You will find an `algos` folder at the root of your local repository and you should write the following algorithms in the file `Student.java`:

### 1. Major

The school organizes an end-of-year party and all adult students are invited. In order to avoid sending invitations to underage students, you must create a method that checks a student's age and returns whether or not they are of age.

Create a static method named *isLegal*, which returns "true" if the age passed as an argument is greater than or equal to 18 and returns "false" if it is not.

### 2. Grouping people

You have to divide the students in a class into two groups. Each student has a number and you want to use this data to assign them to either group A or B.

Create a static method called *giveGroup*, which takes in a student's number. If this is even, return the character "A", otherwise return the character "B".

### 3. Cleaning data

The school needs to count how many of its future students want to learn Java. To do this, a survey was sent out asking students which language they wanted to study. Students wrote "Java" with inconsistent lower and upper case letters, e. g. "JAVA" or "java", instead of "Java".

Create a static method called *countStudents*, which receives an array containing the languages chosen by the candidates. Return the number of candidates who have chosen Java, regardless of how they wrote it (upper/lower case).

### 4. Factorial (Recursivity)

Create a recursive method that computes a factorial :

	0! = 1
	1! = 1
	2! = 1 x 2
	3! = 1 x 2 x 3
	4! = 1 x 2 x 3 x 4

### 5. BlackJack (Bonus)

Write a function that takes in parameter the hand of a player and the hand of the bank, then returns the winner of the game.

Rules : If the player or the bank has more than 21, he or it loses the game.
The player wins if he has more than the bank and 21 or less. Same goes for the bank.
In case of ex aeco, we will consider that the player wins.
If the player has in hand an ace and a 10 points card (e.g. 1 + J or 1 + 10), he wins by BlackJack.

Values of the cards : The heads are worth 10 ("J", "Q", and "K")
The numbers are worth what's indicated (a 4-card is worth 4 points)
For simplicity purpose, the ace (1) is worth 1 point except for the Blackjack case where it's considered to be worth 11.

### 6. Testing

Remember to test the methods you have developed. 

#### Unix

To compile and execute the `StudentTest` class, you can use the *tester.sh* script in the `algos` folder as follows:

```Bash
./test.sh
```

#### Windows

To compile and execute the `StudentTest` class, you can type the code below
```sh
javac -cp .;junit-4.12.jar StudentTest.java
```

Then, if no error occur, type the code below: 

```
java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore StudentTest
```


## III. Quiz

You will find a `Quiz.java` file at the root of your local repository: compile and run it.

Answer the questions, and at the end it will generate a `quiz.txt` file.

You can then edit the file manually to correct your answers.

> Please answer honestly, without any help from the Internet!


## IV. HTML/CSS

You were hired to carry out mobile integration for the Wild Code School homepage!

You will find a `web` folder in the root of your local repository.

The structure of the *index.html* file is already approved, so you will need to modify the *style.css* file so that the site displays as follows:

*[Mobile version](./templates/template-mobile.png)
*[Desktop version (>= 768px)](./templates/template-desktop.png)

> You will also find these two images in the `templates` folder

#### The colors to be used are as follows:

* "#39424E": default text and footer background color
* "#F76C6C" : background color of the "Apply now" button

###### Be careful to respect the following points: 

* do not modify the structure of HTML, except to add classes
* successfully integrate according to *mobile first* methodology
* the desktop version should be displayed for screen sizes **768px** and higher
* in the desktop version, the columns of the three articles are **250px** wide.
* do not delete the code that is already present in *style.css*
* you don't have to add or change the font size (*font-size*): this is already perfect.


## V. Finalisation

Push the changes made to your local branch; and push everything to the remote repository.

On the GitHub website, check that the branch exists and that your changes are present.

Now return to Odyssey and share the link to your branch on GitHub.
