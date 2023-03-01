from ViewMenu import *
from Calc import *


def run():
    while True:
        num1 = Calc("First number")
        num2 = Calc("Second number")
        type_operation = input(f"{choice_operation}>")
        if type_operation == "1":
            num1.summarize(num2)
        elif type_operation == "2":
            num1.subtraction(num2)
        elif type_operation == "3":
            num1.multiplication(num2)
        elif type_operation == "4":
            num1.division(num2)
        else:
            "Invalid choice, close application"
            return 0

        show_result(num1)
