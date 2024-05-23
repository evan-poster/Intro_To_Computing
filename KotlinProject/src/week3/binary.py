def decimal_to_binary(n):
    if n == 0:
        return 0
    binary = 0
    multiplier = 1
    while n > 0:
        binary += (n % 2) * multiplier
        n = n // 2
        multiplier *= 10
    return binary


print(decimal_to_binary(57))  # Output: 1010

def calculate_euler_e(precision=10**-10):
    e = 1
    term = 1
    factorial = 1
    while abs(term) > precision:
        factorial *= term
        term /= (factorial / math.factorial(term))
        e += term
    return e

print(calculate_euler_e())  # Output: 2.7182818284590455