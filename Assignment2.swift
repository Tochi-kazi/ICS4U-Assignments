/**

 Name: Tochi Iroakazi

 Class: ICS4U

 Definition: This code rums rock, paper and Scissors against the program.

 */



show("Choose a number:")

show("1 is for Rock")

show("2 is for Scissors")

show("3 is for Papper")



//makes a value betwen 3 and 1

var answer = Int(arc4random_uniform(3)+1)





var guess = Int(askForChoice("Guess", options:["1","2","3"]))



if answer == 1 {//if the computer chooses Rock.

    if guess == 1 {

        show("Its a draw, the computer chose(Rock) : " + String(answer))

    } else if guess == 2 {

        show("You Lost, the computer chose(Rock) : " + String(answer) )

    } else if guess == 3 {

        show("You won, the computer chose(Rock) : " + String(answer))

    }

};if answer == 2 {// if the computer choses 2 which is Scissors.

    if guess == 1 {

        show("You won, the computer chose(Scissors): " + String(answer))

    } else if guess == 2 {

        show("Its a draw, the computer chose(Scissors): " + String(answer))

    } else if guess == 3 {

        show("You Lost, the computer chose(Scissors): " + String(answer))

    }

};if answer == 3 {//if the computer chooses Paper 

    if guess == 1 {

        show("You Lost, the computer chose(Paper): " + String(answer))

    } else if guess == 2 {

        show("You won, the computer chose(Paper): " + String(answer))

    } else if guess == 3 {

        show("Its a draw, the computer chose(Paper): " + String(answer))

    }

}
