# delete those comment when you fnish with making this game
# copy def Question1()~gameover() to make another question
# when you made a new question, you need to make a few changes
#
# if answerOne(this could be anything) = 't'
# ^^ this answerOne should be the question number that youre trying to make
#   Question2()
# ^^ this Question2 should be the NEXT queston number, if you decided to fnish
#    this question, type endOfGame()
#
# look through this code, and if you have any questions, snapchat me.
# I would be happy to help you out.


def Question1():
    '''level one question'''
    print ("Here is level one question")
    print ("Type 't' if you think it's true, type 'f' if you think it's false\n")
    print ("QUESTION1: ____________")
    # type a true question
    answerOne = input("-->")

    if answerOne == 't':
        Question2()
    else:
        gameOver()

def Question2():
    '''level two question'''
    print ("Here is level two question")
    print ("Type 't' if you think it's true, type 'f' if you think it's false\n")
    print ("QUESTION2: ____________")
    # type a false question
    answerTwo = input("-->")

    if answerTwo == 'f':
        Question3()
    else:
        gameOver()

def Question3():
    '''level three question'''
    print ("Here is level two question")
    print ("Type 't' if you think it's true, type 'f' if you think it's false\n")
    print ("QUESTION3: ____________")
    # type a false question
    answerThree = input("-->")

    if answerThree == 'f':
        endOfGame()
    else:
        gameOver()

def gameOver():
    '''game over'''
    print ("you are wrong!! Thnaks for playing!!")

def endOfGame():
    '''call this function when you want to end this game'''
    print ("Thank you for playing this game! See you next time!!")

## the game starts here ##
def main():
    print ("wlcome to true and false questions game")
    print ("First, I would like to ask your name. what is your name?")
    name = input("-->")

    print ("okay,", name)
    Question1()

if __name__ == '__main__':
    main()
