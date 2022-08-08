def power_of_two(x):
    power = 1
    while x >= power:
        if power == x:
            return True
        power *= 2
    return False