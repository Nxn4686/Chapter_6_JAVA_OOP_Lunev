def show_result(num):
    try:
        print(f"Result operation > {num.get_values()}")
    except Exception as err:
        print("Invalid type data")
        print(err)


choice_operation = """
Choice operation:
\t1. Summarize
\t2. Subtraction
\t3. Multiplication
\t4. Division
\t5. Exit
"""


