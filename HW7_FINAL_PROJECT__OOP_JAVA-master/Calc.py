class Calc:
    def __init__(self, msg=""):
        print(msg)
        self.values = float(input("Enter rational values: "))
        print()

    def summarize(self, other):
        if type(other) == Calc:
            self.values += other.values

    def subtraction(self, other):
        if type(other) == Calc:
            self.values -= other.values

    def multiplication(self, other):
        if type(other) == Calc:
            self.values *= other.values

    def division(self, other):
        if type(other) == Calc:
            self.values /= other.values

    def get_values(self):
        return self.values
